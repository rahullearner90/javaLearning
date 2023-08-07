import java.util.InputMismatchException;
import java.util.Scanner;

public class Lounch3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num :");
        
        try {
            int x=sc.nextInt();
            System.out.println(x);
        } 
        catch (InputMismatchException e) {
            System.out.println("Enter Number Only..");
            // System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Somthing went wrong..");
        }
        finally
        {
            sc.close();
        }
    }
}
