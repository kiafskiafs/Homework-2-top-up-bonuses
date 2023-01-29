import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите баланс вашего счёта на настоящий момент (в рублях, без копеек): ");
        int initialBalance = in.nextInt();

        System.out.print("Введите сумму, на которую вы хотите пополнить счёт (в рублях, без копеек): ");
        int paymentAmount = in.nextInt();

        int bonus;
        if (paymentAmount > 1000) {
            bonus = paymentAmount / 100;
        } else {
            bonus = 0;
        }
        int finalBalance = initialBalance + paymentAmount + bonus;

        System.out.println("После оплаты в указанном размере на вашем счету будет " + finalBalance + " руб.");
        System.out.println("Из них бонусных " + bonus + " руб.");
        in.close();
    }
}