class UserException extends Exception {
	public UserException() {
	}

	public UserException(String message) {
		super(message);
	}
}

public class Ex2_2 {
	public static void main(String[] args) {
		try {
			int a = -10;

			if (a < 0) {
				throw new UserException("양수가 아닙니다!");
			}
		} catch (UserException e) {
			System.out.println(e.getMessage());

		}
	}
}
