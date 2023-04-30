// This program was written on April 30th, 2023, by Alexandra Krasney

public class ComedyKrasney extends MovieKrasney {
    // To create the default constructor
    public ComedyKrasney(){
        super();
    }
    
    // To create the conversion constructor
    public ComedyKrasney(String newRating, String newTitle, double newID,
    double newDaysLate) {
       super(newRating, newTitle, (double)newID, (double)newDaysLate);
    }
    
    
    // To create the copy constructor
    public ComedyKrasney(ComedyKrasney other) {
        super(other);
    }
    
    
    // To create the unique version of the calcLateFees method that
    // this class has 
    public static String calcLateFees(ComedyKrasney toBeCalculated) {
        return "Late fee of the movie in question is: " + String.format("$%.2f",(2.5 * toBeCalculated.getDaysLate())) + " USD";
    }

}