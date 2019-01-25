package com.saral.reporting.repo;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import com.saral.reporting.model.ApplInfoJson;

public interface ApplInfoJsonRepository extends CrudRepository<ApplInfoJson, Long>{

	List<ApplInfoJson> findByServiceId(Long serviceId);

	Long countByServiceId(Long serviceId);
	
	//Stream<ApplInfoJson> findByServiceId(Long serviceId);

	
	
}
