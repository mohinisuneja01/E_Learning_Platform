<!doctype html>
<head>
<title>
Users
</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${users}" var="user">
      <div class="card">
        <div class="card-header">
User Id : ${user.userId}
        </div>
        <div class="card-body">
                  <h5 class="card-title">${user.name}</h5>

                  <p class="card-text">Address : ${user.address} <br>Registration Date : ${user.regDate}<br>Phone : ${user.phone}<br>Email : ${user.email}</p>
        </div>
        </div>
</c:forEach>
</body>
