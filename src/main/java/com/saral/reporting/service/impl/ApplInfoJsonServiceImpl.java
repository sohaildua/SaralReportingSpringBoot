package com.saral.reporting.service.impl;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.saral.reporting.model.ApplInfoJson;
import com.saral.reporting.repo.ApplInfoJsonRepository;
import com.saral.reporting.service.ApplInfoJsonService;

@Service
public class ApplInfoJsonServiceImpl implements ApplInfoJsonService{

	@Autowired
	ApplInfoJsonRepository applInfoJsonRepository;
	
	/*
	 * @Override public Stream<ApplInfoJson> findByServiceId(Long serviceId) {
	 * 
	 * return applInfoJsonRepository.findByServiceId(serviceId); }
	 */
	@Override
	public List<ApplInfoJson> findByServiceId(Long serviceId) {
		
		return applInfoJsonRepository.findByServiceId(serviceId);
	}

	@Override
	public Long countByServiceId(Long serviceId) {
		// TODO Auto-generated method stub
		return applInfoJsonRepository.countByServiceId(serviceId);
	}

	
}
