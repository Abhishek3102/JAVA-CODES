import java.util.Scanner;

public class LoveMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter name " + i + ": ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Spriha")) {
                System.out.println("I LOVE YOU");
            } else {
                System.out.println("Just a friend");
            }
        }

        scanner.close();
    }
}

