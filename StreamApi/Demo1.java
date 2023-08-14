import java.util.*;
import java.util.stream.Stream;
class Demo1{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,5,4,6,9,8,7);

        Stream streamdata=list.stream();

        long x=streamdata.count();
        System.out.println("Count is : "+x);

        // streamdata.forEach(i->System.out.println(i));

    }
}