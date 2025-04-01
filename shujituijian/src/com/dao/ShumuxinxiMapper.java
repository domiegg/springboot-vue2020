package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Shumuxinxi;

public interface ShumuxinxiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shumuxinxi record);

    int insertSelective(Shumuxinxi record);

    Shumuxinxi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shumuxinxi record);
	
    int updateByPrimaryKey(Shumuxinxi record);
	public Shumuxinxi quchongShumuxinxi(Map<String, Object> shumubianhao);
	public List<Shumuxinxi> getAll(Map<String, Object> map);
	public List<Shumuxinxi> getsyshumuxinxi1(Map<String, Object> map);
	public List<Shumuxinxi> getsyshumuxinxi3(Map<String, Object> map);
	public List<Shumuxinxi> getsyshumuxinxi2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Shumuxinxi> getByPage(Map<String, Object> map);
	public List<Shumuxinxi> select(Map<String, Object> map);
//	所有List
}

