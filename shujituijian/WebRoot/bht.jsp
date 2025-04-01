<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>


  <div class="content-block overview">
        <div class="overview-carousel">
            <div class="aui-Carousel">
                <ul class="wrappers">
 <%
			String sqlbht="select  shouyetupian from xinwentongzhi where leibie='站内新闻'  order by id desc limit 0,5";
			ResultSet RS_resultbht=connDbBean.executeQuery(sqlbht);
while(RS_resultbht.next())
{
		%>
                    <li class="" style="transition-duration: 1s;">
                        <a  href="" rel="nofollow" target="_blank"><img src="<%=RS_resultbht.getString("shouyetupian")%>"></a>
                    </li>
 		<%
		}
		%>
  
                 </ul>
            </div>
        </div>
    </div>
<script src="qtimages/js/ga.js"></script>
 <script src="qtimages/js/index.js"></script>