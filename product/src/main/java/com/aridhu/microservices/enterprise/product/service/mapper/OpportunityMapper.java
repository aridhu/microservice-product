package com.aridhu.microservices.enterprise.product.service.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import com.aridhu.microservices.enterprise.product.service.domain.Opportunity;

@Mapper
public interface OpportunityMapper {

	@Select("select OPPORTUNITY_NAME, OPPORTUNITY_AMOUNT, CLOSE_DATE, AOWNER_PARTY," + 
			" SOLD_TO_PARTY, TIER2_TO_PARTY from OPPORTUNITY_V where OPPORTUNITY_NAME = #{opportunityName}")
	@Results(value = {
		      @Result(property = "opportunityName", column = "OPPORTUNITY_NAME"),
		      @Result(property="opportunityAmount", column = "OPPORTUNITY_AMOUNT"),
		      @Result(property = "closeDate", column = "CLOSE_DATE"),
		      @Result(property = "aownerParty", column = "AOWNER_PARTY"),
		      @Result(property = "soldToParty", column = "SOLD_TO_PARTY"),
		      @Result(property = "tier2ToParty", column = "TIER2_TO_PARTY")
		    })
	Opportunity findByOpportunityName(@Param("opportunityName") String opportunityName);
	
	
	
	@Select("select OPPORTUNITY_NAME, OPPORTUNITY_AMOUNT, CLOSE_DATE, AOWNER_PARTY," + 
			" SOLD_TO_PARTY, TIER2_TO_PARTY from OPPORTUNITY_V")
	@Results(value = {
		      @Result(property = "opportunityName", column = "OPPORTUNITY_NAME"),
		      @Result(property="opportunityAmount", column = "OPPORTUNITY_AMOUNT"),
		      @Result(property = "closeDate", column = "CLOSE_DATE"),
		      @Result(property = "aownerParty", column = "AOWNER_PARTY"),
		      @Result(property = "soldToParty", column = "SOLD_TO_PARTY"),
		      @Result(property = "tier2ToParty", column = "TIER2_TO_PARTY")
		    })
	List<Opportunity> findAll();
	
	
	
	
	@Insert("insert into OPPORTUNITY_V"
			+ " (OPPORTUNITY_NAME, OPPORTUNITY_AMOUNT, CLOSE_DATE, AOWNER_PARTY,"
			+ "  SOLD_TO_PARTY, TIER2_TO_PARTY) values "
			+ " (#{opportunityName}, #{opportunityAmount}, #{closeDate}, #{aownerParty},"
			+ "  #{soldToParty}, #{tier2ToParty})")
	void saveOpportunity(Opportunity opportunity) throws Exception;
	
}
