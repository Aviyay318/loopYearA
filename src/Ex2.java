import java.util.Scanner;

public class Ex2 {
//    תרגיל 2:
//    כתבו תוכנית המדפיסה את כל המספרים הטבעיים מ-0 ועד limit,
//    כאשר limit הוא מספר שנקלט מהמשתמש.
//    אם limit אינו מספר חיובי יש להדפיס הודעת שגיאה מתאימה.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter positive number");
        int limit = scanner.nextInt();
        if (limit<0){
            System.out.println("error");
        }else {
            for (int i=0; i<limit;i++){
                System.out.println(i);
            }
        }
    }
}
