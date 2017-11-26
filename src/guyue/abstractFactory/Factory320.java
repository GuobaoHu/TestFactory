package guyue.abstractFactory;

public class Factory320 implements Factory {

	@Override
	public AirCondition createAirCondition() {
		return new AirConditionA();
	}

	@Override
	public Engine createEngine() {
		return new EngineA();
	}

}
