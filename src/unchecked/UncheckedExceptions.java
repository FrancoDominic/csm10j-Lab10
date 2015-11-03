
package unchecked;

public class UncheckedExceptions 
{
 public static void ThrowIndexOutOfBounds()
 {
     int[] a = new int[10];
             
     System.out.println(a[10]);
 }
 
 public static void CatchIndexOutOfBounds()
 {
     try
     {
         int[] a = new int[10];
             
         System.out.println(a[10]);
     }
     catch(ArrayIndexOutOfBoundsException aex)
     {
         System.out.println("Caught ArrayIndexOutOfBounds");
     }
                 
 }
 
 public static void CatchIndexOutOfBoundsFinally()
 {
     try
     {
         int[] a = new int[10];
             
         System.out.println(a[10]);
             
     }
     catch(ArrayIndexOutOfBoundsException aex)
     {
         System.out.println("Caught ArrayIndexOutOfBounds");
     }
     finally
     {
         System.out.println("Finally statement executed");
     }
 }
}
