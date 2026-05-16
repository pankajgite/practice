package questions;


public class EarlySingletonClass{
	private EarlySingletonClass(){}

	private static final EarlySingletonClass ins = new EarlySingletonClass();

	public static EarlySingletonClass getInstance(){
		return ins;
	}
}

/*
Q: Create singleton class with early initialization (eager singleton)
Q: Create singleton class with lazy initialization (lazy singleton)

early initialization
    create singleton as soon as class loaded

lazy initialization
    create when it required


Implement a Singleton class
----------------------------

1. Controlling instance creation
    .class constructor must not be accessible globally
    .subclassing/inheritance not allowed

2. Giving access to singleton class
    .A public static method is good choice
*/