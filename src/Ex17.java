import java.util.Scanner;

public class Ex17 {
//    בקשת מספר בין 1 ל־100
//    כתוב תוכנית הקולטת מהמשתמש מספר אם הקלט לא בטווח התוכנית
//    תבקש מהמשתמש שיכניס שוב עד שיכניס מספר בטווח ואז תדפיס את המספר.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter a number 1 - 100");
            number = scanner.nextInt();

        }while (number<1 || number>100);

        System.out.println(number);
    }
}
