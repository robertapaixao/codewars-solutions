package String;
public class Main {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(solution("world"));
        System.out.println(solution("hello"));
        System.out.println(solution("java"));
    }
}