package exceptions;

public class ExceptionContext {
	
	public static final String CONTEXT_KEY = "context";

	private Exception exception;
	
	//private Object caller;
	private String methodSignature;
	private String methodName;
	private String[] parameters;
	
	public Exception getException() { return exception; }
	//public Object getCaller() { return caller; }
	public String getMethodName() { return methodName; }
	public String[] getParameters() { return parameters; }
	
	public ExceptionContext(Exception e, String methodName, String... parameters) {
		this.exception = e;
		//this.caller = caller;
		this.methodName = methodName;
		this.parameters = parameters;
	}
	
	public String getMethodSignature() { 
		if (methodSignature == null) {
			StringBuilder sb = new StringBuilder();
			sb.append(methodName).append('(');
			for (String p : parameters) sb.append(p).append(',');
			sb.setCharAt(sb.length() - 1, ')');
			methodSignature = sb.toString();
		}
		return methodSignature;
	}
}
