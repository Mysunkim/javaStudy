import java.util.Scanner;

public class minus {
    public static void main(String[] args) throws Exception {
        
        int num1, num2 , total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num1");
        num1 = sc.nextInt();

        System.out.println("Input num2");
        num2 = sc.nextInt();

        total = num1 - num2;
        System.out.println(total);

    }
}
