import java.util.*;
import java.util.stream.Stream;
public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(4,3,5,4,1,6,9,8,7);
        System.out.println(list);

        // Stream<Integer> streamlist=list.stream();
        // Stream<Integer> filters=streamlist.filter(i->i%2==0);
        // Stream<Integer> maped=filters.map(i->i*2);
        // Stream<Integer> sort=maped.sorted();
        // sort.forEach(n->System.out.println(n));

        // Method2
        Stream<Integer> streamdata=list.stream();
        Stream<Integer> sortedlist=streamdata.sorted();
        sortedlist.forEach(i->System.out.println(i));
        

    }
}
