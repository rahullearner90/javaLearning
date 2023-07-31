public class  Demo1 {
    static int a;
    static{
        a=10;
        System.out.println("Static area");
        System.out.println(a);
    };
    public static void main(String[] args) {
        System.out.println("Main Method Area");
        System.out.println(a);
    }
}