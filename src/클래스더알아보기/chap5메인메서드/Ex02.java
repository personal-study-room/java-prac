package 클래스더알아보기.chap5메인메서드;

public class Ex02 {

//    javac 클래스더알아보기/chap5메인메서드/Ex02.java
//    java 클래스더알아보기/chap5메인메서드/Ex02 하나 둘 셋 넷 다섯
//    arg = 하나
//    arg = 둘
//    arg = 셋
//    arg = 넷
//    arg = 다섯
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
    }
}
