<!doctype html>
<head>
    <title>
        Contact form
    </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<form action="/contacts" method="POST">
    <div class="container">
        <div class="row">
            <div class="col-md-2">

            </div>
            <div class="col-md-8 text-center" style="border: 2px solid black; margin-top: 10px; border-radius: 10px;">
                <h1>Contact Form</h1>
                <p style="font-style: oblique;"> User ID
                    <input name="userId" id="form" placeholder="User ID" type="text">
                </p>
                <p style="font-style: oblique;">Name
                    <input name="name" id="form" placeholder="Name" type="text">
                </p>
                <p style="font-style: oblique;">Email
                    <input name="email" id="form" placeholder="Email" type="email">
                </p>

                <p style="font-style: oblique;">Phone
                    <input name="phone" id="form" placeholder="Phone" type="text">
                </p>
                <p style="font-style: oblique;">Message
                    <input name="message" id="form" placeholder="Message" type="text" >
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