import java.util.*;

class stringpalindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String rev = "";
        String stemp = str.toUpperCase();

        for (int i = stemp.length(); i > 0; i--) {
            rev = rev + String.valueOf(stemp.charAt(i - 1));
        }

        if (rev.compareTo(stemp) == 0) {
            System.out.println("String is PALINDROME");
        } else {
            System.out.println("String is NOT PALINDROME");
        }

    }
}

