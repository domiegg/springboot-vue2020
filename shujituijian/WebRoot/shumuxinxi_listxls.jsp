<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="shumuxinxihsgb" scope="page" class="com.bean.ShumuxinxiBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=shumuxinxi.xls");
%>
<html>
  <head>
    <title>��Ŀ��Ϣ</title>
  </head>

  <body >
 <%
			String sql="select * from shumuxinxi  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td align='center'>��Ŀ���</td>    <td align='center'>��Ŀ����</td>    <td align='center'>��Ŀ���</td>    <td align='center'>�۸�</td>    <td align='center'>����</td>    <td align='center'>������</td>    <td align='center'>����</td>    <td  width='90' align='center'>����</td>        
	
    <td width="120" align="center" bgcolor="CCFFFF">���ʱ��</td>
    
  </tr>
   <%		
				List pagelist3=shumuxinxihsgb.getAllShumuxinxi(11);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.shumubianhao}</td>    <td>${u.shumumingcheng}</td>    <td>${u.shumuleibie}</td>    <td>${u.jiage}</td>    <td>${u.xiaoliang}</td>    <td>${u.chubanshe}</td>    <td>${u.zuozhe}</td>    <td width='90' align='center'><a href='${u.fengmian}' target='_blank'><img src='${u.fengmian}' width=88 height=99 border=0 /></a></td>        
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

