package com.service;

import java.util.List;

import com.model.Goods;

public interface GoodsService 
{
	public Goods saveGoods(Goods g);
	public List<Goods> getAllGoods();
    public List<Goods> saveAll(List<Goods> glist);
	public Goods getOneGood(int goodsId);		
	public void deleteById(int gId);
	
	public Goods updateGood(Goods g);
}
