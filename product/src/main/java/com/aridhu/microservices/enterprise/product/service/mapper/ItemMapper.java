package com.aridhu.microservices.enterprise.product.service.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import com.aridhu.microservices.enterprise.product.service.domain.Item;

@Mapper
public interface ItemMapper {

	@Select("select ITEM_NUMBER, DESCRIPTION, SERVICE_ITEM_FLAG, EOS_DATE,"
			+ " ACTIVE_FLAG, CREATED_BY, TENANT_ID, CREATION_DATE,"
			+ " LAST_UPDATED_BY, LAST_UPDATE_DATE from item where ITEM_NUMBER = #{itemNumber}")
	@Results(value = {
		      @Result(property = "itemNumber", column = "ITEM_NUMBER"),
		      @Result(property="description", column = "DESCRIPTION"),
		      @Result(property = "serviceItem", column = "SERVICE_ITEM_FLAG"),
		      @Result(property = "eosDate", column = "EOS_DATE"),
		      @Result(property = "active", column = "ACTIVE_FLAG"),
		      @Result(property = "createdBy", column = "CREATED_BY"),
		      @Result(property = "tenantId", column = "TENANT_ID"),
		      @Result(property = "creationDate", column = "CREATION_DATE"),
		      @Result(property = "lastUpdatedBy", column = "LAST_UPDATED_BY"),
		      @Result(property = "lastUpdatedDate", column = "LAST_UPDATE_DATE")
		    })
	Item findByItemNumber(@Param("itemNumber") String itemNumber);
	
	
	
	
	@Select("select ITEM_NUMBER, DESCRIPTION, SERVICE_ITEM_FLAG, EOS_DATE,"
			+ " ACTIVE_FLAG, CREATED_BY, TENANT_ID, CREATION_DATE,"
			+ " LAST_UPDATED_BY, LAST_UPDATE_DATE  from item")
	@Results(value = {
		      @Result(property = "itemNumber", column = "ITEM_NUMBER"),
		      @Result(property="description", column = "DESCRIPTION"),
		      @Result(property = "serviceItem", column = "SERVICE_ITEM_FLAG"),
		      @Result(property = "eosDate", column = "EOS_DATE"),
		      @Result(property = "active", column = "ACTIVE_FLAG"),
		      @Result(property = "createdBy", column = "CREATED_BY"),
		      @Result(property = "tenantId", column = "TENANT_ID"),
		      @Result(property = "creationDate", column = "CREATION_DATE"),
		      @Result(property = "lastUpdatedBy", column = "LAST_UPDATED_BY"),
		      @Result(property = "lastUpdatedDate", column = "LAST_UPDATE_DATE")
		    })
	List<Item> findAll();
	
	
	
	
	@Insert("insert into item"
			+ " (ITEM_NUMBER, DESCRIPTION, SERVICE_ITEM_FLAG, EOS_DATE, "
			+ "  ACTIVE_FLAG, CREATED_BY, TENANT_ID, CREATION_DATE, "
			+ "  LAST_UPDATED_BY, LAST_UPDATE_DATE) values "
			+ " (#{itemNumber}, #{description}, #{serviceItem}, #{eosDate},"
			+ "  #{active}, #{createdBy}, #{tenantId}, #{creationDate},"
			+ "  #{lastUpdatedBy}, #{lastUpdatedDate})")
	void saveItem(Item item) throws Exception;
	
}
