import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


class Demo1{
    public static void main(String args[]){
        ArrayList ar=new ArrayList();
        ar.add(100);
        ar.add(150);
        ar.add(25);
        ar.add(175);
        ar.add(125);
        ar.add(50);

//     //   for loop  // 
//     for(int i=0; i<ar.size();i++){
//         // Object o=ar.get(i);
//         // System.out.println(o); 
//         System.out.println(ar.get(i));
//     }
// System.out.println("....................");

//     // for each loop //
//     for (Object e : ar) {
//         System.out.println(e);
//     };

    Iterator itr=ar.iterator();
    while(itr.hasNext()){
        int value=(Integer)itr.next();
        System.out.println(value);
    }

    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,");

    ListIterator litr=ar.listIterator(ar.size());
    while(litr.hasPrevious()){
        System.out.println(litr.previous());
    }



    }
}