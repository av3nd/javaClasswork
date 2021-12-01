import java.util.Scanner;

public class AddThreeNumber {
    public static void main(String[] args){
        takeInput();
        subtractNumbers(7,2,3);

    }

    public static void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers");
        int hello = sc.nextInt();
        int hy = sc.nextInt();
        int bye = sc.nextInt();
        int value = addNumbers(hello,hy,bye);
        System.out.println("The sum of three numbers is: "+ value);
    }

    public static int addNumbers(int first, int second, int third){
       int result = first+second+third;
       return result;
    }

    public static void subtractNumbers(int first, int second, int third){
       int result = first-second-third;
        System.out.println("The subtract of three numbers is: "+ result);
    }
}
