package cn.mianzhou;

public class Ceshi {
    public static void main(String[] args) {
//        String aa = "mianzhou";
//        System.out.println(aa);
//
        A c1 = new A();
//        a.say();
        System.out.println(c1.hashCode());


        B d = new B();
        System.out.println(d.hashCode());
//        b.say();


        int a = 2;
        int b = 2;
        Integer c = 2;


        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        a = 3;
        System.out.println(a);
        System.out.println(System.identityHashCode(a));
        a = 2;

        System.out.println(System.identityHashCode(a));

        System.out.println(c.hashCode());
    }
}


class A {
    public void say() {
        System.out.println("hello");
    }
}

class B implements Mianzhou {
    @Override
    public void say() {
        System.out.println("youmianzhou");
    }
}