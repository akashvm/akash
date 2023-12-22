package com.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Entity.ManagerEntity;

public interface ManagerRepo extends JpaRepository<ManagerEntity, Integer>{
	@Query(value = "SELECT staff.name AS staff_name FROM staff JOIN manager ON staff.manager_id = manager.manager_id WHERE manager.name =?" , nativeQuery = true)

	   public  List<String>getByName( String name);




}
