import java.util.Random;

/**
* This class runs a performace analysis
* comparing classes PointCP, PointCPDesign2,
* and PointCPDesign3.
*/
public class PerformanceAnalysis{
	/**
	* A fixed number of iterations
	* which every method will run.
	*/
	private final static int ITERATIONS = 10000000;
	/**
	* To generate a radom point to be tested.
	*/
	private static Random rand = new Random();
	/**
	* A measure of the time elapsed in milliseconds.
	*/
	private static double timeElapsed = 0.0;
	
	
	/**
	* For each design create random instances 
	* and then call each method many thousands of times,
	* and then find the elapsed time in milliseconds 
	* for the fixed number of iterations. 
	* The program runs each time for about 10 seconds.
	* Run each version several times to ensure consistent results,
	* by use of the median result as definitive result,
	* plus give the maximum and minimum.
	*/
	public static void main(String[]args){
		PointCP point1;
		PointCPDesign2 point2;
		PointCPDesign3 point3;
		double temp;
		double[] tempArray;
		double startTime = 0.0;
		double endTime = 0.0;
		double time = 0.0;
		int attempts = 50;
		
		
		//Code repetition
		System.out.println("\n****************************"+" Testing Design 1 "+"****************************\n");
		System.out.println("\n********** Initially cartesian coordinate **********\n");
        point1 = new PointCP('C', rand.nextInt(100), rand.nextInt(100));
		
		//Testing getX()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getX();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nPoint: "+point1+
		                   "\nMethod: getX() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getY()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getY();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getY() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getRho()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getRho();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getRho() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getTheta()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getTheta();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getTheta() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing convertStorageToPolar()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				point1.convertStorageToPolar();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: convertStorageToPolar() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing convertStorageToCartesian()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				point1.convertStorageToCartesian();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: convertStorageToCartesian() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getDistance(PointCP pointB)
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getDistance(new PointCP('C', rand.nextInt(100),rand.nextInt(100)));
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getDistance(PointCP pointB) ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing rotatePoint(double rotation)
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				point1 = point1.rotatePoint(rand.nextInt(100));
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: rotatePoint(double rotation) ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		System.out.println("\n********** Initially polar coordinate **********\n");
		point1 = new PointCP('P', rand.nextInt(100), rand.nextInt(100));
		
		//Testing getX()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getX();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nPoint: "+point1+
		                   "\nMethod: getX() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getY()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getY();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getY() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getRho()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getRho();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getRho() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getTheta()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getTheta();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getTheta() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing convertStorageToPolar()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				point1.convertStorageToPolar();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: convertStorageToPolar() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing convertStorageToCartesian()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				point1.convertStorageToCartesian();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: convertStorageToCartesian() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getDistance(PointCP pointB)
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point1.getDistance(new PointCP('P', rand.nextInt(100),rand.nextInt(100)));
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getDistance(PointCP pointB) ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing rotatePoint(double rotation)
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				point1 = point1.rotatePoint(rand.nextInt(100));
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: rotatePoint(double rotation) ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		
		
		
		
		
		
		
		
		
		//Code repetition
		System.out.println("\n****************************"+" Testing Design 2 "+"****************************\n");
        point2 = new PointCPDesign2(rand.nextInt(100), rand.nextInt(100));
		
		//Testing getX()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point2.getX();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nPoint: "+point2+
		                   "\nMethod: getX() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getY()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point2.getY();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getY() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getRho()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point2.getRho();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getRho() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getTheta()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point2.getTheta();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getTheta() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing convertStorageToPolar()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				tempArray = point2.convertStorageToPolar();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: convertStorageToPolar() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing convertStorageToCartesian()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				tempArray = point2.convertStorageToCartesian();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: convertStorageToCartesian() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getDistance(PointCPDesign2 pointB)
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point2.getDistanceD2(new PointCPDesign2(rand.nextInt(100),rand.nextInt(100)));
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getDistance(PointCPDesign2 pointB) ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing rotatePoint(double rotation)
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				point2 = point2.rotatePointD2(rand.nextInt(100));
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: rotatePoint(double rotation) ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		
		
		
		
		
		
		
		
		//Code repetition
		System.out.println("\n****************************"+" Testing Design 3 "+"****************************\n");
        point3 = new PointCPDesign3(rand.nextInt(100), rand.nextInt(100));
		
		//Testing getX()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point3.getX();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nPoint: "+point3+
		                   "\nMethod: getX() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getY()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point3.getY();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getY() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getRho()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point3.getRho();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getRho() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getTheta()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point3.getTheta();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getTheta() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing convertStorageToPolar()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				tempArray = point3.convertStorageToPolar();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: convertStorageToPolar() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing convertStorageToCartesian()
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				tempArray = point3.convertStorageToCartesian();
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: convertStorageToCartesian() ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing getDistance(PointCPDesign3 pointB)
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				temp = point3.getDistanceD3(new PointCPDesign3(rand.nextInt(100),rand.nextInt(100)));
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: getDistance(PointCPDesign3 pointB) ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
		
		//Testing rotatePoint(double rotation)
		for(int i=0; i<attempts; i++){
			startTime = System.currentTimeMillis(); 
			for(int j=0; j<ITERATIONS; j++){
				point3 = point3.rotatePointD3(rand.nextInt(100));
			}
			endTime = System.currentTimeMillis();
			time += endTime - startTime;
		}
		timeElapsed = time/attempts ;                   //median time elapsed after 50 attempts of 10000000 iterations
		System.out.println("\nMethod: rotatePoint(double rotation) ; Number of iterations: "+
						   ITERATIONS+" ; Median time elapsed of "+
						   attempts+" attempts: "+timeElapsed+" milliseconds");
		timeElapsed = 0.0;                              //Reinitialises timeElapsed to 0.0
		time = 0.0;                                     //Reinitialises time to 0.0
	}	
}