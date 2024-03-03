public class Operator {
    public static void main(String[] args) {

        //relational operators
        System.out.println("Relational Operators: ");
        int  x = 10;
        int  y = 15;
        System.out.println("x = "+x+", y = "+y);
        System.out.println("x>y : " + (x > y));  
        System.out.println("x<y : " + (x < y));  
        System.out.println("x>=y: " + (x >= y));  
        System.out.println("x<=y: " + (x <= y));  
        System.out.println();  
        
        //logical operators
        System.out.println("Logical Operators: ");
        boolean t= true;
        boolean f= false;
        System.out.println("t = "+ t+" ,f = "+f);
        System.out.println("t && f : " + (t && f));   //AND operator
        System.out.println("t || f : " + (t || f));   //OR operator
        System.out.println("!t = "+ (!t));             //NOT operator
        System.out.println();

        //arithmetic operators
        System.out.println( "Arithmetic Operators: " );
        int a=7;
        int b=5;
        System.out.println("a = "+ a + ",b = " + b);
        System.out.println("a+b = " + (a+b));      //addition
        System.out.println("a-b = " + (a-b));      //subtraction
        System.out.println("a*b = " + (a*b));      //multiplication
        System.out.println("a/b = " + (a/b));      //division
        System.out.println("a%b = " + (a%b));      //modulus
        System.out.println();
        
        //unary operators
        System.out.println("Unary Operators: ");
        int u=9;
        System.out.println("u = "+ u);
        System.out.println("Pre-increment\n++u = "  + ++u);
        System.out.println("post-increment\nu++ = " + u++);
        System.out.println("\nPre-decrement\n--u = " + --u);
        System.out.println("Post-decrement\nu-- = "  + u--);
        System.out.println();

        //ternary operator
        System.out.println("Ternary Operator: ");
        int speed=60;
        String condition= speed<40 ? "Normal Speed" : "Over-Speed";
        System.out.println(speed + "\t"+condition);
        System.out.println();

        //Assignment operator
        System.out.println("Assignment Operator: ");
        int p=4;
        System.out.println("p = "+ p);
        System.out.println("p +=2: " + (p += 2));    //Add and assign
        System.out.println("p -=3: " + (p -= 3));    //Subtract and assign
        System.out.println("p *=4: " + (p *=  4));    //Multiply and assign
        System.out.println("p /=2: " + (p /= 2) );   //Divide and assign
        System.out.println("p %=3: " + (p %= 3 ));   //Modulo and assign
        System.out.println();
    }
}
