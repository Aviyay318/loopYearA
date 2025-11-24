import java.util.Scanner;

public class Ex18 {

//    יש לכתוב תוכנית הקולטת מהמשתמש להכניס מספר דו ספרתי –
//    אם הוא לא הכניס דו ספרתי יש לבקש שוב
//    לאחר מכן תדפיס בלולאה את כל המספרים עד אליו אבל תדלג
//    על מספרים שמכילים את הספרה 5

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("please enter number between 10 - 100");
            number = scanner.nextInt();
        }while (number<10 || number>99);

        for (int i=1 ;i <=number ; i++){
            if (i%10==5 || i/10==5){
                continue;
            }
            System.out.println(i);
        }

    }
}
