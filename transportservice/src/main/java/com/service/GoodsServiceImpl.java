package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dao.GoodsRepository;
import com.model.Farmer;
import com.model.Goods;

@Service
public class GoodsServiceImpl implements GoodsService
{
	@Autowired
	GoodsRepository goodRepo;
	
	public Goods saveGoods(Goods g)
	{
		goodRepo.save(g);
		return g;
	}
	
	public List<Goods> getAllGoods() {
		return goodRepo.findAll();
	}
	
	public List<Goods> saveAll(@RequestBody List<Goods> glist) 
	{
		return goodRepo.saveAll(glist);
	}
	
	public Goods getOneGood(int goodsId) 
	{
		
		return goodRepo.findById(goodsId).orElse(null);
	}
	
	public void deleteById(int gId)
	{
		goodRepo.deleteById(gId);
	}
	
	public Goods updateGood(Goods g) 
	{
		Goods existGoods=goodRepo.findById(g.getGoodsId()).orElse(null);
		existGoods.setDescription(g.getDescription());;
		return goodRepo.save(existGoods);
	}
}

