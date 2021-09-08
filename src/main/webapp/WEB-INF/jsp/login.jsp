<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>
        Login Page
    </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<form action="/login" method="POST">
    <div class="container">
        <div class="row">
            <div class="col-md-2">

            </div>
            <div class="col-md-8 text-center" style="border: 2px solid black; margin-top: 10px; border-radius: 10px;">
                <h1>Login Page</h1>


                <p style="font-style: oblique;">Username
                    <input name="username" id="form" placeholder="Username" type="text">
                </p>
                <p style="font-style: oblique;">Password
                    <input name="password" id="form" placeholder="Password" type="password">
                </p>
                <input type="hidden"
                        name="${_csrf.parameterName}"
                        value="${_csrf.token}"/>
                <input type = "submit" value="Login">
                <a href='/user'>Register</a>
                <c:if test="${param.error != null}">
                        <p style="color:red">
                            Invalid username and password.
                        </p>
                    </c:if>
                 <c:if test="${param.logout != null}">
                         <p style="color:red">
                             You have been logged out.
                         </p>
                     </c:if>
            </div>

        </div>
    </div>

    </form>
</body>
</html>