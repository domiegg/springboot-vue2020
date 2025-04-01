package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Shumuyuedu;

public interface ShumuyueduServer {

  public int add(Shumuyuedu po);

  public int update(Shumuyuedu po);
  
  
  
  public int delete(int id);

  public List<Shumuyuedu> getAll(Map<String,Object> map);
  public List<Shumuyuedu> getsyshumuyuedu1(Map<String,Object> map);
  public List<Shumuyuedu> getsyshumuyuedu2(Map<String,Object> map);
  public List<Shumuyuedu> getsyshumuyuedu3(Map<String,Object> map);
  public Shumuyuedu quchongShumuyuedu(Map<String, Object> acount);

  public Shumuyuedu getById( int id);

  public List<Shumuyuedu> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Shumuyuedu> select(Map<String, Object> map);
}
//	所有List
