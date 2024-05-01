<%-- 
    Document   : index
    Created on : Apr 9, 2024, 11:23:06 AM
    Author     : hbtth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@page import="Model.*" %>
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
        <title>Táo shop</title>
    </head>
    <body>
        <%@include file="page/head.jsp" %>
        <main>
            <!--slider-->
            <section class="slider">
                <div class="container">
                    <div class="slider-content">
                        <div class="slider-content-top-container">
                            <div class="slider-content-top">
                                <a href="listproduct?idCategory=3"><img src="banner/banner-1.jpeg" alt=""></a>
                                <a href="listproduct?idCategory=1"><img src="banner/banner-2.jpeg" alt=""></a>
                                <a href="listproduct?idCategory=6"><img src="banner/banner-3.jpeg" alt=""></a>
                                <a href="listproduct?idCategory=4"><img src="banner/banner-4.jpeg" alt=""></a>
                                <a href="listproduct?idCategory=2"><img src="banner/banner-5.jpeg" alt=""></a>
                                <a href=""><img src="banner/banner-6.jpeg" alt=""></a>
                            </div>
                            <div class="slider-content-top-dh">
                                <ion-icon class="fa-solid fa-chevron-left" name="chevron-back-outline"></ion-icon>
                                <ion-icon class="fa-solid fa-chevron-right" name="chevron-forward-outline"></ion-icon>
                            </div>
                        </div>
                        <div class="slider-content-bottom">
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
                <section>
                    <div class="container">
                        <video style="width: 100%;" src="img/large_2x.mp4" autoplay muted loop ></video>
                    </div>
                </section>
                <div class="container">
                    <div class="quick-sales">
                        <div class="item">
                            <a href="listproduct?idCategory=4"> <img src="banner/banner-6.png" alt=""></a>
                        </div>
                        <div class="item">
                            <a href="listproduct?idCategory=2"> <img src="banner/banner-7.png" alt=""></a>
                        </div>
                        <div class="item">
                            <a href="listproduct?idCategory=5"> <img src="banner/banner-8.png" alt=""></a>
                        </div>
                    </div>
                </div>
            </section>
            <!-- slider-sp -->
            <section>
                <div class="container">
                    <div class="flash-sale">
                        <div class="header">
                            <h2>F<ion-icon class="fa-solid" name="flash"></ion-icon>ASH SALE</h2>
                        </div>
                        <div class="content-sale">
                            <div class="slider-container">
                                <div class="slider-container-product">
                                    <div class="slider-product">
                                        <c:forEach items="${listItem1}" var="i">
                                            <div class="item-product">
                                                <div class="img">
                                                    <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                                </div>
                                                <div class="info">
                                                    <div class="info-main"><a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>

                                                        <span>
                                                            <strong> ${FormatMoney.format(i.salePrice)}₫
                                                            </strong>
                                                            <s>${FormatMoney.format(i.primePrice)}₫</s>
                                                        </span></div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                    <div class="slider-product">
                                        <c:forEach items="${listItem2}" var="i">
                                            <div class="item-product">
                                                <div class="img">
                                                    <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                                </div>
                                                <div class="info">
                                                    <div class="info-main"><a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>
                                                        <span>
                                                            <strong> ${FormatMoney.format(i.salePrice)}₫
                                                            </strong>
                                                            <s>${FormatMoney.format(i.primePrice)}₫</s>
                                                        </span></div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                    <div class="slider-product">
                                        <c:forEach items="${listItem3}" var="i">
                                            <div class="item-product">
                                                <div class="img">
                                                    <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                                </div>
                                                <div class="info">
                                                    <div class="info-main"><a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>
                                                        <span>
                                                            <strong> ${FormatMoney.format(i.salePrice)}₫
                                                            </strong>
                                                            <s>${FormatMoney.format(i.primePrice)}₫</s>
                                                        </span></div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                </div>
                                <div class="slider-container-dh">
                                    <ion-icon class="fa-solid fa-chevron-left-two" name="chevron-back-outline"></ion-icon>
                                    <ion-icon class="fa-solid fa-chevron-right-two" name="chevron-forward-outline"></ion-icon>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </section>
            <!-- IPHONE -->
            <section>
                <div class="container">
                    <div class="box-home">
                        <div class="header">
                            <h4><a href=""></a>IPHONE</h4>
                        </div>
                        <div class="content-list-product">
                            <c:forEach items="${list.subList(0, 4)}" var="i">
                                <div class="item">
                                    <div class="img">
                                        <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                    </div>
                                    <div class="info">
                                        <div class="info-main">
                                            <a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>
                                            <span>
                                                <strong> ${FormatMoney.format(i.salePrice)}₫</strong>
                                                <s>${FormatMoney.format(i.primePrice)}₫</s>
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
                        <div class="show-all">
                            <a href="listproduct?idCategory=1">
                                <span>Xem tất cả iPhone</span>
                                <ion-icon class="fa-solid fa-chevron-right" name="chevron-forward-outline"></ion-icon>
                            </a>
                        </div>
                    </div>
            </section>
            <!-- IPAD -->
            <section>
                <div class="container">
                    <div class="box-home">
                        <div class="header">
                            <h4><a href=""></a>IPAD</h4>
                        </div>
                        <div class="content-list-product">
                            <c:forEach items="${list.subList(20, 24)}" var="i">
                                <div class="item">
                                    <div class="img">
                                        <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                    </div>
                                    <div class="info">
                                        <div class="info-main">
                                            <a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>
                                            <span>
                                                <strong> ${FormatMoney.format(i.salePrice)}₫</strong>
                                                <s>${FormatMoney.format(i.primePrice)}₫</s>
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
                        <div class="show-all">
                            <a href="listproduct?idCategory=2">
                                Xem tất cả iPad
                                <ion-icon class="fa-solid fa-chevron-right" name="chevron-forward-outline"></ion-icon>
                            </a>
                        </div>
                    </div>
                </div>
            </section>
            <!-- MAC -->
            <section>
                <div class="container">
                    <div class="box-home">
                        <div class="header">
                            <h4><a href=""></a>MAC</h4>
                        </div>
                        <div class="content-list-product">
                            <c:forEach items="${list.subList(38, 42)}" var="i">
                                <div class="item">
                                    <div class="img">
                                        <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                    </div>
                                    <div class="info">
                                        <div class="info-main">
                                            <a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>
                                            <span>
                                                <strong> ${FormatMoney.format(i.salePrice)}₫</strong>
                                                <s>${FormatMoney.format(i.primePrice)}₫</s>
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
                        <div class="show-all">
                            <a href="listproduct?idCategory=3">
                                Xem tất cả Mac
                                <ion-icon class="fa-solid fa-chevron-right" name="chevron-forward-outline"></ion-icon>
                            </a>
                        </div>
                    </div>
                </div>
            </section>
            <!-- Watch -->
            <section>
                <div class="container">
                    <div class="box-home">
                        <div class="header">
                            <h4><a href=""></a>WATCH</h4>
                        </div>
                        <div class="content-list-product">
                            <c:forEach items="${list.subList(30, 34)}" var="i">
                                <div class="item">
                                    <div class="img">
                                        <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                    </div>
                                    <div class="info">
                                        <div class="info-main">
                                            <a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>
                                            <span>
                                                <strong> ${FormatMoney.format(i.salePrice)}₫</strong>
                                                <s>${FormatMoney.format(i.primePrice)}₫</s>
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
                        <div class="show-all">
                            <a href="listproduct?idCategory=4">
                                Xem tất cả Wacth
                                <ion-icon class="fa-solid fa-chevron-right" name="chevron-forward-outline"></ion-icon>
                            </a>
                        </div>
                    </div>
                </div>
            </section>
            <!-- sound -->
            <section>
                <div class="container">
                    <div class="box-home">
                        <div class="header">
                            <h4><a href=""></a>ÂM THANH</h4>
                        </div>
                        <div class="content-list-product">
                            <c:forEach items="${list.subList(47, 51)}" var="i">
                                <div class="item">
                                    <div class="img">
                                        <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                    </div>
                                    <div class="info">
                                        <div class="info-main">
                                            <a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>
                                            <span>
                                                <strong> ${FormatMoney.format(i.salePrice)}₫</strong>
                                                <s>${FormatMoney.format(i.primePrice)}₫</s>
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
                        <div class="show-all">
                            <a href="listproduct?idCategory=5">
                                Xem tất cả âm thanh
                                <ion-icon class="fa-solid fa-chevron-right" name="chevron-forward-outline"></ion-icon>
                            </a>
                        </div>
                    </div>
                </div>
            </section>
            <!-- phụ kiện -->
            <section>
                <div class="container">
                    <div class="box-home">
                        <div class="header">
                            <h4><a href=""></a>PHỤ KIỆN</h4>
                        </div>
                        <div class="content-list-product">
                             <c:forEach items="${list.subList(55, 59)}" var="i">
                                <div class="item">
                                    <div class="img">
                                        <a href="detail?idProduct=${i.idProduct}"><img src="${i.listImage.get(0).nameImage}" alt=""></a>
                                    </div>
                                    <div class="info">
                                        <div class="info-main">
                                            <a href="detail?idProduct=${i.idProduct}"> ${i.nameProduct} </a>
                                            <span>
                                                <strong> ${FormatMoney.format(i.salePrice)}₫</strong>
                                                <s>${FormatMoney.format(i.primePrice)}₫</s>
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
                        <div class="show-all">
                            <a href="listproduct?idCategory=6">
                                Xem tất cả phụ kiện
                                <ion-icon class="fa-solid fa-chevron-right" name="chevron-forward-outline"></ion-icon>
                            </a>
                        </div>
                    </div>
                </div>
            </section>
        </main>
        <%@include file="page/footer.jsp" %>
    </body>
</html>
