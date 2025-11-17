import java.util.Scanner;

public class Ex9 {
//    תרגיל 9:
//    כתבו תוכנית הקולטת מהמשתמש מספרים עשרוניים,
//    עד אשר הוקלדו בדיוק שלושה מספרים דו-ספרתיים.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;

    while (count<3){
        System.out.println("enter a number");
        double number = scanner.nextDouble();
        if (number>9 && number<100){
            count++;
        }
    }
}

}
