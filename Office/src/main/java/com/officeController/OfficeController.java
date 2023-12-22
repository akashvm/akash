package com.officeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.officeEntity.OfficeEntity;
import com.officeService.OfficeService;

@RestController
@RequestMapping("officedetails")
@CrossOrigin(origins="*")

public class OfficeController {
	@Autowired
	OfficeService officeSer;
	
	@PostMapping(value = "/add")
	public OfficeEntity insertoffice(@RequestBody OfficeEntity s) {
		return officeSer.insertoffice(s);
	}
	
	@DeleteMapping(value = "/delete/{s}")
    public OfficeEntity delete(@PathVariable OfficeEntity s) {
		return officeSer.delete(s);
	}
	
	@GetMapping(value = "/findID/{id}")
	public OfficeEntity findId(@PathVariable int id) {
		return officeSer.findId(id);
	}
	
	@PutMapping(value="/update/{id}")
	public OfficeEntity update(@PathVariable int id,@RequestBody OfficeEntity m) {
		return officeSer.update(m);
	}
	@GetMapping(value = "/addall")	
	public List<OfficeEntity> insertAllOffice() {
		return officeSer.insertAllOffice();
	}

}
