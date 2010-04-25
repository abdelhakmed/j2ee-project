<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.List" %>
<%@page import="qcm.models.*" %>

<%
            Questionnaire questionnaire = (Questionnaire) request.getAttribute("questionnaire");

%>
<fieldset id="modifier_reponses" class="">
    <legend>Questions modifiables</legend>
    <ul class="questions">
        <%
                    for (Question question : questionnaire.getQuestions()) {
                        if (question.estModifiable()) {
                            out.println("<a href='javascript:display_question(" + question.getIdQuestion() + ");' >");
                            out.println("<li>" + question.getLibelle() + "</li></a>");
                        }

                    }
        %>
    </ul>

</fieldset>

<div id="temps_restant">
    <form method="post" action="<%=  request.getContextPath()%>/mesQuestionnaires/ajoutsQuestions.html">
        <input type="submit" value="Ajouter une question" />
        <input type="hidden" name="idQuestionnaire" value="<%= questionnaire.getIdQuestionnaire()%>" />
    </form>
</div>


<div class="panel_left">
    <h1>Votre questionnaire : &laquo; <%= questionnaire.getLibelle()%> &raquo;</h1>

    <p class="left">Sélectionnez une question à modifier dans le paneau de droite ou bien modifiez le titre du questionnaire ou son niveau.</p>


    <form method="post" action="<%= request.getContextPath()%>/mesQuestionnaires/enregistrementQuestionnaire.html" id="modifier_questionnaire">
        <table class="format">
            <tr>
                <td>Titre de votre questionnaire :</td>
                <td>
                    <textarea name="libelleQuestionnaire" cols="50" rows="5"><%= questionnaire.getLibelle()%></textarea>
                </td>
            </tr>
            <tr>
                <td>Niveau :</td>
                <td>
                    <select name="niveauQuestionnaire">
                        <%
                                    for (Niveau niveau : (List<Niveau>) request.getAttribute("niveaux")) {
                                        out.println("<option value='" + niveau.getIdNiveau() + "'");
                                        if (niveau.getIdNiveau() == questionnaire.getIdNiveau()) {
                                            out.println(" selected = 'selected' ");
                                        }
                                        out.print(">" + niveau.getLibelle() + "</option>");
                                    }
                        %>
                    </select>
                </td>
            </tr>
        </table>

        <input type="hidden" name="idQuestionnaire" value="<%= questionnaire.getIdQuestionnaire()%>" />
        <input type="submit" value="Enregistrer la modification" class="button" />
    </form>

    <div id="reponses">
        <%
                    for (Question q : questionnaire.getQuestions()) {
                        if (q.estModifiable() && q.getIdUser() == questionnaire.getIdUser()) {

                            out.println("<div id='question_" + q.getIdQuestion() + "' class='question_a_ajouter'>");

                            out.println("<table id='question_a_ajouter' class='format question-a-ajouter'>");
                            out.println("<tr>");
                            out.println("<th class='libelle'>Libellé</th>");
                            out.println("<th class='descriptif'>Descriptif</th>");
                            out.println("<th class='note'>Note</th>");
                            out.println("<th class='correcte'>Réponse correcte</th>");
                            out.println("</tr>");

                            List<Reponse> reponses = q.getReponses();
                            for (Reponse reponse : reponses) {
                                out.println("<tr>");
                                out.println("<td>" + reponse.getLibelle() + "</td>");
                                out.println("<td>" + reponse.getDescriptif() + "</td>");
                                out.println("<td>" + reponse.getNote() + "</td>");
                                out.println("<td>" + (reponse.estCorrecte() ? "Oui" : "Non") + "</td>");
                                out.println("</tr>");
                            }
                            out.println("</table>");

                            out.println("<form action='" + request.getContextPath() + "/mesQuestionnaires/modifierQuestion.html' method='post' accept-charset='utf-8'>");
                            out.println("<input type='hidden' name='idQuestion' value='" + q.getIdQuestion() + "' />");
                            out.println("<input class='button' type='submit' value='Modifier cette question' />");
                            out.println("<a class='button' href='javascript:display_modifier_questionnaire()'>Revenir à la modification du questionnaire</a>");
                            if (questionnaire.getQuestions().size() > 1) {
                                    out.println("<a class='button' href='" + request.getContextPath() + "/mesQuestionnaires/suppressionQuestion.html?idQuestionnaire=" + questionnaire.getIdQuestionnaire() + "&idQuestion=" + q.getIdQuestion() + "'>Supprimer cette question</a>");
                            }
                            out.println("</form>");
                            out.println("</div>");

                        }

                    }


        %>
    </div>
</div>

<script type="text/javascript" charset="utf-8">
    function display_question(index) {
        var questions = document.getElementsByClassName('question_a_ajouter');
        document.getElementById('modifier_questionnaire').style.display = 'none';
        for (var i = 0; i < questions.length; i++) {
            questions[i].style.display = 'none';
        }
        if (index >= 0) {
            document.getElementById('question_' + index).style.display = 'block';
        }
    }
    function display_modifier_questionnaire() {
        var questions = document.getElementsByClassName('question_a_ajouter');
        document.getElementById('modifier_questionnaire').style.display = 'block';
        for (var i = 0; i < questions.length; i++) {
            questions[i].style.display = 'none';
        }
    }
</script>