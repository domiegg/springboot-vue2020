package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Shumuleibie;

public interface ShumuleibieMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shumuleibie record);

    int insertSelective(Shumuleibie record);

    Shumuleibie selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shumuleibie record);
	
    int updateByPrimaryKey(Shumuleibie record);
	public Shumuleibie quchongShumuleibie(Map<String, Object> leibie);
	public List<Shumuleibie> getAll(Map<String, Object> map);
	public List<Shumuleibie> getsyshumuleibie1(Map<String, Object> map);
	public List<Shumuleibie> getsyshumuleibie3(Map<String, Object> map);
	public List<Shumuleibie> getsyshumuleibie2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Shumuleibie> getByPage(Map<String, Object> map);
	public List<Shumuleibie> select(Map<String, Object> map);
//	所有List
}

