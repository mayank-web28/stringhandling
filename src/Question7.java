import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {

        Scanner obj6 = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = obj6.nextLine();
        char[] a = s.toUpperCase().toCharArray();
        int totalWeight = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = a[i];
            totalWeight = totalWeight + j;
        }
        System.out.println(totalWeight);
    }
}
