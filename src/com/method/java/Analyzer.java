package com.method.java;

public class Analyzer {
	private String input;
	
	public Analyzer(String input) {
		this.input = input;
	}
	
//	public String getInput() {
//		return input;	
//	}
//	
//	public void setInput(String input) {
//		this.input = input;
//	}
	
	public String Mood() {
		try {
			if(input == null || input.isEmpty()) {
				throw new IllegalArgumentException("Enter valid mood.");
			}
			else if(input.toLowerCase().contains("sad")) {
				return "Sad";
			}
			else {
				return "Happy";
			}
		} catch(NullPointerException e){
			throw new IllegalArgumentException("Enter valid mood ",e);
		}
	}
}
