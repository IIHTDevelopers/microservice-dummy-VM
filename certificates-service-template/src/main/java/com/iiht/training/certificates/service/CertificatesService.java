package com.iiht.training.certificates.service;

import java.util.List;

import com.iiht.training.certificates.dto.CertificatesDto;

public interface CertificatesService {

	public CertificatesDto generateCertificate(CertificatesDto certificatesDto);

	public List<CertificatesDto> findCertificatesByEmployeeId(Integer id);

	public List<CertificatesDto> findCertificatesBySkillName(String skillName);

}
