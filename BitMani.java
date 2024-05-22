public class BitMani {
    public static void main(String arg[]){

        int n=8;// bin=1000

        //find the ith bit of a no
        int i=5;
        int mask=1<<i-1;
        //logic=n&mask 11001
        System.out.println((n & mask));
        

        //set the ith term => to make that term 1
        int j=2;
        int mask2= 1<<j-1;
        //logic= n|mask
        System.out.println((n|mask2));


        //reset the ith term => to make that term 0
        int k=4;
        int mask3=~(1<<k-1);
        //logic= n&mask
        System.out.println(n & mask3);
    }
    /*
    public static int bin(int n){
        int binaryno=00;
        for(int i=n;i>0;i=i/2){
            binaryno= binaryno*10 + i%2;
        }
        return binaryno;
    }
    */
}
