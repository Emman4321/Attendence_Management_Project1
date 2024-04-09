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

                    break;
                case "here":

                    break;
                case "print":

                    break;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }

}
