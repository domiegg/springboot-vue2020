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
		<TITLE>修改书目阅读</TITLE>
	    
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
	document.location.href="shumuyuedu_add.jsp?id=<%=id%>";
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
			<form action="updateShumuyuedu.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">修改书目阅读<input type="hidden" name="id" value="${shumuyuedu.id}" /></td>
						</tr>
						<tr ><td width="200">书目编号：</td><td><input name='shumubianhao' type='text' id='shumubianhao' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">书目名称：</td><td><input name='shumumingcheng' type='text' id='shumumingcheng' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">书目类别：</td><td><input name='shumuleibie' type='text' id='shumuleibie' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">价格：</td><td><input name='jiage' type='text' id='jiage' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">销量：</td><td><input name='xiaoliang' type='text' id='xiaoliang' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">出版社：</td><td><input name='chubanshe' type='text' id='chubanshe' value='' onblur='' style='border:solid 1px #000000; color:#666666' /></td></tr>		<tr ><td width="200">作者：</td><td><input name='zuozhe' type='text' id='zuozhe' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">读者：</td><td><input name='duzhe' type='text' id='duzhe' onblur='' style='border:solid 1px #000000; color:#666666' value='<%=(String)request.getSession().getAttribute("username")%>' readonly="readonly" /></td></tr>		<tr ><td width="200">读后感：</td><td><textarea name='duhougan' cols='50' rows='5' id='duhougan' onblur='' style='border:solid 1px #000000; color:#666666' ></textarea></td></tr>		
		
						<tr align='center'   height="22">
						    <td width="25%"  align="right">&nbsp;
						        
						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();"/>
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
						<script language="javascript">document.form1.shumubianhao.value='${shumuyuedu.shumubianhao}';</script>	<script language="javascript">document.form1.shumumingcheng.value='${shumuyuedu.shumumingcheng}';</script>	<script language="javascript">document.form1.shumuleibie.value='${shumuyuedu.shumuleibie}';</script>	<script language="javascript">document.form1.jiage.value='${shumuyuedu.jiage}';</script>	<script language="javascript">document.form1.xiaoliang.value='${shumuyuedu.xiaoliang}';</script>	<script language="javascript">document.form1.chubanshe.value='${shumuyuedu.chubanshe}';</script>	<script language="javascript">document.form1.zuozhe.value='${shumuyuedu.zuozhe}';</script>	<script language="javascript">document.form1.duzhe.value='${shumuyuedu.duzhe}';</script>	<script language="javascript">document.form1.duhougan.value='${shumuyuedu.duhougan}';</script>	
					 </table>
			</form>
   </body>
</html>






