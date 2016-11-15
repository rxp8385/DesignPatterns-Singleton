package com.rxp8385.designpatterns.singleton.model;

public class Database {
	
	// Modern way of implementing Singleton pattern (thread safe, but it does introduce a global variable in 
	// the class that calls the method "getInstance").
	private static Database instance = new Database();
	
	// private constructor prevents other classes from creating Database objects
	private Database(){
		
	}
	
	public static Database getInstance(){
		return instance;
	}
	
	// Old way of implementing Singleton...(lazy instantiation - not thread safe).
	
	private static Database oldWayInstanceObject;
	
	public static Database getOldWayInstanceObject(){
		if (oldWayInstanceObject == null){
			oldWayInstanceObject = new Database();
		}
		// Instantiation doesn't happen until the last possible moment - when someone calls the method
		// Lazy instantiation can be used when it's best to delay the creation of an object, maybe the object is too
		// large to load during start-up, for instance.
		return oldWayInstanceObject;
	}
	
	public void connect(){
		System.out.println("Connected to database");
	}

	public void disconnect(){
		System.out.println("Disconnected from database...");
	}	
}
