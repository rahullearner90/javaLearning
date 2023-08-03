import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Row 
        System.out.println("Enter Row for Pattern");
        int m=sc.nextInt();
        // Collumn
        System.out.println("Enter Collumn for Pattern");
        int n=sc.nextInt();
        // Outer Loop
        for(int i=1; i<=m; i++){
            // Inner Loop
            for(int j=1; j<=n; j++){
                if(i==j || (i+j)==m || i==1 || j==1 || i==n || j==m || (i+j)==(n/2) || (i-j)==(n/2) || (j-i)==(n/2) || (i+j)==n+(n/2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            } 
            // Space between pattern
            System.out.print(" ");         
            // Inner Loop
            for(int j=1; j<=n; j++){
                if((i+j)==(n/2) || (i-j)==(n/2) || (j-i)==(n/2) || (i+j)==n+(n/2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }          
            // sopace between pattern
            System.out.print(" ");
            // Inner Loop
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==m || j==m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }          
            // sopace between pattern
            System.out.print(" ");
            // Inner Loop
            for(int j=1; j<=n; j++){
                if(i==j || i+j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }          
            System.out.println();
        }
    }
}
