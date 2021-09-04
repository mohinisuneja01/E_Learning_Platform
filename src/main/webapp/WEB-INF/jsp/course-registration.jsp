<!doctype html>
<head>
    <title>
        Course form
    </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<form action="/courses" method="POST">
    <div class="container">
        <div class="row">
            <div class="col-md-2">

            </div>
            <div class="col-md-8 text-center" style="border: 2px solid black; margin-top: 10px; border-radius: 10px;">
                <h1>Course Form</h1>
                <p style="font-style: oblique;">Course ID
                    <input name="courseId" id="form" placeholder="Course ID" type="text">
                </p>
                <p style="font-style: oblique;">Course Name
                    <input name="course_name" id="form" placeholder="Course Name" type="text">
                </p>
                <p style="font-style: oblique;">Course Description
                    <input name="course_desc" id="form" placeholder="Course Description" type="text">
                </p>
                <p style="font-style: oblique;">Course Resources
                 <input name="course_resource" id="form" placeholder="Course Resources" type="text">
                 <input type="file" id="image-input" name="course_resource" accept=".png" onchange="readURL(this);">
                                </p>

                <p style="font-style: oblique;">Course Fee
                    <input name="course_fee" id="form" placeholder="Course Fee" type="text">
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