<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="qcm.models.*" %>
<%@page import="java.util.List" %>

<%
            List<Question> questionsByThemeQuestionnaire = (List<Question>) request.getSession().getAttribute("questionsByThemeNewQuestionnaire");
            Questionnaire questionnaire = (Questionnaire) request.getAttribute("questionnaire");

%>
<fieldset id="modifier_reponses" class="">
    <legend>Questions du questionnaire</legend>
    <ul class="questions">
        <%
                if(!questionnaire.getQuestions().isEmpty()){
                    for (Question question : questionnaire.getQuestions()) {
                        out.println("<li>" + question.getLibelle() + "</li>");
                    }
                }
        %>
    </ul>
</fieldset>

<div class="panel_left">
    <%

                if (questionnaire != null) {
                    out.print("<h1>Votre questionnaire : &laquo; " + questionnaire.getLibelle() + " &raquo;</h1><br/><br/>");
    %>

    <label for="question">Sélectionner une question existante à ajouter dans votre questionnaire :</label>
    <br/><br/>
    <select name="question" id="question" onchange="display_question()" >
        <option>Choisissez une question à ajouter</option>
        <option value="0">Ajouter une nouvelle question</option>

        <%
                            if (questionsByThemeQuestionnaire != null) {
                                for (int k = 0; k < questionsByThemeQuestionnaire.size(); k++) {
                                    if(!questionnaire.getQuestions().contains(questionsByThemeQuestionnaire.get(k))){
                                        out.println("<option value='" + questionsByThemeQuestionnaire.get(k).getIdQuestion() + "'>");
                                        out.print(questionsByThemeQuestionnaire.get(k).getLibelle());
                                        out.print("</option>");
                                    }
                                }

        %>
    </select>

    <div id="reponses">
        <form id="question_0" class="question_a_ajouter" action="<%= request.getContextPath()%>/creerQuestionnaire/ajouterReponses.html" method="post">
            <table>
                <tr>
                    <td colspan="2"><label for="libelleQuestion">Libellé de la question : </label></td>
                </tr>
                <tr>
                    <td colspan="2"><textarea id="libelleQuestion" name="libelleQuestion" cols="50" rows="5"></textarea></td>
                </tr>
                <tr>
                    <td><label for="nbReponses">Nombre de réponses à cette question</label></td>
                    <td><input type="text" id="nbReponses" name="nbReponses" size="3" class="medium-input" /></td>
                </tr>
            </table>
            <input type='hidden' name='action' value='applyToAddNewQuestion' />
            <input class='button' type='submit' value='Ajouter les réponses' />
        </form>

        <%
                            for (int i = 0; i < questionsByThemeQuestionnaire.size(); i++) {
                                Question q = questionsByThemeQuestionnaire.get(i);
                                out.println("<div id='question_" + q.getIdQuestion() + "' class='question_a_ajouter'>");

                                out.println("<table id='question_a_ajouter' class='format question-a-ajouter'>");
                                out.println("<tr>");
                                out.println("<th class='libelle'>Libellé</th>");
                                out.println("<th class='descriptif'>Descriptif</th>");
                                out.println("<th class='note'>Note</th>");
                                out.println("<th class='correcte'>Réponse correcte</th>");
                                out.println("</tr>");

                                List<Reponse> reponses = q.getReponses();
                                if (reponses != null) {
                                    for (Reponse reponse : reponses) {
                                        out.println("<tr>");
                                        out.println("<td>" + reponse.getLibelle() + "</td>");
                                        out.println("<td>" + reponse.getDescriptif() + "</td>");
                                        out.println("<td>" + reponse.getNote() + "</td>");
                                        out.println("<td>" + (reponse.estCorrecte() ? "Oui" : "Non") + "</td>");
                                        out.println("</tr>");
                                    }
                                }
                                out.println("</table>");

                                out.println("<form action='" + request.getContextPath() + "/creerQuestionnaire/ajouterQuestion.html' method='post' accept-charset='utf-8'>");
                                out.println("<input type='hidden' name='idQuestionToAdd' value='" + q.getIdQuestion() + "' />");
                                out.println("<input class='button' type='submit' value='Ajouter cette question' />");
                                out.println("</form>");
                                out.println("</div>");
                            }
                        }
                    } else {
                        out.println("Un questionnaire correspondant à vos critères existe déjà");
                    }
        %>
    </div>
</div>
<script type="text/javascript" charset="utf-8">
    function display_question() {
        var questions = document.getElementsByClassName('question_a_ajouter');
        for (var i = 0; i < questions.length; i++) {
            questions[i].style.display = 'none';
        }
        var index = document.getElementById('question').value;
        if (index >= 0) {
            document.getElementById('question_' + index).style.display = 'block';
        }
    }
</script>