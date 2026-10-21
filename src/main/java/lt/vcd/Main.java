package lt.vcd;

public class Main {
    static void main() {
        for (int i = 10; i <= 99; i++) {
                if ((i % 10 * 10 + i / 10) - i == 36) {
                    if ((i % 10) / (i / 10) == 2 && (i % 10) % (i / 10) == 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
