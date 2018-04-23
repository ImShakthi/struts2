package com.sakthi.login.management.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginManagementAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private HttpServletResponse response;

	private String firstName;
	private String lastName;
	private String email;
	private String receiveUpdates;
	private String bio;

	public HttpServletResponse getServletResponse() {
		return this.response;
	}

	public HttpServletRequest getServletRequest() {
		return this.request;
	}

	public void setServletResponse(final HttpServletResponse httpServletResponseArg) {
		this.response = httpServletResponseArg;
	}

	public void setServletRequest(final HttpServletRequest httpServletRequestArg) {
		this.request = httpServletRequestArg;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstNameArg) {
		this.firstName = firstNameArg;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReceiveUpdates() {
		return receiveUpdates;
	}

	public void setReceiveUpdates(String receiveUpdates) {
		this.receiveUpdates = receiveUpdates;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String signUpUser() {
		try {
			System.out.println("@@>> " + this.firstName + " >> " + this.lastName + " >> " + this.email + " >> "
					+ this.receiveUpdates + " >> " + this.bio);
		} catch (Exception e) {
			System.err.println("Error in signUpUser becoz of " + e);
		}
		return NONE;
	}
}
