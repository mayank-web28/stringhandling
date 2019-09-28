import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        String s = obj1.nextLine();
        int i =obj1.nextInt();
        int j =obj1.nextInt();
        System.out.println(s);
        System.out.println(s.substring(i,j));
    }
}
