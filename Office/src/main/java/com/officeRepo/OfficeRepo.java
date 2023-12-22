package com.officeRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.officeEntity.OfficeEntity;

public interface OfficeRepo extends JpaRepository<OfficeEntity, Integer>{

}