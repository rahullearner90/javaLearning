public class Test3 {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("Rahul");
        s1.append(" kumar");
        System.out.println(s1);
        s1.setCharAt(0, 'A');
        System.out.println(s1);
    }
}
