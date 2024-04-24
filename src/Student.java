public class Student {
    private String name;
    private boolean isPresent;

    public Student(String name){
        this.name = name;
        this.isPresent = false;
    }

    public String getName() {
        return name;
    }
    public boolean getPresence() {
        return isPresent;
    }
    public void setPresence(boolean inClass){
        isPresent = inClass;
    }
}
