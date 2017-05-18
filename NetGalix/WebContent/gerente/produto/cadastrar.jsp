<!doctype html public "-//w3c//dtdhtml4.0 transitional//en">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<f:view>
<link rel="stylesheet" href="../style.css" type="text/css" />
<html>
<head>
<title>Cadastrar</title>

</head>
<body>
        
        <%@include file="/menu_segundario.jsp" %>
<h:form>
<legend>Cadastrar</legend>

<h:panelGrid columns="2" border="3">


<h:outputText value="Nome"/>
<h:inputText  id="idNome" value="#{mantenedorBean.produto.nome_produto }" required="true" requiredMessage="-->Falta Preencher esse campo" />
<h:outputText value="preço"/>
<h:inputText  id="idPreco" value="#{mantenedorBean.produto.preco_produto }" required="true" requiredMessage="-->Falta Preencher esse campo" />
<h:outputText value="Estoque"/>
<h:inputText  id="idEstoque" value="#{mantenedorBean.produto.id_estoque }" required="true" requiredMessage="-->Falta Preencher esse campo" />
<h:outputText value="Descrição"/>
<h:inputText  id="idDescrição" value="#{mantenedorBean.produto.descricao_produto }" required="true" requiredMessage="-->Falta Preencher esse campo" />
<h:outputText value="Quantidade"/>
<h:inputText  id="idQuantidade" value="#{mantenedorBean.produto.quantidade_item_estoque }" required="true" requiredMessage="-->Falta Preencher esse campo" />
<h:outputText value="Subgrupo"/>
<h:inputText  id="idsubgrupo" value="#{mantenedorBean.produto.id_subgrupo }" required="true" requiredMessage="-->Falta Preencher esse campo" />

</h:panelGrid>

<h:commandButton value="Cadastrar" type="submit" action="#{mantenedorBean.salvarProduto }"/>

</h:form>

</body>
</html>
</f:view>