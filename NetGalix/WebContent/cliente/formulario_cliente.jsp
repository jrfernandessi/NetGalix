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
       <h2>Formulario de Cadastro</h2> <br/>
<f:view>
      <h:form> 
        <h3>Informações pessoais</h3>
        <h:panelGrid >
             
		        <h:outputText value="Nome completo:" />
		        <h:panelGroup>
		        	<h:inputText  id="idNome" value="#{perfilBean.usuario.nome_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		        	<h:message for="idNome" style="color: red"/>
		        </h:panelGroup> 
		        <h:outputText value="CPF:" />
		        <h:panelGroup>
		          <h:inputText id="idCPF" value="#{perfilBean.usuario.cpf_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" /> 
		          <h:outputText value="(Digite apenas números, sem pontos ou traço)" />
		          <h:message for="idCPF" style="color: red"/>  
		        </h:panelGroup>  
		        <h:outputText value="Sexo" />
		        <h:selectOneMenu value="#{perfilBean.usuario.sexo_usuario}" >
		            <f:selectItem itemValue="Masculino"/>
		            <f:selectItem itemValue="Feminino"/>
		        </h:selectOneMenu>
		        <h:outputText value="Data de nascimento:" />
		        <h:panelGroup>
		          <h:inputText id="idData" value="#{perfilBean.dataTemp}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		          <h:outputText value="(DD/MM/AAAA)" />
		          <h:message for="idData" style="color: red"/>
		        </h:panelGroup>
		        <h:outputText value="Telefone Residencial:" />
		        <h:panelGroup>
		           <h:inputText id="idTelefone" value="#{perfilBean.usuario.telefone_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		           <h:outputText value="(DDD - TELEFONE)" />
		           <h:message for="idTelefone" style="color: red"/> 
		        </h:panelGroup>
		        <h:outputText value="Como gostaria de ser chamado:" />
		        <h:panelGroup>
		           <h:inputText id="idApelido" value="#{perfilBean.usuario.apelido_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		           <h:outputText value="(PRIMEIRO NOME, SOBRE NOME, ETC)"/>
		           <h:message for="idApelido" style="color: red"/>
		        </h:panelGroup>
		        <h:outputText value="E-mail:"/>
		        <h:panelGroup>
		        	<h:inputText id="idEmail" value="#{perfilBean.usuario.email_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo"/>
		        	<h:message for="idEmail" style="color: red"/>
		        </h:panelGroup> 
		        <h:outputText value="Senha" />
		        <h:panelGroup>
		        	<h:inputSecret id="idSenha" value="#{perfilBean.usuario.senha_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		        	<h:message for="idSenha" style="color: red"/>
		        </h:panelGroup> 
		        <h:outputText value="Confirmar senha:" />
		        <h:panelGroup>
		        	<h:inputSecret  id="idConfirmar" value="#{perfilBean.senhaTemp}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		        	<h:message for="idConfirmar" style="color: red"/>
		        </h:panelGroup>
		   </h:panelGrid>
		   
        <h3>Dados de Localização</h3>
        
        <h:panelGrid>
                <h:outputText value="CEP:" />
                <h:panelGroup>
		        	<h:inputText id="idCEP" value="#{perfilBean.usuario.cep_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		        	<h:message for="idCEP" style="color: red"/>
		        </h:panelGroup>
		        <h:outputText value="Estado:" />
		        <h:panelGroup>
		        	<h:inputText id="idEstado" value="#{perfilBean.usuario.uf_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		        	<h:message for="idEstado" style="color: red"/>
		        </h:panelGroup>
		        
		        <h:outputText value="Cidade:" />
		        <h:panelGroup>
		        	<h:inputText id="idCidade" value="#{perfilBean.usuario.cidade_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		        	<h:message for="idCidade" style="color: red"/>
		        </h:panelGroup>
		        <h:outputText value="Bairro:" />
		        <h:panelGroup>
		        	<h:inputText id="idBairro" value="#{perfilBean.usuario.bairro_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		        	<h:message for="idBairro" style="color: red"/>
		        </h:panelGroup>
		        <h:outputText value="Rua:" />
		        <h:panelGroup>
		        	<h:inputText id="idRua" value="#{perfilBean.usuario.rua_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		        	<h:message for="idRua" style="color: red"/>
		        </h:panelGroup>
		        <h:outputText value="Numero da casa:" />
		        <h:panelGroup>
		        	<h:inputText id="idCasa" value="#{perfilBean.usuario.numero_casa_usuario}" required="true" requiredMessage="-->Falta Preencher esse campo" />
		        	<h:message for="idCasa" style="color: red" />
		        </h:panelGroup> 
		        <br/>
		        
        
        </h:panelGrid>
        <h:commandButton value="Efetuar Cadastro" action="#{perfilBean.salvarPerfil}" /> <br/>
      </h:form>
      <h2 align="center"><h:outputText value="#{perfilBean.mensagem}" /></h2>     
           
      <h:outputLink value="../index.jsf" >
          <f:verbatim>Retornar a página inicial</f:verbatim>
    </h:outputLink>  
            
</f:view>
  

</body>
</html>