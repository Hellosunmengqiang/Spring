package com.springdem.dao2;

public interface ClothesDao {
	
	
	public double getPrice(int id);
	
	public int getInventory(int id);//获取衣服的库存
	
	public void updateInventory(int cid,int amount);

}
