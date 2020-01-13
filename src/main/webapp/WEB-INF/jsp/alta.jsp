<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    </head>
    <body>
        <div class="container">
            <%-- Aqui hacemos un formulario con todos los campos que vamos a rellenar--%>
            <form:form method="post" commandName="motor">
                <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                 <h1>Alta motor</h1>
                <p>
                    <form:label path="modelo">Modelo:</form:label>
                    <form:input path="modelo" cssClass="form-control"/>
                </p>

                <p>
                    <form:label path="fabricante">Fabricante:</form:label>
                    <form:input path="fabricante" cssClass="form-control"/>
                </p>

                <p>
                    <form:label path="potencia">Potencia:</form:label>
                    <form:input path="potencia" cssClass="form-control"/>
                </p>

                <p>
                    <form:label path="peso">Peso:</form:label>
                    <form:input path="peso" cssClass="form-control"/>
                </p>

                <p>
                    <form:label path="cantidad">Cantidad:</form:label>
                    <form:input path="cantidad" cssClass="form-control"/>
                </p>
                <br>
                <input type="submit" value="Enviar" class="btn btn-primary" />
            </form:form>
                
            
            <a href="listado.htm">Listado</a>
        </div>
        
    </body>
</html>
