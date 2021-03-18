import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input amount and currency of money: ");
        String num = in.nextLine();

        String[] el = num.split(" ");
        double tmp = Double.parseDouble(el[0]);

        switch (el[1]){
            case "USD":
                Dollar dol = new Dollar();
                System.out.printf(num + " = %.2f UAH", dol.convert(tmp));
                break;
            case "EUR":
                Euro eu = new Euro();
                System.out.printf(num + " = %.2f UAH", eu.convert(tmp));
                break;
        }
        in.close();
    }
}