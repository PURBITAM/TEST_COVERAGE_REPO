package com.purbita.JACOCODemo.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee implements Serializable{

	private static final long serialVersionUID = 4625037178092085622L;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("message")
	private String message;


	@JsonCreator
	public Employee(@JsonProperty("id") Integer id,
			@JsonProperty("name") String name,
			@JsonProperty("message") String message) {
		this.id = id;
		this.name = name;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
