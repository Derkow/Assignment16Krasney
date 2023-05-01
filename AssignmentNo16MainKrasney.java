// This program was written by Alexandra Krasney on April 26th, 2023

/**
 * Pseudo-code
 * 
 * Note: All classes described below will have 'Krasney' appened to their
 * names as to make it easier for the one who will grade this program to 
 * distinguish my submission from the others
 * 
 * 1) Create Movie class, and give it the properties of ratingMPPA (which
 * is a String), ID number (a double), possRatings (a list of Strings),
 * daysLate (a double)and movieTitle (A String). PossRatings contains the 
 * following: "G", "PG", "PG-13", "R", and "NC-17". All properties
 * are private, with their own accessor and mutator methods, and 
 * possRatings is static 
 * 2) Give Movie class a default constructor, a conversion constructor 
 * which initializes all properies, an equals method which only decides
 * that two Movie objects are equal by only comparing the values of 
 * their respective ID number properties, aa method that compares its 
 * input, a String, against the items of the PossRatings property, letting
 * the user know if the String does not match any of the list contents, 
 * and a method named calcLateFees which calculates the late fee of a
 * given movie object by multiplying 2 by the number of days that the 
 * movie that is represented by the object in question is late
 * 3) Create the Action, Drama, and Comedy classes from the Movie class. 
 * In each class, override the calcLateFees method of their parent by,
 * in the Action class, setting the constant in the calcLateFees method
 * to 3, setting the constant in the calcLateFees method of the Comedy 
 * class to 2.5, and changing the calculation of the calcLateFees method
 * of the Drama class entirely by adding the value of the dayLate
 * property of the object in question to itself. 
 */
public class AssignmentNo16MainKrasney {
    public static void main(String[] main) {
        // To demonstrate the MovieKrasney class. The properties of the demonstration objects
        // are the same, in order to highlight the uniqueness of their classes
        MovieKrasney movie = new MovieKrasney("G", "Blade", (double)202020, (double)49);
        System.out.println(MovieKrasney.calcLateFees(movie));
        
        // To demonstrate the ActionKrasney class
        ActionKrasney action = new ActionKrasney("G", "Blade", (double)202020, (double)49);
        System.out.println(ActionKrasney.calcLateFees(action));
        
        // To demonstrate the DramaKrasney class
        DramaKrasney drama = new DramaKrasney("G", "Blade", (double)202020, (double)49);
        System.out.println(DramaKrasney.calcLateFees(drama));
        
        // To demonstrate the ComedyKrasney class 
        ComedyKrasney comedy = new ComedyKrasney("G", "Blade", (double)202020, (double)49);
        System.out.println(ComedyKrasney.calcLateFees(comedy));
        
        
        // To demonstrate the equals method inherent to all classes 
        // The line below should resolve as 'true' in the terminal
        System.out.println("\n" + movie.equals(drama));
    }
}

/**
 * Sources:
 * 
 * https://stackabuse.com/java-check-if-array-contains-value-or-element/#arraysaslistcontains
 * https://www.developer.com/java/java-string-format-method/
 */
