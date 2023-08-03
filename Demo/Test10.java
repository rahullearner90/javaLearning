public class Test10 {
    static String remove(String str){
        String str1=" ";
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')){
                str1 = (str1+ch);
            }
        }
        return str1;
    }
    public static void main(String[] args) {
    //    String rs=Test10.remove("Hello, have a good day");
       String rs=remove("Hello, have a good day");
       System.out.println(rs);
    }
}
