package com.aridhu.microservices.enterprise.product.service.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 
OPPORTUNITY_NAME
OPPORTUNITY_AMOUNT
CLOSE_DATE
AOWNER_PARTY
SOLD_TO_PARTY
TIER2_TO_PARTY
 */

public class Opportunity implements Serializable {
	private static final long serialVersionUID = 2L;
	private String opportunityName;
	private Long opportunityAmount;
	private Date closeDate;
	private String aownerParty;
	private String soldToParty;
	private String tier2ToParty;
	public String getOpportunityName() {
		return opportunityName;
	}
	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}
	public Long getOpportunityAmount() {
		return opportunityAmount;
	}
	public void setOpportunityAmount(Long opportunityAmount) {
		this.opportunityAmount = opportunityAmount;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public String getAownerParty() {
		return aownerParty;
	}
	public void setAownerParty(String aownerParty) {
		this.aownerParty = aownerParty;
	}
	public String getSoldToParty() {
		return soldToParty;
	}
	public void setSoldToParty(String soldToParty) {
		this.soldToParty = soldToParty;
	}
	public String getTier2ToParty() {
		return tier2ToParty;
	}
	public void setTier2ToParty(String tier2ToParty) {
		this.tier2ToParty = tier2ToParty;
	}
}
