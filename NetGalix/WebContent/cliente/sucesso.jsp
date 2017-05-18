<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NetGalix - Seu site de compras do sert&atilde;o central</title>
 <link rel="stylesheet" href="../style.css" type="text/css">

</head>
<body>

        <%@include file="../menu_segundario.jsp" %>
<f:view>
   <h2 align="center"><h:outputText value="#{perfilBean.mensagem}" /></h2>
   
    <h:outputLink value="../index.jsf" >
          <f:verbatim>Retornar a página inicial</f:verbatim>
    </h:outputLink>
   
</f:view>   
</body>
</html>