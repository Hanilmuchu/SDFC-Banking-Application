<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1 style="color:blue; ">SFDC BANK</h1>
<h2 style="color: red">EXTRAORDINARY SERVICES</h2>
</header>
<h2><marquee style="color: green;">Say hello to a unique banking experience that meets all your requirements and guarantees a personalised service. We offer a wide range of accounts, deposits and loans in all the major currencies....
</marquee></h2>
<div style="background: aqua;">
<a href="/">Home</a> &nbsp;&nbsp;&nbsp;
<a href="/newaccount">New Account</a> &nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a> &nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a> &nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a> &nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a> &nbsp;&nbsp;&nbsp;
<a href="/closeacc">Close A/C</a> &nbsp;&nbsp;&nbsp;
<a href="/aboutus">AboutUs</a>
</div>
<p></p><p></p>
<style>
#div1{
width: 53.33%;
margin:0 auto;
}
#div2{
width: 23.33%;
float: left;
}
#div3{
width: 23.33%;
float: right;
}
.box{
                width: 500px;
                height: 450px;
                margin: 60px auto 0;
                background: rgba(0, 0,0,0.6);
                text-align: center;
                padding: 35px;
                border: 3px solid red;
                border-radius: 70px 0 70px 0;
                text
            }
</style>
<div id="div2">
<h2>SERVICES</h2>
<h3>
Whatsapp Banking<br>
Doorstep Banking <br>
UPI Autopay <br>
Mobile Banking<br>
Online Banking <br>
Remote Banking <br>
Phone Banking <br>
Online Banking <br>
</h3>
</div>
<div id="div3">
<h2>WELCOME...</h2>
<br>
<img src="e1.jpg" height="60%" width="70%">

<p style="align-content:'justify'"><h4>
Say hello to a unique banking experience that meets all your requirements and guarantees a personalised service. We offer a wide range of accounts, deposits and loans in all the major currencies....
</h4></p>
</div>
<div id="div1">
<h1>Account Details</h1>
<table border="1"
	   cellpadding="5">
<tr>
<th>ACCOUNT NO</th>
<th>USERNAME</th>
<th>AMOUNT</th>
<th>ADDRESS</th>
<th>PHONE</th>
<th>ACCOUNT STATUS</th>
</tr>
<tr>
<td>${users.accNo}</td>
<td>${users.name}</td>
<td>${users.amount}</td>
<td>${users.address}</td>
<td>${users.mno}</td>
<td>Active</td>
</tr>
</table>
</div>
</center>