import java.util.Scanner;
//좌표를 입력받아서 (x,y)가 어느 사분면에있는지 알아내기기
public class comparedex04 {
                public static void main(String[] args) throws Exception {
        
            int x,y;

            Scanner sc = new Scanner(System.in);
            System.out.println("Input inputyear");
            x = sc.nextInt();
            y = sc.nextInt();

            //1사분면 x양수,y양수
            if((x > 0) && (y >0)){
                System.out.println("1sq");
            }
            //2사분면 x음수,y양수
            else if((x < 0) && (y > 0)){
                System.out.println("2sq");
            } 
            //3사분면 x음수,y음수
            else if((x < 0) && (y < 0)){
                System.out.println("3sq");
            }
            //4사분면 x양수,y음수
            else if((x > 0) && (y < 0)){
                System.out.println("4sq");
            }


    }
}
