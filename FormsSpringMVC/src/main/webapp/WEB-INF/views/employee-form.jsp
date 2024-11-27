<%@ page language="java" contentType="text/html;charset=UTF-8"%>
   
<!DOCTYPE html>
<html>

<body>

    <form action="processForm-v2">

        Name: <input type="text" name="employeeName" /> 
        <br /><br />
         
        <label for="role">Employee job role :</label> 
        <select id="role" name="employeeRole">
            <option value="Developer">Developer</option>
            <option value="Tester">Tester</option>
            <option value="Project Manager">Project Manager</option>
        </select> 
        <br /><br /> 
        
        <input type="submit" value="Submit" />

    </form>


</body>
</html>