/**
 * 
 */
package com.psm.bootcamp.case01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psm.bootcamp.case01.entity.ProfileBiodata;
import com.psm.bootcamp.case01.repository.ProfileBiodataRepository;

/**
 * @author Awiyanto Ajisasongko
 *
 */
@RestController
@RequestMapping("/biodata")
public class BiodataController {
	@Autowired private ProfileBiodataRepository repository;
	
	@GetMapping("/")
	public ResponseEntity<List<ProfileBiodata>> findAll() {
		List<ProfileBiodata> list = repository.findAll();
		return new ResponseEntity<List<ProfileBiodata>>(list, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProfileBiodata> findOne(@PathVariable(name="id") Integer id) {
		ProfileBiodata pb = repository.getOne(id);
		return new ResponseEntity<ProfileBiodata>(pb, HttpStatus.OK);
	}

	@PutMapping("/")
	public ResponseEntity<ProfileBiodata> update(@RequestBody ProfileBiodata entity) {
		return new ResponseEntity<ProfileBiodata>(repository.save(entity), HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<ProfileBiodata> insert(@RequestBody ProfileBiodata entity) {
		return new ResponseEntity<ProfileBiodata>(repository.save(entity), HttpStatus.OK);
	}

	@DeleteMapping("/")
	public ResponseEntity<ProfileBiodata> delete(@RequestBody ProfileBiodata entity) {
		repository.delete(entity);
		return new ResponseEntity<ProfileBiodata>(HttpStatus.OK);
	}
}
