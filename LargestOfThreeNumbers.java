import java.util.Scanner;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        
        // Using nested if-else statements
        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println(num1 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        } else {
            if(num2 > num3) {
                System.out.println(num2 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }
        
        
        // Using nested ternary operators
        int largest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("The largest number is: " + largest);
        
        input.close();
    }

}
