<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Test</title>
</head>
<body>
<p>Ceci est une page générée depuis une JSP.</p>
<p>
    <%
        String attribut = (String) request.getAttribute("test");
        out.println( attribut + "<br>" );

        String parametre = request.getParameter( "auteur" );
        out.println( parametre + "<br>" );

        for(int i = 1; i < 3; i++){
            out.println("Numéro " + i + ": <select name=\"number"+i+"\">");
            for(int j = 1; j <= 10; j++){
                out.println("<option value=\""+j+"\">"+ j + "</option>");
            }
            out.println("</select><br />");
        }
    %>
</p>
</body>
</html>