import java.util.Scanner;

public class Question5
{
  static int mode(int a[],int n) {
    int maxValue = 0, maxCount = 0, i, j;
    for (i = 0; i < n; ++i) {
      int count = 0;
      for (j = 0; j < n; ++j) {
        if (a[j] == a[i])
          ++count;
        }
      if (count > maxCount) {
        maxCount = count;
        maxValue = a[i];
        }
      }
    return maxValue;
  }
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("");
    int times = in.nextInt();
    int[] numberlist = new int[times];
    System.out.println(numberlist.length);
    for (int i = 0; i< times; i++){
      System.out.print("");
      int x = in.nextInt();
      numberlist[i] = x;
      
    }
    int n = times;
    int a[] = numberlist;
    System.out.println("Mode: "+mode(a,n));
  }
}
