package com.aridhu.microservices.enterprise.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aridhu.microservices.enterprise.product.service.domain.Opportunity;
import com.aridhu.microservices.enterprise.product.service.mapper.OpportunityMapper;

@Service
public class OpportunityService {
	
	final private OpportunityMapper opportunityMapper;
	
	public OpportunityService(OpportunityMapper opportunityMapper) {
		this.opportunityMapper = opportunityMapper;
	}

	public List<Opportunity> findAll() {
		return this.opportunityMapper.findAll();
	}

	public Opportunity findOpportunity(String opportunityName) {
		return this.opportunityMapper.findByOpportunityName(opportunityName);
	}

	public Opportunity saveOpportunity(Opportunity opportunity) throws Exception {
		this.opportunityMapper.saveOpportunity(opportunity);
		return opportunity;
	}

}
