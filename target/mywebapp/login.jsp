<html>
<head>
</head>
<body>
<%@ include file="parts/header.jsp" %>
<div class="container">
<form action="insertData" method="post">

<div class="form-group">
    <label for="exampleInputPassword1">name</label>
    <input name="mname" type="text" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
 </body>
</html>