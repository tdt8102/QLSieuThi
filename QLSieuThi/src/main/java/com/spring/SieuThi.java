package com.spring;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "t_sieuthi")
public class SieuThi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mast;
	@Column(name = "tenst")
	private String tenst;
	@Column(name = "diachi")
	private String diachi;
	@Column(name = "hanghoa")
	private String hanghoa;
	@Column(name ="soluong")
	private int soluong;
	@Column(name = "thanhtien")
	private int thanhtien;
	
	public SieuThi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMast() {
		return mast;
	}

	public void setMast(int mast) {
		this.mast = mast;
	}

	public String getTenst() {
		return tenst;
	}

	public void setTenst(String tenst) {
		this.tenst = tenst;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getHanghoa() {
		return hanghoa;
	}

	public void setHanghoa(String hanghoa) {
		this.hanghoa = hanghoa;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public int getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}

	public SieuThi(int mast, String tenst, String diachi, String hanghoa, int soluong, int thanhtien) {
		super();
		this.mast = mast;
		this.tenst = tenst;
		this.diachi = diachi;
		this.hanghoa = hanghoa;
		this.soluong = soluong;
		this.thanhtien = thanhtien;
	}

	public SieuThi(String tenst, String diachi, String hanghoa, int soluong, int thanhtien) {
		super();
		this.tenst = tenst;
		this.diachi = diachi;
		this.hanghoa = hanghoa;
		this.soluong = soluong;
		this.thanhtien = thanhtien;
	}
	
}