import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int esleme = 1;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    esleme = esleme * j;
                }
            }
            if (esleme==i) {
                System.out.print(i+", ");
            }
        }
    }
}