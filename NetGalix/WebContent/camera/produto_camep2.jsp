<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../style.css" type="text/css">
</head>
<body>

   <div id="container">
		<%@include file="../menu_segundario.jsp" %>
		<div id="corpo">    
       <div id="lateralBar">
				<ul class="lista">
					<li>Novos modelos de celulares
					<ul class="subLista">
						<a href="" title=""><li>Motorola</li></a>
						<a href="" title=""><li>Samsung</li></a>
						<a href="" title=""><li>Sony Ericsson</li></a>
						<a href="" title=""><li>Motorola</li></a>
						<a href="" title=""><li>Samsung</li></a>
						<a href="" title=""><li>Sony Ericsson</li></a>
					</ul>
					</li>
					
					<li>Tudo de informática
					<ul class="subLista">
						<a href="" title=""><li>NoteBooks</li></a>
						<a href="" title=""><li>Computadores</li></a>
						<a href="" title=""><li>Impressora</li></a>
						<a href="" title=""><li>NoteBooks</li></a>
						<a href="" title=""><li>Computadores</li></a>
						<a href="" title=""><li>Impressora</li></a>
						<a href="" title=""><li>NoteBooks</li></a>
						<a href="" title=""><li>Computadores</li></a>
						<a href="" title=""><li>Impressora</li></a>
					</ul>
					</li>
				</ul>
			</div>
			
			<div id="conteudo">
				<div id="banner">
					<img alt="" src="../images/aguarde.jpg" width="100%" />
				</div>
				<div id="vitrine">
					<div class="produto">
						<a href="" title="">
							<img alt="" src="produtos/camep2.jpg" class="img_produto" />
							<h1 class="nome_produto">Nome do produto</h1>
							<p class="desc_produto">Descrição deste produto aqui Descrição deste produto aqui Descrição deste produto aqui Descrição deste produto aqui Descrição deste produto aqui Descrição deste produto aqui </p>
							<h2 class="preco">R$ 500,00</h2>
						</a>
					</div>
			    </div>
			 </div>
		  </div>
	   </div>
	   <br/>
	   <h:form>
	       <p align="center"><h:commandButton value="Comprar" /> </p>
	   </h:form>
</body>
</html>
</f:view>