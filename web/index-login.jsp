<%-- 
    Document   : index-login
    Created on : Apr 9, 2024, 9:39:04 AM
    Author     : hbtth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
        <link rel="stylesheet" href="index.css">
        <link rel="icon" href="img/logo.ico" type="image/icontype">
        <title>Táo sờ to-iPhone</title>
    </head>
    <body>
        <%@include file="page/head.jsp" %>
        <main >
            <div class="page">
                <div class="container">
                    <div class="page-exit">
                        <ul>
                            <li><a href="index.html"> Trang chủ</a></li>
                            <li><span>></span></li>
                            <li>Đăng nhập</li>
                        </ul>
                    </div>
                </div>
            </div>
            <section>
                <div class="page-user">
                    <div class="page-user-body">
                        <div class="img-page">
                            <img src="img/VNU_M492_08 1.jpeg" alt="">
                        </div>
                        <form class="form-user" action="login" method="POST">
                            <div class="form-register">
                                <div class="info-user">
                                    <div class="page-title-1">
                                        <h1>Đăng Nhập</h1>
                                    </div>
                                    <div class="info-form">
                                        <div class="input-username">
                                            <p>Username:</p>
                                            <input type="text" name="username" value="${username != null ? username : ''}" required>
                                        </div>
                                        <div class="input-password">
                                            <p>Mật khẩu:</p>
                                            <input type="password" name="password" value="${password != null ? password : ''}" required>
                                        </div>
                                            <p style="color: red">${noitce}</p>
                                    </div>
                                    <div class="input-forgot">
                                        <div class="check">
                                            <input id="3" type="checkbox" name="rem" value="112513" ${remember != null ? 'checked':''}>
                                            <label for="3"> Nhớ mật khẩu</label>
                                        </div>
                                        <span class="forgot-password"><a href="">Quên mật khẩu?</a></span>
                                    </div>
                                    <div class="buttons">
                                        <button type="submit">Đăng nhập</button>
                                    </div>
                                    <div class="buttons-forgot">
                                        <label for="">Bạn chưa có tài khoản?</label>
                                        <a href="register">Tạo tài khoản ngay</a>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </section>

            <!-- email -->
            <section>
                <div class="container">

                </div>
            </section>
        </main>
        <%@include file="page/footer.jsp" %>
    </body>

</html>
