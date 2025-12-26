import java.util.Scanner;

public class squareroot {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        if (number > 0){
            double squareRoot = Math.sqrt(number);
            System.out.println(squareRoot);
        }
        else{
            System.out.println("input positive number");
        }
    }
}
