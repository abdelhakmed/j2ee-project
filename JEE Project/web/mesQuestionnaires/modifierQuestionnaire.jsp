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

<div class="panel_left">
    <%
                out.print("<h1>Votre questionnaire : &laquo; " + questionnaire.getLibelle() + " &raquo;</h1><br/><br/>");
    %>

    <form method="post" action="<%= request.getContextPath() %>/mesQuestionnaires/enregistrementQuestionnaire.html" >
        Titre de votre questionnaire : 
        <textarea name="libelleQuestionnaire" cols="50" rows="5">
            <%= questionnaire.getLibelle() %>
        </textarea>
        Niveau : 
        <select name="niveauQuestionnaire">
            <%
                for(Niveau niveau : (List<Niveau>) request.getAttribute("niveaux")){
                    out.println("<option value='" + niveau.getIdNiveau() + "'");
                    if(niveau.getIdNiveau() == questionnaire.getIdNiveau())
                        out.println(" selected = 'selected' ");
                    out.print(">" + niveau.getLibelle() + "</option>");
                }
            %>
        </select>
        <input type="hidden" name="idQuestionnaire" value="<%= questionnaire.getIdQuestionnaire() %>" />
        <input type="submit" value="Enregistrer la modification" />
    </form>

    <div id="reponses">


        <%
                    for (Question q : questionnaire.getQuestions()) {
                        if (q.estModifiable()) {

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

                            out.println("<form action='" + request.getContextPath() + "/mesQuestionnaire/modifierQuestion.html' method='post' accept-charset='utf-8'>");
                            out.println("<input type='hidden' name='idQuestion' value='" + q.getIdQuestion() + "' />");
                            out.println("<input class='button' type='submit' value='Modifier cette question' />");
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
        for (var i = 0; i < questions.length; i++) {
            questions[i].style.display = 'none';
        }
        if (index >= 0) {
            document.getElementById('question_' + index).style.display = 'block';
        }
    }

</script>