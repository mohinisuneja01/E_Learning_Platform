<!doctype html>
<head>
    <title>
        Registration form
    </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<form action="/user" method="POST">
    <div class="container">
        <div class="row">
            <div class="col-md-2">

            </div>
            <div class="col-md-8 text-center" style="border: 2px solid black; margin-top: 10px; border-radius: 10px;">
                <h1>Registration Form</h1>
                <p style="font-style: oblique;"> User ID
                    <input name="userId" id="form" placeholder="User ID" type="text">
                </p>
                <p style="font-style: oblique;">Name
                    <input name="name" id="form" placeholder="Name" type="text">
                </p>
                <p style="font-style: oblique;">Email
                    <input name="email" id="form" placeholder="Email" type="email">
                </p>
                <p style="font-style: oblique;">Password
                    <input name="password" id="form" placeholder="Password" type="password">
                </p>
                <p style="font-style: oblique;">Phone
                    <input name="phone" id="form" placeholder="Phone" type="text">
                </p>
                <p style="font-style: oblique;">Address
                    <input name="address" id="form" placeholder="Address" type="text" >
             </p>
                <p style="font-style: oblique;">Upload Photo <input type="file" id="image-input" name="uploadPhoto" accept=".png" onchange="readURL(this);">
                </p>
                <input type = "submit">
            </div>
            <div class="col-md-2">

            </div>
        </div>
    </div>

    </form>
</body>
</html>