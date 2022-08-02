package com.meli.mapper;

public interface IMapper <I, O> {
	
	public O Map(I in);

}
