package math;

public class Math {
	 
	public static int sum(int num1, int num2) {
        return num1 + num2;  }
	
	
	public static int multiply(int num1, int num2) {
        return num1 * num2;  }
	
	
	
	
 
    public static void main(String[] args) {
        
    	int result = sum(20,30);
        int result2 = multiply(5,5);
        
        System.out.println("Sum of numbers is: " + result);
        System.out.println("Multiply of numbers is: " + result2);
        
     
    }
}