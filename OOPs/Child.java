public class Child extends INheritance {
    public static void main(String[] args) {
        INheritance cat = new INheritance();
        cat.a=5;
        Child x= new Child();
        x.a+= 10;
        System.out.println(cat.b);
        System.out.println(x.a);
        System.out.println(x.getClass().getName());
    }
}
