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

import com.entity.Shumuxinxi;
import com.server.ShumuxinxiServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class ShumuxinxiController {
	@Resource
	private ShumuxinxiServer shumuxinxiService;
	private HttpServletRequest request2;


   
	@RequestMapping("addShumuxinxi.do")
	public String addShumuxinxi(HttpServletRequest request,Shumuxinxi shumuxinxi,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		shumuxinxi.setAddtime(time.toString().substring(0, 19));
		shumuxinxiService.add(shumuxinxi);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "shumuxinxiList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:shumuxinxiList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateShumuxinxi.do")
	public String doUpdateShumuxinxi(int id,ModelMap map,Shumuxinxi shumuxinxi){
		shumuxinxi=shumuxinxiService.getById(id);
		map.put("shumuxinxi", shumuxinxi);
		return "shumuxinxi_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("shumuxinxiDetail.do")
	public String shumuxinxiDetail(int id,ModelMap map,Shumuxinxi shumuxinxi){
		shumuxinxi=shumuxinxiService.getById(id);
		map.put("shumuxinxi", shumuxinxi);
		return "shumuxinxi_detail";
	}
//	前台详细
	@RequestMapping("smxxDetail.do")
	public String smxxDetail(int id,ModelMap map,Shumuxinxi shumuxinxi){
		shumuxinxi=shumuxinxiService.getById(id);
		map.put("shumuxinxi", shumuxinxi);
		return "shumuxinxidetail";
	}
//	
	@RequestMapping("updateShumuxinxi.do")
	public String updateShumuxinxi(int id,ModelMap map,Shumuxinxi shumuxinxi,HttpServletRequest request,HttpSession session){
		shumuxinxiService.update(shumuxinxi);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:shumuxinxiList.do";
	}

//	分页查询
	@RequestMapping("shumuxinxiList.do")
	public String shumuxinxiList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shumuxinxi shumuxinxi, String shumubianhao, String shumumingcheng, String shumuleibie, String jiage1,String jiage2, String xiaoliang1,String xiaoliang2, String chubanshe, String zuozhe, String fengmian, String shumujianjie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(shumubianhao==null||shumubianhao.equals("")){pmap.put("shumubianhao", null);}else{pmap.put("shumubianhao", shumubianhao);}
		if(shumumingcheng==null||shumumingcheng.equals("")){pmap.put("shumumingcheng", null);}else{pmap.put("shumumingcheng", shumumingcheng);}
		if(shumuleibie==null||shumuleibie.equals("")){pmap.put("shumuleibie", null);}else{pmap.put("shumuleibie", shumuleibie);}
		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}
		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}
		if(xiaoliang1==null||xiaoliang1.equals("")){pmap.put("xiaoliang1", null);}else{pmap.put("xiaoliang1", xiaoliang1);}
		if(xiaoliang2==null||xiaoliang2.equals("")){pmap.put("xiaoliang2", null);}else{pmap.put("xiaoliang2", xiaoliang2);}
		if(chubanshe==null||chubanshe.equals("")){pmap.put("chubanshe", null);}else{pmap.put("chubanshe", chubanshe);}
		if(zuozhe==null||zuozhe.equals("")){pmap.put("zuozhe", null);}else{pmap.put("zuozhe", zuozhe);}
		if(fengmian==null||fengmian.equals("")){pmap.put("fengmian", null);}else{pmap.put("fengmian", fengmian);}
		if(shumujianjie==null||shumujianjie.equals("")){pmap.put("shumujianjie", null);}else{pmap.put("shumujianjie", shumujianjie);}
		
		int total=shumuxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shumuxinxi> list=shumuxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shumuxinxi_list";
	}
	
	
	
	@RequestMapping("smxxList.do")
	public String smxxList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shumuxinxi shumuxinxi, String shumubianhao, String shumumingcheng, String shumuleibie, String jiage1,String jiage2, String xiaoliang1,String xiaoliang2, String chubanshe, String zuozhe, String fengmian, String shumujianjie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(shumubianhao==null||shumubianhao.equals("")){pmap.put("shumubianhao", null);}else{pmap.put("shumubianhao", shumubianhao);}
		if(shumumingcheng==null||shumumingcheng.equals("")){pmap.put("shumumingcheng", null);}else{pmap.put("shumumingcheng", shumumingcheng);}
		if(shumuleibie==null||shumuleibie.equals("")){pmap.put("shumuleibie", null);}else{pmap.put("shumuleibie", shumuleibie);}
		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}
		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}
		if(xiaoliang1==null||xiaoliang1.equals("")){pmap.put("xiaoliang1", null);}else{pmap.put("xiaoliang1", xiaoliang1);}
		if(xiaoliang2==null||xiaoliang2.equals("")){pmap.put("xiaoliang2", null);}else{pmap.put("xiaoliang2", xiaoliang2);}
		if(chubanshe==null||chubanshe.equals("")){pmap.put("chubanshe", null);}else{pmap.put("chubanshe", chubanshe);}
		if(zuozhe==null||zuozhe.equals("")){pmap.put("zuozhe", null);}else{pmap.put("zuozhe", zuozhe);}
		if(fengmian==null||fengmian.equals("")){pmap.put("fengmian", null);}else{pmap.put("fengmian", fengmian);}
		if(shumujianjie==null||shumujianjie.equals("")){pmap.put("shumujianjie", null);}else{pmap.put("shumujianjie", shumujianjie);}
		
		int total=shumuxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shumuxinxi> list=shumuxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shumuxinxilist";
	}


	@RequestMapping("deleteShumuxinxi.do")
	public String deleteShumuxinxi(int id,HttpServletRequest request){
		shumuxinxiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:shumuxinxiList.do";
	}
	
	
}
