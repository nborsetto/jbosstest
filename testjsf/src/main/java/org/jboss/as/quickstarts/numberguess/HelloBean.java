package org.jboss.as.quickstarts.numberguess;

import java.io.Serializable;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped
@Named
public class HelloBean implements Serializable {

	//cambiamento per branch3
	private static final long serialVersionUID = 3344199387523339981L;
	private String name;
	private String greeting;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void doGreeting() {
		greeting = "Ciao: " + name;
	}
}