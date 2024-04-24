<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
<center>
<header>
<h1 style="color:blue; ">SFDC BANK</h1>
<h2 style="color: red;">EXTRAORDINARY SERVICES</h2>
</header>
<h2><marquee style="color: green;">Say hello to a unique banking experience that meets all your requirements and guarantees a personalised service. We offer a wide range of accounts, deposits and loans in all the major currencies....
</marquee></h2>
<nav>
<div style="background: aqua;size: 50px">
<a href="/">Home</a> &nbsp;&nbsp;&nbsp;
<a href="/newaccount">New Account</a> &nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a> &nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a> &nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a> &nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a> &nbsp;&nbsp;&nbsp;
<a href="/closeacc">Close A/C</a> &nbsp;&nbsp;&nbsp;
<a href="/aboutus">AboutUs</a> &nbsp;&nbsp;&nbsp;
</div>
</nav>
<style>
#div1{
width: 30%;
float: left;
}
#div2{
width: 30%;
float: right;
}
#div3{
width: 40%;
margin: 0 auto;
font-size: 80px;
color: red;
}
</style>
<div id="div1">
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
<div id="div2">
<h2>WELCOME...</h2>
<br>
<img src="e1.jpg" height="60%" width="70%">
<p style="align-content:'justify'"><h4>
Say hello to a unique banking experience that meets all your requirements and guarantees a personalised service. We offer a wide range of accounts, deposits and loans in all the major currencies....
</h4></p>
</div>
<br><br><br>
<div id="div3">
<section>
  <img class="mySlides" src="1.jpg" style="width:100%">
  <img class="mySlides" src="2.jpg" style="width:100%">
  <img class="mySlides" src="3.jpg" style="width:100%">
  <img class="mySlides" src="e1.jpg" style="width:100%">
</section>
<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}
  x[myIndex-1].style.display = "block";
  setTimeout(carousel, 2000);
}
</script>

</div>
</center>
</body>
</html>