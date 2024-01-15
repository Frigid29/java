public class overloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        int a= 7,b=8,c=9;
        float d=2.3f,e=5.4f;
        System.out.println(sum(a,b));
        System.out.println(sum(d,e));
        System.out.println(sum(a,b,c));
    }
}
