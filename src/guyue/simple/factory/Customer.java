package guyue.simple.factory;

public class Customer {
	
	public static void main(String[] args) {
		Factory factory = new Factory();
		BMW bmw1 = factory.produceBMW(523);
		BMW bmw2 = factory.produceBMW(320);
	}
	
}
