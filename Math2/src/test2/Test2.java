package test2;

public class Test2 {
	
	
	public static void swapFunction(int a, int b) {
        System.out.println("In swapFunction at the begining: a = " + a + " , b = " + b);
 
        // Swap n1 with n2
        int c = a;
        a = b;
        b = c;
        System.out.println("In swapFunction at the end: a = " + a + " , b = " + b);
    }
 
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + " , b = " + b);
 
        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("\n**Now, Before and After swapping values will be same here**:");
        System.out.println("After swapping: a = " + a + " , b = " + b);
    }
 
	

}
