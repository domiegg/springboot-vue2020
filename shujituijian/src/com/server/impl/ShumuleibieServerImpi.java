package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ShumuleibieMapper;
import com.entity.Shumuleibie;
import com.server.ShumuleibieServer;
@Service
public class ShumuleibieServerImpi implements ShumuleibieServer {
   @Resource
   private ShumuleibieMapper gdao;
	@Override
	public int add(Shumuleibie po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Shumuleibie po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Shumuleibie> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Shumuleibie> getsyshumuleibie1(Map<String, Object> map) {
		return gdao.getsyshumuleibie1(map);
	}
	public List<Shumuleibie> getsyshumuleibie2(Map<String, Object> map) {
		return gdao.getsyshumuleibie2(map);
	}
	public List<Shumuleibie> getsyshumuleibie3(Map<String, Object> map) {
		return gdao.getsyshumuleibie3(map);
	}
	
	@Override
	public Shumuleibie quchongShumuleibie(Map<String, Object> account) {
		return gdao.quchongShumuleibie(account);
	}

	@Override
	public List<Shumuleibie> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Shumuleibie> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Shumuleibie getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

