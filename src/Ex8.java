import java.util.Scanner;

public class Ex8 {
//    תרגיל 8:
//    כתבו תוכנית הקולטת מהמשתמש מספרים שלמים
//    עד אשר הוקלדו בדיוק חמישה מספרים זוגיים.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;

    while (count<5){
        System.out.println("please enter a number");
        int number = scanner.nextInt();
        if (number%2==0){
            count++;
        }
    }
}

}
