// 登录按钮切换

function personReg() {
    var reg = document.getElementsByClassName("reg");
    if(reg[0].className.indexOf("hidden")>-1){
        reg[0].classList.remove("hidden");
        reg[0].classList.add("show");
    }
    if(reg[1].className.indexOf("show")>-1){
        reg[1].classList.remove("show");
        reg[1].classList.add("hidden");
    }
    if(reg[2].className.indexOf("show")>-1){
        reg[2].classList.remove("show");
        reg[2].classList.add("hidden");
    }
    var tags = document.getElementsByClassName("top_tag");
    if(!(tags[0].className.indexOf("active")>-1)){
        tags[0].classList.add("active");
    }
    if(tags[1].className.indexOf("active")>-1){
        tags[1].classList.remove("active");
    }
    if(tags[2].className.indexOf("active")>-1){
        tags[2].classList.remove("active");
    }
    var ad = document.getElementById("AdImg");
    ad.style.height = "558px";
    // ad.style.backgroundImage='url(https://static.zcool.cn/v1.1.43/passport4.0/images/login-ground.jpg)';
}
function classReg() {
    var reg = document.getElementsByClassName("reg");
    if(reg[1].className.indexOf("hidden")>-1){
        reg[1].classList.remove("hidden");
        reg[1].classList.add("show");
    }
    if(reg[0].className.indexOf("show")>-1){
        reg[0].classList.remove("show");
        reg[0].classList.add("hidden");
    }
    if(reg[2].className.indexOf("show")>-1){
        reg[2].classList.remove("show");
        reg[2].classList.add("hidden");
    }
    var tags = document.getElementsByClassName("top_tag");
    if(!(tags[1].className.indexOf("active")>-1)){
        tags[1].classList.add("active");
    }
    if(tags[0].className.indexOf("active")>-1){
        tags[0].classList.remove("active");
    }
    if(tags[2].className.indexOf("active")>-1){
        tags[2].classList.remove("active");
    }
    var ad = document.getElementById("AdImg");
    ad.style.height = "558px";
}
function orgReg() {
    // alert("orgReg");
    var reg = document.getElementsByClassName("reg");
    if(reg[2].className.indexOf("hidden")>-1){
        reg[2].classList.remove("hidden");
        reg[2].classList.add("show");
    }
    if(reg[1].className.indexOf("show")>-1){
        reg[1].classList.remove("show");
        reg[1].classList.add("hidden");
    }
    if(reg[0].className.indexOf("show")>-1){
        reg[0].classList.remove("show");
        reg[0].classList.add("hidden");
    }
    var tags = document.getElementsByClassName("top_tag");
    if(!(tags[2].className.indexOf("active")>-1)){
        tags[2].classList.add("active");
    }
    if(tags[1].className.indexOf("active")>-1){
        tags[1].classList.remove("active");
    }
    if(tags[0].className.indexOf("active")>-1){
        tags[0].classList.remove("active");
    }
    var ad = document.getElementById("AdImg");
    ad.style.height = "558px";
}
