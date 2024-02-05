package com.iiht.training.skills.proxy;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.iiht.training.skills.dto.CertificatesDto;

public interface CertificatesServiceProxy {

	// Add a correct configuration for feign client
	public List<CertificatesDto> getCertificatesBySkillName(@PathVariable String skillName); 
}
