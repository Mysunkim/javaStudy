import java.util.Scanner;
public class scannerex {
    public static void main(String[] args) throws Exception {
        
        String[] oriId = {"joonas","baekjoon"};
        String inputId;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id");
        inputId = sc.next();

        //배열의 각 요소와 inputId를 비교
        for(String id : oriId){
            if(inputId.equals(id)){
                found = true;
            } 
        }

        if(found){
            System.out.println(inputId + "!?!");
        } else {
            System.out.println("new id!");
        }
    }
    
}
