package Day9;

public class FunctionExample {

	public static void main(String[] args) {
		add(18, 6);
        sub(21, 7);
        mul(8, 2);
        div(50, 5);
        square(12);
        cube(2);

	}
	
	public static void add(int a, int b) {
	        int result = a + b;
	        System.out.println("Addition: " + result);
	    }

	public static void sub(int a, int b) {
	        int result = a - b;
	        System.out.println("Subtraction: " + result);
	    }

	public static void mul(int a, int b) {
	        int result = a * b;
	        System.out.println("Multiplication: " + result);
	    }

	public static void div(int a, int b) {
	        if (b != 0) {
	            int result = a / b;
	            System.out.println("Division: " + result);
	        } else {
	            System.out.println("Cannot divide by zero");
	        }
	    }

	public static void square(int a) {
	        int result = a * a;
	        System.out.println("Square of " + a + ": " + result);
	    }

	public static void cube(int a) {
	        int result = a * a * a;
	        System.out.println("Cube of " + a + ": " + result);

	}

}
