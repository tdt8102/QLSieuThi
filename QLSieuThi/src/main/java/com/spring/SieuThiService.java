package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SieuThiService {
	@Autowired
	private SieuThiRepository repo;
	
	public void save(SieuThi b) {
		repo.save(b);
	}

	public List<SieuThi> getAll() {
		return repo.findAll();
	}

	public SieuThi getById(int id) {
		return repo.findById(id).get();
	}

	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	public List<SieuThi> search(String a, int b) {
		
		return repo.finddata(a, b);
	}
}
