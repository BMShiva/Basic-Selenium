
public class Addition {


	int addition(int x, int y) {
		
		try {
			int z = x / y;
		} catch (Exception e) {
System.out.println("ewcjsx");
		}
		return 0;
	}

	public static void main(String[] args) {
		Addition sumOfTwoNumbers = new Addition();
		sumOfTwoNumbers.addition(3, 4);
		
	}
}








/*public class Addition {   //with static variables and static method 

	static int z;
	static int addition(int x, int y) {
		 z = x + y;
		return z;
	}

	public static void main(String[] args) {
		Addition sumOfTwoNumbers = addition();
		addition(3, 4);
		System.out.println(z);
	}
}       */
