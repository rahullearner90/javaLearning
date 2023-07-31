class Arr1D{
    public static void main(String args[]){
        // if we know the size and value of the array
        // in this example memory allocation in stack memory
        int ar1[]={22,44,11,33,99};
        String names[]={"rahul","guddu","tony","stark","iron-man"};
        for(int i=0;i<=4;i++){
            System.out.println(ar1[i]);
            System.out.println(names[i]);
        }

        // if we don't know the size of the array
        // in this example memory allocation in heap memory
        int arr2[]=new int[5];
        // initialization
        arr2[0]=22;
        arr2[1]=44;
        arr2[2]=11;
        arr2[3]=33;
        arr2[4]=99;
        String names2[]=new String[5];
        names2[0]="rahul";
        names2[1]="guddu";
        names2[2]="tony";
        names2[3]="stark";
        names2[4]="iron-man";
        for(int i=0;i<=4;i++){
            System.out.println(arr2[i]);
            System.out.println(names2[i]);
        }

    }
}