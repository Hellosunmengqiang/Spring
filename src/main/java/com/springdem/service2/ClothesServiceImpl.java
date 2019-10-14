package com.springdem.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springdem.dao2.ClothesDao;
import com.springdem.dao2.UsersDao;

@Service("clothesService")
public class ClothesServiceImpl implements ClothesService {

	@Autowired
	private UsersDao usersdao;
	@Autowired
	private ClothesDao clothesDao;
	
	//传播属性：REQUIRED，表示multiPurchaseClothes和purchaseClothes方法，使用一个事务
	//传播事务：REQUIRES_NEW,表示multiPurchaseClothes和purchaseClothes方法，使用的是各自的事务
	//@Transactional(propagation=Propagation.REQUIRES_NEW) 
	@Override
	public void purchaseClothes(int uid, int cid, int amount) {
		//1.通过点击按钮获取衣服的id，用户的id，用户购买的数量
		//2.通过衣服的id获取到衣服的单价，计算出总价格
		double price=clothesDao.getPrice(cid);
		double sumPrice=amount*price;
		//3.从衣服的库存中减除购买的数量
		clothesDao.updateInventory(cid, amount);
		//4.从用户的余额中去除购买衣服的金额
		usersdao.updateBalance(uid, sumPrice);

	}

}
