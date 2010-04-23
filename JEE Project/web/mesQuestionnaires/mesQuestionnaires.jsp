<%@page import="java.util.Map" %>
<h4>Mes questionnaires créés</h4>
<ul class="liste">
<%
        Map<Integer, String> questionnaires = (Map<Integer, String>) request.getAttribute("mapQuestionnaires");
        if (questionnaires != null && !questionnaires.isEmpty()) {

            out.println("<ol>");
            for (Integer i : questionnaires.keySet()) {
%>
        <a href="<%= request.getContextPath() %>/editer.html?questionnaire=<%= i %>"><li><%= questionnaires.get(i)%></li></a>
<%
            }
            out.println("</ol>");
        }
%>
</ul>
                