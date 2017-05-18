<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NetGalix - Seu site de compras do sert&atilde;o central</title>

</head>

<% int quantCar = 0; %>

<body>

	
	<div id="Layer1"></div>
	
	<div id="Layer2">
	<a href="../cliente/cadastro.jsf" >Faça seu Login ou cadastre-se </a> 
	|<a href=""> Meus Pedidos</a> 
	|<a href=""> Central de Atendimento</a> 
	|Televendas: 3431-1443
	</div>
	
	<div id="Layer3">
	<p class="carrinho"><strong>Bem vindo</strong>, visitante! <br /><br />
	Seu Carrinho: (<%=quantCar %> itens)</p>
	</div>
	
	<div id="Layer4">
	<ul id="menu">
		<li><a href="../index.jsf">Página Inicial</a></li>
		<li><a href="../infor/index.jsp" >Informática</a></li>
		<li><a href="../fone/index.jsp" >Telefones e Celulares</a></li>
		<li><a href="../camera/index.jsp" >Câmeras e Filmadoras</a></li>
		<li><a href="../eletro/index.jsp" >Eletrônicos</a></li>
		<li><a href="../eletrod/index.jsp" >Eletrodomésticos</a></li>
		<li><a href="../eletrop/index.jsp" >Eletro Portáteis</a></li>
								
	</ul>
	<div id="Layer6">
		<form id="form1" name="form1" method="post" action=""><label
			for="textfield"></label>
		<div align="right"><input name="CampoBuscar" type="text"
			id="CampoBuscar" value="Buscar" onmouseover="if(this.value == 'Buscar')this.value='';" onmouseout="if(this.value == '')this.value='Buscar';" /> <label for="Submit"></label> <input
			type="submit" name="Submit" value="Ok" id="Submit" /></div>
		</form>
	</div>
	</div>

</body>
</html>
