<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Listado motores</h1>
                <%-- Creamos la tabla del listado de motores --%>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Modelo</th>
                            <th>Fabricante</th>
                            <th>Potencia</th>
                            <th>Peso</th>
                            <th>Cantidad</th>
                            <th>Optimo</th>
                        </tr>
                    </thead>
                    <%-- Aqui hacemos un ciclo for para aniadir los datos a la tabla con sus respectivos campos--%>
                    <tbody>
                        <c:forEach items="${motores}" var="motor">
                        <tr>
                            <td><c:out value="${motor.modelo}"></c:out></td>
                            <td><c:out value="${motor.fabricante}"></c:out></td>
                            <td><c:out value="${motor.potencia}"></c:out></td>
                            <td><c:out value="${motor.peso}"></c:out></td>
                            <td><c:out value="${motor.cantidad}"></c:out></td>

                            <%-- Aqui hacemos la comprobacion de si es optimo o no el coche realizando la operacion y asignando el resultado--%>
                            <td>
                                <c:choose>
                                    <c:when test="${motor.peso/motor.potencia < 10}"> Si <br> </c:when>
                                    <c:otherwise>No<br> </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        </c:forEach> 
                    </tbody>
                </table>
            </div>
            <br>
            <a href="alta.htm">Alta</a>
        </div>
    </body>
</html>
