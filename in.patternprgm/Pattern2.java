import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Row 
        System.out.println("Enter Row for Pattern");
        int m=sc.nextInt();
        // Collumn
        System.out.println("Enter Collumn for Pattern");
        int n=sc.nextInt();
        // Outer loop
        for(int i=1; i<=m; i++){
            // Inner loop
            for(int j=1; j<=n; j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
