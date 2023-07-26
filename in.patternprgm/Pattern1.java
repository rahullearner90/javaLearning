// package in.patternprgm;

public class Pattern1 {
    public static void main(String[] args) {

  // Pattern like O
        // // Row
        // int n=6;
        // // collumn
        // int m=6;
        // // outer loop
        // for(int i=1; i<=n; i++){
        //     // inner Loop
        //     for(int j=1; j<=m; j++){
        //         if(i==1 || j==1 || i==n || j==m){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // example pattern like A

        // // Row
        // int n=5;
        // int s=n/2;
        // // collumn
        // int m=5;
        // // outer loop
        // for(int i=1; i<=n; i++){
        //     // inner Loop
        //     for(int j=1; j<=m; j++){
        //         if(i==1 || j==1 || i==s+1 || j==m){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

    //  Pattern like H
       // Row
        int n=5;
        int s=n/2;
        // collumn
        int m=5;
        // outer loop
        for(int i=1; i<=n; i++){
            // inner Loop
            for(int j=1; j<=m; j++){
                if( j==1 || i==s+1 || j==m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
