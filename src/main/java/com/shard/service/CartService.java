package com.shard.service;

import java.util.List;
import java.util.OptionalInt;

import com.shard.domain.DetailCartVO;
import com.shard.domain.ItemVO;

public interface CartService {
	public void initCart(String email, OptionalInt itemNum, String size);
	public List<ItemVO> detailOrderItems(int cartNum);
	//멤버십에 따른 배송비, 적립률 산정을 위한
	public int getMembership(String email);
	public int getPointRate(int memNum);
	public int  deliveryCharge(int memNum);
	public void chooseDetailCartDelete(List<Integer> itemNumList,int cartNum);
	public void allDetailCartDelete(int cartNum);
	//계산
	//DetailOrderVO에서 cartItemCnt추출해서 List애 담음
	public List<Integer> extractCartItemCnts(List<DetailCartVO> detailOrders);
	//List[ item.itemNum의 sale * detailcart.cartNum/email 의 cartItemCnt ]를 SUM 
	public int calculateTotalPrice(List<Integer> sales, List<Integer> cartItemCnts);

}