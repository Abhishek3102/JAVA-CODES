import java.util.*;
public class SwitchMonth {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Month Number");
int n = sc.nextInt();

switch(n) {
   case 1:
       System.out.println("Month is January");
       break;
   case 2:
       System.out.println("Month is February");
       break;
   case 3:
       System.out.println("Month is March");
       break;
   case 4:
       System.out.println("Month is April");
       break;
   case 5:
       System.out.println("Month is May");
       break;
   default:
       System.out.println("Gaddari karbe tori behen ke chodu");
     }
   }
}

