import java.util.*;
class DivisionMeExceptionWaalaCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int m, n, div;
            System.out.println("Enter the value of m : ");
            m = sc.nextInt();
            System.out.println("Enter the value of n : ");
            n = sc.nextInt();
            div = m / n;
            System.out.println("Answer of division is : " + div);
        } catch (ArithmeticException ae) {
            System.out.println(ae);

        } catch (InputMismatchException ime) {
            System.out.println(ime);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}

