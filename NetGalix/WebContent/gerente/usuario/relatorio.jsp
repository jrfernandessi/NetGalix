<!doctype html public "-//w3c//dtdhtml4.0 transitional//en">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Relatorio</title>
</head>
<body>
<f:view>


<h:form>
<legend>Relatorio</legend>
<h:panelGrid columns="2" border="3">
<h:outputText value="userID"/>
<h:inputText value=""/>
</h:panelGrid>
<h:commandButton value="Voltar" />
<h:commandButton value="Download"/>
</h:form>

</f:view>
</body>
</html>