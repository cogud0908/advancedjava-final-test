package prob05;

public class PasswordDismatchException extends Exception {

	public PasswordDismatchException()
	{
		super("비밀번호가 맞지 않습니다.");
	}
	
	public PasswordDismatchException(String message)
	{
		super(message);
	}
}
