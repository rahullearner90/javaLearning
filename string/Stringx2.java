public class Stringx2 {
    public static void main(String[] args) {
        String s1="rahul";
        
        String s2=new String("rahul");

        // it is comparing reference of the value
        System.out.println(s1==s2);//output:false

        // it is comparing value of the String
        System.out.println(s1.equals(s2));//output:true
    }
}
