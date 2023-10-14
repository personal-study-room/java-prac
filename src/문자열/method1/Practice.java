package 문자열.method1;

public class Practice {
    public static void main(String[] args) {
        String str1 = "0부터3 5부터8 test";

        int int1 = str1.indexOf("3"); // 3
        int int2 = str1.indexOf("4"); // -1

        String result = str1.substring(
                str1.indexOf("5"),
                str1.indexOf("8") + 1);

        System.out.println("result = " + result);

    }
}
