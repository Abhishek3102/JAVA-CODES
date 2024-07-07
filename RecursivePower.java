public class RecursivePower {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else if (n < 0) {
            return 1 / power(x, -n);
        } else {
            double y = power(x, n/2);
            if (n % 2 == 0) {
                return y * y;
            } else {
                return y * y * x;
            }
        }
    }
    
    public static void main(String[] args) {
        double x = 2.5;
        int n = 3;
        double y = power(x, n);
        System.out.println(x + " to the power of " + n + " is " + y);
    }
}

