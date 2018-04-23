var BaseHandlerUtil = {
	init : function() {
		console.log("init....");
		try {

		} catch (e) {
			console.log("Error in adding listen", e);
		}
	},
	onClick : function() {
		try {
			console.log("log......");
			$.ajax({
				url : "basicmanagement/getAdmin",
				success : function(result) {
					try {
						console.log("reslt ", result);
						var json = JSON.parse(result);
						console.log(json.message);
						console.log(json.name);

						document.getElementById("name").innerHTML = json.name;
						document.getElementById("message").innerHTML = json.message;
					} catch (e) {
						console.log(e);
					}
				}
			});
		} catch (e) {
			console.log("error in onlick ", e);
		}
	},
	signUpUser : function() {
		try {

			BaseHandlerUtil.addUser();

		} catch (e) {
			console.log("error while signUpUser ", e);
		}
	},
	addUser : function(params) {
		try {
			$.ajax({
				url : "loginmanagement/signUpUser",
				type : "GET",
				data : params,
				complete : function(xhr, result) {
					console.log("xhr ", xhr);
					console.log("res ", result);
				}
			});
		} catch (e) {
			console.log("Error in adduser " + e);
		}
	}
};

BaseHandlerUtil.init();