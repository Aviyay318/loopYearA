import java.util.Scanner;

public class Ex15 {
//    כתבו תוכנית הקולטת מהמשתמש מספר שלם lines,
//    ואז מדפיסה lines שורות,
//    כאשר בכל שורה יש lines מופעים של הערך lines.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                System.out.print(lines);
            }
            System.out.println();
        }
    }
}
