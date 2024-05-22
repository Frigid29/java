class OddEven
{
    public static void main(String[] args) {
        int num = 67;
        System.out.println(isOdd(num));
    }

    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}