
        <h4>Modification effectuee</h4>
        <p>Votre modification a bien été effectuée</p>
        <form method="post" action="<%=  request.getContextPath() %>/mesQuestionnaires/editer.html">
            <input type="submit" value="Retour" />
            <input
                type="hidden" name="questionnaire" value="<%= Integer.parseInt(request.getAttribute("questionnaire").toString()) %>" />
        </form>

       

