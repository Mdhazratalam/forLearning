public class MathUtil {

    public static int add(int a, int b) {

    System.out.println("Adding numbers...");
    return Math.addExact(a, b);
}

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("The sum is: " + result);


        
    }
    
}
