import java.math.BigDecimal;
public class BigDecimals {
    public static void main(String[] args) {
        double x=0.03;
        double y=0.02;
        System.out.println(x-y); //output-> 0.009999999999999998
        BigDecimal a = new BigDecimal("0.03");
        BigDecimal b = new BigDecimal("0.02");
        BigDecimal sub= a.subtract(b); //output-> 0.01
        System.out.println(sub);

        BigDecimal p=new BigDecimal("12134.165465265");
        System.out.println("p: "+p);
        BigDecimal q=new BigDecimal("4954654.16549646546");
        System.out.println("q: "+q);
        //addition
        BigDecimal sum=p.add(q);
        System.out.println("addition: "+sum);
        //subtraction
        BigDecimal diff=p.subtract(q);
        System.out.println("subtraction: "+diff);
        //multiply
        BigDecimal prod=p.multiply(q);
        System.out.println("product: "+prod);
        //division
        BigDecimal n1=new BigDecimal("12.34550");
        BigDecimal n2=new BigDecimal("10");
        BigDecimal quotient=n1.divide(n2);
        System.out.println("division: "+quotient);
        //power
        BigDecimal power=p.pow(2);
        System.out.println("power: "+power);

        //negative
        System.out.println("negate:" + p.negate());

        //constant
        BigDecimal con=BigDecimal.ONE;
        System.out.println("constant: "+ con);
    }
}
