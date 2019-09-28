import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {

        Scanner obj4 = new Scanner(System.in);
        System.out.println("enter the string");
        String a = obj4.nextLine().trim();
        System.out.println("enter the substring");
        String b = obj4.nextLine().trim();
        a = a.replaceAll(b, "*");
        System.out.println(a);
    }
}
