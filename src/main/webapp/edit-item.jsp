<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>

  function checkForm(form)
  {
    // validation fails if the input is blank
    if(form.inputfield.value == "") {
      alert("Error: Input is empty!");
      form.inputfield.focus();
      return false;
    }

    // regular expression to match only alphanumeric characters and spaces
    var re = /^[\w ]+$/;

    // validation fails if the input doesn't match our regular expression
    if(!re.test(form.inputfield.value)) {
      alert("Error: Input contains invalid characters!");
      form.inputfield.focus();
      return false;
    }

    // validation was successful
    return true;
  }

</script>

</head>
<body>
<form action = "editItemServlet" method="post" onsubmit="checkForm(this);">
Store: <input type = "text" name = "store" value = "${itemToEdit.store}">
Item: <input type = "text" name = "item" value = "${itemToEdit.item}">
 <input type = "hidden" name = "id" value = "${itemToEdit.id}">
<input type="submit" value = "Save Edited Item">

</form>

</body>
</html>