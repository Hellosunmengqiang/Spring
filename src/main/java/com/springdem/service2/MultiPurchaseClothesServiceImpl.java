package com.springdem.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("multiPurchaseClothesService")
public class MultiPurchaseClothesServiceImpl implements MultiClothesService{

	@Autowired
	private ClothesService clothesService;
	
	//@Transactional
	@Override
	public void multiPurchaseClothes(int uid, int[] cids, int[] amounts) {
		// TODO 自动生成的方法存根
		for(int i=0;i<cids.length;i++)
		clothesService.purchaseClothes(uid, cids[i], amounts[i]);
	}

}
