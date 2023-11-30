package com.shard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shard.domain.PayVO;

public interface PayMapper {
	//pay 생성
	public void payInsert(PayVO pvo);
	//결제완료된 상품들을 cart에서 삭제
	public void cartDelete(@Param("cartNum")int cartNum, @Param("itemNumList")List<Integer> itemNumList);
	//결제완료된 사용한쿠폰에 orderId 추가
	public void useCouponIssuanceUpdate(@Param("orderId")int orderId, @Param("issueNum")int issueNum);
	//결제완료시 payComplete->1로 변경
	public void payCompleteUpdate(int orderId);
	//결제완료시 orders.usePoint 사용포인트와 주문완료여부 = 1 로 수정
	public void ordersUpdate(@Param("usePoint")int usePoint, @Param("orderId")int orderId);
	//결제완료시 
	public void customerPointUpdate(@Param("usedpoint")int usedpoint, @Param("email")String email);
//	public int getTotalAmountForLast3Months(String email);
//	public void membershipUpdate(@Param("memNum")int memNum, @Param("email")String email);
	
}