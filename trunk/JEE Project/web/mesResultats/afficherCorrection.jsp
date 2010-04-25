<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map" %>
<%@page import="java.util.List" %>
<%@page import="qcm.models.*" %>

<%
            Questionnaire questionnaire = (Questionnaire) request.getAttribute("questionnaire");

            if (questionnaire != null) {%>
<h1><%=questionnaire.getLibelle()%></h1>
<a class="button" href="<%= request.getContextPath() %>/mesResultats/index.html">&laquo; Retour</a>
<ol class="info_questionnaire">
<%
            for (Question question : questionnaire.getQuestions()) {
                out.println("<li><strong>" + question.getLibelle() + "</strong>");
                out.println("<table class='format'>");
                out.println("<tr>");
                out.println("<th>Réponse</th>");
                out.println("<th>Descriptif</th>");
                out.println("</tr>");
                for (Reponse reponse : question.getReponses()) {
                    out.println("<tr>");
                    if (reponse.estCorrecte()) {
                        out.println("<td><strong class='bon'>" + reponse.getLibelle() + "</strong></td>");
                        out.println("<td>(" + reponse.getDescriptif() + ")</td>");
                    } else {
                        out.println("<td>" + reponse.getLibelle() + "</td>");
                        out.println("<td>(" + reponse.getDescriptif() + ")</td>");
                    }
                    out.println("</tr>");
                }
                out.println("</table>");
                out.println("</li>");
            }
    %>
</ol>
<%}
%>
               