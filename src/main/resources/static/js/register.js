$(function(){

	var error_name = false;
	var error_password = false;
	var error_phone = false;
	var check_verificationCode = false;
	var error_check = false;				//改 每次成功设为false


	$('#userName').blur(function() {
		check_userName();
	});

	
	$('#pwd').blur(function() {
		check_pwd();
	});
	
	$('#phone').blur(function() {
		check_phone();
	});

	$('#input_verificationCode').click(function(){
		ver_Code();
	});
	
	$('#allow').click(function() {
		if($(this).is(':checked'))
		{
			error_check = false;
			$(this).siblings('span').hide();
		}
		else
		{
			error_check = true;
			$(this).siblings('span').this.html('请勾选同意');
			$(this).siblings('span').this.show();
		}
	});

	
	//方法具体实现
	
	function check_userName(){
		var len = $('#userName').val().length;
		if(len<3||len>20)
		{
			$('#userName').next().html('请输入3-20个字符的用户名')
			$('#userName').next().show();
			error_name = true;
		}
		else
		{
			console.log("用户成功")
			$('#userName').next().hide();
			error_name = false;
		}
	}

	function check_pwd(){
		var len = $('#pwd').val().length;
		if(len<3||len>20)
		{
			$('#pwd').next().html('密码最少3位，最长20位')
			$('#pwd').next().show();
			error_password = true;
		}
		else
		{
			console.log("密码成功")
			$('#pwd').next().hide();
			error_password = false;
		}		
	}
	

	 
	 function check_phone(){
			var phone = $('#phone').val();
			var len = $('#phone').val().length;
			console.log("些啥都行")
			console.log('phone')
		$.ajax({
			url:`https://www.zjxsx.top:9000/fruitShop/User/check/phone?phone=${phone} `,
			async:false,
			method:"GET",	
			success:function(phy){
				if(len = 11){
					if(phy&&phy.statusResult.code == 0){
						//alert(phy.statusResult.message)
						console.log(phy.statusResult.message)
						$(".show_phone").next().html('');
						$('.show_phone').next().show();
						error_phone = false;
						return true;
					}else{
						error_phone = true;
						$(".show_phone").next().html(phy.statusResult.message);
						$('.show_phone').next().show();
						return false;
					}
				}else{
					$('#phone').next().html('请输入11位的电话号码哦~');
					$('#phone').next().show();
				}
			}	   
			});
	}


	
	function ver_Code(){
			//console.log("phone")
			var result = check_phone();
			if(result == false){
				$('.input_verificationCode').next().html("手机已经注册过，不能获取验证码！");
				$('.input_verificationCode').next().show();
			}else{
			var phone = $('#phone').val();
			console.log("abc")
		
		$.ajax({
			url:`https://www.zjxsx.top:9000/fruitShop/User/verificationCode?phone=${phone} `,
			method:"POST",
			success:function(ver){
				console.log(ver.statusResult.code)
				if(ver&&ver.statusResult.code == 0){
					alert("已发送验证码")
					check_verificationCode = false;
				}else{
					check_verificationCode = true;
					$(".show_message").next().html(ver.statusResult.message);
					$('.show_message').next().show();
				}
			}
		});
	}
	}
	

	
	function send_register(){ 
			var username = $('#userName').val();	
			var password = $('#pwd').val();
			var phone = $('#phone').val();
			var addr = $('#addr').val();	
			var verificationCode = $('#verificationCode').val();
			$.ajax({
				url:`https://www.zjxsx.top:9000/fruitShop/User/register?addr=${addr}&phone=${phone}&pwd=${password}&userName=${username}&verificationCode=${verificationCode}`,
				method:"POST",
				success:function(reg){
					if(reg.statusResult.code == 0){
						window.location.replace('login.html');  
					}else{
						alert(reg.statusResult.message);
						
					}
				}
			});
	 
	}

	/*$('#reg').click(function() {
		check_userName();
		check_pwd();
		ver_Code();
			
		if(error_name == false && error_password == false && check_verificationCode == false && error_check == false)    // error_phone == false &&
		{
			send_register();
		}

	});*/

})