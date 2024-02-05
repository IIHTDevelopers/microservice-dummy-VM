package com.iiht.training.certificates.controller;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
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

import com.iiht.training.certificates.dto.CertificatesDto;
import com.iiht.training.certificates.service.CertificatesService;


@RestController
@RequestMapping("/api")
public class CertificatesRestController {

	@Autowired
	private CertificatesService certificatesService;


	@Value("${role}")
    private String message;

    @GetMapping("/certificates/userrole")
    public String getMessage() {
        return message;
    }

	@PostMapping("/certificates")
	public ResponseEntity<CertificatesDto> addCertificate(@Valid @RequestBody CertificatesDto certificatesDto,
			BindingResult result) {
				CertificatesDto certificatesDto2 = this.certificatesService.generateCertificate(certificatesDto);
				return new ResponseEntity<CertificatesDto>(certificatesDto2, HttpStatus.OK);
	}

	// get certificates by employeeId
	@GetMapping("/certificates/employee/{employeeId}")
	public ResponseEntity<List<CertificatesDto>> getCertificatesByEmployeeId(@PathVariable Integer employeeId) {
		List<CertificatesDto> certificatesDtos = this.certificatesService.findCertificatesByEmployeeId(employeeId);
		return new ResponseEntity<List<CertificatesDto>>(certificatesDtos, HttpStatus.OK);
	}

	// get certificates by skillName
	@GetMapping("/certificates/skills/{skillName}")
	public ResponseEntity<List<CertificatesDto>> getCertificatesBySkillName(@PathVariable String skillName) {
		return null;
	}
}
