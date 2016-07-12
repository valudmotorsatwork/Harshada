<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="kendo" uri="http://www.kendoui.com/jsp/tags"%>
<head>
<link rel="stylesheet" href="css/kendo.common.min.css"/>
<link rel="stylesheet" href="css/kendo.default.min.css" />
<link rel="stylesheet" href="css/kendo.default.mobile.min.css" />
<link rel="stylesheet" href="css/kendo.dataviz.default.min.css"/>
<link rel="stylesheet" href="css/kendo.rtl.min.css"/>
<style >
div.right{
width: 22%
}
div.absolute {
	width: 50%
    position: absolute;
    box-sizing: border-box;
    width: 300px;
    height: 400px;
    margin-top:70px;
    margin-bottom:70px;
    border: 3px solid black;
    background-color: silver;
}
div.left{
width: 22%
}
div.vertical{
height:20px;
}
#login.title {
                    font-size: 16px;
                    color: #fff;
                    background-color: #1e88e5;
                    padding: 20px 30px;
                    margin: 0;
               }
.k-primary{
width: 120px;
height: 30px;
background-color: light gray;
}
 .demo-section {
                    padding: 0;
                }
</style>
</head>
<body>
<form action="RegisterController" method="post">
<div id="example" align="center">
<div class="right"></div>
<div class="absolute" align="center">
<br/>
<% if ( session.getAttribute( "ExistUser" ) != null ) { %>
<%=session.getAttribute( "ExistUser" )%>
<% } %>
<div id="login.title" class="demo-section k content" align="center"><h2 class="title">SignUp</h2>
<table>
<tr></tr>

<tr>
<td align="left">
 <label for="name">First Name</label></td>
</tr>

<tr>
<td>
 <kendo:maskedTextBox name="firstName"></kendo:maskedTextBox>
</td>
</tr>
<tr></tr>

<tr>
<td align="left">
 <label for="name">Last Name</label></td>
</tr>

<tr>
<td>
<kendo:maskedTextBox name="lastName"></kendo:maskedTextBox>
</td>
</tr>
<tr></tr>
<tr>
<td align="left">
 <label for="name">Email</label></td>
</tr>
<tr>
<td>
<kendo:maskedTextBox name="email"></kendo:maskedTextBox>
</td>
</tr>
<tr></tr>
<tr>
<td align="left">
 <label for="password">Password</label></td>
</tr>

 <tr>
 <td>
<kendo:maskedTextBox name="password" type="password"></kendo:maskedTextBox> 
</td>
</tr>

<tr><td align="center">
<kendo:button name="Signup" class="k-primary" enable="false" >
<kendo:button-content>
Sign Up
</kendo:button-content>
</kendo:button>
</td>
</table>
</div>
<div class="left"></div>
</div>
</div>
</form>
</body>