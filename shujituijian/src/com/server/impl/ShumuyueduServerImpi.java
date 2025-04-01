package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ShumuyueduMapper;
import com.entity.Shumuyuedu;
import com.server.ShumuyueduServer;
@Service
public class ShumuyueduServerImpi implements ShumuyueduServer {
   @Resource
   private ShumuyueduMapper gdao;
	@Override
	public int add(Shumuyuedu po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Shumuyuedu po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Shumuyuedu> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Shumuyuedu> getsyshumuyuedu1(Map<String, Object> map) {
		return gdao.getsyshumuyuedu1(map);
	}
	public List<Shumuyuedu> getsyshumuyuedu2(Map<String, Object> map) {
		return gdao.getsyshumuyuedu2(map);
	}
	public List<Shumuyuedu> getsyshumuyuedu3(Map<String, Object> map) {
		return gdao.getsyshumuyuedu3(map);
	}
	
	@Override
	public Shumuyuedu quchongShumuyuedu(Map<String, Object> account) {
		return gdao.quchongShumuyuedu(account);
	}

	@Override
	public List<Shumuyuedu> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Shumuyuedu> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Shumuyuedu getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

