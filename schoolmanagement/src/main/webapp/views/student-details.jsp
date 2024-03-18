<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">


</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <h2>Student Details</h2>
                <div class="card">
                    <div class="card-header">
                        <h5>Student Details</h5>
                    </div>
                    <div class="card-body">
                        <div><b>Roll No:</b>${student.rollNo}</div>
                        <div><b>Name:</b>${student.name}</div>
                        <div><b>City:</b>${student.city}</div>
                        <div><b>Mobile No:</b>${student.mobileNo}</div>
                    </div>

                </div>

            </div>
        </div>
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</html>