package Day10;

public class Equations {

	public static void main(String[] args) {
		squareOfDifference(6, 4);  
        quadraticEquation(3, 6, 2, 4);  
        squareOfSum(5, 6);  
        sumOfCubes(5, 6); 

	}
	public static void squareOfDifference(int a, int b) {
        int result = (a * a) - (2 * a * b) + (b * b);
        System.out.println("Result of Square of Difference: " + result);
    }
	public static void quadraticEquation(int a, int b, int c, int x) {
        int result = (a * x * x) + (b * x) + c;
        System.out.println("Result of Quadratic Equation: " + result);
    }
	public static void squareOfSum(int a, int b) {
        int result = (a * a) + (2 * a * b) + (b * b);
        System.out.println("Result of Square of Sum: " + result);
    }
	 public static void sumOfCubes(int a, int b) {
	        int result = (a + b) * ((a * a) - (a * b) + (b * b));
	        System.out.println("Result of Sum of Cubes: " + result);

	}

}
