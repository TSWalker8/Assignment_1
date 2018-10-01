// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


 //*********************************************************************
 //QUESTION 4
 //*********************************************************************
 


/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTestModified
{
  //Class methods *****************************************************

  /**
   * This method is responsible for the creation of the PointCP
   * object.  This can be done in two ways; the first, by using the
   * command line and running the program using <code> java 
   * PointCPTest &lt;coordtype (c/p)&gt; &lt;X/RHO&gt; &lt;Y/THETA&gt;
   * </code> and the second by getting the program to prompt the user.
   * If the user does not enter a valid sequence at the command line,
   * the program will prompte him or her.
   *
   * @param args[0] The coordinate type.  P for polar and C for
   *                cartesian.
   * @param args[1] The value of X or RHO.
   * @param args[2] The value of Y or THETA.
   */
  public static void main(String[] args)
  {
    PointCP point;
	PointCPDesign2 point2;
	PointCPDesign3 point3;

    System.out.println("Cartesian-Polar Coordinates Conversion Program");
    System.out.println("\n****************************"+" Testing Design 1 "+"****************************\n");
    // Check if the user input coordinates from the command line
    // If he did, create the PointCP object from these arguments.
    // If he did not, prompt the user for them.
    try
    {
      point = new PointCP(args[0].toUpperCase().charAt(0), 
        Double.valueOf(args[1]).doubleValue(), 
        Double.valueOf(args[2]).doubleValue());
    }
    catch(Exception e)
    {
      // If we arrive here, it is because either there were no
      // command line arguments, or they were invalid
      if(args.length != 0)
        System.out.println("Invalid arguments on command line");

      try
      {
        point = getInput();
      }
      catch(IOException ex)
      {
        System.out.println("Error getting input. Ending program.");
        return;
      }
    }
    System.out.println("\nYou entered:\n" + point);
	point.convertStorageToCartesian();
	System.out.println("\nAfter asking to store as Cartesian:\n" + point);
	point.convertStorageToPolar();
	System.out.println("\nAfter asking to store as Polar:\n" + point);
	
	
	//Testing Design 2, Desgin 3 (and Design 6)
	System.out.println("\n****************************"+" Testing Design 2 "+"****************************\n"+
	                   "\nCartesian coordinates: computed on demand, but not stored"+
	                   "\nPolar coordinates: simply returned\n");
	point2 = getInputD2();
	System.out.println("\nYou entered:\n" + point2 +
	                   "\nAfter asking to store as Polar:\n" + point2 +
	                   "\nAfter asking to convert to Cartesian (whithout storing):\n" + 
	                    Arrays.toString(point2.convertStorageToCartesian()));
						
	System.out.println("\n****************************"+" Testing Design 3 "+"****************************\n"+
	                   "\nCartesian coordinates: simply returned"+
					   "\nPolar coordinates: computed on demand, but not stored\n");
	point3 = getInputD3();
	System.out.println("\nYou entered:\n" + point3 +
	                   "\nAfter asking to store as Cartesian:\n" + point3 +
					   "\nAfter asking to convert to Polar (whithout storing):\n" + 
	                    Arrays.toString(point3.convertStorageToPolar()));
  }
  
  
  
  
  
  /**
   * This method obtains input from the user and verifies that
   * it is valid.  When the input is valid, it returns a PointCP
   * object.
   *
   * @return A PointCP constructed using information obtained 
   *         from the user.
   * @throws IOException If there is an error getting input from
   *         the user.
   */
  private static PointCP getInput() throws IOException
  {
    byte[] buffer = new byte[1024];  //Buffer to hold byte input
    boolean isOK = false;  // Flag set if input correct
    String theInput = "";  // Input information
    
    //Information to be passed to the constructor
    char coordType = 'A'; // Temporary default, to be set to P or C
    double a = 0.0;
    double b = 0.0;

    // Allow the user to enter the three different arguments
    for (int i = 0; i < 3; i++)
    {
      while (!(isOK))
      {
        isOK = true;  //flag set to true assuming input will be valid
          
        // Prompt the user
        if (i == 0) // First argument - type of coordinates
        {
          System.out.print("Enter the type of Coordinates you "
            + "are inputting ((C)artesian / (P)olar): ");
        }
        else // Second and third arguments
        {
          System.out.print("Enter the value of " 
            + (coordType == 'C' 
              ? (i == 1 ? "X " : "Y ")
              : (i == 1 ? "Rho " : "Theta ")) 
            + "using a decimal point(.): ");
        }

        // Get the user's input      
       
        // Initialize the buffer before we read the input
        for(int k=0; k<1024; k++)
        	buffer[k] = '\u0020';        
             
        System.in.read(buffer);
        theInput = new String(buffer).trim();
        
        // Verify the user's input
        try
        {
          if (i == 0) // First argument -- type of coordinates
          {
            if (!((theInput.toUpperCase().charAt(0) == 'C') 
              || (theInput.toUpperCase().charAt(0) == 'P')))
            {
              //Invalid input, reset flag so user is prompted again
              isOK = false;
            }
            else
            {
              coordType = theInput.toUpperCase().charAt(0);
            }
          }
          else  // Second and third arguments
          {
            //Convert the input to double values
            if (i == 1)
              a = Double.valueOf(theInput).doubleValue();
            else
              b = Double.valueOf(theInput).doubleValue();
          }
        }
        catch(Exception e)
        {
        	System.out.println("Incorrect input");
        	isOK = false;  //Reset flag as so not to end while loop
        }
      }

      //Reset flag so while loop will prompt for other arguments
      isOK = false;
    }
	
    //Return a new PointCP object
    return (new PointCP(coordType, a, b));
  }
  
  
  
  
  /**
   * This method obtains input from the user and verifies that
   * it is valid.  When the input is valid, it returns a PointCPDesign2
   * object.
   *
   * @return A PointCPDesign2 constructed using information obtained 
   *         from the user.
   */
  private static PointCPDesign2 getInputD2(){
	  boolean isOK = false;
	  double rho = 0.0;
	  double theta = 0.0;
	  
	  while(!(isOK)){
		try{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Enter the value of Rho using a decimal point(.):");
			rho = userInput.nextDouble();
			System.out.println("Enter the value of Theta using a decimal point(.):");
			theta = userInput.nextDouble();
			
			isOK = true;
		}catch(java.util.InputMismatchException e){
			System.out.println("\nPlease try again to enter the value of Rho, then of Theta\n");
			isOK = false;
		}
	  }
	  return (new PointCPDesign2(rho, theta));
  }
  /**
   * This method obtains input from the user and verifies that
   * it is valid.  When the input is valid, it returns a PointCPDesign3
   * object.
   *
   * @return A PointCPDesign3 constructed using information obtained 
   *         from the user.
   */
  private static PointCPDesign3 getInputD3(){
	  boolean isOK = false;
	  double X = 0.0;
	  double Y = 0.0;
	  
	  while(!(isOK)){
		try{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Enter the value of X using a decimal point(.):");
			X = userInput.nextDouble();
			System.out.println("Enter the value of Y using a decimal point(.):");
			Y = userInput.nextDouble();
			
			isOK = true;
			//Close the scanner object using close() method to prevent memory leak
		    userInput.close();
		}catch(java.util.InputMismatchException e){
			System.out.println("\nPlease try again to enter the value of X, then of Y\n");
			isOK = false;
		}
	  }
	  return (new PointCPDesign3(X, Y));
  }
  
 
}