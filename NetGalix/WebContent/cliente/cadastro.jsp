<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NetGalix - Seu site de compras do sert&atilde;o central</title>
 <link rel="stylesheet" href="../style.css" type="text/css">

</head>
<body>

           
                            
    <div id="container">
      <%@include file="../menu_segundario.jsp" %>
         <br/>
        <div id="Layer12">
			<ul id="menu">
				<li><a>Identificação</a></li>
				</ul>
		</div>
       <div id="Layer11">  
	        <h:form>
	        <f:verbatim><h3>Ja sou cliente</h3></f:verbatim>
	        <h:outputText value="E-Mail:"/>   <br/>
	        <h:inputText value="#{perfilBean.usuario.email_usuario}" size="30"/>  <br/>   
	        <h:outputText value="Senha:"/>   <br/>
	        <h:inputSecret value="#{perfilBean.usuario.senha_usuario}" size="30"/> <br/><br/>
	        <h:commandButton action="#{perfilBean.loginPerfil}" value="Continuar"  />     
	        </h:form>
       </div>
       
       <div id="Layer11">  
	        <h:form>
	        <f:verbatim><h3>Não sou Cliente</h3></f:verbatim>
	        <h:outputText value="Informe seu E-Mail:"/>   <br/>
	        <h:inputText value="#{perfilBean.usuario.email_usuario}" size="30"/>  <br/> <br/><br/><br/>  
	        <h:commandButton value="Continuar" action="#{perfilBean.preencheFormulario}" />     
	        </h:form>
       </div>    
       <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
       <h2 align="center"><h:outputText value="#{perfilBean.mensagem}" /></h2>   
     </div>                 
</body>
</html>
</f:view>