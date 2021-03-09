package com.example.demo.exh.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.controller.AbstractController;
import com.example.demo.exh.domain.Exhbn;
import com.example.demo.exh.service.ExhbnServiceImpl;
import com.example.demo.hal.domain.Hall;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequiredArgsConstructor 
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/exhbns")
public class ExhbnController extends AbstractController<Exhbn> {
	final ExhbnServiceImpl service;

	@PostMapping("/save")
	public ResponseEntity<Long> save(Exhbn e) {
		return ResponseEntity.ok(service.save(e));
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Long> delete(Exhbn e) {
		return ResponseEntity.ok(service.delete(e));
	}

	@GetMapping("/count")
	public ResponseEntity<Long> count() {
		return ResponseEntity.ok(service.count());
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Exhbn> getOne(long id) {
		return ResponseEntity.ok(service.getOne(id));
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Exhbn>> findById(long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existsById(long id) {
		return ResponseEntity.ok(service.existsById(id));
	}

	@GetMapping("/all")
	public ResponseEntity<List<Exhbn>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/exhbnTitle/{exhbnTitle}")
	public ResponseEntity<List<Exhbn>> findByExhbnTitle(@PathVariable String exhbnTitle) {
		return ResponseEntity.ok(service.findByExhbnTitle(exhbnTitle));
	}
}
