<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 4/13/2018
  Time: 5:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" type="text/css" href="css/logout.css">

<body>
<div class=logout>

</div>

<div class=search>
    <form action="Dec" method="post">
        <input type="text" name="search" placeholder="Enter Username">
        <input type="submit" name="searchButton" value="Search">
    </form>
</div>

<div class="name">
    <h1>${name}</h1>
</div>

<div class=delete>
    <form action="Dec" method="post">
        <input type="text" name="delete" placeholder="Enter Number">
        <input type="submit" name="deleteButton" value="Delete">
    </form>
</div>
<div class=SearchYourselfOrAbsent>
    <h1> ${SearchYourselfOrAbsent}</h1>
</div>

<div class=logout1>

    <a href="login.jsp">Logout</a>


</div>


<div class=tree>

    <img src="pictures/tree.png" class="xMass">

</div>

<div class=Information>
    <h1></h1>
    <h1></h1>
    <h1> ${priceOfTree}</h1>
    <h1> ${priceOfBalls}</h1>
    <h1> ${priceOfCandies}</h1>
    <h1> ${priceOfFlashlights}</h1>
    <h1> ${percentOfBalls}</h1>
    <h1> ${percentOfCandies}</h1>
    <h1> ${percentOfFlashlights}</h1>
</div>
<div class=InfAboutTree>
    <h1> Information about tree</h1>

</div>


<div class=Decoration>
    <form action="Dec" method="post">
        <input type="image" name="button" class="Ball1" img src="pictures/Ball1.png" value="Ball1">
        <input type="image" name="button" class="Candy1" img src="pictures/Candy1.png" value="Candy1">
        <input type="image" name="button" class="Flashlight1" img src="pictures/Flashlight1.png" value="Flashlight1">
        <input type="image" name="button" class="Ball2" img src="pictures/Ball2.png" value="Ball2">
        <input type="image" name="button" class="Candy2" img src="pictures/Candy2.png" value="Candy2">
        <input type="image" name="button" class="Flashlight2" img src="pictures/Flashlight2.png" value="Flashlight2">
        <input type="image" name="button" class="Ball3" img src="pictures/Ball3.png" value="Ball3">
        <input type="image" name="button" class="Candy3" img src="pictures/Candy3.png" value="Candy3">
        <input type="image" name="button" class="Flashlight3" img src="pictures/Flashlight3.png" value="Flashlight3">
    </form>

</div>
<div class=Choice>
    <h1> Make your choice</h1>

</div>


<div class=Pictures1>

    <c:choose>
        <c:when test="${status1.equals('1Ball1')}">
            <img src="pictures/Ball1.png">
        </c:when>

        <c:when test="${status1.equals('1Candy1')}">
            <img src="pictures/Candy1.png">
        </c:when>
        <c:when test="${status1.equals('1Flashlight1')}">

            <img src="pictures/Flashlight1.png">
        </c:when>

        <c:when test="${status1.equals('1Ball2')}">
            <img src="pictures/Ball2.png">
        </c:when>

        <c:when test="${status1.equals('1Candy2')}">
            <img src="pictures/Candy2.png">
        </c:when>
        <c:when test="${status1.equals('1Flashlight2')}">
            <img src="pictures/Flashlight2.png">
        </c:when>

        <c:when test="${status1.equals('1Ball3')}">
            <img src="pictures/Ball3.png">
        </c:when>

        <c:when test="${status1.equals('1Candy3')}">
            <img src="pictures/Candy3.png">
        </c:when>
        <c:when test="${status1.equals('1Flashlight3')}">
            <img src="pictures/Flashlight3.png">
        </c:when>

    </c:choose>

</div>

<div class=Pictures2>

    <c:choose>
        <c:when test="${status2.equals('21Ball1')}">
            <img src="pictures/Ball1.png">
        </c:when>

        <c:when test="${status2.equals('2Candy1')}">
            <img src="pictures/Candy1.png">
        </c:when>
        <c:when test="${status2.equals('2Flashlight1')}">

            <img src="pictures/Flashlight1.png">
        </c:when>

        <c:when test="${status2.equals('2Ball2')}">
            <img src="pictures/Ball2.png">
        </c:when>

        <c:when test="${status2.equals('2Candy2')}">
            <img src="pictures/Candy2.png">
        </c:when>
        <c:when test="${status2.equals('2Flashlight2')}">
            <img src="pictures/Flashlight2.png">
        </c:when>

        <c:when test="${status2.equals('2Ball3')}">
            <img src="pictures/Ball3.png">
        </c:when>

        <c:when test="${status2.equals('2Candy3')}">
            <img src="pictures/Candy3.png">
        </c:when>
        <c:when test="${status2.equals('2Flashlight3')}">
            <img src="pictures/Flashlight3.png">
        </c:when>

    </c:choose>

</div>


<div class=Pictures3>

    <c:choose>
        <c:when test="${status3.equals('3Ball1')}">
            <img src="pictures/Ball1.png">
        </c:when>

        <c:when test="${status3.equals('3Candy1')}">
            <img src="pictures/Candy1.png">
        </c:when>
        <c:when test="${status3.equals('3Flashlight1')}">

            <img src="pictures/Flashlight1.png">
        </c:when>

        <c:when test="${status3.equals('3Ball2')}">
            <img src="pictures/Ball2.png">
        </c:when>

        <c:when test="${status3.equals('3Candy2')}">
            <img src="pictures/Candy2.png">
        </c:when>
        <c:when test="${status3.equals('3Flashlight2')}">
            <img src="pictures/Flashlight2.png">
        </c:when>

        <c:when test="${status3.equals('3Ball3')}">
            <img src="pictures/Ball3.png">
        </c:when>

        <c:when test="${status3.equals('3Candy3')}">
            <img src="pictures/Candy3.png">
        </c:when>
        <c:when test="${status3.equals('3Flashlight3')}">
            <img src="pictures/Flashlight3.png">
        </c:when>

    </c:choose>

</div>

<div class=Pictures4>

    <c:choose>
        <c:when test="${status4.equals('4Ball1')}">
            <img src="pictures/Ball1.png">
        </c:when>

        <c:when test="${status4.equals('4Candy1')}">
            <img src="pictures/Candy1.png">
        </c:when>
        <c:when test="${status4.equals('4Flashlight1')}">

            <img src="pictures/Flashlight1.png">
        </c:when>

        <c:when test="${status4.equals('4Ball2')}">
            <img src="pictures/Ball2.png">
        </c:when>

        <c:when test="${status4.equals('4Candy2')}">
            <img src="pictures/Candy2.png">
        </c:when>
        <c:when test="${status4.equals('4Flashlight2')}">
            <img src="pictures/Flashlight2.png">
        </c:when>

        <c:when test="${status4.equals('4Ball3')}">
            <img src="pictures/Ball3.png">
        </c:when>

        <c:when test="${status4.equals('4Candy3')}">
            <img src="pictures/Candy3.png">
        </c:when>
        <c:when test="${status4.equals('4Flashlight3')}">
            <img src="pictures/Flashlight3.png">
        </c:when>

    </c:choose>

</div>

<div class=Pictures5>

    <c:choose>
        <c:when test="${status5.equals('5Ball1')}">
            <img src="pictures/Ball1.png">
        </c:when>

        <c:when test="${status5.equals('5Candy1')}">
            <img src="pictures/Candy1.png">
        </c:when>
        <c:when test="${status5.equals('5Flashlight1')}">

            <img src="pictures/Flashlight1.png">
        </c:when>

        <c:when test="${status5.equals('5Ball2')}">
            <img src="pictures/Ball2.png">
        </c:when>

        <c:when test="${status5.equals('5Candy2')}">
            <img src="pictures/Candy2.png">
        </c:when>
        <c:when test="${status5.equals('5Flashlight2')}">
            <img src="pictures/Flashlight2.png">
        </c:when>

        <c:when test="${status5.equals('5Ball3')}">
            <img src="pictures/Ball3.png">
        </c:when>

        <c:when test="${status5.equals('5Candy3')}">
            <img src="pictures/Candy3.png">
        </c:when>
        <c:when test="${status5.equals('5Flashlight3')}">
            <img src="pictures/Flashlight3.png">
        </c:when>

    </c:choose>

</div>

<div class=Pictures6>

    <c:choose>
        <c:when test="${status6.equals('6Ball1')}">
            <img src="pictures/Ball1.png">
        </c:when>

        <c:when test="${status6.equals('6Candy1')}">
            <img src="pictures/Candy1.png">
        </c:when>
        <c:when test="${status6.equals('6Flashlight1')}">

            <img src="pictures/Flashlight1.png">
        </c:when>

        <c:when test="${status6.equals('6Ball2')}">
            <img src="pictures/Ball2.png">
        </c:when>

        <c:when test="${status6.equals('6Candy2')}">
            <img src="pictures/Candy2.png">
        </c:when>
        <c:when test="${status6.equals('6Flashlight2')}">
            <img src="pictures/Flashlight2.png">
        </c:when>

        <c:when test="${status6.equals('6Ball3')}">
            <img src="pictures/Ball3.png">
        </c:when>

        <c:when test="${status6.equals('6Candy3')}">
            <img src="pictures/Candy3.png">
        </c:when>
        <c:when test="${status6.equals('6Flashlight3')}">
            <img src="pictures/Flashlight3.png">
        </c:when>

    </c:choose>

</div>

<div class=Pictures7>

    <c:choose>
        <c:when test="${status7.equals('7Ball1')}">
            <img src="pictures/Ball1.png">
        </c:when>

        <c:when test="${status7.equals('7Candy1')}">
            <img src="pictures/Candy1.png">
        </c:when>
        <c:when test="${status7.equals('7Flashlight1')}">

            <img src="pictures/Flashlight1.png">
        </c:when>

        <c:when test="${status7.equals('7Ball2')}">
            <img src="pictures/Ball2.png">
        </c:when>

        <c:when test="${status7.equals('7Candy2')}">
            <img src="pictures/Candy2.png">
        </c:when>
        <c:when test="${status7.equals('7Flashlight2')}">
            <img src="pictures/Flashlight2.png">
        </c:when>

        <c:when test="${status7.equals('7Ball3')}">
            <img src="pictures/Ball3.png">
        </c:when>

        <c:when test="${status7.equals('7Candy3')}">
            <img src="pictures/Candy3.png">
        </c:when>
        <c:when test="${status7.equals('7Flashlight3')}">
            <img src="pictures/Flashlight3.png">
        </c:when>

    </c:choose>

</div>

<div class=Pictures8>

    <c:choose>
        <c:when test="${status8.equals('8Ball1')}">
            <img src="pictures/Ball1.png">
        </c:when>

        <c:when test="${status8.equals('8Candy1')}">
            <img src="pictures/Candy1.png">
        </c:when>
        <c:when test="${status8.equals('8Flashlight1')}">

            <img src="pictures/Flashlight1.png">
        </c:when>

        <c:when test="${status8.equals('8Ball2')}">
            <img src="pictures/Ball2.png">
        </c:when>

        <c:when test="${status8.equals('8Candy2')}">
            <img src="pictures/Candy2.png">
        </c:when>
        <c:when test="${status8.equals('8Flashlight2')}">
            <img src="pictures/Flashlight2.png">
        </c:when>

        <c:when test="${status8.equals('8Ball3')}">
            <img src="pictures/Ball3.png">
        </c:when>

        <c:when test="${status8.equals('8Candy3')}">
            <img src="pictures/Candy3.png">
        </c:when>
        <c:when test="${status8.equals('8Flashlight3')}">
            <img src="pictures/Flashlight3.png">
        </c:when>

    </c:choose>

</div>

<div class=Pictures9>

    <c:choose>
        <c:when test="${status9.equals('9Ball1')}">
            <img src="pictures/Ball1.png">
        </c:when>

        <c:when test="${status9.equals('9Candy1')}">
            <img src="pictures/Candy1.png">
        </c:when>
        <c:when test="${status9.equals('9Flashlight1')}">

            <img src="pictures/Flashlight1.png">
        </c:when>

        <c:when test="${status9.equals('9Ball2')}">
            <img src="pictures/Ball2.png">
        </c:when>

        <c:when test="${status9.equals('9Candy2')}">
            <img src="pictures/Candy2.png">
        </c:when>
        <c:when test="${status9.equals('9Flashlight2')}">
            <img src="pictures/Flashlight2.png">
        </c:when>

        <c:when test="${status9.equals('9Ball3')}">
            <img src="pictures/Ball3.png">
        </c:when>

        <c:when test="${status9.equals('9Candy3')}">
            <img src="pictures/Candy3.png">
        </c:when>
        <c:when test="${status9.equals('9Flashlight3')}">
            <img src="pictures/Flashlight3.png">
        </c:when>

    </c:choose>

</div>

<style>
    #blink {
        -webkit-animation: blink 2s linear infinite;
        animation: blink 2s linear infinite;
        font-size: 40px;

        color: #F00;
    }

    @-webkit-keyframes blink {
        0% {
            color: #F00;
        }
        50% {
            color: #FBB;
        }
        100% {
            color: #F00;
        }
    }

    @keyframes blink {
        0% {
            color: #F00;
        }
        50% {
            color: #FBB;
        }
        100% {
            color: #F00;
        }
    }
</style>
<div class=Error>
    <p id="blink">${ErrorMessage}</p id = "blink">
</div>


</body>
</html>

