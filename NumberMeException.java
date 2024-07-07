import java.util.*;
class NumberMeException {
    private static int number;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter a Number : ");
            int number = sc.nextInt();

            if (number == 0) {
                throw new Exception("NUMBER CANNOT BE ZERO");
            }

            int ReversedNumber = reverseNumber(number);


            System.out.println("Reversed Number is : " + ReversedNumber);
        }




        catch (Exception e) {
            System.out.println(e);
            

            }


            }
            public static int reverseNumber(int number) {
                int ReversedNumber = 0;

                while(number != 0) {
                    int remainder = number%10;



                    ReversedNumber = ReversedNumber * 10 + remainder;
                    number  = number / 10;
                }
                  return ReversedNumber;
            }
        }


        