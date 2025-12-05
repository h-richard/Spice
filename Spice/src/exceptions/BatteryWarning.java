package exceptions;

public class BatteryWarning extends Exception {
	
	public BatteryWarning() {
		super();
	}
	
	public BatteryWarning(String message) {
		super(message);
	}

}
