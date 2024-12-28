import java.util.Scanner;
public class calex {
   //(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
   //(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
   
   public static void main(String[] args) throws Exception {
        
    int a,b,c;
    double total1,total2,total3,total4;

    Scanner sc = new Scanner(System.in);
    System.out.println("Input a");
    a = sc.nextInt();

    System.out.println("Input b");
    b = sc.nextInt();

    System.out.println("Input c");
    c = sc.nextInt();

    total1 = (a+b)%c;
    total2 = ((a%c) + (b%c))%c;
    total3 = (a*b)%c;
    total4 = ((a%c)*(b%c))%c;

    System.out.println(total1 + "!" + total2 +"!"+total3+"!" + total4);

    }

}
