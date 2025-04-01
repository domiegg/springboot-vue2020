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

import com.entity.Shumuyuedu;
import com.server.ShumuyueduServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class ShumuyueduController {
	@Resource
	private ShumuyueduServer shumuyueduService;


   
	@RequestMapping("addShumuyuedu.do")
	public String addShumuyuedu(HttpServletRequest request,Shumuyuedu shumuyuedu,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		shumuyuedu.setAddtime(time.toString().substring(0, 19));
		shumuyueduService.add(shumuyuedu);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "shumuyueduList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:shumuyueduList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateShumuyuedu.do")
	public String doUpdateShumuyuedu(int id,ModelMap map,Shumuyuedu shumuyuedu){
		shumuyuedu=shumuyueduService.getById(id);
		map.put("shumuyuedu", shumuyuedu);
		return "shumuyuedu_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("shumuyueduDetail.do")
	public String shumuyueduDetail(int id,ModelMap map,Shumuyuedu shumuyuedu){
		shumuyuedu=shumuyueduService.getById(id);
		map.put("shumuyuedu", shumuyuedu);
		return "shumuyuedu_detail";
	}
//	前台详细
	@RequestMapping("smydDetail.do")
	public String smydDetail(int id,ModelMap map,Shumuyuedu shumuyuedu){
		shumuyuedu=shumuyueduService.getById(id);
		map.put("shumuyuedu", shumuyuedu);
		return "shumuyuedudetail";
	}
//	
	@RequestMapping("updateShumuyuedu.do")
	public String updateShumuyuedu(int id,ModelMap map,Shumuyuedu shumuyuedu,HttpServletRequest request,HttpSession session){
		shumuyueduService.update(shumuyuedu);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:shumuyueduList.do";
	}

//	分页查询
	@RequestMapping("shumuyueduList.do")
	public String shumuyueduList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shumuyuedu shumuyuedu, String shumubianhao, String shumumingcheng, String shumuleibie, String jiage, String xiaoliang, String chubanshe, String zuozhe, String duzhe, String duhougan){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(shumubianhao==null||shumubianhao.equals("")){pmap.put("shumubianhao", null);}else{pmap.put("shumubianhao", shumubianhao);}		if(shumumingcheng==null||shumumingcheng.equals("")){pmap.put("shumumingcheng", null);}else{pmap.put("shumumingcheng", shumumingcheng);}		if(shumuleibie==null||shumuleibie.equals("")){pmap.put("shumuleibie", null);}else{pmap.put("shumuleibie", shumuleibie);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(xiaoliang==null||xiaoliang.equals("")){pmap.put("xiaoliang", null);}else{pmap.put("xiaoliang", xiaoliang);}		if(chubanshe==null||chubanshe.equals("")){pmap.put("chubanshe", null);}else{pmap.put("chubanshe", chubanshe);}		if(zuozhe==null||zuozhe.equals("")){pmap.put("zuozhe", null);}else{pmap.put("zuozhe", zuozhe);}		if(duzhe==null||duzhe.equals("")){pmap.put("duzhe", null);}else{pmap.put("duzhe", duzhe);}		if(duhougan==null||duhougan.equals("")){pmap.put("duhougan", null);}else{pmap.put("duhougan", duhougan);}		
		int total=shumuyueduService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shumuyuedu> list=shumuyueduService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shumuyuedu_list";
	}
	
	@RequestMapping("shumuyueduList2.do")
	public String shumuyueduList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shumuyuedu shumuyuedu, String shumubianhao, String shumumingcheng, String shumuleibie, String jiage, String xiaoliang, String chubanshe, String zuozhe, String duzhe, String duhougan,HttpServletRequest request){
		/*if(session.getAttribute("user")==null){
			return "login";
		}*/
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		pmap.put("duzhe", (String)request.getSession().getAttribute("username"));
		if(shumubianhao==null||shumubianhao.equals("")){pmap.put("shumubianhao", null);}else{pmap.put("shumubianhao", shumubianhao);}		if(shumumingcheng==null||shumumingcheng.equals("")){pmap.put("shumumingcheng", null);}else{pmap.put("shumumingcheng", shumumingcheng);}		if(shumuleibie==null||shumuleibie.equals("")){pmap.put("shumuleibie", null);}else{pmap.put("shumuleibie", shumuleibie);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(xiaoliang==null||xiaoliang.equals("")){pmap.put("xiaoliang", null);}else{pmap.put("xiaoliang", xiaoliang);}		if(chubanshe==null||chubanshe.equals("")){pmap.put("chubanshe", null);}else{pmap.put("chubanshe", chubanshe);}		if(zuozhe==null||zuozhe.equals("")){pmap.put("zuozhe", null);}else{pmap.put("zuozhe", zuozhe);}		if(duhougan==null||duhougan.equals("")){pmap.put("duhougan", null);}else{pmap.put("duhougan", duhougan);}		
		
		int total=shumuyueduService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shumuyuedu> list=shumuyueduService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shumuyuedu_list2";
	}	
	
	@RequestMapping("smydList.do")
	public String smydList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shumuyuedu shumuyuedu, String shumubianhao, String shumumingcheng, String shumuleibie, String jiage, String xiaoliang, String chubanshe, String zuozhe, String duzhe, String duhougan){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(shumubianhao==null||shumubianhao.equals("")){pmap.put("shumubianhao", null);}else{pmap.put("shumubianhao", shumubianhao);}		if(shumumingcheng==null||shumumingcheng.equals("")){pmap.put("shumumingcheng", null);}else{pmap.put("shumumingcheng", shumumingcheng);}		if(shumuleibie==null||shumuleibie.equals("")){pmap.put("shumuleibie", null);}else{pmap.put("shumuleibie", shumuleibie);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(xiaoliang==null||xiaoliang.equals("")){pmap.put("xiaoliang", null);}else{pmap.put("xiaoliang", xiaoliang);}		if(chubanshe==null||chubanshe.equals("")){pmap.put("chubanshe", null);}else{pmap.put("chubanshe", chubanshe);}		if(zuozhe==null||zuozhe.equals("")){pmap.put("zuozhe", null);}else{pmap.put("zuozhe", zuozhe);}		if(duzhe==null||duzhe.equals("")){pmap.put("duzhe", null);}else{pmap.put("duzhe", duzhe);}		if(duhougan==null||duhougan.equals("")){pmap.put("duhougan", null);}else{pmap.put("duhougan", duhougan);}		
		int total=shumuyueduService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shumuyuedu> list=shumuyueduService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shumuyuedulist";
	}
	
	@RequestMapping("deleteShumuyuedu.do")
	public String deleteShumuyuedu(int id,HttpServletRequest request){
		shumuyueduService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:shumuyueduList.do";
	}
	
	
}
