package com.meli.service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meli.mapper.CountryInfoDTOToCountry;
import com.meli.mapper.IpGeolocationDTOToIpGeo;
import com.meli.persistence.entity.CountryInfo;
import com.meli.persistence.entity.IpGeolocation;
import com.meli.persistence.entity.IpInfo;
import com.meli.persistence.repository.IpGeolocationRepository;
import com.meli.persistence.repository.IpInfoRepository;
import com.meli.rest.CountryInfoRest;
import com.meli.rest.IpGeolocationRest;
import com.meli.service.DTO.CountryInfoDTO;
import com.meli.service.DTO.IpGeolocationDTO;
import com.meli.util.DistanceCalculator;
import com.meli.util.ValidateIPAddress;

@Service
public class IpGeolocationServiceImpl implements IpGeolocationService {

	@Autowired
	private IpGeolocationDTOToIpGeo mapperIpGeolocation;
	@Autowired
	private CountryInfoDTOToCountry mapperCountry;
	/*@Autowired*/
	private IpGeolocationRepository ipGeolocationRepository;
	/*@Autowired*/
	private IpInfoRepository ipInfoRepository;
	
	
	public IpGeolocation save(String ip) {
		if(!ValidateIPAddress.validateIPAddress(ip)){
            throw new RuntimeException("La ip ingresada no posee el patron 'XXX.XXX.XXX.XXX' ");
        }
		IpGeolocation ipGeolocationRest = IpGeolocationRest.getIpGeolocation(ip);
		IpGeolocationDTO ipGeolocationDTO = mapperIpGeolocation.map(ipGeolocationRest);
		ipGeolocationRepository.saveAndFlush(ipGeolocationRest);
		return ipGeolocationRest;
	}
	
	public IpInfo get(String ip) {
		if(!ValidateIPAddress.validateIPAddress(ip)){
            throw new RuntimeException("La ip ingresada no posee el patron 'XXX.XXX.XXX.XXX' ");
        }
		LocalDateTime localDateTime = LocalDateTime.now();
		IpGeolocation ipGeolocationRest = IpGeolocationRest.getIpGeolocation(ip);
		CountryInfo countryInfoRest = CountryInfoRest.getCountryInfo(ipGeolocationRest.country);
		CountryInfoDTO countryInfoDTO = mapperCountry.map(countryInfoRest);
		IpGeolocationDTO ipGeolocationDTO = mapperIpGeolocation.map(ipGeolocationRest);
		var lat = ipGeolocationDTO.getLat().shortValue();
		var lon = ipGeolocationDTO.getLon().shortValue();
		var distanceBetweenBuenosAiresAndCountry = DistanceCalculator.distance(lat, lon);
		IpInfo ipInfo = new IpInfo(
				ip, 
				localDateTime, 
				ipGeolocationDTO.getCountry(),
				countryInfoDTO.getLanguages(),
				countryInfoDTO.getCurrencies(),
				countryInfoDTO.getTimezones(),
				distanceBetweenBuenosAiresAndCountry);
		ipInfoRepository.saveAndFlush(ipInfo);
		return ipInfo;
	}
	
	
	
}
