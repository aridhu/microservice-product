package com.aridhu.microservices.enterprise.product.service.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 
ITEM_NUMBER       NOT NULL VARCHAR2(50)  
DESCRIPTION                VARCHAR2(100) 
SERVICE_ITEM_FLAG          VARCHAR2(1)   
EOS_DATE                   DATE          
ACTIVE_FLAG                VARCHAR2(1)   
CREATED_BY                 NUMBER        
TENANT_ID         NOT NULL NUMBER        
CREATION_DATE              DATE          
LAST_UPDATED_BY            NUMBER        
LAST_UPDATE_DATE           DATE  
 */

public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	private String itemNumber;
	private String description;
	private boolean serviceItem;
	private Date eosDate;
	private boolean active;
	private Long createdBy;
	private Long tenantId;
	private Date creationDate;
	private Long lastUpdatedBy;
	private Date lastUpdatedDate;
	
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isServiceItem() {
		return serviceItem;
	}
	public void setServiceItem(boolean serviceItem) {
		this.serviceItem = serviceItem;
	}
	public Date getEosDate() {
		return eosDate;
	}
	public void setEosDate(Date eosDate) {
		this.eosDate = eosDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Long getTenantId() {
		return tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

}
