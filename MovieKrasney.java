// This program was written on April 28th, 2023, by Alexandra Krasney
import java.util.Arrays;
public class MovieKrasney {
    private String mPAARating = "";
    private String movieTitle = "";
    private double iDNumber;
    private double daysLate;
    // possRatings is of protected access level as to allow for easier 
    // checking of the value submitted for a movie's rating
    // when creating an object of this class, or of the classes that will
    // be derived of this class, through constructors other than the 
    // default constructor 
    protected static String[] possRatings = {"G", "PG", "PG-13", "R", "NC-17"};
    // To create the getter and setter methods of the above properties 
    
    public String getMPAARating() {
        return this.mPAARating;
    }
    
    public void setMPAARating(String newRating) {
        this.mPAARating = newRating;
    }
    
    public String getMovieTitle() {
        return this.movieTitle;
    }
    
    public void setMovieTitle(String newMovieTitle) {
        this.movieTitle = newMovieTitle;
    }
    
    public double getIDNumber() {
        return this.iDNumber;
    }
    
    public void setIDNumber(double newIDNumber) {
        this.iDNumber = newIDNumber;
    }
    
    public double getDaysLate() {
        return this.daysLate;
    }
    
    public void setDaysLate(double newDaysLate) {
        this.daysLate = newDaysLate;
    }
    
    // To establish the default constructor, the conversion constructor, 
    // and the copy constructor, and the method that checks to see if
    // the parameters of the latter two constructors are valid. The 
    // reason as to why said method is written in between the default
    // and conversion constructors within the text of the code itself is
    // so that complier can use this method when calling upon the copy
    // constructor and the conversion constructor

    
    public MovieKrasney(){
        this.setMPAARating("");
        this.setMovieTitle("");
        this.setIDNumber(0);
        this.setDaysLate(0);
    }
    
    
    // The conversion constructor which initializes all properties
    // "Nu" here is a deliberate mispelling of the word 'new'
    public MovieKrasney(String nuRating, String nuTitle, double nuID,
    double nuDaysLate) {
        this.setMPAARating(nuRating);
        this.setMovieTitle(nuTitle);
        this.setIDNumber(nuID);
        this.setDaysLate(nuDaysLate);
        
        // To see if the rating of this movie could be an acutal rating
        // both in the past and in the future. 
        if ((Arrays.asList(MovieKrasney.possRatings).
        contains(this.getMPAARating()) == false && 
        this.getMPAARating() != "X")) {
            System.out.println("Rating is not valid, at least in the US");
            System.out.println("System will shut down");
            System.exit(0);
        }
        // This is to account for movies that were assigned the grade of
        // 'X' at their release, and to update them accordingly with 
        // their modern equivalent 
        else if (this.getMPAARating() == "X") {
            this.setMPAARating(MovieKrasney.possRatings[4]);
        }
        else {
        }
    }
    
    // To create the copy constructor
    public MovieKrasney(MovieKrasney other) {
        // To check first to see if the object that is to be copied has 
        // valid values
    
        if (Arrays.asList(MovieKrasney.possRatings).
        contains(other.getMPAARating()) == false && 
        other.getMPAARating() != "X") {
            System.out.println("Rating of object to be copied is not valid, at least in the US");
            System.out.println("System will shut down");
            System.exit(0);
        }
        else if (other.getMPAARating() == "X") {
            this.setMPAARating("X");
        }
        else {
        }
        this.setMovieTitle(other.getMovieTitle());
        this.setIDNumber(other.getIDNumber());
        this.setDaysLate(other.getDaysLate());
    }
    
    // To create the unique equals() method of this class and its 
    // descendants
    public boolean equals(MovieKrasney other) {
        // Again, to check if the movie that is being compared to 
        // this movie has a valid rating
        if (Arrays.asList(MovieKrasney.possRatings).
        contains(other.getMPAARating()) == false && 
        other.getMPAARating() != "X") {
            System.out.println("Rating of object that is being compared to is not valid, at least in the US");
            System.out.println("System will shut down as consequence");
            System.exit(0);
        }
        else if (other.getMPAARating() == "X") {
            this.setMPAARating("X");
        }
        else {
        }
        return this.iDNumber == other.iDNumber; 
    }
    
    // To establish the calcLateFees method. As the instructions of this
    // assignment called for this method to have input, it seemed the most
    // appropriate to give this method the static keyword, as a similar 
    // method that was dynamic/not-static would presumably not require a 
    // parameter, as it could just simply call upon the properties of the 
    // object that is attached to in the text of the code itself 
    public static String calcLateFees(MovieKrasney toBeCalculated) {
        return "Late fee of the movie in question is: " + String.format("$%.2f",(2 * toBeCalculated.getDaysLate())) + " USD";
    }
}


        


