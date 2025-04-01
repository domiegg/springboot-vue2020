package com.controller;

import java.io.File;
import java.io.IOException;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Shumuleibie;
import com.server.ShumuleibieServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class ShumuleibieController {
	@Resource
	private ShumuleibieServer shumuleibieService;


   
	@RequestMapping("addShumuleibie.do")
	public String addShumuleibie(HttpServletRequest request,Shumuleibie shumuleibie,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		shumuleibie.setAddtime(time.toString().substring(0, 19));
		shumuleibieService.add(shumuleibie);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "shumuleibieList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:shumuleibieList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateShumuleibie.do")
	public String doUpdateShumuleibie(int id,ModelMap map,Shumuleibie shumuleibie){
		shumuleibie=shumuleibieService.getById(id);
		map.put("shumuleibie", shumuleibie);
		return "shumuleibie_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("shumuleibieDetail.do")
	public String shumuleibieDetail(int id,ModelMap map,Shumuleibie shumuleibie){
		shumuleibie=shumuleibieService.getById(id);
		map.put("shumuleibie", shumuleibie);
		return "shumuleibie_detail";
	}
//	前台详细
	@RequestMapping("smlbDetail.do")
	public String smlbDetail(int id,ModelMap map,Shumuleibie shumuleibie){
		shumuleibie=shumuleibieService.getById(id);
		map.put("shumuleibie", shumuleibie);
		return "shumuleibiedetail";
	}
//	
	@RequestMapping("updateShumuleibie.do")
	public String updateShumuleibie(int id,ModelMap map,Shumuleibie shumuleibie,HttpServletRequest request,HttpSession session){
		shumuleibieService.update(shumuleibie);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:shumuleibieList.do";
	}

//	分页查询
	@RequestMapping("shumuleibieList.do")
	public String shumuleibieList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shumuleibie shumuleibie, String leibie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}		
		int total=shumuleibieService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shumuleibie> list=shumuleibieService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shumuleibie_list";
	}
	
	
	
	@RequestMapping("smlbList.do")
	public String smlbList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shumuleibie shumuleibie, String leibie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}		
		int total=shumuleibieService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shumuleibie> list=shumuleibieService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shumuleibielist";
	}
	
	@RequestMapping("deleteShumuleibie.do")
	public String deleteShumuleibie(int id,HttpServletRequest request){
		shumuleibieService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:shumuleibieList.do";
	}
	
	
}
