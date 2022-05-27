package exception;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2 };
		try {
			System.out.println("the 10th value arrray is:" + array[10]);

		}

		catch (Exception e) {
			System.out.println("the error" + e);
		}

	}

}
