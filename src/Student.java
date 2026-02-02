package DataStructure;

/*
 * This class represents a Student and extends the Person class.
 * Students are required to attend all course hours, therefore
 * the participating hours are equal to the total course hours.
 */
public class Student extends Person {

	
    /*
     * This constructor initializes a Student object by invoking
     * the superclass constructor to set the shared attributes.
     */
    public Student(String title, String firstName, String lastName) {
        super(title, firstName, lastName);
    }

    /*
     * Returns the total participating hours for a Student.
     * Students attend all scheduled hours.
     */
    
    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours;
    }
}