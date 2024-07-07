import java.util.*;

class Experiment_2 {
	public static void main(String[] args) {
		int st, sub, roll;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Students");
		st = sc.nextInt();
		System.out.println("Enter no of Subjects");
		sub = sc.nextInt();

		int student[][] = new int[st][sub + 1];
		int total[] = new int[st];
		int sum;
		for (int i = 0; i < st; i++) {
			sum = 0;
			System.out.println("Enter Roll no of Student" + (i + 1));
			student[i][0] = sc.nextInt();
			for (int j = 1; j <= sub; j++) {

				System.out.println("Enter Marks of Subject" + (j));
				student[i][j] = sc.nextInt();
				sum = sum + student[i][j];
			}
			total[i] = sum;
		}

		System.out.print("rollno." + "\t" + "sub1" + "\t" + "sub2" + "\t" + "sub3" + "\t" + "total" + "\t" + "\n");
		for (int i = 0; i < st; i++) {
			System.out.print(student[i][0] + "\t");
			for (int j = 1; j <= sub; j++) {
				System.out.print(student[i][j] + "\t");

			}
			System.out.print(total[i] + "\t");
			System.out.println();
		}
		int max = total[0];
		roll = student[0][0];
		for (int i = 0; i < st; i++) {
			if (total[i] >= max) {
				max = total[i];
				roll = student[i][0];
			}

		}
		System.out.println("Student" + "\t" + roll + "\t" + "has max marks which are:");
		System.out.println(max);
	}
}
