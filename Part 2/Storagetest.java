//Assignment 1 Question 7
// Matthew Walker 6934696
//Jeremy Georges 8537121
//SEG 2105 B01 Lab
//Miguel Garzon
import java.util.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
public class Storagetest{
  public static ArrayList list(int tester){
    ArrayList<Integer> numList= new ArrayList<Integer>();
    Random random = new Random();
    for (int i=0; i<tester; i++){
      numList.add(random.nextInt(9));
    }
    return numList;
  }
  public static Vector vector(int tester){
    @SuppressWarnings("unchecked")
    Vector numVector= new Vector(tester);
    int counter=0;
    Random random = new Random();
    for (int i=0; i<tester; i++){
      numVector.add(counter, random.nextInt(9));
      counter++;
    }
    return numVector;
  }
  
  public static int[] arraytype(int tester){
    int[] arraytest= new int[tester];
    int counter=0;
    Random random = new Random();
    for (int i=0; i<tester; i++){
      arraytest[counter]=random.nextInt(9);
      counter++;
    }
    return arraytest;
  }
    
  public static void main(String[] args){
    ArrayList l1;
    Vector v1;
    int [] a1;
    long start=0, end=0;
    String input1="", input2="";
    int inputnum1=0, inputnum2=0;
    input2 = JOptionPane.showInputDialog("How many numbers would you like the storage units to hold ");
    inputnum2= Integer.parseInt(input2);
    start=System.nanoTime();
    l1=list(inputnum2);
    end=System.nanoTime();
    double seconds = (double) (end-start)/1000000000.0;
    System.out.println("This ArrayList test took " + (seconds) +" seconds");
    start=System.nanoTime();
    v1=vector(inputnum2);
    end=System.nanoTime();
    seconds = (double) (end-start)/1000000000.0;
    System.out.println("This Vector test took " + (seconds) +" seconds");
    start=System.nanoTime();
    a1=arraytype(inputnum2);
    end=System.nanoTime();
    seconds = (double) (end-start)/1000000000.0;
    System.out.println("This Array test took " + (seconds) +" seconds"+"\n");
    int n=JOptionPane.showConfirmDialog(null,"would you like to add the elements?", "Question", JOptionPane.YES_NO_OPTION);
    if (true)
    {
      start=System.nanoTime();
      Iterator i1= l1.iterator();
      int sum=0;
      while (i1.hasNext()){
        Object element=i1.next();
        sum=sum+(int)element;
      } 
      end=System.nanoTime();
      seconds = (double) (end-start)/1000000000.0;
      System.out.println("This Iteration took " + (seconds) +" seconds");
      System.out.println("The total sum of the ArrayList is " +sum +"\n");
      sum=0;
      start=System.nanoTime();
      Iterator i2= v1.iterator();
      while (i2.hasNext()){
        Object element=i2.next();
        sum=sum+(int)element;
      } 
      end=System.nanoTime();
      seconds = (double) (end-start)/1000000000.0;
      System.out.println("This Iteration took " + (seconds) +" seconds");
      System.out.println("The total sum of the Vector is " +sum+"\n");
      sum=0;
      start=System.nanoTime();
      for (int i=0; i<a1.length; i++){
        sum=sum+a1[i];
      }
      end=System.nanoTime();
      seconds = (double) (end-start)/1000000000.0;
      System.out.println("This for loop addition took " + (seconds) +" seconds");
      System.out.println("The total sum of the Array is " +sum+"\n");
      
    }
        
      
  }
}



  