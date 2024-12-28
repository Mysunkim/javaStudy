
import java.util.Scanner;
//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
public class comparedex {
        public static void main(String[] args) throws Exception {
        
            int a, b;

            Scanner sc = new Scanner(System.in);
            System.out.println("Input num1");
            a = sc.nextInt();
            System.out.println("Input num2");
            b = sc.nextInt();

            if(a>b){
                System.out.println(">");
            } else if(a == b){
                System.out.println("=");
            } else {
                System.out.println("<");
            }
    }
}
