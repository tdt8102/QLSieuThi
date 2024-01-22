package com.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SieuThiRepository extends JpaRepository<SieuThi, Integer> {
	@Query("SELECT k FROM SieuThi k WHERE k.tenst = :a AND k.soluong <= :b")
	List<SieuThi> finddata(String a, int b);
}