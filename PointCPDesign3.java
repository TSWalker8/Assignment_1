// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 



 //*********************************************************************
 //QUESTION 3
 //*********************************************************************
 

 
/**
 * This class contains instances of coordinates in
 * cartesian format.  It also provides the utilities to convert
 * them into polar format. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCPDesign3
{
  //Instance variables ************************************************
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double x;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double y;
	
  
  //Constructors ******************************************************

  /**
   * Constructs a cartesian coordinate object.
   */
  public PointCPDesign3(double x, double y)
  {
    this.x = x;
    this.y = y;
  }
	
  
  //Instance methods **************************************************
 
  public double getX()
  {
     return x;
  }
  
  public double getY()
  {
     return y;
  }
  
  public double getRho()
  {
     return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
  }
  
  public double getTheta()
  {
     return Math.toDegrees(Math.atan2(y, x));
  }
  
	
  /**
   * Converts Cartesian coordinates to Polar coordinates,
   * and returns an array of polar coordinate not stored.
   */
  public double[] convertStorageToPolar()
  {
      //Calculate RHO and THETA
	  double[] array = {getRho(),getTheta()};
	  return array;
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates,
   * and returns an array of cartesian coordinate not stored.
   */
  public double[] convertStorageToCartesian()
  {
      //Calculate X and Y
      double[] array = {getX(),getY()};
	  return array;
  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP rotatePoint(double rotation) //SHOULD RETURN A DIFFERENT TYPE?
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as Cartesian (" + getX() + "," + getY() + ")" + "\n";
  }
}