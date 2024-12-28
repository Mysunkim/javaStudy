import java.util.Scanner;

public class calex02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num1,num2,calt,calt2,calt3,total;
        System.out.println("input num1");
        num1 = sc.nextInt();

         System.out.println("input num2");
         num2 = sc.nextInt();

        calt = num1 *((num2%100)%10);
        calt2 = num1 *((num2%100)/10);
        calt3 = num1*(num2/100);
        total = calt + (calt2*10 )+ (calt3*100);
        System.out.println(calt);
        System.out.println(calt2);
        System.out.println(calt3);
        System.out.println(total);




    }
    
}
