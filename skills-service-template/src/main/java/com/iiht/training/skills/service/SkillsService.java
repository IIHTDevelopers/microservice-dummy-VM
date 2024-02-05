package com.iiht.training.skills.service;

import java.util.List;

import com.iiht.training.skills.dto.SkillsDto;

public interface SkillsService {

	public SkillsDto addSkill(SkillsDto skillsDto);
	public List<SkillsDto> skillsByEmployeeId(Integer emloyeeId);
	
}
