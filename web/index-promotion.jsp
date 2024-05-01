<%-- 
    Document   : index-promotion
    Created on : Apr 9, 2024, 10:09:33 AM
    Author     : hbtth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
        <link rel="stylesheet" href="index.css">
        <link rel="icon" href="img/logo.ico" type="image/icontype">
        <title>Táo sờ to-Dịch vụ</title>
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
                            <li>Khuyến mãi</li>
                        </ul>
                    </div>
                </div>
            </div>
            <section>
                <div style="font-weight: bold;font-size: 50px;color: red;text-align: center;padding: 50px;" class="promotion">
                    <p><ion-icon name="sad-outline"></ion-icon>Chưa có làm <ion-icon name="sad-outline"></ion-icon></p>
                </div>
            </section>
            <!-- email -->
            <section>
                <div class="container">
                    <div class="subscript">
                        <div class="icon-text">
                            <div class="text">
                                <h3>Đăng ký nhận tin</h3>
                                <p>Đăng ký để nhận những chương trình khuyến mại hot nhất của Phone Sờ To</p>
                            </div>
                        </div>
                        <div class="form">
                            <form onsubmit="return submitSubscription(this);">
                                <input name="__RequestVerificationToken" type="hidden" value="6QhQeeyNud4u93WVC60kqb-yMeXNL6b91HO5_0exeVY2dC8JjuieqDQ7dm-y31PeMlcOyMRVGaFrklgaBj-fr4I-_vg1" />
                                <div class="input">
                                    <input type="email" id="email" name="email" placeholder="Nhập E-mail của bạn" />
                                </div>
                                <button type="submit"><ion-icon class="fa-solid" name="paper-plane"></ion-icon></button>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </main>
        <%@include file="page/footer.jsp" %>
    </body>
</html>
