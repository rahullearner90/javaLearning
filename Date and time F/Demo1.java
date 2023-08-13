import java.util.Date;
class Demo1{
    public static void main(String[] args) {
        Date d1=new Date();
        System.out.println(d1);

        long t=d1.getTime();
        System.out.println(t);
        // System.out.println(d1.getHours());
        
        java.sql.Date d2=new java.sql.Date(d1.getTime());
        System.out.println(d2);


    }
}