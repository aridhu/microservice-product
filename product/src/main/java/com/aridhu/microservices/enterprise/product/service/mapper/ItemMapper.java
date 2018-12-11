package com.aridhu.microservices.enterprise.product.service.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.aridhu.microservices.enterprise.product.service.domain.Item;

@Mapper
public interface ItemMapper {

	@Select("select * from item where ITEM_NUMBER = #{itemNumber}")
	Item findByItemNumber(@Param("itemNumber") Long itemNumber);
	
	@Select("select * from item")
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
