package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Shumuyuedu;

public interface ShumuyueduMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shumuyuedu record);

    int insertSelective(Shumuyuedu record);

    Shumuyuedu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shumuyuedu record);
	
    int updateByPrimaryKey(Shumuyuedu record);
	public Shumuyuedu quchongShumuyuedu(Map<String, Object> duzhe);
	public List<Shumuyuedu> getAll(Map<String, Object> map);
	public List<Shumuyuedu> getsyshumuyuedu1(Map<String, Object> map);
	public List<Shumuyuedu> getsyshumuyuedu3(Map<String, Object> map);
	public List<Shumuyuedu> getsyshumuyuedu2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Shumuyuedu> getByPage(Map<String, Object> map);
	public List<Shumuyuedu> select(Map<String, Object> map);
//	所有List
}

