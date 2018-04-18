package com.sakthi.rest.data.service;

import com.sakthi.rest.data.model.Person;
import com.sakthi.rest.data.model.Response;

public interface PersonService {

	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();
}
