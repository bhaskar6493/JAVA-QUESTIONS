public class largestNo {
   public static void main(String[] args) {
       int a = 5, b = 10, c = 3;
       int largest;
       if (a >= b && a >= c)
           largest = a;
       else if (b >= a && b >= c)
           largest = b;
       else
           largest = c;
       System.out.println("The largest number is " + largest);
   }
}
