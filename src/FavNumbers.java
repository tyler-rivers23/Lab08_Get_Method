
import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int favNum;
        double doublefavNum;

        favNum = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println(favNum);
        doublefavNum = SafeInput.getDouble(in, "Enter your favorite number");
        System.out.println(doublefavNum);

    }
}
