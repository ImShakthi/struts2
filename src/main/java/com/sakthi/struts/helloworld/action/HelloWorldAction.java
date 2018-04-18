package com.sakthi.struts.helloworld.action;

//import org.apache.struts2.;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.json.JSONObject;

/**
 * References
 * https://struts.apache.org/primer.html
 * https://struts.apache.org/getting-started/using-tags.html
 * 
 */

import com.opensymphony.xwork2.ActionSupport;
import com.sakthi.struts.helloworld.model.MessageStore;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	private MessageStore messageStore;
	private HttpServletRequest request;
	private HttpServletResponse response;

	public void setServletResponse(HttpServletResponse httpServletResponse) {
		this.response = httpServletResponse;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	private String message;

	// final static Logger logger = Logger.getLogger(HelloWorldAction.class);

	public String getMessage() {
		return message;
	}

	public void setMessage(final String messageArg) {
		this.message = messageArg;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String execute() {
		messageStore = new MessageStore();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<");
		setMessage("This is yo message....");
		request.setAttribute("name", "sakthivel");
		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public String getAdmin() throws IOException {
		JSONObject json = null;
		try {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>GET ADMIN<<<<<<<<<<<<<<<<<<<<<<<<<");
			json = new JSONObject();
			json.put("message", "This is yo message....");
			json.put("name", "sakthivel");
			
			System.out.println("JSON>>>>>>>" + json.toString());
		} catch (Exception e) {
			System.err.println("Errorrr....");
		}
		this.response.getWriter().print(json.toString());
		return NONE;
	}
}