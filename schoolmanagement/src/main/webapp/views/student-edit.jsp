<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
    <section>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-header">
                            <h5 class="card-title">Registration Form</h5>
                        </div>
                        <div class="card-body">
                            <form action="/student/update" method="post">

                                    <input type="hidden" class="form-control" readonly id="rollno" name="rollno" value="${student.rollNo}">
                                <div class="mb-3">
                                    <label for="name" class="form-label">Name</label>
                                    <input type="text" class="form-control" id="name" name="name" value="${student.name}">
                                </div>
                                <div class="mb-3">
                                    <label for="name" class="form-label">Mobile No</label>
                                    <input type="text" class="form-control" id="mobileno" name="mobileno" value="${student.mobileNo}">
                                </div>
                                <div class="mb-3">
                                    <label for="name" class="form-label">City</label>
                                    <input type="text" class="form-control" id="city" name="city" value="${student.city}">
                                </div>
                                <button type="submit" class="btn btn-primary">Submit</button>
                                
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>    
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>