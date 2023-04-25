import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int Number, answer;
        answer = (int) (Math.random() * 11);
        System.out.println("Answer the number game!");
        do {
            System.out.println("Your answer: ");
            Number = scanner.nextInt();
            if (Number == answer) {
                System.out.println("You answer correctly!");
            } else if (Number != answer) {
                System.out.println("Your answer is wrong!");
                if (Number>answer){
                    System.out.println("Your number is below "+Number + " try again!");
                } else if (Number<answer) {
                    System.out.println("Your number is above "+Number + " try again!");
                }
            }
        }while (Number!=answer);
    }
}