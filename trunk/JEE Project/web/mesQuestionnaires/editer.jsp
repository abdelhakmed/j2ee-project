<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map" %>
<%@page import="java.util.List" %>
<%@page import="qcm.models.*" %>

<%
            final Questionnaire questionnaire = (Questionnaire) request.getAttribute("questionnaire");
            final Map<Integer, Integer> usersResponses = (Map<Integer, Integer>) request.getAttribute("usersResponses");
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
                        int nbUsersReponsesTotal = 0;
    %>
    <li> <%= question.getLibelle()%>
        <table class="format">
            <tr>
                <th>Libellé</th>
                <th>Descriptif</th>
                <th>Réponses<br/>utilisateurs</th>
            </tr>
            <%

                                    for (Reponse reponse : question.getReponses()) {
                                        nbUsersReponsesTotal += usersResponses.get(reponse.getIdReponse());
                                    }

                                    for (Reponse reponse : question.getReponses()) {
                                        out.println("<tr>");
                                        if (reponse.estCorrecte()) {
                                            out.println("<td><strong class='bon'>" + reponse.getLibelle() + "</strong></td>");
                                        } else {
                                            out.println("<td><strong>" + reponse.getLibelle() + "</strong></td>");
                                        }
                                        out.println("<td>" + reponse.getDescriptif() + "</td>");
                                         if(nbUsersReponsesTotal > 0){
                                            double res = (double) (usersResponses.get(reponse.getIdReponse()) * 100) / (double) nbUsersReponsesTotal ;
                                            String resString = String.valueOf(res);
                                            out.println("<td>" + resString.substring(0, Math.min(resString.length(), 5)) + " % </td>");
                                         }else {
                                            out.println("<td></td>");
                                         }
                                        out.println("</tr>");
                                    }
            %>
        </table>
    </li>
    <%
                    }
    %>
</ol>
<%
            }
%>
