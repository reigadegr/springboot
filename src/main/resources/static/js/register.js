function register(){
    let userName = $("#userName").val();
    let psw = $("#psw").val();
    let address = $("#address").val();
    let phone = $("#phone").val();
    alert(userName+psw+address+phone);


    $.ajax({
        type:"post",
        dataType:"json",
        url:"http//localhost:8082/springboot/api/v1/users",
        data:{
            "userName":userName,
            "psw":psw,
            "address":address,
            "phone":phone
        },
        success:function (data){
            alert(data.msg);
        },
        error:function (error){
            alert(error.msg);
        }
    });
}
