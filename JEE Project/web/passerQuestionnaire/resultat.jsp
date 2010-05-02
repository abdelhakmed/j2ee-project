<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="qcm.models.*" %>
<%@page import="java.util.List" %>
<%@page import="java.util.Map" %>

<%
        Qcm qcm = (Qcm) request.getSession().getAttribute("qcm");
        int questionRepondues = 0;
        int nbQuestionsTotal = qcm.getQuestionnaire().getQuestions().size();
        int noteMax = qcm.getQuestionnaire().getNoteMax();
        Integer note = (Integer) request.getAttribute("note");

        List<Question> questions = qcm.getQuestionnaire().getQuestions();
        for (Question question : questions) {
            List<Integer> userRep = qcm.getUserReponses().get(question.getIdQuestion());
            if (!userRep.isEmpty()) {
                questionRepondues++;
            }
        }

%>
<h4 id="liste">Résultats pour ce questionnaire</h4>
<div id="score">
    <p>Votre note : <br /><span class="score_value <%= (note < noteMax / 2) ? "mauvais" : "bon"%>"><%= note%> / <%= noteMax%></span></p>
</div>
<div class="recapitule_questionnaire">
    <h5>Récapitulatif du questionnaire</h5>
    <table>
        <tr>
            <td class="static">Titre</td>
            <td><%= qcm.getQuestionnaire().getLibelle()%></td>
        </tr>
        <tr>
            <td class="static">Thème</td>
            <td><%= request.getAttribute("theme")%></td>
        </tr>
        <tr>
            <td class="static">Niveau</td>
            <td><%= request.getAttribute("niveau")%></td>
        </tr>
        <tr>
            <td class="static">Questions répondues</td>
            <td><%= questionRepondues%> / <%= nbQuestionsTotal%></td>
        </tr>
        <tr>
            <td class="static">Temps utilisé</td>
            <td>50 secondes</td>
        </tr>
    </table>
</div>

<dl id="resultat" class="liste_recapitulatif">
    <%
                for (Question question : questions) {
                    out.println("<dt>&Eacute;noncé : " + question.getLibelle() + "</dt>");
                    List<Reponse> rep = question.getReponses();
                    List<Integer> userRep = qcm.getUserReponses().get(question.getIdQuestion());
                    if (!userRep.isEmpty()) {
                        out.println("<dd>Vos réponses");
                        out.println("<ul>");
                        for (int j = 0; j < rep.size(); j++) {
                            Reponse reponse = rep.get(j);
                            int idDansRep = reponse.getIdReponse();

                            if (userRep.contains(idDansRep)) {
                                if (reponse.estCorrecte()) {
                                    out.println("<li class='bon'>" + reponse.getLibelle() + " (+" + reponse.getNote() + " points)</li>");
                                } else {
                                    out.println("<li class='mauvais'>" + reponse.getLibelle() + " (" + reponse.getDescriptif() + ")</li>");
                                }
                            }
                        }
                        out.println("</ul></dd>");
                    } else {
                        out.println("<dd class='mauvais'>Vous n'avez pas répondu à cette question</dd>");
                    }
                }
    %>
</dl>
<a class="button" href="<%= request.getContextPath() %>/index.html">Retour à l'accueil</a>
               