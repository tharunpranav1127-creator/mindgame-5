import java.util.*;

public class ReverseCustomerName {
    static String reverseName(String name) {
        String[] parts = name.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            reversed.append(parts[i]);
            if (i != 0) reversed.append(" ");
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a full name: ");
        String input = sc.nextLine();
        String reversedName = reverseName(input);
        System.out.println("Reversed Name: " + reversedName);
        sc.close();
    }
}