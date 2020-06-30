<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<h1>Add A Commitee Memeber</h1>

<form action="/addCommiteeMember" method="post" >

  <div class="container">
    <label for="commiteeMembername"><b>commiteeMember_name</b></label>
    <input type="text" placeholder="Enter commiteeMember_name " name="commiteeMember_name" required>
    <br>
        <label for="phoneNumber"><b>phoneNumber</b></label>
    <input type="text" placeholder="phoneNumber" name="phoneNumber" required>
      <br>
        <label for="wardNumber"><b>wardNumber</b></label>
    <input type="text" placeholder="wardNumber " name="wardNumber" required>
  
    <button type="submit">Add Commitee Memeber</button>
    
      <h6>${commiteeMemberAddition}</h6>
   
  </div>
</form>



