import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.replace('a', '*');
        s = s.replace('e', '*');
        s = s.replace('i', '*');
        s = s.replace('0', '*');
        s = s.replace('u', '*');
        System.out.println(s);    }
}
