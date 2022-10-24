package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Siswa;

public interface SiswaService {
	public Siswa save(Siswa data);
	public Siswa update(Siswa data);
	public Siswa delete(int id);
	public List<Siswa> get();
	public Siswa getById(int id);
}
