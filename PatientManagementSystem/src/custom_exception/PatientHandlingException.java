package custom_exception;

@SuppressWarnings("serial")
public class PatientHandlingException extends Exception {
	public PatientHandlingException (String msg)
	{
		super(msg);
	}

}
