<%-- Declare attributes using the directive --%>
<%@tag description="demo tag" %>
<%@attribute name="user" required="true" %>
<%@attribute name="color" required="false" %>

<%-- Default color if not provided --%>
<div style="color: ${empty color ? 'black' : color}">
   <h3> Welcome to the site, ${user}!</h3>
</div>