//IS147 Attendence Project
// Group Project
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendenceSheet attendenceSheet = new AttendenceSheet();

        while (true){
            System.out.println("Please enter a command (add, addplus, here, abs, print, total, rand, or end to stop): ");
            String command = scanner.nextLine();

            switch (command){
                case "add":
                    System.out.println("Please enter the student's name: ");
                    String name = scanner.nextLine();

                    attendenceSheet.addStudent(name);
                    break;
                case "addplus":
                    System.out.println("Please enter multiple students' names, seperated by commas: ");
                    String names = scanner.nextLine();

                    attendenceSheet.addStudent(names.split(", "));
                    break;
                case "here":
                    System.out.println("Which student is present?: ");
                    String present = scanner.nextLine();

                    attendenceSheet.markHere(present);
                    break;
                case "abs":
                    System.out.println("Which student is absent?: ");
                    String absent = scanner.nextLine();

                    attendenceSheet.markAbs(absent);
                    break;
                case "print":
                    attendenceSheet.print();
                    break;
                case "total":
                    attendenceSheet.calculateTotal();
                    break;
                case "rand":
                    attendenceSheet.randomStudent();
                    break;
                case "end":
                    return;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }

}
