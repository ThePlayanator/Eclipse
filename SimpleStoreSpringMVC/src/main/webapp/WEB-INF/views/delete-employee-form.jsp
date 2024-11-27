<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>

<body>

<h2>Delete a single employee</h2>

    <form action="processSingleDelete" method="GET">

        Name: <input type="text" name="employeeName" /> 
        <br /><br />
        
        <input type="submit" value="Submit" />

    </form>
	<br />
	<a href=${pageContext.request.contextPath}>Back to main menu</a>


</body>
</html>