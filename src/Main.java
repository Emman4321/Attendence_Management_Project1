//IS147 Attendence Project
import java.util.Scanner;
import java.util.Date; // print the date along with students present (FUTURE)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendenceSheet attendenceSheet = new AttendenceSheet(50);

        while (true){
            System.out.println("Please enter a command (add, here, abs, print, total, or end): ");
            String command = scanner.nextLine();

            switch (command){
                case "add":
                    System.out.println("Please enter the student's name: ");
                    String name = scanner.nextLine();

                    attendenceSheet.addStudent(name);
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
                case "end":
                    return;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }

}
