package com.meli.persistence.entity.country;

public class RegionalBlocs {

	private String acronym;
    private String name;
	public RegionalBlocs(String acronym, String name) {
		super();
		this.acronym = acronym;
		this.name = name;
	}
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
