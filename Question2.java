import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
     
    Scanner in = new Scanner(System.in);
    System.out.print("Input weight in kg:");
    double weight = in.nextDouble();
    
    System.out.print("Input height in cm:");
    double height = in.nextDouble();
    System.out.println(height/(weight*weight));
  }
}
