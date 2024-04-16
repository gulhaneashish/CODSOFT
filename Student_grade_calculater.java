import java.util.*;
public class Student_grade_calculater {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of subjects: ");
        int subjects = sc.nextInt();

        int totalmarks = 0;
        for (int i = 1; i <=subjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = sc.nextInt();
            totalmarks += marks;
        }

        double avgpercentage = (double) totalmarks / subjects;

        char grade;
        if (avgpercentage >= 90) {
            grade = 'A';
        } else if (avgpercentage >= 75) {
            grade = 'B';
        } else if (avgpercentage >= 60) {
            grade = 'C';
        } else if (avgpercentage >= 45) {
            grade = 'D';
        } else if (avgpercentage >= 35) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks: " + totalmarks);
        System.out.println("Average Percentage: " + avgpercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

