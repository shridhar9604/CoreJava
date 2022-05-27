package exception;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for (int i = 1; i <= 3; i++) {
				System.out.println("the value:");

				System.out.println(i);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("the finally block always execute");
		}

	}

}
