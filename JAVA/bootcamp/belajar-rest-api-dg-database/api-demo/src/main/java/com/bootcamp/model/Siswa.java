package com.bootcamp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbl_siswa")
public class Siswa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="nis", length = 10)
	private String nis;
	
	@Column(name="nama", length = 100)
	private String nama;
	
	@Column(name="jk", length=10)
	private String jk;
	
	@Column(name="tpt_lahir", length = 64)
	private String tptLahir;
	
	@Temporal(TemporalType.DATE)
	@Column(name="tgl_lahir")
	private Date tglLahir;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getTptLahir() {
		return tptLahir;
	}

	public void setTptLahir(String tptLahir) {
		this.tptLahir = tptLahir;
	}

	public Date getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}

	@Override
	public String toString() {
		return "Siswa [id=" + id + ", nis=" + nis + ", nama=" + nama + ", jk=" + jk + ", tptLahir=" + tptLahir
				+ ", tglLahir=" + tglLahir + "]";
	}
}
