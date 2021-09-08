<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    <h1>Courses</h1>
<br>

<!--<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1"
                  >
    <tr>
        <th>Course Name</th>
        <th>Course ID</th>
        <th>Course Resource</th>

    </tr>
    <c:forEach items="${courses}" var="course">
        <tr>
            <td><c:out value="${course.course_name}"/></td>
            <td><c:out value="${course.courseId}"/></td>
            <td><c:out value="${course.course_resource}"/></td>
        </tr>
    </c:forEach>
</table>-->
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>

    <c:forEach items="${courses}" var="course">
      <div class="card">
        <div class="card-header">
         Course Id : ${course.courseId}
        </div>
        <div class="card-body">
          <h5 class="card-title">${course.course_name}</h5>

          <p class="card-text">Course Description : ${course.course_desc} <br>Course Resource : ${course.course_resource}<br>Course Fees : ${course.course_fee}</p>
          <c:forEach items="${enrollments}" var="enroll">
          <c:if test="${enroll.course.courseId})==${course.courseId}" >
          <c:set var="enrolled" scope="application" value="1"/>
          </c:if>
          </c:forEach>
          <form method="POST" action="/courses/all">
                  <input type="hidden" name="courseId" value="${course.courseId}"/>
                  <c:choose>
                 <c:when test="${enrolled}=='1'">
                   <input type="submit" value="Enroll"/>
                 </c:when>
                 <c:otherwise>
                   <input type="submit" value="Enrolled" disabled/>
                 </c:otherwise>
                   </c:choose>
                   </form>
        </div>
      </div>
    </c:forEach>
   </body>
</html>