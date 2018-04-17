package com.sakthi.struts.helloworld.action;

/**
 * References
 * https://struts.apache.org/primer.html
 * https://struts.apache.org/getting-started/using-tags.html
 * 
 */

import com.opensymphony.xwork2.ActionSupport;
import com.sakthi.struts.helloworld.model.MessageStore;

public class HelloWorldAction extends ActionSupport {
	private MessageStore messageStore;

	public String execute() {
		messageStore = new MessageStore();
		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}
	
	public String getAdmin()
	{
		try
		{
			System.out.println("in get admin...");
		}
		catch(Exception e)
		{
			System.err.println("Errorrr....");
		}
		return null;
	}
}