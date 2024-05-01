<%-- 
    Document   : index-detail-product
    Created on : Apr 9, 2024, 5:37:40 PM
    Author     : hbtth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <body>
        <%@include file="page/head.jsp" %>
        <main >
            <div class="page">
                <div class="container">
                    <div class="page-exit">
                        <ul>
                            <li><a href="home"> Trang chủ</a></li>
                            <li><span>></span></li>
                            <li><a href="home">${product.type.nameCategory} </a></li>
                            <li><span>></span></li>
                            <li><a href="home">${product.type.nameType} </a></li>
                            <li><span>></span></li>
                            <li>${product.nameProduct}</li>
                        </ul>
                    </div>
                </div>
            </div>
            <section>
                <div class="ip-product">
                    <div class="container-2">
                        <div class="ip-product-img">
                            <div class="ip-img"><img src="${product.listImage.get(0).nameImage}" alt=""></div>
                            <div class="ip-img-list">
                                <div class="ip-list">
                                    <div class="list">
                                        <img src="ip-list/0008056_space-black_550.webp" alt="">
                                    </div>
                                </div>
                                <div class="ip-list">
                                    <div class="list">
                                        <img src="ip-list/0008058_space-black_550.webp" alt="">
                                    </div>
                                </div>
                                <div class="ip-list">
                                    <div class="list">
                                        <img src="ip-list/0008059_space-black_550.webp" alt="">
                                    </div>
                                </div>
                                <div class="ip-list">
                                    <div class="list">
                                        <img src="ip-list/0008060_space-black_550.webp" alt="">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="ip-product-info">
                            <div class="ip-title">
                                <div class="product-name"><h2>${product.nameProduct}</h2></div>
                                <div class="product-evaluate">

                                </div>
                            </div>
                            <div class="ip-detail">
                                <div class="detail-price"><strong>${FormatMoney.format(product.salePrice)}đ</strong> <s>${FormatMoney.format(product.primePrice)}đ</s></div>
                                <form action="cart" method="POST"> 
                                    <div class="detail-capacity">
                                        <span>Color</span>
                                        <input type="radio" name="capacity" value="Black" id="11"> <label for="11">Black</label>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <input type="radio" name="capacity" value="Green" id="22"> <label for="22">Green</label>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <input type="radio" name="capacity" value="Purple" id="33"> <label for="33">Purple</label>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <input type="radio" name="capacity" value="Gold" id="44"> <label for="44">Gold</label>
                                    </div>
                                    <div class="detail-endow">
                                        <div class="detail-endow-1">
                                            <ion-icon name="gift-outline"></ion-icon><span> Khuyến mãi</span> 
                                            <label> <input type="radio" name="gender" value="male"> Mua thẳng </label> <br>
                                            <label><input type="radio" name="gender" value="female"> Trả góp 0%</label> <br>
                                            <label><input type="radio" name="gender" value="male">Giá ưu đãi mua kèm bảo hành kim cương, VIP</label> <br>

                                        </div>
                                        <div class="detail-endow-2">
                                            <ion-icon name="gift-outline"></ion-icon><span>Ưu đãi thanh toán</span>
                                            <p>

                                                ● Giảm 500.000đ qua VNPAY (Áp dụng hoá đơn từ 25 triệu - Code: HMHE2023 - SL có hạn) <br>

                                                ● Giảm 500.000đ qua ZaloPay (Áp dụng hoá đơn từ 20 triệu mua tại Shop - SL có hạn) <br>

                                                ● Giảm 5% tối đa 500.000đ qua Kredivo (SL có hạn) <br>
                                            </p>
                                        </div>
                                    </div>
                                    <input type="hidden" value="${product.salePrice}" name="priceOfProduct">
                                    <input type="hidden" value="${product.idProduct}" name="idProduct">
                                    <div class="detail-buy">
                                        <div class="detail-buy-1"><button style="width: 200px" type="submit">Add to cart</button>
                                        </div>
                                        <div class="detail-buy-2"><button>Trả góp</button><button><ion-icon name="repeat-outline"></ion-icon>Thu cũ đổi mới</button></div>
                                    </div>
                                </form>
                                
                                <div class="detail-bottom">
                                    <ul>
                                        <li><ion-icon name="checkmark-circle-sharp"></ion-icon>Bộ sản phẩm gồm: Hộp, Sách hướng dẫn, Cây lấy sim, Cáp Lightning - Type C</li>
                                        <li><ion-icon name="checkmark-circle-sharp"></ion-icon>Bảo hành chính hãng 1 năm </li>
                                        <li><ion-icon name="checkmark-circle-sharp"></ion-icon>Giao hàng nhanh toàn quốc </li>
                                        <li><ion-icon name="checkmark-circle-sharp"></ion-icon>Gọi đặt mua 0352827813(7:30 - 22:00)</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>

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
