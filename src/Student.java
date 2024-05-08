/**
 * Represents a student with a name and presence status.
 */
public class Student {
    /** The name of the student. */
    private String name;
    /** The presence status of the student. */
    private boolean isPresent;

    /**
     * Constructs a student with the given name.
     *
     * @param name the name of the student
     */
    public Student(String name){
        this.name = name;
        this.isPresent = false;
    }
    /**
     * Gets the name of the student.
     *
     * @return the name of the student
     */

    public String getName() {
        return name;
    }
    /**
     * Gets the presence status of the student.
     *
     * @return true if the student is present, false otherwise
     */
    public boolean getPresence() {
        return isPresent;
    }
    /**
     * Sets the presence status of the student.
     *
     * @param inClass true if the student is present, false otherwise
     */
    public void setPresence(boolean inClass){
        isPresent = inClass;
    }
}
