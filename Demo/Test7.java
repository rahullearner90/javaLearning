import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Capital of india ?:");
        String s1=sc.nextLine();
        String s2="new helhi";
        if(s1.equals(s2)){
            System.out.println("Right");
        }else{
            System.out.println("Wrong");
        }
    }
}
