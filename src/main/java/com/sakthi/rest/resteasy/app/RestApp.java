package com.sakthi.rest.resteasy.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.sakthi.rest.data.service.PersonServiceImpl;

@ApplicationPath("/api")
public class RestApp extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RestApp() {
		singletons.add(new PersonServiceImpl());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
