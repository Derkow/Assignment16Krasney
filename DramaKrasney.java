// This program was written on April 30th, 2023, by Alexandra Krasney

public class DramaKrasney extends MovieKrasney {
    // To create the default constructor
    
    public DramaKrasney() {
        super();
    }
    
    // To create the conversion constructor
    
    public DramaKrasney(String newRating, String newName, double newID, double newDaysLate) {
        super(newRating, newName, (double)newID, (double)newDaysLate);
    }
    
    // To create the copy constructor
    
    public DramaKrasney(DramaKrasney other) {
        super(other);
    }
    
    
    
    
    // To create the unique version of the calcLateFees method that
    // this class has 
    public static String calcLateFees(DramaKrasney toBeCalculated) {
        return "Late fee of the movie in question is: " + String.format("$%.2f",(2 * toBeCalculated.getDaysLate())) + " USD";
    }
}