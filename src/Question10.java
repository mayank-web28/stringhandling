import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner obj9 = new Scanner(System.in);
        System.out.println("enter the string");
        String b = obj9.nextLine().trim();
        System.out.println("enter the character");
        char a = obj9.next().charAt(0);
        System.out.println(b.indexOf(a));
    }
}
