function login(){
    let userName = $("#userName").val();
    let psw = $("#psw").val();

    $.ajax({
        type:"post",
        dataType:"json",
        url:"http//localhost:8082/springboot/api/v1/user",
        data:{
            "userName":userName,
            "psw":psw,
        },
        success:function (data){
            alert(data.msg);
        },
        error:function (error){
            alert(error.msg);
        }
    });
}
