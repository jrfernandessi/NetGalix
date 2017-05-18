<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Janela Administrativa</title>
<link rel="stylesheet" href="../style.css" type="text/css" />

</head>
<body>
            <%@include file="../menu_segundario.jsp" %>

<h:form>
<h1>Administração </h1>


<h:panelGrid columns="1" cellpadding="6" border="4" >
<h:outputText value="Produto"/>
<h:commandLink action="#{mantenedorBean.cadastrarProduto}" value="Cadastrar"  />
<h:commandLink action="#{mantenedorBean.alterarProduto}" value="Alterar" />
<h:commandLink action="#{mantenedorBean.excluirProduto}" value="Exlcluir" />
<h:commandLink value="Relatório de Produto" />
<h:commandLink value="Estoque (Download) " />
</h:panelGrid>
<br>
<h:panelGrid columns="1" cellpadding="6" border="4" >
<h:outputText value="Usuário"/>
<h:commandLink action="#{mantenedorBean.alterarUsuario}" value="Alterar" />
<h:commandLink action="#{mantenedorBean.excluirUsuario}" value="Exlcluir" />
<h:commandLink value="Relatório de usuário" />
<h:commandLink value="Usuários (Download)"/>
</h:panelGrid>


</h:form>

</body>
</html>
</f:view>