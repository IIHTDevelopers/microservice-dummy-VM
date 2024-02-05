package com.iiht.training.certificates.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.certificates.dto.CertificatesDto;
import com.iiht.training.certificates.entity.Certificates;
import com.iiht.training.certificates.repository.CertificatesRepository;
import com.iiht.training.certificates.service.CertificatesService;

@Service
public class CertificatesServiceImpl implements CertificatesService {

	@Autowired
	private CertificatesRepository repository;

	@Override
	public CertificatesDto generateCertificate(CertificatesDto certificatesDto) {
		Certificates certificates = new Certificates();
		certificates.setEmployeeId(certificatesDto.getEmployeeId());
		certificates.setSkillName(certificatesDto.getSkillName());
		certificates.setDateOfIssue(certificatesDto.getDateOfIssue());
		certificates.setDateOfExpiry(certificatesDto.getDateOfExpiry());
		certificates.setPassingScore(certificatesDto.getPassingScore());
		certificates.setMaxScore(certificatesDto.getMaxScore());
		certificates.setScorePercentage(certificatesDto.getScorePercentage());
		Certificates certificates2 = this.repository.save(certificates);
		return certificatesDto;
	}

	
	@Override
	public List<CertificatesDto> findCertificatesByEmployeeId(Integer id) {
		List<Certificates> certificates = this.repository.findByEmployeeId(id);
		List<CertificatesDto> certificatesDtos = new ArrayList<CertificatesDto>();
		for (Certificates certificates2 : certificates) {
			CertificatesDto certificatesDto = new CertificatesDto();
			certificatesDto.setEmployeeId(certificates2.getEmployeeId());
			certificatesDto.setSkillName(certificates2.getSkillName());
			certificatesDtos.add(certificatesDto);
		}
		return certificatesDtos;
	}

	@Override
	public List<CertificatesDto> findCertificatesBySkillName(String skillName) {
		// TODO Auto-generated method stub
		return null;
	}

}
