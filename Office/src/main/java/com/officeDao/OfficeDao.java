package com.officeDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.officeEntity.OfficeEntity;
import com.officeRepo.OfficeRepo;

@Repository

public class OfficeDao {
	@Autowired
	OfficeRepo officeRepo;

	public OfficeEntity insertoffice(OfficeEntity s) {
		return officeRepo.save(s);
	}

	public OfficeEntity delete(OfficeEntity s) {
		 officeRepo.delete(s);
		return (s);
	}

	public OfficeEntity findId(int id) {
		return officeRepo.findById(id).get();
	}

	public OfficeEntity update(OfficeEntity m) {
		officeRepo.save(m);
		return m;
	}

	public List<OfficeEntity> insertAllOffice() {
		return officeRepo.findAll();
	}

}
