import java.util.Scanner;

class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int m=sc.nextInt();
        System.out.print("Enter Colls : ");
        int n=sc.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || i==1 || i==m || j==n || i==j || i+j==m+1 || i+j==(m/2)+1 || j-i==m/2 || i-j==m/2 || i+j==(m+n/2)+1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        };
    }
}