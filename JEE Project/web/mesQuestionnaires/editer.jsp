<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map" %>
<%@page import="java.util.List" %>
<%@page import="qcm.models.*" %>

<%
            Questionnaire questionnaire = (Questionnaire) request.getAttribute("questionnaire");
            if (questionnaire != null) {
%>
<h1><%=questionnaire.getLibelle()%></h1>

<h2>Niveau de ce questionnaire : <%= ((Niveau) request.getAttribute("niveau")).getLibelle()%> </h2>

<a href="<%= request.getContextPath()%>/mesQuestionnaires/index.html">&laquo; Retour</a>

<%
                if (!questionnaire.estPasse()) {
                    out.println("<a href='" + request.getContextPath() + "/mesQuestionnaires/modifierQuestionnaire.html?questionnaire=" + questionnaire.getIdQuestionnaire() + "'>Modifier ce questionnaire</a>");
                }

%>
<ol id="info_questionnaire">
    <%
                    for (Question question : questionnaire.getQuestions()) {
                        out.println("<li>" + question.getLibelle() + "<ul class='liste'>");
                        for (Reponse reponse : question.getReponses()) {
                            out.println("<li>");
                            if (reponse.estCorrecte()) {
                                out.println("<strong class='bon'>" + reponse.getLibelle());
                                out.println(" (" + reponse.getDescriptif() + ")</strong>");
                            } else {
                                out.println(reponse.getLibelle());
                                out.println(" (" + reponse.getDescriptif() + ")");
                            }
                            out.println("</li>");
                        }
                        out.println("</ul></li>");
                    }
    %>
</ol>
<%
            }
%>
