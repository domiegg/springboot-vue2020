package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ShumuxinxiMapper;
import com.entity.Shumuxinxi;
import com.server.ShumuxinxiServer;
@Service
public class ShumuxinxiServerImpi implements ShumuxinxiServer {
   @Resource
   private ShumuxinxiMapper gdao;
	@Override
	public int add(Shumuxinxi po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Shumuxinxi po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Shumuxinxi> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Shumuxinxi> getsyshumuxinxi1(Map<String, Object> map) {
		return gdao.getsyshumuxinxi1(map);
	}
	public List<Shumuxinxi> getsyshumuxinxi2(Map<String, Object> map) {
		return gdao.getsyshumuxinxi2(map);
	}
	public List<Shumuxinxi> getsyshumuxinxi3(Map<String, Object> map) {
		return gdao.getsyshumuxinxi3(map);
	}
	
	@Override
	public Shumuxinxi quchongShumuxinxi(Map<String, Object> account) {
		return gdao.quchongShumuxinxi(account);
	}

	@Override
	public List<Shumuxinxi> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Shumuxinxi> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Shumuxinxi getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

