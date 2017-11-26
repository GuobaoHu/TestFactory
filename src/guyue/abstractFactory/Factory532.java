package guyue.abstractFactory;

public class Factory532 implements Factory {

	@Override
	public AirCondition createAirCondition() {
		return new AirConditionB();
	}

	@Override
	public Engine createEngine() {
		return new EngineB();
	}

}
