<%--
  Created by IntelliJ IDEA.
  User: KSOFTNOUT
  Date: 06.05.2018
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>

<link rel="stylesheet" type = "text/css" href = "css/guest.css">
<body>

<div class = tree>

    <img src="pictures/tree.png" class="xMass">

</div>


    <form action="Guest" method="post">
    <input type = "submit" name = "home" value="Home" class = "Home">
    </form>


<div class = logout>

</div>

<div class = logout1>

    <a href="login.jsp">Logout</a>

</div>

<div class = UserName>
    <h1>  ${guestName}</h1>
</div>

<div class = Information>
    <h1> </h1>
    <h1> </h1>
    <h1> ${searchpriceOfTree}</h1>
    <h1> ${searchpriceOfBalls}</h1>
    <h1> ${searchpriceOfCandies}</h1>
    <h1> ${searchpriceOfFlashlights}</h1>
    <h1> ${searchpercentOfBalls}</h1>
    <h1> ${searchpercentOfCandies}</h1>
    <h1> ${searchpercentOfFlashlights}</h1>
</div>
<div class = InfAboutTree>
    <h1>  Information about tree</h1>

</div>

<div class = SearchPictures1>

    <c:choose>
        <c:when test="${status1.equals('1Ball1')}">
            <img src="pictures/Ball1.png" >
        </c:when>

        <c:when test="${status1.equals('1Candy1')}">
            <img src="pictures/Candy1.png" >
        </c:when>
        <c:when test="${status1.equals('1Flashlight1')}">

            <img src="pictures/Flashlight1.png" >
        </c:when>

        <c:when test="${status1.equals('1Ball2')}">
            <img src="pictures/Ball2.png" >
        </c:when>

        <c:when test="${status1.equals('1Candy2')}">
            <img src="pictures/Candy2.png" >
        </c:when>
        <c:when test="${status1.equals('1Flashlight2')}">
            <img src="pictures/Flashlight2.png" >
        </c:when>

        <c:when test="${status1.equals('1Ball3')}">
            <img src="pictures/Ball3.png" >
        </c:when>

        <c:when test="${status1.equals('1Candy3')}">
            <img src="pictures/Candy3.png" >
        </c:when>
        <c:when test="${status1.equals('1Flashlight3')}">
            <img src="pictures/Flashlight3.png" >
        </c:when>

    </c:choose>

</div>

<div class = SearchPictures2>

    <c:choose>
        <c:when test="${status2.equals('21Ball1')}">
            <img src="pictures/Ball1.png" >
        </c:when>

        <c:when test="${status2.equals('2Candy1')}">
            <img src="pictures/Candy1.png" >
        </c:when>
        <c:when test="${status2.equals('2Flashlight1')}">

            <img src="pictures/Flashlight1.png" >
        </c:when>

        <c:when test="${status2.equals('2Ball2')}">
            <img src="pictures/Ball2.png" >
        </c:when>

        <c:when test="${status2.equals('2Candy2')}">
            <img src="pictures/Candy2.png" >
        </c:when>
        <c:when test="${status2.equals('2Flashlight2')}">
            <img src="pictures/Flashlight2.png" >
        </c:when>

        <c:when test="${status2.equals('2Ball3')}">
            <img src="pictures/Ball3.png" >
        </c:when>

        <c:when test="${status2.equals('2Candy3')}">
            <img src="pictures/Candy3.png" >
        </c:when>
        <c:when test="${status2.equals('2Flashlight3')}">
            <img src="pictures/Flashlight3.png" >
        </c:when>

    </c:choose>

</div>


<div class = SearchPictures3>

    <c:choose>
        <c:when test="${status3.equals('3Ball1')}">
            <img src="pictures/Ball1.png" >
        </c:when>

        <c:when test="${status3.equals('3Candy1')}">
            <img src="pictures/Candy1.png" >
        </c:when>
        <c:when test="${status3.equals('3Flashlight1')}">

            <img src="pictures/Flashlight1.png" >
        </c:when>

        <c:when test="${status3.equals('3Ball2')}">
            <img src="pictures/Ball2.png" >
        </c:when>

        <c:when test="${status3.equals('3Candy2')}">
            <img src="pictures/Candy2.png" >
        </c:when>
        <c:when test="${status3.equals('3Flashlight2')}">
            <img src="pictures/Flashlight2.png" >
        </c:when>

        <c:when test="${status3.equals('3Ball3')}">
            <img src="pictures/Ball3.png" >
        </c:when>

        <c:when test="${status3.equals('3Candy3')}">
            <img src="pictures/Candy3.png" >
        </c:when>
        <c:when test="${status3.equals('3Flashlight3')}">
            <img src="pictures/Flashlight3.png" >
        </c:when>

    </c:choose>

</div>

<div class = SearchPictures4>

    <c:choose>
        <c:when test="${status4.equals('4Ball1')}">
            <img src="pictures/Ball1.png" >
        </c:when>

        <c:when test="${status4.equals('4Candy1')}">
            <img src="pictures/Candy1.png" >
        </c:when>
        <c:when test="${status4.equals('4Flashlight1')}">

            <img src="pictures/Flashlight1.png" >
        </c:when>

        <c:when test="${status4.equals('4Ball2')}">
            <img src="pictures/Ball2.png" >
        </c:when>

        <c:when test="${status4.equals('4Candy2')}">
            <img src="pictures/Candy2.png" >
        </c:when>
        <c:when test="${status4.equals('4Flashlight2')}">
            <img src="pictures/Flashlight2.png" >
        </c:when>

        <c:when test="${status4.equals('4Ball3')}">
            <img src="pictures/Ball3.png" >
        </c:when>

        <c:when test="${status4.equals('4Candy3')}">
            <img src="pictures/Candy3.png" >
        </c:when>
        <c:when test="${status4.equals('4Flashlight3')}">
            <img src="pictures/Flashlight3.png" >
        </c:when>

    </c:choose>

</div>

<div class = SearchPictures5>

    <c:choose>
        <c:when test="${status5.equals('5Ball1')}">
            <img src="pictures/Ball1.png" >
        </c:when>

        <c:when test="${status5.equals('5Candy1')}">
            <img src="pictures/Candy1.png" >
        </c:when>
        <c:when test="${status5.equals('5Flashlight1')}">

            <img src="pictures/Flashlight1.png" >
        </c:when>

        <c:when test="${status5.equals('5Ball2')}">
            <img src="pictures/Ball2.png" >
        </c:when>

        <c:when test="${status5.equals('5Candy2')}">
            <img src="pictures/Candy2.png" >
        </c:when>
        <c:when test="${status5.equals('5Flashlight2')}">
            <img src="pictures/Flashlight2.png" >
        </c:when>

        <c:when test="${status5.equals('5Ball3')}">
            <img src="pictures/Ball3.png" >
        </c:when>

        <c:when test="${status5.equals('5Candy3')}">
            <img src="pictures/Candy3.png" >
        </c:when>
        <c:when test="${status5.equals('5Flashlight3')}">
            <img src="pictures/Flashlight3.png" >
        </c:when>

    </c:choose>

</div>

<div class = SearchPictures6>

    <c:choose>
        <c:when test="${status6.equals('6Ball1')}">
            <img src="pictures/Ball1.png" >
        </c:when>

        <c:when test="${status6.equals('6Candy1')}">
            <img src="pictures/Candy1.png" >
        </c:when>
        <c:when test="${status6.equals('6Flashlight1')}">

            <img src="pictures/Flashlight1.png" >
        </c:when>

        <c:when test="${status6.equals('6Ball2')}">
            <img src="pictures/Ball2.png" >
        </c:when>

        <c:when test="${status6.equals('6Candy2')}">
            <img src="pictures/Candy2.png" >
        </c:when>
        <c:when test="${status6.equals('6Flashlight2')}">
            <img src="pictures/Flashlight2.png" >
        </c:when>

        <c:when test="${status6.equals('6Ball3')}">
            <img src="pictures/Ball3.png" >
        </c:when>

        <c:when test="${status6.equals('6Candy3')}">
            <img src="pictures/Candy3.png" >
        </c:when>
        <c:when test="${status6.equals('6Flashlight3')}">
            <img src="pictures/Flashlight3.png" >
        </c:when>

    </c:choose>

</div>

<div class = SearchPictures7>

    <c:choose>
        <c:when test="${status7.equals('7Ball1')}">
            <img src="pictures/Ball1.png" >
        </c:when>

        <c:when test="${status7.equals('7Candy1')}">
            <img src="pictures/Candy1.png" >
        </c:when>
        <c:when test="${status7.equals('7Flashlight1')}">

            <img src="pictures/Flashlight1.png" >
        </c:when>

        <c:when test="${status7.equals('7Ball2')}">
            <img src="pictures/Ball2.png" >
        </c:when>

        <c:when test="${status7.equals('7Candy2')}">
            <img src="pictures/Candy2.png" >
        </c:when>
        <c:when test="${status7.equals('7Flashlight2')}">
            <img src="pictures/Flashlight2.png" >
        </c:when>

        <c:when test="${status7.equals('7Ball3')}">
            <img src="pictures/Ball3.png" >
        </c:when>

        <c:when test="${status7.equals('7Candy3')}">
            <img src="pictures/Candy3.png" >
        </c:when>
        <c:when test="${status7.equals('7Flashlight3')}">
            <img src="pictures/Flashlight3.png" >
        </c:when>

    </c:choose>

</div>

<div class = SearchPictures8>

    <c:choose>
        <c:when test="${status8.equals('8Ball1')}">
            <img src="pictures/Ball1.png" >
        </c:when>

        <c:when test="${status8.equals('8Candy1')}">
            <img src="pictures/Candy1.png" >
        </c:when>
        <c:when test="${status8.equals('8Flashlight1')}">

            <img src="pictures/Flashlight1.png" >
        </c:when>

        <c:when test="${status8.equals('8Ball2')}">
            <img src="pictures/Ball2.png" >
        </c:when>

        <c:when test="${status8.equals('8Candy2')}">
            <img src="pictures/Candy2.png" >
        </c:when>
        <c:when test="${status8.equals('8Flashlight2')}">
            <img src="pictures/Flashlight2.png" >
        </c:when>

        <c:when test="${status8.equals('8Ball3')}">
            <img src="pictures/Ball3.png" >
        </c:when>

        <c:when test="${status8.equals('8Candy3')}">
            <img src="pictures/Candy3.png" >
        </c:when>
        <c:when test="${status8.equals('8Flashlight3')}">
            <img src="pictures/Flashlight3.png" >
        </c:when>

    </c:choose>

</div>

<div class = SearchPictures9>

    <c:choose>
        <c:when test="${status9.equals('9Ball1')}">
            <img src="pictures/Ball1.png" >
        </c:when>

        <c:when test="${status9.equals('9Candy1')}">
            <img src="pictures/Candy1.png" >
        </c:when>
        <c:when test="${status9.equals('9Flashlight1')}">

            <img src="pictures/Flashlight1.png" >
        </c:when>

        <c:when test="${status9.equals('9Ball2')}">
            <img src="pictures/Ball2.png" >
        </c:when>

        <c:when test="${status9.equals('9Candy2')}">
            <img src="pictures/Candy2.png" >
        </c:when>
        <c:when test="${status9.equals('9Flashlight2')}">
            <img src="pictures/Flashlight2.png" >
        </c:when>

        <c:when test="${status9.equals('9Ball3')}">
            <img src="pictures/Ball3.png"  >
        </c:when>

        <c:when test="${status9.equals('9Candy3')}">
            <img src="pictures/Candy3.png" >
        </c:when>
        <c:when test="${status9.equals('9Flashlight3')}">
            <img src="pictures/Flashlight3.png" >
        </c:when>

    </c:choose>

</div>

</body>
</html>
