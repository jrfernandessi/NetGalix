<!doctype html public "-//w3c//dtdhtml4.0 transitional//en">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<f:view>
<html>
<head>
<title>Excluir</title>
<link rel="stylesheet" href="../style.css" type="text/css" />
</head>
<body>
        <%@include file="/menu_segundario.jsp" %>
<h:form>
<legend>Excluir</legend>
<h:panelGrid columns="2" border="3">
<h:outputText value="ID"/>
<h:inputText value=""/>
</h:panelGrid>
<h:commandButton action="#{mantenedorBean.voltarIndex}" value="Voltar" />
<h:commandButton value="Excluir"/>
</h:form>

</body>
</html>
</f:view>