package com.officeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.officeDao.OfficeDao;
import com.officeEntity.OfficeEntity;

@Service
public class OfficeService {
	@Autowired
	OfficeDao officeDao;

	public OfficeEntity insertoffice(OfficeEntity s) {
		return officeDao.insertoffice(s);
	}

	public OfficeEntity delete(OfficeEntity s) {
		return officeDao.delete(s);
	}

	public OfficeEntity findId(int id) {
		return officeDao.findId(id);
	}

	public OfficeEntity update(OfficeEntity m) {
		return officeDao.update(m);
	}

	public List<OfficeEntity> insertAllOffice() {
		return officeDao.insertAllOffice();
	}

}
