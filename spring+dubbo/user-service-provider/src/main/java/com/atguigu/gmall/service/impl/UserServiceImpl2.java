package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

public class UserServiceImpl2 implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....new...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "吴纪福", "1", "吴纪福", "12345645", "Y");
		UserAddress address2 = new UserAddress(2, "李智恩", "1", "吴纪福", "1234567", "N");
		
		return Arrays.asList(address1,address2);
	}

}
