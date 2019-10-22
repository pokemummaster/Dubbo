package com.atguigu.gmall.service.impl;

import java.util.List;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;

	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("这是我的id"+userId);
		//1銆佹煡璇㈢敤鎴风殑鏀惰揣鍦板潃
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}
	
	

}
