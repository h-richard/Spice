package exceptions;

public class LowBattery extends Exception {
	
	public LowBattery() {
		super();
	}
	
	public LowBattery(String message) {
		super(message);
	}

}
