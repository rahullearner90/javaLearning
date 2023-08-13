import java.util.*;
class Demo1{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(8);
        al.add(5);
        System.out.println(al);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(8);
        list.add(6);
        list.add(5);
        System.out.println(list);
        
        for(Object o : list){
            System.out.println(o);
        }

        System.out.println("List1 : ");
        al.forEach(i->System.out.println(i));
        System.out.println("List2 : ");
        list.forEach(i->System.out.println(i));

        List<Integer> list2=Arrays.asList(2,4,5,7,9,8,6,3,1);
        System.out.println("List3 : ");
        list2.forEach(i->System.out.println(i));
        int x=list2.get(2);
        System.out.println("Value of index 2 : "+x);
    }
}