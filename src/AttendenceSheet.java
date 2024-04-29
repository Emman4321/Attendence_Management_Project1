public class AttendenceSheet {

    private Student[] studentList;
    private int currentStudents;

    public AttendenceSheet(int size){
        this.studentList = new Student[size];

        this.currentStudents = 0;
    }


    public void addStudent(String name){
        // add student to list in main
        for (int i = 0; i < studentList.length; i++){
            if (studentList[i] == null){
                studentList[i]= new Student(name);
                currentStudents ++;
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
    public void markAbs(String name){
        for (int l = 0; l < studentList.length; l++){
            if (studentList[l] != null && studentList[l].getName().equals(name)) {
                studentList[l].setPresence(false);
                break;
            }
        }
    }
    public double calculateTotal(){
        int totalStudents = currentStudents;
        int presentStudents = 0;

        for (int n = 0; n < studentList.length; n++){
            if (studentList[n] != null && studentList[n].getPresence()){
                presentStudents +=1;
            }
        }
        double percentage = ((double) presentStudents / totalStudents) * 100;
        System.out.println("There are " + presentStudents + " present students, making it " + percentage + "% of students present");

        return percentage;
    }
    public void print(){
        for (int k = 0; k < studentList.length; k++) {
            if (studentList[k] != null){
                System.out.println(studentList[k].getName() + ": " + (studentList[k].getPresence() ? "Present" : "Absent"));
            }
        }
    }
}
