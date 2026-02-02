package DataStructure;
*
/* This class represents a Teaching Assistant and extends the Person class.
* I implemented the logic so that TAs participate only in lab hours,
* which vary depending on the total number of course hours.
*/
public class TA extends Person {
	
	//This constructor initializes a Teaching Assistant object

    public TA(String title, String firstName, String lastName) {
        super(title, firstName, lastName);
    }

    @Override
    public int getParticipatingHours(int courseHours) {

    	
        int labHours; // TA are responsible for lab hours only 

        if(courseHours > 4){     // calculates the participating hours for a TA 
            labHours = 2;
        }else{
            labHours = 1;
        }

        return labHours;
    }
}