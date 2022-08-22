public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i = i + 1) {
            int v;
            if (i % 3 == 0)
                v = 9;
            else
                v = 7;

            System.out.println(v);
        }
    }
}