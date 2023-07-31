public class InhancedLoop {
    public static void main(String[] args) {
        // method one
        int arr1[]={4,2,3};
        for(int a:arr1){
            System.out.println(a);
        }
        // method two
        int arr[][]={
            {2,1,4,6},
            {9,7,6,5},
            {8,2,7,3}
        };

        for(int a[]:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    } 
}
