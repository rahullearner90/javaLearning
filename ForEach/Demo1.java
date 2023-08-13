import java.util.ArrayList;
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

        al.forEach(i->System.out.println(i));
        list.forEach(i->System.out.println(i));
    }
}