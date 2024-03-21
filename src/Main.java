import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create arrays to store student names and grades
        String[] studentNames = new String[numberOfStudents];
        int[][] studentGrades = new int[numberOfStudents][3]; // Assuming three subjects: Math, Science, English

        // Input student names and grades
        for (int i = 0; i < numberOfStudents; i++) {
            scanner.nextLine(); // Consume newline character
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.println("Enter grades for " + studentNames[i] + ":");
            System.out.print("Math: ");
            studentGrades[i][0] = scanner.nextInt();
            System.out.print("Science: ");
            studentGrades[i][1] = scanner.nextInt();
            System.out.print("English: ");
            studentGrades[i][2] = scanner.nextInt();
        }

        // Display student information
        System.out.println("\nStudent Grades Report:");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-20s | %-10s | %-10s | %-10s\n", "Name", "Math", "Science", "English");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-20s | %-10d | %-10d | %-10d\n", studentNames[i], studentGrades[i][0], studentGrades[i][1], studentGrades[i][2]);
        }
        System.out.println("----------------------------------------------------------");
    }
}
