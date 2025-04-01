package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Shumuleibie;

public interface ShumuleibieServer {

  public int add(Shumuleibie po);

  public int update(Shumuleibie po);
  
  
  
  public int delete(int id);

  public List<Shumuleibie> getAll(Map<String,Object> map);
  public List<Shumuleibie> getsyshumuleibie1(Map<String,Object> map);
  public List<Shumuleibie> getsyshumuleibie2(Map<String,Object> map);
  public List<Shumuleibie> getsyshumuleibie3(Map<String,Object> map);
  public Shumuleibie quchongShumuleibie(Map<String, Object> acount);

  public Shumuleibie getById( int id);

  public List<Shumuleibie> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Shumuleibie> select(Map<String, Object> map);
}
//	所有List
