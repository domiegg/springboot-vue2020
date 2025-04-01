<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>书目信息详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  书目信息详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%' height=44>书目编号：</td><td width='39%'>${shumuxinxi.shumubianhao}</td><td  rowspan=7 align=center><a href=${shumuxinxi.fengmian} target=_blank><img src=${shumuxinxi.fengmian} width=228 height=215 border=0></a></td></tr><tr><td width='11%' height=44>书目名称：</td><td width='39%'>${shumuxinxi.shumumingcheng}</td></tr><tr><td width='11%' height=44>书目类别：</td><td width='39%'>${shumuxinxi.shumuleibie}</td></tr><tr><td width='11%' height=44>价格：</td><td width='39%'>${shumuxinxi.jiage}</td></tr><tr><td width='11%' height=44>销量：</td><td width='39%'>${shumuxinxi.xiaoliang}</td></tr><tr><td width='11%' height=44>出版社：</td><td width='39%'>${shumuxinxi.chubanshe}</td></tr><tr><td width='11%' height=44>作者：</td><td width='39%'>${shumuxinxi.zuozhe}</td></tr><tr><td width='11%' height=100  >书目简介：</td><td width='39%' colspan=2 height=100 >${shumuxinxi.shumujianjie}</td></tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

