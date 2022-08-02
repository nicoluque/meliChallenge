package com.meli.mapper;

import org.springframework.stereotype.Component;

import com.meli.persistence.entity.CountryInfo;
import com.meli.service.DTO.CountryInfoDTO;

@Component
public class CountryInfoDTOToCountry implements IMapper<CountryInfoDTO, CountryInfo>{
	
	public CountryInfoDTO map(CountryInfo in) {
		CountryInfoDTO countryInfoDTO = new CountryInfoDTO();
		countryInfoDTO.setName(in.getName());
		countryInfoDTO.setDemonym(in.getDemonym());
		countryInfoDTO.setTimezones(in.getTimezones().get(0));
		countryInfoDTO.setCurrencies(in.getCurrencies().get(0).getCode());
		countryInfoDTO.setLanguages(in.getLanguages().get(0).getName());
		return countryInfoDTO;
	}

	@Override
	public CountryInfo Map(CountryInfoDTO in) {
		// TODO Auto-generated method stub
		return null;
	}
}
