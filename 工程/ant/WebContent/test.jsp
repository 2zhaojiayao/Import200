<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
    src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<title>站内搜索</title>
 
<style type="text/css">
    .xiala{
        width: 100px;
        background-color: #fcfcfc;
        border:1px solid gray;
        display: block;
    }
    .show-row:hover{
        background-color: #f5f6f7;
    }
</style>
 
<script type="text/javascript">
    //提示条目点击事件，将该行添加到搜索input中
    function rowClick(obj) {
        var rowText = obj.innerHTML;
        var sInput = $("#search-input");
        var showText = $("#xiala");
        sInput.val(rowText);
        showText.css('display','None');
    }
 
    //ajax搜索函数将input中的参数发给servlet，
    //然后将servlet返回的列表显示在搜索条下面的div中
    function search(obj) {
//         window.console.log(obj.value);
        var text = obj.value;
        var showText = $("#xiala");
        showText.css('display','block');
        var content = "";
        if(text==''){
            return;
        }
        $.ajax({
            type : 'get',
            url : '${pageContext.request.contextPath}/search',
            data : {
                'text' : text,
            },
            dataType : 'json',
            success : function(data) {
                for(var i=0;i<data.length;i++){
//                     window.console.log(data[i].name);
                    content += "<div class='show-row' onclick='rowClick(this);'>" + data[i].name + "</div>"
                }
                showText.html(content);
//                 window.console.log(data);
                window.console.log('成功回调函数');
            },
            error : function() {
                window.console.log('失败回调函数');
            }
 
        })
    }
    
 
</script>
 
</head>
<body>
    <div>
        <input type="text" name='search-text' id='search-input' style="width:100px;" onkeyup="search(this);">
        <input type="submit" value="搜索">
    </div>
    <div id='xiala' class='xiala' >
    </div>
</body>
</html>
