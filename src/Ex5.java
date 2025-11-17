import java.util.Random;
import java.util.Scanner;

public class Ex5 {
//    תרגיל 4:
//    כתבו תוכנית הקולטת מהמשתמש חמישה מספרים שלמים,
//    ולאחר מכן מדפיסה כמה מבין אותם מספרים הם גדולים מ-10.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("enter min");
    int min = scanner.nextInt();
    System.out.println("enter max");
    int max = scanner.nextInt();
    int count = 0;
    System.out.println("random numbers : ");
    for (int i = 0; i < 5; i++) {
        int number = random.nextInt(min , max);
        if (i<4){
            System.out.print(number + ", ");
        }else {
            System.out.println(number);
        }
        if (number>10){
            count++;
        }
    }
    System.out.println();
    System.out.print("the count of ... than 10: " + count);
}
}
