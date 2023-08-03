class Operator{
    public static void main(String[] args) {
        // increament and decreament operator

        int a=5;
        a++;
        a--;
        int b=6;
        int c= a++ + ++a + a-- + --a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // assingment operator
        a=2;
        System.out.println(a);
        // cumpoud assignment operator
        a+=2;
        System.out.println(a);
        a-=2;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a=9;
        a%=2;
        System.out.println(a);

        // relational operator
        System.out.println("Relational operator.........");
        a=5;
        b=10;
        c=5;
        boolean result = a==b;
        System.out.println(result);
        result= a>b;
        System.out.println(result);
        result= a<b;
        System.out.println(result);
        result= a>=b;
        System.out.println(result);
        result= a<=b;
        System.out.println(result);
        result= a==c;
        System.out.println(result);
        result= a>=c;
        System.out.println(result);
        result= a<=c;
        System.out.println(result);
        result= a!=b;
        System.out.println(result);

        a=10;
        b=20;
        c=30;
        // and operator
        System.out.println("Logicall operator");
        System.out.println(a<b && b<c);
        System.out.println(a<b && a>b);
        System.out.println(a==b && a>b);
        // or operator
        System.out.println(a<b || b<c);
        System.out.println(a<b || a>b);
        System.out.println(a==b || a>b);
        // not operator
        System.out.println(!(a<b && b<c));
        System.out.println(!(a<b && a>b));
        System.out.println(!(a==b && a>b));

    }
}