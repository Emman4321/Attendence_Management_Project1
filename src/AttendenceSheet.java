public class AttendenceSheet {

    private String[] studentList;

    public AttendenceSheet(int size){
        this.studentList = new String[size];
    }

    public boolean isPresent(String name){
        //find the student in the array and mark as present
        return false;
    }
    public void addStudent(String name){
        // add student to list in main
    }

    public void markHere(String name){
        // find the student in list and set status to true or here
    }

    public void print(){
        // loop through the student list and display the names along with their status
    }
}
