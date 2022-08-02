package com.meli.persistence.entity.country;

public class Currencies {
	
	private String code;
	private String name;
	private char symbol;
	
	public Currencies(String code, String name, char symbol) {
		super();
		this.code = code;
		this.name = name;
		this.symbol = symbol;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	
	
}
