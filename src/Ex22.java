import java.util.Scanner;

public class Ex22 {
    // משולש הפוך עולה
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter a number");
    int number = scanner.nextInt();

    for (int i = 1; i <=number ; i++) {
        for (int j = 1; j <=i ; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}



//     for (int i = 0 ,j=10; i < 10 ; i++,j--) {
//        System.out.println(i + " , " + j);
//    }
}
