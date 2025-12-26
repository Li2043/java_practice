import java.util.Scanner;

public class Integerinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("gave the number " + value);
    }
}
