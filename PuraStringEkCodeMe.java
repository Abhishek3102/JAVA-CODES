import java.util.Scanner;

public class PuraStringEkCodeMe {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // PRINTING STRING AND FINDING OUT ITS LENGTH
        System.out.println("Enter FirstName : ");
        String firstName = sc.nextLine();

        System.out.println("Enter LastName : ");
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName + " " + "Loves" + " " + "ABHISHEK";
        System.out.println("FirstName is : " + firstName);
        System.out.println("LastName is : " + lastName);
        System.out.println("THE ENTERED STRING IS : " + fullName);
        System.out.println("The length of entered String is : " + fullName.length());

        System.out.println();

        //  SUBSTRING METHOD BY TAKING USER INPUT
        System.out.println("ENTER STRING 1 : ");
        String str1 = sc.nextLine();
        String str2 = str1.substring(0, 11);
        System.out.println("Substring bhale hi aadha aaye : " + " " + str2);
        System.out.println("Par Reality ye hai ki : " + " " + str1);

        System.out.println();

        // TAKING TWO STRING INPUT FROM USER AND CHECKING WHETHER BOTH STRING ARE EQUAL OR NOT
        System.out.println("Enter Name 1 : ");
        String name1 = sc.nextLine();
        System.out.println("Enter Name 2 : ");
        String name2 = sc.nextLine();

        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }  else {
            System.out.println("Strings are not equal");
        }

        System.out.println();

        // STRING REVERSE KARNE KA 1ST METHOD
        System.out.println("Enter a string : ");
        String userInput = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        sb.append(userInput);
        System.out.println("Changing from String Buffer to String : " + sb.toString());
        sb.reverse();
        System.out.println("Reversed String is : " + sb);

        System.out.println();

        // STRING REVERSE KARNE KA 2ND METHOD
        System.out.println("Enter a String : ");
        String sbu = sc.nextLine();

        StringBuilder sbb = new StringBuilder();
        sbb.append(sbu);
        System.out.println("Changing from String Builder to String : " + sbb.toString());

        for (int i = 0; i < sbb.length() / 2; i++) {
            int front = i;
            int back = sbb.length() - 1 - i;    //6-1-0 = > 5

            char frontChar = sbb.charAt(front);
            char backChar = sbb.charAt(back);

            sbb.setCharAt(front, backChar);
            sbb.setCharAt(back, frontChar);
        }
        System.out.println("Your Reversed String is : " + sbb);
    }
}




