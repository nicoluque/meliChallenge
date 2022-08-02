package com.meli.mapper;


import org.springframework.stereotype.Component;

import com.meli.persistence.entity.IpGeolocation;
import com.meli.service.DTO.IpGeolocationDTO;

@Component
public class IpGeolocationDTOToIpGeo implements IMapper<IpGeolocationDTO, IpGeolocation>{

	public IpGeolocationDTO map(IpGeolocation in) {
		IpGeolocationDTO ipGeolocationDTO = new IpGeolocationDTO();
		ipGeolocationDTO.setQuery(in.query);
		ipGeolocationDTO.setCountry(in.country);
		ipGeolocationDTO.setCountryCode(in.countryCode);
		ipGeolocationDTO.setCity(in.city);
		ipGeolocationDTO.setLat(in.lat);
		ipGeolocationDTO.setLon(in.lon);
		ipGeolocationDTO.setOffset(in.offset);
		return ipGeolocationDTO;
	}

	@Override
	public IpGeolocation Map(IpGeolocationDTO in) {
		// TODO Auto-generated method stub
		return null;
	}
	
}