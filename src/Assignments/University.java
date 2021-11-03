package Assignments;

import java.util.ArrayList;

public class University {

  String name;
  String country;
  String establisheddate;
  ArrayList<String> courses;
public University(String name, String country) {
	
	this.name = name;
	this.country = country;
}
public University(String name) {
	
	this.name = name;
}
public University(String name, String country, String establisheddate, ArrayList<String> subjects) {
	
	this.name = name;
	this.country = country;
	this.establisheddate = establisheddate;
	this.courses = subjects;
}
public University(String name, String country, String establisheddate) {

	this.name = name;
	this.country = country;
	this.establisheddate = establisheddate;
}
	
	

}
