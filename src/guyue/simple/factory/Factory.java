package guyue.simple.factory;

public class Factory {
	public BMW produceBMW(int type) {
		switch(type) {
		case 320: 
			return new BMW320();
		
		case 523: 
			return new BMW523();
		
		default:
			break;
		
		}
		return null;
	}
}
