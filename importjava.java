import java.util.Scanner;

public class importjava {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fist_number:");
        int first_number = input.nextInt();
        System.out.println("Enter your second_number:");
        int second_number = input.nextInt();
        int substraction_total = first_number - second_number;
        System.out.println("The answer is:" + substraction_total);
        input.close();

    }
}