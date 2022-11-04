import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to count up to? ");
        int countTo = scanner.nextInt();


        int counter = 1;
        System.out.println(counter);
        while (counter < countTo) {
            counter++;
            System.out.println(counter);
        }
    }
}

