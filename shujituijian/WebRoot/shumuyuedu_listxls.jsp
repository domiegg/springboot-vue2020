<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="shumuyueduhsgb" scope="page" class="com.bean.ShumuyueduBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=shumuyuedu.xls");
%>
<html>
  <head>
    <title>��Ŀ�Ķ�</title>
  </head>

  <body >
 <%
			String sql="select * from shumuyuedu  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td align='center'>��Ŀ���</td>    <td align='center'>��Ŀ����</td>    <td align='center'>��Ŀ���</td>    <td align='center'>�۸�</td>    <td align='center'>����</td>    <td align='center'>������</td>    <td align='center'>����</td>    <td align='center'>����</td>        
	
    <td width="120" align="center" bgcolor="CCFFFF">���ʱ��</td>
    
  </tr>
   <%		
				List pagelist3=shumuyueduhsgb.getAllShumuyuedu(11);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.shumubianhao}</td>    <td>${u.shumumingcheng}</td>    <td>${u.shumuleibie}</td>    <td>${u.jiage}</td>    <td>${u.xiaoliang}</td>    <td>${u.chubanshe}</td>    <td>${u.zuozhe}</td>    <td>${u.duzhe}</td>        
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

