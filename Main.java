import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount and currency: ");
        String num = in.nextLine();
        String[] numm = num.split(" ");
        double tmp = Double.parseDouble(numm[0]);

        switch (numm[1])
        {
            case "PLN":
                PLN pl = new PLN();
                System.out.printf(num + " = %.2f UAH", pl.convert(tmp));
                break;

            case "CZK":
                CZK cz = new CZK();
                System.out.printf(num + " = %.2f UAH", cz.convert(tmp));
                break;
        }

        in.close();
    }
}
