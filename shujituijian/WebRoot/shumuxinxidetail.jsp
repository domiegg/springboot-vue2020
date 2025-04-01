<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>

<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>书目信息</title>

<meta name="generator" content="" />
<meta name="author" content="" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<script src="qtimages/js/jquery-1.8.3.min.js"></script>
<script src="qtimages/js/jquery.superslide.2.1.js"></script>
<link rel="stylesheet" type="text/css" href="qtimages/css/common.css">
<link rel="stylesheet" type="text/css" href="qtimages/css/common1.css">
<link type="text/css" rel="stylesheet" href="qtimages/css/flexslider.css" />
<link rel="stylesheet" type="text/css" href="qtimages/css/index.css">
<link rel="stylesheet" type="text/css" href="qtimages/css/main.css">
<link href="qtimages/css/index1.css" rel="stylesheet">
<link href="qtimages/css/zzsc.css" rel="stylesheet" type="text/css">

<script src="qtimages/js/hsggundong.js"></script>
</head>
<script language=javascript src='js/popup.js'></script>
<script language=javascript> 
function hsgpinglun(nbiao,nid){ 
popheight=450;
pop('hsgpinglun.jsp?biao='+nbiao+'&id='+nid,'在线评论',550,250) ;
}
</script> 
<%
	String id=request.getParameter("id");
	
     %>
<body>
  <jsp:include page="qttop.jsp"></jsp:include>
<jsp:include page="bht.jsp"></jsp:include>

  <div class="layout bg6">
    <div class="lei_mian">
      <h3><a href="index.do">首页</a> 书目信息 </h3>
    </div>
  </div>

<div style="width:1200px; margin:0 auto;">

                    
					
   <table width="100%" border="0" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse"  class="newsline">  
      <tr>
		 <td width='11%' height=44>书目编号：</td><td width='39%'>${shumuxinxi.shumubianhao}</td><td  rowspan=7 align=center><a href=${shumuxinxi.fengmian} target=_blank><img src=${shumuxinxi.fengmian}  width=228 height=215 border=0></a></td></tr><tr>         <td width='11%' height=44>书目名称：</td><td width='39%'>${shumuxinxi.shumumingcheng}</td></tr><tr>         <td width='11%' height=44>书目类别：</td><td width='39%'>${shumuxinxi.shumuleibie}</td></tr><tr>         <td width='11%' height=44>价格：</td><td width='39%'>${shumuxinxi.jiage}</td></tr><tr>         <td width='11%' height=44>销量：</td><td width='39%'>${shumuxinxi.xiaoliang}</td></tr><tr>         <td width='11%' height=44>出版社：</td><td width='39%'>${shumuxinxi.chubanshe}</td></tr><tr>         <td width='11%' height=44>作者：</td><td width='39%'>${shumuxinxi.zuozhe}</td></tr><tr>                           <td width='11%' height=100  >书目简介：</td><td width='39%' colspan=2 height=100 >${shumuxinxi.shumujianjie}</td></tr><tr>							 
                                <td colspan="3"><table width="100%" border="0" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse" class="newsline">
                                  <tr>
                                    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
                                    <td width="471" bgcolor='#CCFFFF'>评价内容</td>
                                    <td width="88" bgcolor='#CCFFFF'>评分</td>
                                    <td width="88" bgcolor='#CCFFFF'>评论人</td>
                                    <td width="138" align="center" bgcolor="CCFFFF">评论时间</td>
                                  </tr>
								  <%@page import="com.util.db"%>
                                   <%
								   int pli=0;
    for(HashMap map:new db().getpinglun("shangpinxinxi",id)){
	pli=pli+1;
     %>
                                   <tr>
                                    <td width="30" align="center" bgcolor='#CCFF99'><%=pli%></td>
                                    <td width="471" bgcolor='#CCFF99'><%=map.get("pinglunneirong") %></td>
                                    <td width="88" bgcolor='#CCFF99'><%=map.get("pingfen") %></td>
                                    <td width="88" bgcolor='#CCFF99'><%=map.get("pinglunren") %></td>
                                    <td width="138" align="center" bgcolor="CCFF99"><%=map.get("addtime") %></td>
                                  </tr>
                                  <%
								 
								  }
								   %>
                                </table></td>
                                </tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" /><input type=button name=Submit52 value=打印 onClick="javascript:window.print()" /> <input type="button" name="shumuxinxishumuyuedu" value="书目阅读" onclick="javascript:location.href='shumuyueduadd.jsp?id=${shumuxinxi.id}';"> <!--jixaaxnnxiu--><input type=button name=Submit53 value=评论 onClick="javascript:hsgpinglun('shumuxinxi','<%=id%>')"/></td></tr>
    
  </table>
                     
					  
					
					  
					  
				</div>	  
  <jsp:include page="qtdown.jsp"></jsp:include>
  
</body> 
</html>
