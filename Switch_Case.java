public class Switch_Case {
    public static void main(String[] args) {
        char ch='A';
        ch=Character.toLowerCase(ch);
        switch (ch) {
            case 'a':
                System.out.println(ch + " is vowel");
                break;
            case 'e': //fall through
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
                break;
        }
    }
}
