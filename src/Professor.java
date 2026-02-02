/**
 * 
 */
package DataStructure;

/*
 * This class represents a Professor and extends the abstract Person class.
 * I implemented the participating hours logic so that professors attend
 * lecture hours only, which are calculated by subtracting lab hours from
 * the total course hours .
 */


public class Professor extends Person {

	
	// The constructor initializes the professor object 
    public Professor(String title, String firstName, String lastName) {
        super(title, firstName, lastName);
    }

    @Override
    public int getParticipatingHours(int courseHours) {

        int labHours;

        
        // calculates the participating hours for a professor 
        if(courseHours > 4){
            labHours = 2;
        }else{
            labHours = 1;
        }

        //professors attend lecture hours only 
        int lectureHours = courseHours - labHours;

        return lectureHours;
    }
}
