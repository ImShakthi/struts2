var BaseHandlerUtil = {
	init : function() {
		console.log("init....");
		try {

		} catch (e) {
			console.log("Error in adding listen", e);
		}
	},
	onClick : function() {
		new Ajax.Request('basicmanagement/getAdmin', {
			onSuccess : function(response) {
				console.log("sccess ", response);
				try {
					var res = response.responseText;
					var json = JSON.parse(res);
					console.log(json.message);
					console.log(json.name);

					document.getElementById("name").innerHTML = json.name;
					document.getElementById("message").innerHTML = json.message;
				} catch (e) {
					console.log(e);
				}
			}

		//			onComplete : function(response) {
		//				console.log("complete ", response);
		//			}
		});
	}
};

BaseHandlerUtil.init();