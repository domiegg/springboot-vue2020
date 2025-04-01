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
		<TITLE>添加书目信息</TITLE>
	    

 	<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>      
	</head>
<%
  String id="";
   %>

<script language="javascript">

function gows()
{
	document.location.href="shumuxinxi_add.jsp?id=<%=id%>";
}
function hsgxia2shxurxu(nstr,nwbk)
{
	if (eval("form1."+nwbk).value.indexOf(nstr)>=0)
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value.replace(nstr+"；", "");
	}
	else
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value+nstr+"；";
	}
}
</script>
	<body>
			<form action="addShumuxinxi.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">添加书目信息</td>
						</tr>
						<tr ><td width="200">书目编号：</td><td><input name='shumubianhao' type='text' id='shumubianhao' value='<%=connDbBean.getID()%>' onblur='' style='border:solid 1px #000000; color:#666666' /></td></tr>		<tr ><td width="200">书目名称：</td><td><input name='shumumingcheng' type='text' id='shumumingcheng' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelshumumingcheng' /></td></tr>		<tr ><td width="200">书目类别：</td><td><select name='shumuleibie' id='shumuleibie' style=' height:19px; border:solid 1px #000000; color:#666666'><%=connDbBean.hsggetoption("shumuleibie","leibie")%></select></td></tr>		<tr ><td width="200">价格：</td><td><input name='jiage' type='text' id='jiage' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;<label id='clabeljiage' />必需数字型</td></tr>		<tr ><td width="200">销量：</td><td><input name='xiaoliang' type='text' id='xiaoliang' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;<label id='clabelxiaoliang' />必需数字型</td></tr>		<tr ><td width="200">出版社：</td><td><input name='chubanshe' type='text' id='chubanshe' value='' onblur='' size='50' style='border:solid 1px #000000; color:#666666' /></td></tr>		<tr ><td width="200">作者：</td><td><input name='zuozhe' type='text' id='zuozhe' value='' onblur='' style='border:solid 1px #000000; color:#666666' /></td></tr>		<tr ><td width="200">封面：</td><td><input name='fengmian' type='text' id='fengmian' size='50' value='' onblur='' style='border:solid 1px #000000; color:#666666' />&nbsp;<input type='button' value='上传' onClick="up('fengmian')" style='border:solid 1px #000000; color:#666666'/></td></tr>		<tr ><td width="200">书目简介：</td><td><textarea name='shumujianjie' cols='50' rows='5' id='shumujianjie' onblur='' style='border:solid 1px #000000; color:#666666' ></textarea></td></tr>		
		
						<tr align='center'   height="22">
						    <td width="25%"  align="right">&nbsp;
						        
						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();"/>
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>






<script language=javascript >  
 
 function checkform(){  
 
	var shumumingchengobj = document.getElementById("shumumingcheng"); if(shumumingchengobj.value==""){document.getElementById("clabelshumumingcheng").innerHTML="&nbsp;&nbsp;<font color=red>请输入书目名称</font>";return false;}else{document.getElementById("clabelshumumingcheng").innerHTML="  "; } 	var jiageobj = document.getElementById("jiage"); if(jiageobj.value!=""){ if(/^[0-9]+.?[0-9]*$/.test(jiageobj.value)){document.getElementById("clabeljiage").innerHTML=""; }else{document.getElementById("clabeljiage").innerHTML="&nbsp;&nbsp;<font color=red>必需数字型</font>"; return false;}}      var xiaoliangobj = document.getElementById("xiaoliang"); if(xiaoliangobj.value!=""){ if(/^[0-9]+.?[0-9]*$/.test(xiaoliangobj.value)){document.getElementById("clabelxiaoliang").innerHTML=""; }else{document.getElementById("clabelxiaoliang").innerHTML="&nbsp;&nbsp;<font color=red>必需数字型</font>"; return false;}}      


return true;   
}   
popheight=450;
</script>  
