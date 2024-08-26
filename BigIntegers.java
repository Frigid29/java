import java.math.*;
public class BigIntegers {
    public static void main(String[] args) {
        int a=56;
        BigInteger A= BigInteger.valueOf(a);
        //string
        BigInteger B=new BigInteger("123213213211564798461987984634345");
        BigInteger D=new BigInteger("354984694897984844654986354649845");
        //constants
        BigInteger c= BigInteger.TEN;
        //addition 
        BigInteger sum= B.add(D);
        System.out.println("addition: "+ sum);
        //multiply
        BigInteger m= B.multiply(D);
        System.out.println("product: "+m);
        //subtract
        BigInteger sub= B.subtract(D);
        System.out.println("Subtraction: "+sub);
        //divide
        BigInteger div= D.divide(B);
        System.out.println("Division: "+div);
        //remainder
        BigInteger rem= D.remainder(B);
        System.out.println("Reminder: "+rem);

        //compare 
        if(B.compareTo(D)<0){
            System.out.println("B is smaller than D");
        }else{
            System.out.println("B is greater than D");
        }

        System.out.println(fact(4567));
    }

    public static BigInteger fact(int num){
        BigInteger result = new  BigInteger("1");
        for(int i=2;i<=num;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;

    }
}
