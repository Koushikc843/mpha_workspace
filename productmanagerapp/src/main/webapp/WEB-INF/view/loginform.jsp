<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>SignIn</title>
        <link rel="stylesheet" href="style.css">
    </head>

    <body>
        <div class="container">

            <div class="menu">
                <jsp:include page="menu.jsp" />
                <h3>SignIn</h3>
            </div>
            <div class="form">
                <form action="logincontroller" method="post">

                    <div class="inside">
                        <div>
 Login:<input type='text' name='lg'>
                        </div>
                       <div>
Password:<input type='text' name='ps'>
                       </div>
                        <div>
 <button id=but>submit</button>
                        </div>
                        
                       

                    </div>
                </form>
            </div>
 </div>

    </body>

    </html>