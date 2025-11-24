import java.util.Scanner;

public class Ex20 {

//    תוכנית קלט 10 מספרים, עם תנאים בלולאת for
//    בכל איטרציה:
//    אם המשתמש כתב מספר שלילי דלג
//    אם כתב 999  עצור את הלולאה
//    אם כתב מספר רגיל יש לסכום
//    ולהדפיס את הסכום בסיום ואת כמות המספרים שנקלטו


    public static void main(String[] args) {
        final int ERROR =999;
        Scanner scanner = new Scanner(System.in);
         int sum = 0;
         int count =0 ;
        for (int i = 0; i <10 ; i++) {
            System.out.println("please enter a number");
            int number = scanner.nextInt();
            if (number<0){
               continue;
            } else if (number==ERROR) {
                break;
            }
            sum = sum + number;
            count++;
        }

        System.out.println("sum of: " + sum + " count of: " + count);
    }
}
