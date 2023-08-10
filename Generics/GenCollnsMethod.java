import java.util.*;

public class GenCollnsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(14);
        list1.add(11);
        list1.add(10);
        list1.add(18);
        list1.add(8);
        list1.add(4);
        list1.add(6);
      System.out.println(list1);  
        Collections.sort(list1);
      System.out.println(list1);

        ArrayList<String> list2=new ArrayList<String>();
        list2.add("Rahul");
        list2.add("Apple");
        list2.add("Orange");
        list2.add("Banana");
        list2.add("Pearse");
       System.out.println(list2);
        Collections.sort(list2);
       System.out.println(list2);

       ArrayList<Integer> list3=new ArrayList<Integer>();
        list3.add(14);
        list3.add(11);
        list3.add(10);
        list3.add(10);
       int a=Collections.frequency(list3, 10) ;
       System.out.println("Frequecy : "+a);

       int b= Collections.binarySearch(list1, 11);
       System.out.println("Index : "+b);

       int c=Collections.max(list3);
       System.out.println("Maximum : "+ c);

       System.out.println("List3 : "+list3);
       Collections.reverse(list3);
       System.out.println(list3);

       Collections.rotate(list3, 2);
       System.out.println(list3);

    

    }
}
