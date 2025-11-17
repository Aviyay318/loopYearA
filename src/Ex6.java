import java.util.Scanner;

public class Ex6 {
//    תרגיל 6:
//    כתבו תוכנית הקולטת מהמשתמש חמישה מספרים שלמים,
//    מכן מדפיסה כמה מבין אותם מספרים הם זוגיים.

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("please enter a int number");
            int number = scanner.nextInt();
            if (number%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
