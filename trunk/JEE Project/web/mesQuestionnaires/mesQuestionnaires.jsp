<%@page import="java.util.Map" %>
<h4>Mes questionnaires créés</h4>
<%
        Map<Integer, String> questionnaires = (Map<Integer, String>) request.getAttribute("mapQuestionnaires");
        if (questionnaires != null && !questionnaires.isEmpty()) {

            out.println("<table class='format'>");
            out.println("<tr>");
            out.println("<th>Consulter</th>");
            out.println("<th>Statistiques</th>");
            out.println("</tr>");

            for (Integer i : questionnaires.keySet()) {
%>
<tr>
    <td>
        <a href="<%= request.getContextPath() %>/mesQuestionnaires/editer.html?questionnaire=<%= i %>"><%= questionnaires.get(i)%></a>
    </td>
    <td class="centered">
        <a href=""><img src="<%= request.getContextPath() %>/img/stats.png" alt="Consulter les statistiques" /></a>
    </td>
</tr>
<%
            }
            out.println("</table>");
        }
%>
