package com.aridhu.microservices.enterprise.product.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aridhu.microservices.enterprise.product.service.OpportunityService;
import com.aridhu.microservices.enterprise.product.service.domain.Opportunity;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/v1/opportunity")
@Api
public class OpportunityController {
	
	private final OpportunityService opportunityService;
	
	public OpportunityController(OpportunityService opportunityService) {
		this.opportunityService = opportunityService;
	}
	
	@GetMapping(path="/list")
	public ResponseEntity<List<Opportunity>> listOpportunity() {
		List<Opportunity> itemlist = opportunityService.findAll();
		return new ResponseEntity<List<Opportunity>>(itemlist, HttpStatus.OK);
	}
	
	@GetMapping(path="/find")
	public ResponseEntity<Opportunity> findOpportunity(@RequestParam ("opportunityName") String opportunityName) {
		Opportunity opportunity = opportunityService.findOpportunity(opportunityName);
		return new ResponseEntity<Opportunity>(opportunity, HttpStatus.OK);
	}
	
	@PostMapping(path="/save")
	public ResponseEntity<Opportunity> saveItem(Opportunity opportunity) {
		try {
			opportunity = opportunityService.saveOpportunity(opportunity);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<Opportunity>(opportunity, HttpStatus.OK); 
	}
	
	

}
