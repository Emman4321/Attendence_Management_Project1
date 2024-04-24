public class AttendenceSheet {

    private Student[] studentList;

    public AttendenceSheet(int size){
        this.studentList = new Student[size];
    }


    public void addStudent(String name){
        // add student to list in main
        for (int i = 0; i < studentList.length; i++){
            if (studentList[i] == null){
                studentList[i]= new Student(name);
                break;
            }
        }
    }

    public void markHere(String name){
        // find the student in list and set status to true or here
        for (int j = 0; j < studentList.length; j++){
            if (studentList[j] != null && studentList[j].getName().equals(name)) {
                studentList[j].setPresence(true);
                break;
            }
        }
    }
    public void print(){
        for (int k = 0; k < studentList.length; k++) {
            if (studentList[k] != null){
                System.out.println(studentList[k].getName() + ": " + (studentList[k].getPresence() ? "Present" : "Absent"));
            }
        }
    }
}
