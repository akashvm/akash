package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.StaffEntity;

public interface StaffRepo extends JpaRepository<StaffEntity, Integer>{

}
