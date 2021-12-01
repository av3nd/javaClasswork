import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal, time and amount");
        float p = sc.nextFloat();
        float t = sc.nextFloat();
        float r = sc.nextFloat();

        float result = SI(p,t,r);

        System.out.println("Simple interest is : " + result);
    }

    public static float SI(float principal, float time, float amount){
        float Simple_Interest = (principal*time*amount)/100;
        return Simple_Interest;
    }
}
