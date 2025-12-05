package exceptions;

public class UnknownTagException extends Exception {
	
	public UnknownTagException() {
		super();
	}
	
	public UnknownTagException(String message) {
		super(message);
	}
}
