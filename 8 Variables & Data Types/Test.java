public class Test {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'c';
        short s = 512;
        int i = 1000;
        float f = 3.13f;
        double d = 99.9954;

        int $i = 16;

        System.out.println("Result: " + ((f * b) + (i % c) - (d * s)));
        System.out.println($i);
    }
}
