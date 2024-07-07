import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st, sub, i, j, total = 0;
        System.out.println("Enter the number of students: ");
        st = sc.nextInt();
        System.out.println("Enter the number of subjects: ");
        sub = sc.nextInt();
        int stud[][] = new int[st][sub + 1];
        int score[][] = new int[st][2];
        for (i = 0; i < st; i++) {
            for (j = 0; j <= sub; j++) {
                if (j == 0) {
                    System.out.println("Enter Roll No");
                    score[i][j] = stud[i][j] = sc.nextInt();
                } else {
                    System.out.println("Enter Marks of Subject: ");
                    stud[i][j] = sc.nextInt();
                    total += stud[i][j];
                }
            }
        }
        System.out.println("Rollno\tSub1\tSub2\tSub3");
        for(i=0;i<st;i++){
            for (j = 0; j <= sub; j++) {
                System.out.print(stud[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
