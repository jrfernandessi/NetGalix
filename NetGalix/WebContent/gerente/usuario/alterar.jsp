<!doctype html public "-//w3c//dtdhtml4.0 transitional//en">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<f:view>
<html>
<head>
<title>Alterar</title>
<link rel="stylesheet" href="../style.css" type="text/css" />
</head>
<body>
  
   <%@include file="/menu_segundario.jsp" %>
<h:form>
<legend>Alterar</legend>
<h:panelGrid columns="3" border="3">
<h:inputText value=""/>
<h:outputText value="ID*"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="Nome"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="Bairro"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="Rua"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="Numero(casa)"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="Cidade"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="Sexo"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="CEP"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="UF"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="RG"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="CPF"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="Telefone"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="Data de Nascimento"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="E-mail"/>
<h:inputText value=""/>

<h:inputText value=""/>
<h:outputText value="Senha"/>
<h:inputText value=""/>
</h:panelGrid>

<h:panelGrid columns="3">
<h:commandButton value="Encontrar por ID"/>
<h:commandButton value="Alterar"/>
<h:commandButton action="#{mantenedorBean.voltarIndex}" value="Voltar" />
</h:panelGrid>
</h:form>


</body>
</html>
</f:view>