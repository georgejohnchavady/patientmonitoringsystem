<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<h1>Add A Patient</h1>

<form action="/addPatient" method="post" >

  <div class="container">
    <label for="patientName"><b>patientName</b></label>
    <input type="text" placeholder="Enter patientName " name="patientName" required>
    <br>
        <label for="phoneNumber"><b>phoneNumber</b></label>
    <input type="text" placeholder="phoneNumber" name="phoneNumber" required>
      <br>
        <label for="wardNumber"><b>wardNumber</b></label>
    <input type="text" placeholder="wardNumber " name="wardNumber" required>
      <br>
        <label for="disease"><b>disease</b></label>
    <input type="text" placeholder="disease" name="disease" required>

  <br>

    <button type="submit">Add Patient</button>
    <h6>${patientAddition}</h6>
   
  </div>
</form>


