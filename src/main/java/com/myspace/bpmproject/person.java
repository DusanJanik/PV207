package com.myspace.bpmproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;

	@org.kie.api.definition.type.Label("Surname")
	private java.lang.String surname;

	public person() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getSurname() {
		return this.surname;
	}

	public void setSurname(java.lang.String surname) {
		this.surname = surname;
	}

	public person(java.lang.String name, java.lang.String surname) {
		this.name = name;
		this.surname = surname;
	}

}