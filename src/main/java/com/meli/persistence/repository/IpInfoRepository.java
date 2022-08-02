package com.meli.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meli.persistence.entity.IpInfo;

public interface IpInfoRepository extends JpaRepository<IpInfo, String>{

}
