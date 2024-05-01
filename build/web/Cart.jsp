<%-- 
    Document   : Cart
    Created on : Apr 9, 2024, 11:50:35 PM
    Author     : hbtth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Model.*" %>
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
        <title>Táo sờ to-iPhone</title>
    </head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <body>
        <%@include file="page/head.jsp" %>
        <main >
            <div class="page">
                <div class="container">
                    <div class="page-exit">
                        <ul>
                            <li><a href="index.html"> Trang chủ</a></li>
                            <li><span>></span></li>
                            <li>Giỏ hàng</li>
                        </ul>
                    </div>
                </div>
            </div>
            <section style="width: 100%;">
                <div class="container">
                    <table>
                        <tr>
                            <th>ID</th>
                            <th>Image</th>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Color</th>
                            <th>Total</th>
                            <th>Action</th>
                        </tr>
                        <c:forEach items="${cartOfUser.getAllItemfromCart()}" var="i">
                            <tr>
                                <td>${i.product.idProduct}</td>
                                <td><img src="${i.product.listImage.get(0).nameImage}" style="width: 80px;height: 80px"></td>
                                <td>${i.product.nameProduct}</td>
                                <td>${FormatMoney.format(i.getTotalPrice())}đ</td>
                                <td>
                                    ${i.capacity}
                                </td>
                                <td><button style="width: 50px;height: 20px" onclick="processOnCart(1,${i.product.idProduct})">+</button>
                                    ${i.totalProduct}
                                <button style="width: 50px;height: 20px" onclick="processOnCart(-1,${i.product.idProduct})">-</button></td>
                                <td><a href="delete?idProduct=${i.product.idProduct}" onclick="return confirm('Are you sure you want to delete this product?')">delete</a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </section>
            <h1 style="text-align: center; margin-top: 50px">Total price:${FormatMoney.format(cartOfUser.getTotalMoney())}đ</h1>
            <form style="display: flex; justify-content: center" action="process" method="post">
                <input style=" width:100px;background-color: #33c997;font-weight: 780;" type="submit" value="Check out">
            </form>
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
        <script>
            function processOnCart(val,id){
                window.location = "process?val="+val+"&idProduct="+id;
            }
        </script>
    </body>
</html>
