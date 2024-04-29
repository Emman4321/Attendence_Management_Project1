//IS147 Attendence Project
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendenceSheet attendenceSheet = new AttendenceSheet(30);

        while (true){
            System.out.println("Please enter a command (add, here, absent, print, total, or end): ");
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
                case "absent":
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
