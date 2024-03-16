<!DOCTYPE html>
<html>
<head>
<title>Form</title>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
<style>
form {
            display: block;
        }
</style>
</head>
<body>
<div class="container">
    <div class="col-md-4" >
<form name="register" method="post" action="register" id="#myform" class="form-group">
<h3>Form</h3>
<label>Name</label>
<input type="text" name="name" placeholder="name" id="name" class="form-control">
<label>Email ID</label>
<input type="email"  id="email" placeholder="email"name="email" class="form-control" >
<label>Age</label>
<input type="number" id="age" placeholder="age" name="age" min="1" class="form-control">
<label>Date of Birth</label>
<input type="date" id="dob"  name="dob" class="form-control">
<br>
<button type="submit">submit</button>
</form>
</div>
</div>
</body>
</html>