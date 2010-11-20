<%@ include file="/includes/taglibs.inc.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title><bean:message key="global.application.title" /></title>
<link rel="stylesheet" type="text/css" href="<html:rewrite page="/includes/css/globals.css" />" />
</head>

<body>

<table width="800" border="0" cellspacing="0" cellpadding="0">
  <jsp:include page="/includes/header.inc.jsp"></jsp:include>
  <tr>
    <td align="center" valign="top" class="introbg">
    <table border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="160" colspan="2" align="center" valign="bottom">
        <img src="media/cibertec.jpg" width="305" height="88" border="0" />
        </td>
        
      </tr>
      <tr>
        <td align="center" height="120">
        <html:link href="empadronamiento.do?cmd=menu" styleClass="mainMenuBtn">
   	    <div style="top: 42px;"><bean:message key="global.mainmenu.btn1" /></div>
   	    </html:link>
        </td>
        <td align="center">
        <html:link href="votacion.do" styleClass="mainMenuBtn">
   	    <div style="top: 42px;"><bean:message key="global.mainmenu.btn2" /></div>
   	    </html:link>
        </td>
      </tr>
      <tr>
        <td align="center" height="120">
        <html:link href="login.do?acceso=admin" styleClass="mainMenuBtn">
   	    <div style="top: 35px;"><bean:message key="global.mainmenu.btn3" /></div>
   	    </html:link>
        </td>
        <td align="center">
        <html:link href="login.do?acceso=location" styleClass="mainMenuBtn">
   	    <div style="top: 35px;"><bean:message key="global.mainmenu.btn4" /></div>
   	    </html:link>
        </td>
      </tr>
      <tr>
        <td colspan="2" height="20"></td>
      </tr>
      <jsp:include page="/includes/footer.inc.jsp"></jsp:include>
    </table>
    </td>
  </tr>
</table>
</body>

</html>