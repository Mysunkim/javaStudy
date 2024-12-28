public class method {
    
    String name;

    //생성자 메서드
    method(){
        name = "Mskim";
        System.out.println("생성자 메서드 :" + name);
    }

    //인자가 없는 메서드
    void printName(){
        System.out.println("인자가없는 메서드 :" +name);
    }

    //인자가 하나인 메서드(메서드 오버로딩), 인자 값이 출력됨
    void printName(String name){
        System.out.println("오버로딩메소드 :" +name);
    }

    //가변인자 사용한 메서드
    void printNames(String... name){
        System.out.println("가변인자 : " +name);
        for(String s : name){
            System.out.println(s);
        }
    }

    //인자가 두개인 메소드
    int calc(int num1,int num2){
        return num1 + num2;
    }
    public static void main(String[] args) throws Exception {
        method m = new method();
        m.printName();
        m.printName("lee");
        System.out.println(m.calc(3,4));
    }

}
