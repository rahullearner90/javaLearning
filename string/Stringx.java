class Stringx{
    public static void main(String args[]){
        String name="Rahul";
        String name3="Rahul";
        System.out.println(name);
        System.out.println(name3+"After this");
        String s1 = new String("Rahul");
        String s2 = new String("Rahul");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(name.concat(" Ram"));
    //    String name1 = name.concat(" kumar");
    //     System.out.println(name1);
    StringBuilder name2 = new StringBuilder("Guddu");
    System.out.println(name2.append(" kumar Ram"));

    }
}