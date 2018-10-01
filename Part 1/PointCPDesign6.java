// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 



 //*********************************************************************
 //QUESTION 3
 //*********************************************************************
 

 
/**
 * Interface with designs 2 and 3 as classes implementing it.
 * It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public interface PointCPDesign6
{
  
  //Instance methods **************************************************
 
  public abstract double getX();
  
  public abstract double getY();
  
  public abstract double getRho();
  
  public abstract double getTheta();
 
  
  /**
   * Converts Cartesian coordinates to Polar coordinates,
   * and returns an array of polar coordinate not stored.
   */
  public abstract double[] convertStorageToPolar();
	
  /**
   * Converts Polar coordinates to Cartesian coordinates,
   * and returns an array of cartesian coordinate not stored.
   */
  public abstract double[] convertStorageToCartesian();
  
  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public abstract double getDistance(PointCP pointB);

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public abstract PointCP rotatePoint(double rotation);

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public abstract String toString();
}