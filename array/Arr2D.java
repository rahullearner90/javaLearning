public class Arr2D {
    public static void main(String[] args) {
        // method one
        int arr[][]={
            {2,1,4,6},
            {9,7,6,5},
            {8,2,7,3}
        };
        for(int i=0;i<=2;i++){
            for(int j=0;j<=3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // jagged array
        int arr3[][]={
            {2,1,4,6},
            {9,7,},
            {8,2,7,3}
        };

        for(int i=0;i<=2;i++){
            for(int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

        //method two
        int arr2[][]=new int[2][3];
        arr2[0][0]=2;
        arr2[0][1]=1;
        arr2[0][2]=4;
        arr2[1][0]=5;
        arr2[1][1]=6;
        arr2[1][2]=8;
        
        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++){
                System.out.print(" "+arr2[i][j]);
            }
            System.out.println();
        }
            
    }
}
