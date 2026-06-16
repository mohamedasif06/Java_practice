public class Swapping{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = b+a;
        b = a-b;
        a = a-b;
        System.err.println("a = "+a+" b = "+b);
    }
}
