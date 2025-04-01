<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>书目阅读详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  书目阅读详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>书目编号：</td><td width='39%'>${shumuyuedu.shumubianhao}</td>     <td width='11%'>书目名称：</td><td width='39%'>${shumuyuedu.shumumingcheng}</td></tr><tr>     <td width='11%'>书目类别：</td><td width='39%'>${shumuyuedu.shumuleibie}</td>     <td width='11%'>价格：</td><td width='39%'>${shumuyuedu.jiage}</td></tr><tr>     <td width='11%'>销量：</td><td width='39%'>${shumuyuedu.xiaoliang}</td>     <td width='11%'>出版社：</td><td width='39%'>${shumuyuedu.chubanshe}</td></tr><tr>     <td width='11%'>作者：</td><td width='39%'>${shumuyuedu.zuozhe}</td>     <td width='11%'>读者：</td><td width='39%'>${shumuyuedu.duzhe}</td></tr><tr>     <td width='11%'>读后感：</td><td width='39%'>${shumuyuedu.duhougan}</td>     <td>&nbsp;</td><td>&nbsp;</td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

