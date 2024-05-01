
const rightdh = document.querySelector('.fa-chevron-right')
const leftdh = document.querySelector('.fa-chevron-left')
let index=0
const numberimg =document.querySelectorAll('.slider-content-top img')
console.log(rightdh)
rightdh.addEventListener("click",function(){
    index=index+1
    if(index>numberimg.length-1)
    {
        index=0
    }
    document.querySelector(".slider-content-top").style.right= index*100+"%"
})
leftdh.addEventListener("click",function(){
    index=index-1
    if(index<0)
    {
        index=numberimg.length-1
    }
    document.querySelector(".slider-content-top").style.right=index*100+"%"
})
//tiêu đề
const numberli = document.querySelectorAll('.slider-content-bottom li')
let imgactive =document.querySelector(".active")
// console.log(imgactive)
// console.log(numberli)
 numberli.forEach(function(image,index){
    image.addEventListener("click",function(){
        removeactive ()
        document.querySelector(".slider-content-top").style.right = index *100+"%"
        image.classList.add("active")

    })
 })
 function removeactive (){
    let imgactive =document.querySelector(".active")
    imgactive.classList.remove("active")
}
//tự chuyển slider
function imgauto(){
    index = index + 1
    if(index>numberimg.length-1){
        index=0
    }
    removeactive ()
    document.querySelector(".slider-content-top").style.right = index *100+"%"
    numberli[index].classList.add("active")
}
setInterval(imgauto,5000)
// slider-product
const rightdhtwo = document.querySelector('.fa-chevron-right-two')
const leftdhtwo = document.querySelector('.fa-chevron-left-two')
const numberdiv =document.querySelectorAll('.slider-product')
// console.log(rightdhtwo)
// console.log(leftdhtwo)
rightdhtwo.addEventListener("click",function(){
    index=index+1
    if(index>numberdiv.length-1)
    {
        index=0
    }
    document.querySelector(".slider-container-product").style.right= index*100+"%"
})
leftdhtwo.addEventListener("click",function(){
    index=index-1
    if(index<0)
    {
        index=numberdiv.length-1
    }
    document.querySelector(".slider-container-product").style.right=index*100+"%"
})

function showSearchBox() {
    var searchBox = document.querySelector('.main-search');
    searchBox.style.display = 'block';
  }
  function exitSearchBox(){
    var searchBox = document.querySelector('.main-search');
    searchBox.style.display = 'none';
  }


  function openMenu() {
    var openMenu = document.querySelector('.menu-open');
    openMenu.style.display = 'none';
    var closeMenu = document.querySelector('.menu-close');
    closeMenu.style.display = 'block';
    var closeMenu = document.querySelector('.menu-bar-mobile');
    closeMenu.style.display = 'block';
  }
  function closeMenu(){
    var closeMenu = document.querySelector('.menu-close');
    closeMenu.style.display = 'none';
    var openMenu = document.querySelector('.menu-open');
    openMenu.style.display = 'block';
    var closeMenu = document.querySelector('.menu-bar-mobile');
    closeMenu.style.display = 'none';
  }

  