import java.util.*;

class Stringcountchar {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("\nEnter the character to count : ");
        char check = sc.next().charAt(0);

        char temp;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);

            if (check == temp) {
                count++;
            }
        }

        System.out.println("Number of occurences = " + count);
    }
}

