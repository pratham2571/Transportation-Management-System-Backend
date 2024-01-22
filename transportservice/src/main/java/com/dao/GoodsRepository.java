package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Goods;

public interface GoodsRepository extends JpaRepository<Goods ,Integer>
{

}
