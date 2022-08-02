package com.meli.persistence.entity;

import java.util.List;

import com.meli.persistence.entity.country.Currencies;
import com.meli.persistence.entity.country.Languages;
import com.meli.persistence.entity.country.RegionalBlocs;
import com.meli.persistence.entity.country.Translations;

public class CountryInfo {
	
	private String name;
	private List<String> topLevelDomain;
	private String alpha2Code;
	private String alpha3Code;
	private List<Integer>callingCodes;
	private String capital;
	private List<String>altSpellings;
	private String region;
	private String subregion;
	private Integer population;
	private List<Integer>latlng;
	private String demonym;
	private Integer area;
	private Double gini;
	private List<String> timezones;
	private List<String>borders;
	private String nativeName;
	private Integer numericCode;
	private List<Currencies>currencies;
	private List<Languages>languages;
	private List<Translations>translations;
	private String flag;
	private List<RegionalBlocs>regionalBlocs;
	private String cioc;
	public CountryInfo(String name, List<String> topLevelDomain, String alpha2Code, String alpha3Code,
			List<Integer> callingCodes, String capital, List<String> altSpellings, String region, String subregion,
			Integer population, List<Integer> latlng, String demonym, Integer area, Double gini, List<String> timezones,
			List<String> borders, String nativeName, Integer numericCode, List<Currencies> currencies,
			List<Languages> languages, List<Translations> translations, String flag, List<RegionalBlocs> regionalBlocs,
			String cioc) {
		super();
		this.name = name;
		this.topLevelDomain = topLevelDomain;
		this.alpha2Code = alpha2Code;
		this.alpha3Code = alpha3Code;
		this.callingCodes = callingCodes;
		this.capital = capital;
		this.altSpellings = altSpellings;
		this.region = region;
		this.subregion = subregion;
		this.population = population;
		this.latlng = latlng;
		this.demonym = demonym;
		this.area = area;
		this.gini = gini;
		this.timezones = timezones;
		this.borders = borders;
		this.nativeName = nativeName;
		this.numericCode = numericCode;
		this.currencies = currencies;
		this.languages = languages;
		this.translations = translations;
		this.flag = flag;
		this.regionalBlocs = regionalBlocs;
		this.cioc = cioc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTopLevelDomain() {
		return topLevelDomain;
	}
	public void setTopLevelDomain(List<String> topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
	}
	public String getAlpha2Code() {
		return alpha2Code;
	}
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}
	public String getAlpha3Code() {
		return alpha3Code;
	}
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}
	public List<Integer> getCallingCodes() {
		return callingCodes;
	}
	public void setCallingCodes(List<Integer> callingCodes) {
		this.callingCodes = callingCodes;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public List<String> getAltSpellings() {
		return altSpellings;
	}
	public void setAltSpellings(List<String> altSpellings) {
		this.altSpellings = altSpellings;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public List<Integer> getLatlng() {
		return latlng;
	}
	public void setLatlng(List<Integer> latlng) {
		this.latlng = latlng;
	}
	public String getDemonym() {
		return demonym;
	}
	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Double getGini() {
		return gini;
	}
	public void setGini(Double gini) {
		this.gini = gini;
	}
	public List<String> getTimezones() {
		return timezones;
	}
	public void setTimezones(List<String> timezones) {
		this.timezones = timezones;
	}
	public List<String> getBorders() {
		return borders;
	}
	public void setBorders(List<String> borders) {
		this.borders = borders;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}
	public Integer getNumericCode() {
		return numericCode;
	}
	public void setNumericCode(Integer numericCode) {
		this.numericCode = numericCode;
	}
	public List<Currencies> getCurrencies() {
		return currencies;
	}
	public void setCurrencies(List<Currencies> currencies) {
		this.currencies = currencies;
	}
	public List<Languages> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Languages> languages) {
		this.languages = languages;
	}
	public List<Translations> getTranslations() {
		return translations;
	}
	public void setTranslations(List<Translations> translations) {
		this.translations = translations;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public List<RegionalBlocs> getRegionalBlocs() {
		return regionalBlocs;
	}
	public void setRegionalBlocs(List<RegionalBlocs> regionalBlocs) {
		this.regionalBlocs = regionalBlocs;
	}
	public String getCioc() {
		return cioc;
	}
	public void setCioc(String cioc) {
		this.cioc = cioc;
	}

}
