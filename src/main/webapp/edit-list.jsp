<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit An Existing List</title>

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
<form action = "editListDetailsServlet" method="post" onsubmit="checkForm(this);">
<input type ="hidden" name = "id" value= "${listToEdit.id}">
List Name: <input type ="text" name = "listName" value= "${listToEdit.listName}"><br />
Trip date: <input type ="text" name = "month" placeholder="mm" size="4" value= "${month}"> <input type ="text" name = "day" placeholder="dd" size="4" value= "${date}">, <input type ="text" name = "year" placeholder="yyyy" size="4" value= "${year}">
Shopper Name: <input type = "text" name = "shopperName" value= "${listToEdit.shopper.shopperName}"><br />

Available Items:<br />

<select name="allItemsToAdd" multiple size="6">
<c:forEach items="${requestScope.allItems}" var="currentitem">
   <option value = "${currentitem.id}">${currentitem.store} | ${currentitem.item}</option>
</c:forEach>
</select>
<br />
<input type = "submit" value="Edit List and Add Items">
</form>
<a href = "index.html">Go add new items instead.</a>
</body>
</html>