package com.saral.reporting.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.domain.Pageable;

import com.saral.reporting.model.ApplInfoJson;

public interface ApplInfoJsonService {

	//Stream<ApplInfoJson> findByServiceId(Long serviceId);
	
	List<ApplInfoJson> findByServiceId(Long serviceId);
	Long countByServiceId(Long serviceId);
}
