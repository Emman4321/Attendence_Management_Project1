import java.util.Random;
public class AttendenceSheet {
    private static final int MAX_STUDENT = 50;
    private static int totalClass = 0;
    private Student[] studentList;
    private int currentStudents;

    public AttendenceSheet(){
        this.studentList = new Student[MAX_STUDENT];
        this.currentStudents = 0;
        totalClass += MAX_STUDENT;
    }

    public static int getTotalClass(){
        return totalClass;
    }

    public void addStudent(String name){
        if (currentStudents >= MAX_STUDENT){
            System.out.println("The attendance sheet is now full. No more students can be  added. ");
            return;
        }
        studentList[currentStudents++] = new Student(name);
    }

    public void addStudent(String[] names){
        for (String name : names){
            addStudent(name);
        }
    }



    public void markHere(String name){
        // find the student in list and set status to true or here
        for (int j = 0; j < currentStudents; j++){
            if (studentList[j] != null && studentList[j].getName().equals(name)) {
                studentList[j].setPresence(true);
                break;
            }
        }
    }
    public void markAbs(String name){
        // finds the student in the list and marks them absent
        for (int l = 0; l < currentStudents; l++){
            if (studentList[l] != null && studentList[l].getName().equals(name)) {
                studentList[l].setPresence(false);
                break;
            }
        }
    }
    public double calculateTotal(){
        int presentStudents = 0;

        for (int n = 0; n < currentStudents; n++){
            if (studentList[n].getPresence()){
                presentStudents +=1;
            }
        }
        float percentage = ((float) presentStudents / currentStudents) * 100;
        System.out.println("There is(are) " + presentStudents + " present student(s), making it " + percentage + "% of students present");

        return percentage;
    }

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

    public void print(){
        for (int k = 0; k < studentList.length; k++) {
            if (studentList[k] != null){
                System.out.println(studentList[k].getName() + ": " + (studentList[k].getPresence() ? "Present" : "Absent"));
            }
        }
    }
}
