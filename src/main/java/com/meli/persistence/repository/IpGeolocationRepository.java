package com.meli.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meli.persistence.entity.IpGeolocation;

@Repository
public interface IpGeolocationRepository extends JpaRepository<IpGeolocation, String> {

}
