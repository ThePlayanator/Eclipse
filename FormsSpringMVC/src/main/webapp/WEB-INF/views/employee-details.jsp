<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>

	<h1>Employee Details</h1>
	<hr>
	Employee name : ${param.employeeName}
	<br>
	<br>
	<h2>${message}</h2>
	<br>
	<br> Job role : ${jobInfo.jobRole}
	<br> Salary : ${jobInfo.salary}
	<c:choose>
    <c:when test="${jobInfo.salary < 5000}">
        <c:out value="You're a sad lil boii" />
    </c:when>
    <c:otherwise>
        <c:out value="You're richh ma boii" />
    </c:otherwise>
</c:choose>
	<br>
	<c:if test="${jobInfo.isPermanent}">
		<c:out value="This is a permanent position" />
	</c:if>
	<c:if test="${!jobInfo.isPermanent}">
		<c:out value="This is a temporary position" />
	</c:if>

</body>
</html>