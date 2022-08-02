package com.meli.persistence.entity;

import java.time.LocalDateTime;

public class IpInfo {

	private String query;
	private LocalDateTime timeNow;
	private String country;
	private String languages;
	private String currencies;
	private String timezones;
	private String distanceBetweenBuenosAiresAndCountry;
	
	public IpInfo(String query, LocalDateTime timeNow, String country, String languages, String currencies,
			String timezones, String distanceBetweenBuenosAiresAndCountry) {
		super();
		this.query = query;
		this.timeNow = timeNow;
		this.country = country;
		this.languages = languages;
		this.currencies = currencies;
		this.timezones = timezones;
		this.distanceBetweenBuenosAiresAndCountry = distanceBetweenBuenosAiresAndCountry;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getCurrencies() {
		return currencies;
	}

	public void setCurrencies(String currencies) {
		this.currencies = currencies;
	}

	public String getTimezones() {
		return timezones;
	}

	public void setTimezones(String timezones) {
		this.timezones = timezones;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public LocalDateTime getTimeNow() {
		return timeNow;
	}

	public void setTimeNow(LocalDateTime timeNow) {
		this.timeNow = timeNow;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistanceBetweenBuenosAiresAndCountry() {
		return distanceBetweenBuenosAiresAndCountry;
	}

	public void setDistanceBetweenBuenosAiresAndCountry(String distanceBetweenBuenosAiresAndCountry) {
		this.distanceBetweenBuenosAiresAndCountry = distanceBetweenBuenosAiresAndCountry;
	}
	
}
