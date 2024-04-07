<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<h1>Hi ! from sign page</h1>
<form:form  action = "registerUser" modelAttribute= "user">
 name:
 <form:input path="name"/>
 <br/>
 <br/>
 gender:
 <br/>
 Male<form:radiobutton path="gender" value ="Male"/>
 Female<form:radiobutton path="gender" value ="Female"/>
 <br/>
 <br/>
 location:
 <form:select path="location">
 <form:option value="India"></form:option>
 <form:option value="USA"></form:option>
 <form:option value="Nepal"></form:option>
 <form:option value="Russia"></form:option>
 <br/>
 <br/>
 </form:select>
 <br/>
 <br/>
 college:
  <form:select path="collage">
 <form:option value="India"></form:option>
 <form:option value="USA"></form:option>
 <form:option value="Nepal"></form:option>
 <form:option value="Russia"></form:option>
 <br/>
 <br/>
 </form:select>
 <br/>
 <br/>
 <input type ="submit">
</form:form>


</html>