public class Debugging {

    public static void main(String[] args) {
        System.out.println("iniciou o main");
        a();
        System.out.println("finalizou o main");
    }

    static void a(){
        System.out.println("iniciou o a");
        b();
        System.out.println("finalizou o a");
    }

    static void b(){
        System.out.println("iniciou o b");
        c();
        System.out.println("finalizou o b");
    }

    static void c(){
        System.out.println("iniciou o c");
        d();
        System.out.println("finalizou o c");
    }

    static void d(){
        System.out.println("iniciou o d");
        Thread.dumpStack();
        System.out.println("finalizou o d");
    }

}
