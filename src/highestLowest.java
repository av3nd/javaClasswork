import java.util.Scanner;

public class highestLowest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int firstnum = sc.nextInt();
        int secondnum = sc.nextInt();

    }
    public static void algo(int first, int second){
        if (first>second){
            System.out.println("first is greater");
        }
        else{
            System.out.println("second is greatest");
        }
    }
}
