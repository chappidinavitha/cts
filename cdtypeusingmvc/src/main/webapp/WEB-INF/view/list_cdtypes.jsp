<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<form action="processForm" method="post">
  <div class="form-group">
    <label >CD Title</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label>CD Type</label>
    <select class="form-control" name="type">
      <option value="Unknown">Select...</option>
      <option value="internation cd">internation cd</option>
      <option value="special edition">special edition</option>
      <option value="localedition">localedition</option>
      
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Cdtype releasedate</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="date" name="date">
  </div>
 <input type="submit"/> 
 <input type="reset"/> 
</form>
</body>
</html>