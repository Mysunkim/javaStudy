public class variable02 {
    //클래스의 인스턴스를 생성하여 접근
    int num = 11;
    String letter = "abcde";

    public static void main(String[] args) throws Exception {
        variable02 var02 = new variable02();
        System.out.println(var02.letter + "," + var02.num);
    }
}
