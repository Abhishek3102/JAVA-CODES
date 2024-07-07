import java.util.Scanner;

public class Result1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st, sub, i, j;
        System.out.println("Enter the number of students: ");
        st = sc.nextInt();
        System.out.println("Enter the number of subjects: ");
        sub = sc.nextInt();
        int stud[][] = new int[st][sub + 1];
        int score[][] = new int[st][2];
        int total[] = new int[st];
        for (i = 0; i < st; i++) {
            for (j = 0; j <= sub; j++) {
                if (j == 0) {
                    System.out.println("Enter Roll No");
                    score[i][j] = stud[i][j] = sc.nextInt();
                } else {
                    System.out.println("Enter Marks of Subject: ");
                    stud[i][j] = sc.nextInt();
                    total[i] += stud[i][j];
                }
            }
        }
        for (j = 0; j <= sub; j++) {
            if (j == 0) {
                System.out.print("Rollno\t");
            } else {
                System.out.print("Sub" + j + "\t\t");
            }
            if(j==sub){
                System.out.println("Total");
            }
        }
        for (i = 0; i < st; i++) {
            System.out.println("\n");
            for (j = 0; j <= sub; j++) {
                System.out.print(stud[i][j] + "\t");
            }
            System.out.print(total[i]);
            System.out.println();
        }
    }
}
