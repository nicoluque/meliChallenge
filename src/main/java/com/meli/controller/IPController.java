package com.meli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meli.persistence.entity.IpGeolocation;
import com.meli.service.IpGeolocationServiceImpl;


@RestController
@RequestMapping("/IpGeolocations")
public class IPController {

	IpGeolocationServiceImpl ipGeolocationServiceImpl;
	
	public IPController(IpGeolocationServiceImpl ipGeolocationService) {
		this.ipGeolocationServiceImpl = ipGeolocationService;
	}
	
	@PostMapping("/create")
    public IpGeolocation ipGeolocationDTO(@RequestParam String ip) {
        return this.ipGeolocationServiceImpl.save(ip);
    }
	
}



/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin

0.0.0.0:13306
