/**
 * 
 */
package com.psm.bootcamp.case02.controller;

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

import com.psm.bootcamp.case02.entity.CustomerProfile;
import com.psm.bootcamp.case02.repository.CustomerProfileRepository;

/**
 * @author Awiyanto Ajisasongko
 *
 */
@RestController
@RequestMapping("/cust")
public class CustomerProfileController {
	@Autowired private CustomerProfileRepository repository;
	
	@GetMapping("/")
	public ResponseEntity<List<CustomerProfile>> findAll() {
		List<CustomerProfile> list = repository.findAll();
		return new ResponseEntity<List<CustomerProfile>>(list, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CustomerProfile> findOne(@PathVariable(name="id") Integer id) {
		CustomerProfile pb = repository.getOne(id);
		return new ResponseEntity<CustomerProfile>(pb, HttpStatus.OK);
	}

	@PutMapping("/")
	public ResponseEntity<CustomerProfile> update(@RequestBody CustomerProfile entity) {
		return new ResponseEntity<CustomerProfile>(repository.save(entity), HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<CustomerProfile> insert(@RequestBody CustomerProfile entity) {
		return new ResponseEntity<CustomerProfile>(repository.save(entity), HttpStatus.OK);
	}

	@DeleteMapping("/")
	public ResponseEntity<CustomerProfile> delete(@RequestBody CustomerProfile entity) {
		repository.delete(entity);
		return new ResponseEntity<CustomerProfile>(HttpStatus.OK);
	}
}
