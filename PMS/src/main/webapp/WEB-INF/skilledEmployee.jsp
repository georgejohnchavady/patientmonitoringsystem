<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<h1>Add A Skilled Employee</h1>

<form action="/addSkilledEmployee" method="post" >

  <div class="container">
    <label for="skilledstaffName"><b>skilledstaffName</b></label>
    <input type="text" placeholder="Enter Skilled Staff NAme " name="skilledstaffName" required>
    <br>
        <label for="phoneNumber"><b>phoneNumber</b></label>
    <input type="text" placeholder="phoneNumber" name="phoneNumber" required>
      <br>
        <label for="availableDays"><b>availableDays</b></label>
    <input type="text" placeholder="availableDays " name="availableDays" required>
      <br>
        <label for="designation"><b>designation</b></label>
    <input type="text" placeholder="designation" name="designation" required>

  <br>

    <button type="submit">Add Skilled Employee</button>
    <h6>${skilledEmployeeAddition}</h6>
   
  </div>
</form>

