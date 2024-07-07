public class CountDigits {

    public static void main(String[] args) {
        
        // Check if the user has entered a positive integer as input
        if(args.length != 1) {
            System.out.println("Please enter a single positive integer as input.");
            System.exit(1);
        }
        
        int num = Integer.parseInt(args[0]);
        
        // Check if the input number is less than ten billion
        if(num >= 100000000) {
            System.out.println("Please enter a number less than ten billion.");
            System.exit(1);
        }
        
        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println("The number of digits in the input number is: " + count);
        
    }

}

