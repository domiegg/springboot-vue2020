package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Shumuxinxi;

public interface ShumuxinxiServer {

  public int add(Shumuxinxi po);

  public int update(Shumuxinxi po);
  
  
  
  public int delete(int id);

  public List<Shumuxinxi> getAll(Map<String,Object> map);
  public List<Shumuxinxi> getsyshumuxinxi1(Map<String,Object> map);
  public List<Shumuxinxi> getsyshumuxinxi2(Map<String,Object> map);
  public List<Shumuxinxi> getsyshumuxinxi3(Map<String,Object> map);
  public Shumuxinxi quchongShumuxinxi(Map<String, Object> acount);

  public Shumuxinxi getById( int id);

  public List<Shumuxinxi> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Shumuxinxi> select(Map<String, Object> map);
}
//	所有List
