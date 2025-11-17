import java.util.Scanner;

public class Ex3 {
//    תרגיל 3:
//    כתבו תוכנית המדפיסה את כל המספרים הטבעיים מ-start ועד end,
//    כאשר start הוא מספר שלם כלשהו שנקלט מהמשתמש ו-end הוא
//    מספר שלם כלשהו שנקלט מהמשתמש.
//    אם end אינו גדול מ-start, יש להדפיס הודעת שגיאה מתאימה.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter two numbers : start (bigger then end) , and end");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if (start>end){
            System.out.println("wrong ...start (bigger then end) , and end");
        }else {
            for (int i = start; i < end ; i++) {
                System.out.println(i);
            }
        }
    }
}
