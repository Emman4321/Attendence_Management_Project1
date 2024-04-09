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
                    //code to add names into the attendence sheet array
                    break;
                case "here":
                    //code to mark that person as present
                    break;
                case "print":
                    //code to print the attendence list of whose present and not present
                    break;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }

}
