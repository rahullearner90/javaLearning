import java.util.ArrayDeque;

class DemoDq{
    public static void main(String args[]){
        
        ArrayDeque list=new ArrayDeque();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
       System.out.println(list);

       list.addFirst("hello");
       list.addLast("bro");
       System.out.println(list);

       ArrayDeque ad=new ArrayDeque<>(list);
       System.out.println(ad);
       ad.add("Tony stark");
       ad.add("iron man");
       System.out.println(ad);
    }
}