package com.iiht.training.skills.controller;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.training.skills.dto.CertificatesDto;
import com.iiht.training.skills.dto.SkillsDto;
import com.iiht.training.skills.proxy.CertificatesServiceProxy;
import com.iiht.training.skills.service.SkillsService;

@RestController
@RequestMapping("/api")
public class SkillsRestController {

	@Autowired
	private Environment environment;

	@Autowired
	private SkillsService skillsService;

	@Autowired
	private CertificatesServiceProxy proxy;

	@PostMapping("/skills")
	public ResponseEntity<SkillsDto> addSkill(@Valid @RequestBody SkillsDto skillsDto, BindingResult result) {
		return null;
	}

	

	@GetMapping("/skills/by/{employeeId}")
	public ResponseEntity<List<SkillsDto>> skillsByEmployeeId(@PathVariable("employeeId") Integer id) {
		return null;
	}

	@GetMapping("/skills/certificates-by-skill-name/{name}")
	public ResponseEntity<List<CertificatesDto>> getCertificatesBySkillNameFeign(@PathVariable String name) {
		return null;
	}


}
