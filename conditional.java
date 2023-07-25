import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = sc.nextInt();
        if(age>=18 && age<=60){
            System.out.println("you are eligible to vote");
            if(age<=30){
                System.out.println("you are young man");
            }
        }else if (age<18) {
            if(age<=14){
                System.out.println("you are in tin age");
            }
        }else{
            System.out.println("you are in category of senior citizen");
        }
    }
}
