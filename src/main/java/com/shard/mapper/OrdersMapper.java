package com.shard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

import com.shard.domain.CouponIssuanceVO;
import com.shard.domain.CouponVO;
import com.shard.domain.DeliverAddrVO;
import com.shard.domain.DetailOrderVO;
import com.shard.domain.ItemVO;
import com.shard.domain.ShardMemberVO;

public interface OrdersMapper {

	public void orderInsert(@Param("totalPrice") int totalPrice, @Param("email") String email);
	// 삽입 후 생성된 키 받기
	@SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="orderId", before=false, resultType=int.class)
	public int getLastInsertId();
	
	public void detailOrderInsert(DetailOrderVO dvo);
	public ShardMemberVO getCustomer(String email);
	public List<Integer> getDetailOrder(int orderId);
	public List<ItemVO> getDetailOrderItem(@Param("itemNumList")List<Integer> itemNumList);
	public void addDeliverAddr(DeliverAddrVO dvo);
	public List<CouponIssuanceVO> getCoupon(String email);
	public List<CouponVO> getDiscount(@Param("couponNumList")List<Integer> couponNumList);
	//참조된 detailOrder먼저 삭제 후 orders삭제
	public void detailOrdersDelete(int orderId);
	public void ordersDelete(int orderId);
	public void payCompleteUpdate();
	public void ordersUpdate(int usePoint);
	public void customerPointUpdate(int usedPoint);
	public int getTotalAmountForLast3Months(String email);
	public int membershipUpdate(int memNum);
	
	}