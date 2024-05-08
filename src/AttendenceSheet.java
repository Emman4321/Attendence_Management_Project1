import java.util.Random;
/**
 * Represents an attendance sheet for managing student attendance.
 */
public class AttendenceSheet {
    /** The maximum number of students that can be accommodated on the attendance sheet. */
    private static final int MAX_STUDENT = 50;

    /** The total number of classes tracked. */
    private static int totalClass = 0;

    /** The list of students on the attendance sheet. */
    private Student[] studentList;

    /** The current number of students on the attendance sheet. */
    private int currentStudents;

    /**
     * Constructs an attendance sheet with the default maximum capacity.
     */
    public AttendenceSheet(){
        this.studentList = new Student[MAX_STUDENT];
        this.currentStudents = 0;
        totalClass += MAX_STUDENT;
    }

    /**
     * Gets the total number of students that can be accommodated on the attendance sheet.
     *
     * @return the maximum number of students
     */
    public static int getTotalClass(){
        return totalClass;
    }

    /**
     * Adds a single student to the attendance sheet.
     *
     * @param name the name of the student to be added
     */
    public void addStudent(String name){
        if (currentStudents >= MAX_STUDENT){
            System.out.println("The attendance sheet is now full. No more students can be  added. ");
            return;
        }
        studentList[currentStudents++] = new Student(name);
    }

    /**
     * Adds multiple students to the attendance sheet.
     *
     * @param names an array of names of the students to be added
     */
    public void addStudent(String[] names){
        for (String name : names){
            addStudent(name);
        }
    }


    /**
     * Marks a student as present.
     *
     * @param name the name of the student to be marked present
     */
    public void markHere(String name){
        // find the student in list and set status to true or here
        for (int j = 0; j < currentStudents; j++){
            if (studentList[j] != null && studentList[j].getName().equals(name)) {
                studentList[j].setPresence(true);
                break;
            }
        }
    }

    /**
     * Marks a student as absent.
     *
     * @param name the name of the student to be marked absent
     */
    public void markAbs(String name){
        // finds the student in the list and marks them absent
        for (int l = 0; l < currentStudents; l++){
            if (studentList[l] != null && studentList[l].getName().equals(name)) {
                studentList[l].setPresence(false);
                break;
            }
        }
    }

    /**
     * Calculates the percentage of students present in the class.
     *
     * @return the percentage of students present
     */
    public double calculateTotal(){
        int presentStudents = 0;

        for (int n = 0; n < currentStudents; n++){
            if (studentList[n].getPresence()){
                presentStudents +=1;
            }
        }
        float percentage = ((float) presentStudents / currentStudents) * 100;
        percentage = Math.round(percentage);

        System.out.println("There is(are) " + presentStudents + " present student(s), making it " + percentage + "% of students present");

        return percentage;
    }

    /**
     * Selects a random present student from the attendance sheet.
     */
    public void randomStudent(){
        Random random = new Random();
        Student chosenStudent = null;

        while (chosenStudent == null){
            int randomIndex = random.nextInt(currentStudents);
            if (studentList[randomIndex].getPresence()){
                chosenStudent = studentList[randomIndex];
            }
        }
        System.out.println("The random selected student is: " + chosenStudent.getName());
    }

    /**
     * Prints the list of students on the attendance sheet along with their presence status.
     */
    public void print(){
        for (int k = 0; k < studentList.length; k++) {
            if (studentList[k] != null){
                System.out.println(studentList[k].getName() + ": " + (studentList[k].getPresence() ? "Present" : "Absent"));
            }
        }
    }
}
