import java.util.Scanner;

public class Ex4 {
//    תרגיל 4:
//    כתבו תוכנית הקולטת מהמשתמש חמישה מספרים שלמים,
//    ולאחר מכן מדפיסה כמה מבין אותם מספרים הם גדולים מ-10.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("please enter integer number");
            int number = scanner.nextInt();
            if (number>10){
                count++;
            }
        }
        System.out.println(count);
    }
}
