
import java.util.Scanner;
public class CheckOut {

    public static void main(String[] args) {


        boolean done;
        Scanner in = new Scanner(System.in);
        double totalprice = 0;

do {

    double price = SafeInput.getRangedDouble(in, "Enter the price of you item", 0, 10.00);
    System.out.print("The price of you item is $ ");
    System.out.printf("%.2f", price);
    totalprice = totalprice + price;
    System.out.print(" The total price is : $");
    System.out.printf("%.2f", totalprice);
     done = SafeInput.getYNConfirm(in, " Are you done shopping");
} while (!done);

System.out.println("Thank you for shopping");


    }

}
