import java.util.Scanner;
public class allcal {
    
    public static void main(String[] args) throws Exception {
        
        int num1, num2, sum,min,multi ;
        float divid , tmp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num1");
        num1 = sc.nextInt();

        System.out.println("Input num2");
        num2 = sc.nextInt();

        sum = num1 + num2;
        min = num1 - num2;
        multi = num1 * num2;
        divid = num1 / num2;
        tmp = num1 % num2;
        System.out.println("sum : " + sum);
        System.out.println("min : " + min);
        System.out.println("multi : " + multi);
        System.out.println("divid : " + divid);
        System.out.println("tmp : " + tmp);

    }

}
