import java.util.InputMismatchException;
import java.util.Scanner;

public class Lounch4 {
    public static void main(String[] args) {
        int a=0;
        try(Scanner sc=new Scanner(System.in);)
        {
            System.out.println("Enter Your Number..");   
            a=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter Numbers Only..");
        }
        catch(Exception e)
        {
            System.out.println("Somthing went wrong..");
        }

        System.out.println("Your Number is : "+a);
    }
}
