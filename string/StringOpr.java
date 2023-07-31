public class StringOpr {
    public static void main(String[] args) {
        String str="rahul kumar ram";
        String ustr=str.toUpperCase();
        System.out.println(ustr);
        System.out.println(ustr.toLowerCase());
        System.out.println(ustr.length());
        // System.out.println(ustr.codePointAt(0));
        System.out.println(ustr.charAt(2));
        System.out.println(ustr.substring(6,11));
        System.out.println(ustr.indexOf("r"));
    }
}
