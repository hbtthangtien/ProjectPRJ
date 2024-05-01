<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <div class="heading">
        <div class="main-search">
            <div class="search-box">
                <form method="get" action="search" onsubmit="return submitSearch(this);" enctype="application/x-www-form-urlencoded">
                    <div class="border">
                        <input type="text" id="search-box" name="txtSearch" placeholder="Hôm nay bạn cần tìm gì?" />
                        <ion-icon style="color: aliceblue; font-size: 30px;" class="fa-solid" name="close-circle" onclick="exitSearchBox()"></ion-icon>
                    </div>
                </form>
            </div>
        </div>
        <div class="container">
            <!--logo-->
            <div class="menu-bar">
                <ion-icon class="menu-open" name="menu-outline" onclick="openMenu()"></ion-icon>
                <ion-icon style="display: none;" class="menu-close" name="close-outline"  onclick="closeMenu()"></ion-icon>
            </div>
            <div class="logo">
                <a href="home">
                    <img src="img/taosoto.png" alt="">
                </a>
                <!-- <a href=""><img style="width: 200px;height: 50px;" src="logo-táo.png" alt=""></a> -->
            </div>
            <div class="menu">
                <ul>
                    <li> <a href="listproduct?idCategory=1"><span>Iphone</span></a></li>
                    <li> <a href="listproduct?idCategory=2"><span>iPad</span></a></li>
                    <li> <a href="listproduct?idCategory=3"><span>Mac</span></a></li>
                    <li> <a href="listproduct?idCategory=4"><span>Watch</span></a></li>
                    <li> <a href="listproduct?idCategory=5"><span>Âm thanh</span></a></li>
                    <li> <a href="listproduct?idCategory=6"><span>Phụ kiện</span></a></li>
                    <li> <a href="service"><span>Dịch vụ</span></a></li>
                    <li> <a href="promotion"><span>Ưu đãi</span></a></li>
                </ul>
            </div>
            <div class="header-right">
                <!--search box-->
                <ion-icon class="fa-solid " name="search-outline"  onclick="showSearchBox()"></ion-icon>

                <c:if test="${sessionScope.User != null}">
                    <div class="gioihang">
                        <a href="cart">
                            <ion-icon class="fa-solid fa" name="cart-outline"></ion-icon>
                        </a>
                    </div>
                    <div style="color: white;margin-left: 50px">Hello ${sessionScope.User.fullname}
                        <a href="logout">Logout</a>
                    </div>

                </c:if>
                <c:if test="${sessionScope.User == null}">
                    <div class="tracuu">
                        <a href="login">
                            <ion-icon class="fa-solid " name="person-add-outline"></ion-icon>
                        </a>
                        <div  class="menu-user">
                            <div class="menu-user-1">
                                <ul>
                                    <li><a href="register"> Tạo tài khoản ngay</a></li>
                                    <li><a href="login"> Đăng nhập</a></li>
                                    <li><a href="service"> Dịch vụ</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </c:if>
            </div>
        </div>
        <div class="menu-bottom">
            <ul>
                <li> <a href="listproduct?idCategory=1"><span>Iphone</span></a></li>
                <li> <a href="listproduct?idCategory=2"><span>iPad</span></a></li>
                <li> <a href="listproduct?idCategory=3"><span>Mac</span></a></li>
                <li> <a href="listproduct?idCategory=4"><span>Wacth</span></a></li>
                <li> <a href="listproduct?idCategory=5"><span>Âm thanh</span></a></li>
                <li> <a href="listproduct?idCategory=6"><span>Phụ kiện</span></a></li>
                <!-- <li> <a href=""><span>Trả góp</span></a></li>
                <li> <a href=""><span>Ưu đãi</span></a></li> -->
            </ul>
        </div>
        <div style="display: none;" class="menu-bar-mobile">
            <div class="menu-bar-mobile-1">
                <ul>
                    <li><a href="register">Tạo tài khoản ngay</a></li>
                    <li><a href="login">Đăng nhập</a></li>
                    <li><a href="service">Dịch vụ</a></li>
                    <li><a href="">Ưu đãi</a></li>
                </ul>
            </div>
        </div>
    </div>

</header>