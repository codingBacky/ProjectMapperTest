package com.shard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shard.domain.DetailCartVO;

public interface CartMapper {

	public String getCartnum(String email);
	public void detailCartCntInitUpdate(@Param("itemNum") int itemNum, @Param("cartNum") int cartNum);
	public void cartInsert(String email);
	public void detailCartInsert(@Param("itemNum")int itemNum, @Param("cartNum")int cartNum, @Param("size")String size);
	public List<DetailCartVO> getDetailCart(int cartNum);
	public String getMembership(String email);
	public void chooseDetailCartDelete(@Param("itemNumList")List<Integer> itemNumList, @Param("cartNum")int cartNum);
	public void AllDetailCartDelete(int cartNum);
	
}