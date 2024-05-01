<%-- 
    Document   : index-search
    Created on : Apr 9, 2024, 9:25:25 PM
    Author     : hbtth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
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
    <body>
        <%@include file="page/head.jsp" %>
        <main >
            <div class="page">
                <div class="container">
                    <div class="page-exit">
                        <ul>
                            <li><a href="index.html"> Trang chủ</a></li>
                            <li><span>></span></li>
                            <li>Search</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!--slider-->
            <section class="slider">
                <div class="container">
                    <div class="slider-content">
                        <div class="page-title">
                            <span>Search</span>
                        </div>
                        <div class="slider-content-top-container">
                            <div class="slider-content-top">
                                <a href=""><img src="banner/iphone/category_ip_13-T4-02.jpeg" alt=""></a>
                                <a href=""><img src="banner/iphone/category_iphone_ipad-10.jpg" alt=""></a>
                                <a href=""><img src="banner/iphone/ip14_yellow_category.jpeg" alt=""></a>
                            </div>
                            <div class="slider-content-top-dh">
                                <ion-icon class="fa-solid fa-chevron-left" name="chevron-back-outline"></ion-icon>
                                <ion-icon class="fa-solid fa-chevron-right" name="chevron-forward-outline"></ion-icon>
                            </div>
                        </div>
                        <div style="display: none;" class="slider-content-bottom">
                            <li class="active"> MacBook Air đẳng cấp </li>
                            <li> iPhone chơi liên quân</li>
                            <li> Một đống phụ kiện</li>
                            <li> Apple Wach xem giờ</li>
                            <li> iPad bắn free fire</li>
                        </div>
                    </div>
                </div>
                </div>
            </section>
            <section>
                <div class="container">
                    <video style="width: 100%;" src="img/large_2x.mp4" autoplay muted loop ></video>
                </div>
            </section>
            <!-- IPHONE -->
            <section>
                <div class="container">
                    <div class="box-home">
                        <section>
                            <div class="page-body">
                                <div class="container">
                                    <div class="sub-menu-ip">
                                        <div class="item-box-active">
                                            <div class="sub-item_ip">
                                                <a href="index-iphone.html" style="color: blue;font-weight: 600;border-bottom: 2px solid blue;">Tất cả</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="product-selectors">
                                        <div class="product-viewmode">
                                            <form action="search" method="post" name="ff">
                                                <select name="sort" onchange="sortFunction()">
                                                    <option value="0" ${choice == 0 ? 'selected':''}>Thứ tự hiển thị</option>
                                                    <option value="1" ${choice == 1 ? 'selected':''}>Giá từ cao đến thấp</option>
                                                    <option value="2" ${choice == 2 ? 'selected':''}>Mới nhất</option>
                                                    <option value="3" ${choice == 3 ? 'selected':''}>Tên: A đến Z</option>
                                                    <option value="4" ${choice == 4 ? 'selected':''}>Giá từ thấp đến cao</option>
                                                </select>
                                                <input type="hidden" value="${txtSearch}" name="txtSearch">
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>



                        <!-- <div class="header">
                          <h4><a href=""></a>IPHONE</h4>
                        </div> -->
                        <h1>Kết quả tìm kiếm của sản phẩm "<span>${txtSearch}</span>"</h1>
                        <div class="content-list-product">
                            <c:forEach items="${listProduct}" var="i">
                                <div class="item">
                                    <div class="img">
                                        <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                    </div>
                                    <div class="info">
                                        <div class="info-main">
                                            <a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>
                                            <span>
                                                <strong> ${FormatMoney.format(i.salePrice)}đ</strong>
                                                <s>${FormatMoney.format(i.primePrice)}đ</s>
                                            </span>
                                        </div>

                                        <div class="KM">
                                            <span class="bag">KM</span> <label title="Giảm tới 300.000đ khi thanh to&#225;n qua VNPAY (&#193;p dụng từ 01/04- 30/04)">Giảm tới 300.000đ khi thanh to&#225;n qu...</label>
                                            <strong class="text-orange">VÀ 8 KM KHÁC</strong>
                                        </div>
                                        <div class="promote">
                                            <ul>
                                                <li><span class="bag">KM</span> Giảm tới 300.000đ khi thanh to&#225;n qua VNPAY (&#193;p dụng từ 01/04- 30/04)</li>
                                                <li><span class="bag">KM</span> Giảm th&#234;m 1.2 Triệu khi mở thẻ TP Bank EVO th&#224;nh c&#244;ng</li>
                                                <li><span class="bag">KM</span> Thu cũ đổi mới l&#234;n đời Samsung Galaxy S23 Series: Trợ gi&#225; tới hơn 12 triệu</li>
                                                <li><span class="bag">KM</span> Dịch vụ ph&#242;ng chờ thương gia + Giảm 40% g&#243;i Bảo h&#224;nh Samsung Care+ 12 th&#225;ng gi&#225; c&#242;n 1.220.000đ</li>
                                                <li><span class="bag">KM</span> Thanh to&#225;n qua Moca tặng ngay đế sạc trị gi&#225; 320.000đ (Cho h&#243;a đơn c&#243; tổng gi&#225; trị từ 18 Triệu) - &#193;p dụng từ 01/04</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </section>
            <!-- email -->
            <section></section>
        </main>
        <%@include file="page/footer.jsp" %>
        <script>
            function sortFunction() {
                document.ff.submit();
            }
        </script>
    </body>
</html>
