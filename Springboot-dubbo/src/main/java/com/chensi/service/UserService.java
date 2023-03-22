package com.chensi.service;

import com.chensi.bean.UserAddress;

import java.util.List;

/*
 * @author  chensi
 * @date  2023/1/31
 */
public interface UserService {
	/**
	 * 根据用户id返回所有的收货地址
	 */
	List<UserAddress> getUserAddressList(String userId);

}
