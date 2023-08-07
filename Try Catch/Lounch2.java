import java.util.Scanner;

public class Lounch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
       System.out.println("Enter num1 :");
       int a=sc.nextInt();
       System.out.println("Enter num2 :");
       int b=sc.nextInt();
       int c=0;
       int arr[]={2,4,6};

       try
       {
        c=a/b;
        System.out.println("Result : "+c);
        System.out.println(arr[3]);
       }
       catch(ArithmeticException e)
       {
         System.out.println("can't divide by zero..");
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
        System.out.println("Here Out of limit.."+arr[arr.length]);
       }
    //    catch (Exception e)
    //    {
    //     System.out.println("Somthing went wrong.."+e);
    //    }
    }
}
