import java.util.Scanner;

class Lounch1{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
       System.out.println("Enter num1 :");
       int a=sc.nextInt();
       System.out.println("Enter num2 :");
       int b=sc.nextInt();
       int c=0;
       try {
           c=a/b;
           System.out.println("Result : "+c);
       } catch (Exception e) {
        System.out.println("Somthing went wrong.."+e);
       }
    }
}