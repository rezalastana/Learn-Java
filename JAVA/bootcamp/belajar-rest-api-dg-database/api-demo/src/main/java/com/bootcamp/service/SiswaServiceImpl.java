package com.bootcamp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.model.Siswa;
import com.bootcamp.repository.SiswaRepo;

@Service
public class SiswaServiceImpl implements SiswaService {
	private final SiswaRepo siswaRepo;

	public SiswaServiceImpl(SiswaRepo siswaRepo) {
		this.siswaRepo = siswaRepo;
	}

	@Override
	public Siswa save(Siswa data) {
		return this.siswaRepo.save(data);
	}

	@Override
	public Siswa update(Siswa data) {
		// get data by id, if not match return null
		Siswa temp = this.siswaRepo.findById(data.getId()).orElse(null);
		if (temp != null) {
			temp.setNama(data.getNama());
			temp.setJk(data.getJk());
			temp.setNis(data.getNis());
			temp.setTptLahir(data.getTptLahir());
			temp.setTglLahir(data.getTglLahir());

			this.siswaRepo.save(temp);
		}
		return temp;
	}

	@Override
	public Siswa delete(int id) {
		// get data by id, if not match return null
		Siswa temp = this.siswaRepo.findById(id).orElse(null);
		if(temp != null) {
			this.siswaRepo.delete(temp);
		}
		return temp;
	}

	@Override
	public List<Siswa> get() {
		return this.siswaRepo.findAll();
	}

	@Override
	public Siswa getById(int id) {
		return this.siswaRepo.findById(id).orElse(null);
	}

}
