//IS147 Attendence Project
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendenceSheet attendenceSheet = new AttendenceSheet(30);

        while (true){
            String command = scanner.nextLine();

            switch (command){
                case "add":
                    System.out.println("Please enter the student's name: ");
                    String name = scanner.nextLine();

                    attendenceSheet.addStudent(name);
                    break;
                case "here":
                    System.out.println("Are they here?: ");
                    String present = scanner.nextLine();

                    attendenceSheet.markHere(present);
                    break;
                case "print":
                    attendenceSheet.print();
                    break;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }

}
