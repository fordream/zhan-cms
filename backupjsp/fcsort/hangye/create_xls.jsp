<%@ page contentType="application/msexcel; charset=GB2312"%>
<%@ page import="zt.platform.db.DBUtil"%>
<%@ page errorPage="/fcsort/common/FcsortError.jsp" %>
<%@ page import="zt.cms.pub.SCBranch" %>
<%--
===============================================
Title: 新增不良贷款导出页面
Description: 新增不良贷款导出信息页面
 * @version   $Revision: 1.2 $  $Date: 2007/05/22 08:06:30 $
 * @author   houcs
 * <p/>修改：$Author: houcs $
===============================================
--%>
<%
   String path = request.getContextPath();
   String colspan=request.getParameter("colspan");
   int i=Integer.valueOf(colspan).intValue();
   String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
   String yearday = DBUtil.fromDB(request.getParameter("yeardays") ==null? "2": request.getParameter("yeardays"));
   String startdate=request.getParameter("startdate")==null?"":request.getParameter("startdate");
   String enddate=request.getParameter("enddate")==null?"":request.getParameter("enddate");
   String strScbrhId=request.getParameter("brhid")==null?"":request.getParameter("brhid");
   String strScbrhName = SCBranch.getSName(strScbrhId);//网点名称
   String create=request.getParameter("create")==null?"":request.getParameter("create");
   String counts=request.getParameter("cou")==null?"":request.getParameter("cou");
   if(!counts.equals("")){
   i=i-1;
   if(counts.equals("1")){
	 counts="往年发放往年到期";
	}else if(counts.equals("2")){
	counts="往年发放当年到期";
	}else if(counts.equals("3")){
	counts="当年发放当年往期到期";
	}else if(counts.equals("4")){
	counts="当年发放本期到期";
	}else if(counts.equals("5")){
	counts="往年发放当年后到期";
	}else if(counts.equals("6")){
	counts="当年发放本期后到期";
	}
   }
   String subCreate=create.substring(0,7);
   subCreate=subCreate.replaceAll("-","年");
   if(subCreate.substring(5,6).equals("0")){
    subCreate= subCreate.substring(0,5)+subCreate.substring(6,7)+"月";
    }else{
    subCreate=subCreate+"月";
    }
%>
<%
response.setContentType("application/vnd.ms-excel;charset=gb2312");
%>
<%			String thisMonth="按行业五级分类统计 ";
           
			String  filenamc = new String(thisMonth.getBytes("GBK"),"ISO-8859-1");  
			
			response.setHeader("Content-disposition",
			"inline;filename="+filenamc+".xls");
			
			
%>
<html>

<head>
<title>按行业五级分类统计 </title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<link rel="stylesheet" type="text/css" href="web.css">
		<script language="javascript" src="<%= basePath %>query/setup/meizzDate.js"></script>
		<script language="javascript" src="ajax.js"></script>
		<script type="text/javascript" src="fcsort.js"></script>
</head>
<body>
    <div class="caption" align="center">
     <font size="4"> 
 按行业五级分类统计 
 
  </font>
  </div>
  <div class="caption" align="center">
		<font class="title">
        有效日期：<%=subCreate%>
 </font>
</div>
<div align="center" width="100%">
<table cellSpacing='0' cellPadding='2' width="100%">
<tr width="2200">
	<td width="200">
	<font class="title" align="left">
         网点名称：<%=strScbrhName%>
         </font>
	</td>
	<%
	if(!counts.equals("")){
	%>
	<td width="200">
	<font class="title" align="left">
         类别：<%=counts%>
         </font>
	</td>
	<%
	}
	%>
	<td class="title" align="right" colspan="8" width="2000">
	<%
	if(!counts.equals("")){
	%>
	单位：元
	<%
	}else{
	%>
	单位：万元
	<%
	}
	%>
	</td>
	</tr>
</table>
</div>
<TABLE borderColor="#111111" cellSpacing='0' cellPadding='2'
	width='2200' align='center' border='1'>
	<%=DBUtil.fromDB(request.getParameter("tabledata"))%>
</TABLE>
</body>
</html>
