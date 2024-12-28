import java.util.Scanner;
//연도일때 윤년이면 1 아니면 0출력하는프로그램작성
//윤년 => 4의 배수이면서 100의배수가 아닐때 또는 400의 배수일때
public class comparedex03 {
            public static void main(String[] args) throws Exception {
        
            int inputyear;

            Scanner sc = new Scanner(System.in);
            System.out.println("Input inputyear");
            inputyear = sc.nextInt();

            if(((inputyear%4 == 0) && (!(inputyear % 100 == 0))) || (inputyear%400 == 0)){
                System.out.println("1");
            } else {
                System.out.println("0");
            }


    }
}
