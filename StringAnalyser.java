import java.util.*;

public class StringAnalyser {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int special = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                special++;
            }
        }
        System.out.println("Number of uppercase character:" + upperCaseCount);
        System.out.println("Number of lowercase character:" + lowerCaseCount);
        System.out.println("Number of digits:" + digitCount);
        System.out.println("Number of spaces:" + spaceCount);
        System.out.println("Number of special character:" + special);
    }
}

