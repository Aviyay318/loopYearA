import java.util.Scanner;

public class Ex7 {
//    תרגיל 7:
//    כתבו תוכנית הקולטת מהמשתמש מספר שלם count.
//    לאחר מכן, התוכנית תבקש מהמשתמש להכניס count
//    מספרים שלמים נוספים ותדפיס את הממוצע שלהם.
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int count;
    int sum = 0;

    System.out.println("please enter a number");
    count = scanner.nextInt();

    for (int i = 0; i < count; i++) {
        System.out.println("please enter a number");
        int number = scanner.nextInt();
        sum+=number; // sum = sum + number
    }
    double avg = (double) sum/count;
    System.out.println(avg);

}
}
