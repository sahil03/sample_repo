import java.util.Scanner; // program uses Scanner

public class GradeBookTest
 {
 // main method begins program execution
 public static void main( String args[] )
 {
 // create Scanner to obtain input from command window
 Scanner input = new Scanner( System.in );

 // create a GradeBook object and assign it to myGradeBook
 GradeBook myGradeBook = new GradeBook();

 // prompt for and input course name
 System.out.printf( "Initial course name is: %s\n\n",
		 myGradeBook.getCourseName());
 
 System.out.println( "Please enter the course name:" );
 String theName = input.nextLine();
 myGradeBook.setCourseName( theName );
 System.out.println();
 

 myGradeBook.displayMessage();
 
 } // end main

 }