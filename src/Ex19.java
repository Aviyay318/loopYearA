import java.util.Scanner;

public class Ex19 {
//    יש לכתוב תוכנית הקולטת מהמשתמש (2 מספרים)מספר ו מספר
//    תלת ספרתי ומדפיסה את המספר הראשון שמתחלק ב9 ,
//    ומדפיסה את המספרים שמתחלקים ב4 אבל
//    מדלגת על מספרים שמתחלקים גם ב4 וגם ב3

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 ;
        int num2;

        System.out.println("please enter a number");
        num1 = scanner.nextInt();

        do {
            System.out.println("please enter number with 3 digits");
            num2 = scanner.nextInt();
        }while (num2<100 || num2>999);


        boolean isFound = false;

     //   if (isFound){} // if(isFound==true)
    //   if (!isFound){} // if(isFound==false)


        for (int i = num1 ; i<num2 ;i++){
            if (i%9==0 && isFound==false){ //המספר הראשון שמתחלק ב9
                System.out.println(i);
                isFound = true;
            }
            if (i%4==0 && i%3!=0){
                System.out.println(i); //מתחלק ב4 ולא מתחלק ב3
            }

        }
    }
}
