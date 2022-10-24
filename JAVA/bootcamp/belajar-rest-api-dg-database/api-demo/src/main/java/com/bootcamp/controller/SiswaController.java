package com.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.model.Siswa;
import com.bootcamp.service.SiswaService;

@RestController
@RequestMapping(value="/siswa")
public class SiswaController {
	@Autowired
	private SiswaService siswaService;
	
	@GetMapping
	public List<Siswa> getAll(){
		return siswaService.get();
	}
	
	@GetMapping(value="/{id}")
	public Siswa getById(@PathVariable int id) {
		return siswaService.getById(id);
	}
	
	@PostMapping
	public Siswa simpan(@RequestBody Siswa request) {
		return siswaService.save(request);
	}
	
	@PatchMapping
	public Siswa ubah(@RequestBody Siswa request) {
		return siswaService.update(request);
	}
	
	@DeleteMapping(value="/{id}")
	public Siswa hapus(@PathVariable int id) {
		return siswaService.delete(id);
	}

}
