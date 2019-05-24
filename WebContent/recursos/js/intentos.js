var intentos =0;
$("#intentos").click(function (){
	if (intentos<3) {
			alert(intentos)
			intentos++;	
			var x = $("#user").val();
		    var y = $("#pass").val();
			$.post("home",{"user":x,"pass":y,"op":1});
	}
	else {
		$("#myModal").modal('hide');
	}
});