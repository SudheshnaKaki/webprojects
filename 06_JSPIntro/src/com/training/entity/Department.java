package com.training.entity;

public class Department {
int id = 100;
String name = "Admin";
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + "]";
}


}
