public class StringBldr {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("tony");
        System.out.println(str);
        str.append(" stark");
        System.out.println(str);
        StringBuilder str2=new StringBuilder("tony");
        System.out.println(str2);
        str2.append(" stark");
        System.out.println(str2);
    }
}
