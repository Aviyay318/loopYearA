import java.util.Scanner;

public class Ex16 {
//
//    קלט מספר חיובי בלבד
//    כתוב תוכנית שקולטת מהמשתמש מספר אם המספר שלילי או אפס התוכנית תבקש מהמשתמש
//    שיכניס שוב עד שיכניס מספר חיובי ואז תדפיס את המספר.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter a positive number");
            number = scanner.nextInt();

        }while (number<=0);

        System.out.println(number);
    }
}
