import java.util.Scanner;

public class EX {
    public static void main(String[] args) {
        int number = 16;
        double s = Math.sqrt(number); //שורש
        double x = Math.pow(2,5);//חזקה
        int y = Math.abs(-4); //ערך מוחלט
        System.out.println(Math.sqrt(number));
        Scanner scanner =new Scanner(System.in);

        for (int i=0; i<5;i++){
            int num = scanner.nextInt();;
            if (num<0){
                System.out.println("error");
                break; // מסיים את הלולאה
            }
            if (num>100){
                continue; //מדלג על איטרציה
            }
            System.out.println(num);
        }
    }
}
