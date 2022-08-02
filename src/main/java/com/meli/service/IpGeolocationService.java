package com.meli.service;

import org.springframework.stereotype.Service;

import com.meli.persistence.entity.IpGeolocation;
import com.meli.persistence.entity.IpInfo;

@Service
public interface IpGeolocationService {

	public IpGeolocation save(String ip);
	public IpInfo get(String ip);
}
