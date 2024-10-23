
import java.util.Scanner;
public class Reggie {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        SafeInput.getRegExString(in, "Enter your SSN","^\\d{3}-\\d{2}-\\d{4}$");
        SafeInput.getRegExString(in, "Enter your UC M number", "^(M|m)\\d{5}$");
        SafeInput.getRegExString(in, "Choose to Open Save View or QUit (O,S,V,Q)", "^[OoSsVvQq]$");
    }
}
