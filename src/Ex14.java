import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
