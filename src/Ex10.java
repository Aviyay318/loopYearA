import java.util.Scanner;

public class Ex10 {
//    תרגיל 10:
//    כתבו תוכנית הקולטת מהמשתמש מספרים עשרוניים עד אשר
//    הוקלדו בדיוק חמישה מספרים שלמים

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count<5){
            System.out.println("enter a number");
            double number = scanner.nextDouble();
            if (number%1==0){
                count++;
            }
        }
    }
}
