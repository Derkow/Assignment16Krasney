// This program was written on April 30th, 2023, by Alexandra Krasney

public class ActionKrasney extends MovieKrasney {
    // To create the default, conversion, and copy constructors 
    // of this class
    
    
    // To create the default constructor
    public ActionKrasney(){
        super();
    }
    
    // To create the conversion constructor
    public ActionKrasney(String newRating, String newTitle, double newID,
    double newDaysLate) {
        super(newRating, newTitle, newID, newDaysLate);
    }
    
    
    // To create the copy constructor
    public ActionKrasney(ActionKrasney other) {
        super(other);
    }
    
    
    // To create the unique version of the calcLateFees method that
    // this class has 
    
    public static String calcLateFees(ActionKrasney toBeCalculated) {
        return "Late fee of the movie in question is: " + String.format("$%.2f",(3 * toBeCalculated.getDaysLate())) + " USD";
    }

}