
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="qcm.models.QuestionnairePasse"%>

<h4>Statistiques pour le questionnaire</h4>

<%
            final List<QuestionnairePasse> usages = (List<QuestionnairePasse>) request.getAttribute("usages");
            final Map<Integer, String> users = (Map<Integer, String>) request.getAttribute("users");
%>

<div id="placeholder" style="width:auto;height:300px;"></div>

<a class="button" href="<%= request.getContextPath()%>/mesQuestionnaires/index.html">Retour</a>
<script language="javascript" type="text/javascript" src="<%= request.getContextPath()%>/js/jquery-1.4.2.min.js"></script>
<script language="javascript" type="text/javascript" src="<%= request.getContextPath()%>/js/flot/jquery.flot.min.js"></script>
<script id="source" language="javascript" type="text/javascript">
    $(function () {
        function showTooltip(x, y, contents) {
            $('<div id="tooltip">' + contents + '</div>').css( {
                position: 'absolute',
                display: 'none',
                top: y + 5,
                left: x + 5,
                border: '1px solid #fdd',
                padding: '2px',
                'background-color': '#fee'
                
            }).appendTo("body").fadeIn(5);
        }
        var serie = [
    <%
                for (int i = 0; i < usages.size(); i++) {
                    out.println("[[" + (i + 1) + "," + usages.get(i).getNote() + "]],");
                }
    %>
            ];
            var data = serie;
            var options = {
                series: {
                    bars: {
                        show: true,
                        hoverable: true,
                        barWidth: 0.8,
                        align: 'center'
                    }
                },
                grid: { hoverable: true, autoHighlight: true },
                xaxis: { tickDecimals: 0 },
                yaxis: { tickDecimals: 0 }
            };
            
            var placeholder = $("#placeholder");
            $.plot(placeholder, data, options);

        });
</script>
<table class="format">
    <tr>
        <th>Numéro</th>
        <th>Utilisateur</th>
        <th>Note</th>
    </tr>
    <%
                for (int i = 0; i < usages.size(); i++) {
                    out.println("<tr>");
                    out.println("<td>" + (i + 1) + "</td>");
                    out.println("<td>" + users.get(usages.get(i).getIdUser()) + "</td>");
                    out.println("<td>" + usages.get(i).getNote() + "</td>");
                    out.println("</tr>");
                }
    %>
</table>
