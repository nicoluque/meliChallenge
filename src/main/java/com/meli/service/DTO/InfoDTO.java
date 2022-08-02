package com.meli.service.DTO;

import java.time.LocalDateTime;

public class InfoDTO {

	private String ip;
	private LocalDateTime dateNow;
	private String country;
	private String isoCode;
	private String officialLenguages;
	private String currencies;
	private String timeCountry;
	private String distanceBetweenBuenosAiresAndCountry;

	public InfoDTO(String ip, LocalDateTime dateNow, String country, String isoCode, String officialLenguages,
			String currencies, String timeCountry, String distanceBetweenBuenosAiresAndCountry) {
		this.ip = ip;
		this.dateNow = dateNow;
		this.country = country;
		this.isoCode = isoCode;
		this.officialLenguages = officialLenguages;
		this.currencies = currencies;
		this.timeCountry = timeCountry;
		this.distanceBetweenBuenosAiresAndCountry = distanceBetweenBuenosAiresAndCountry;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public LocalDateTime getDateNow() {
		return dateNow;
	}

	public void setDateNow(LocalDateTime dateNow) {
		this.dateNow = dateNow;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	public String getOfficialLenguages() {
		return officialLenguages;
	}

	public void setOfficialLenguages(String officialLenguages) {
		this.officialLenguages = officialLenguages;
	}

	public String getCurrencies() {
		return currencies;
	}

	public void setCurrencies(String currencies) {
		this.currencies = currencies;
	}

	public String getTimeCountry() {
		return timeCountry;
	}

	public void setTimeCountry(String timeCountry) {
		this.timeCountry = timeCountry;
	}

	public String getDistanceBetweenBuenosAiresAndCountry() {
		return distanceBetweenBuenosAiresAndCountry;
	}

	public void setDistanceBetweenBuenosAiresAndCountry(String distanceBetweenBuenosAiresAndCountry) {
		this.distanceBetweenBuenosAiresAndCountry = distanceBetweenBuenosAiresAndCountry;
	}
	
	
	
	
	
	
}
