import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the marks obtained: ");
        int marks = input.nextInt();
        
        // Using if-else ladder
        char grade;
        if(marks >= 90) {
            grade = 'A';
        } else if(marks >= 80) {
            grade = 'B';
        } else if(marks >= 70) {
            grade = 'C';
        } else if(marks >= 60) {
            grade = 'D';
        } else if(marks >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
        
        // Using switch case
        int roundedMarks = (int) Math.round(marks/10.0)*10;
        switch(roundedMarks) {
            case 90:
            case 100:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            case 70:
                grade = 'C';
                break;
            case 60:
                grade = 'D';
                break;
            case 50:
                grade = 'E';
                break;
            default:
                grade = 'F';
        }
        System.out.println("Grade: " + grade);
        
        input.close();
    }

}

