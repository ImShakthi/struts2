var BaseHandlerUtil = {
	init : function() {
		console.log("init....");
		try {
			
		} catch (e) {
			console.log("Error in adding listen", e);
		}
	},
	onClick : function() {
		alert("Clicked....");
	}
};

BaseHandlerUtil.init();