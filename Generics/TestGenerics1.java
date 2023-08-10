import java.util.ArrayList;

class TestGenerics1{
    public static void main(String args[]){
        // Type Safety....
        String arr[]=new String[5];
        arr[0]="Rahul";
        arr[1]="Ram";
        // arr[2]=23;

        // No Safety 
        ArrayList ar=new ArrayList();
        ar.add(0, 12);
        ar.add(1,"Rahul");

        // Safety  
        ArrayList<String> a=new ArrayList<String>();
        a.add("Hello");
        // a.add(12);

        System.out.println(a+" "+ar);
        for (String elem : arr) {
            System.out.println(elem);
        }
    }
}