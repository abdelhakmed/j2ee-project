<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map" %>
<%@page import="java.util.List" %>
<%@page import="qcm.models.*" %>

<%
            Questionnaire questionnaire = (Questionnaire) request.getAttribute("questionnaire");
            if (questionnaire != null) {
%>
<h3><%=questionnaire.getLibelle()%></h3>

<p>Niveau : <%= ((Niveau) request.getAttribute("niveau")).getLibelle()%></p>

<a class="button" href="<%= request.getContextPath()%>/mesQuestionnaires/index.html">&laquo; Retour</a>

<%
                if (!questionnaire.estPasse()) {
                    out.println("<a class='button' href='" + request.getContextPath() + "/mesQuestionnaires/modifierQuestionnaire.html?questionnaire=" + questionnaire.getIdQuestionnaire() + "'>Modifier ce questionnaire</a>");
                }

%>
<ol class="info_questionnaire">
    <%
                    for (Question question : questionnaire.getQuestions()) {
                        out.println("<li>" + question.getLibelle() + "<ul class='liste info_questionnaire'>");
                        for (Reponse reponse : question.getReponses()) {
                            out.println("<li>");
                            if (reponse.estCorrecte()) {
                                out.println("<strong class='bon'>" + reponse.getLibelle());
                                if (!reponse.getDescriptif().equals("")) {
                                    out.println(" (" + reponse.getDescriptif() + ")");
                                }
                                out.println("</strong>");
                            } else {
                                out.println(reponse.getLibelle());
                                if (!reponse.getDescriptif().equals("")) {
                                    out.println(" (" + reponse.getDescriptif() + ")");
                                }
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
