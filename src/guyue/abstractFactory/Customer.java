package guyue.abstractFactory;

public class Customer {
	
	public static void main(String[] args) {
//		Factory f = new Factory320();
		Factory f = new Factory532();
		f.createAirCondition();
		f.createEngine();
	}
	
}
