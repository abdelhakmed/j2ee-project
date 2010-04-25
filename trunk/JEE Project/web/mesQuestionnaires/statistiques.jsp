<%-- 
    Document   : statistiques
    Created on : 25 avr. 2010, 16:02:49
    Author     : marya
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="qcm.models.QuestionnairePasse"%>

<h4>Statistiques pour le questionnaire</h4>

<%
            List<QuestionnairePasse> usages = (List<QuestionnairePasse>) request.getAttribute("usages");
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
                for (QuestionnairePasse q : usages) {
                    out.println("[[" + q.getIdUser() + "," + q.getNote() + "]],");
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

            var previousPoint = null;
            $("#placeholder").bind("plothover", function (event, pos, item) {
                $("#x").text(pos.x.toFixed(2));
                $("#y").text(pos.y.toFixed(2));

                if (item) {
                    if (previousPoint != item.datapoint) {
                        previousPoint = item.datapoint;

                        $("#tooltip").remove();
                        var x = item.datapoint[0], y = item.datapoint[1];
                        showTooltip(item.pageX, item.pageY, "Utilisateur " + x + " a obtenu " + y);
                    }
                }
                else {
                    $("#tooltip").remove();
                    previousPoint = null;
                }
            });
        });
</script>