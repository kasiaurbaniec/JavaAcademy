import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What's your first name");
//        String firstName =scanner.nextLine();
//        System.out.println("What's your last name");
//        String lastName =scanner.nextLine();
//        System.out.println("Where do you live");
//        String city=scanner.nextLine();
        System.out.println("What's your year of birth");
        int yearOfBirth=scanner.nextInt();
        System.out.println("whats your month of birth");
        int monthOfBirth=scanner.nextInt();
        System.out.println("whats your day of birth");
        int dayOfBirth=scanner.nextInt();
        LocalDate dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

//        System.out.printf("you are %s %s and come from %s, and you were born %te %tB %tY",firstName,lastName,city,dateOfBirth,dateOfBirth,dateOfBirth);
        System.out.format("you were born %te %<tB %<tY",dateOfBirth);

        double x=10000.0/3.0;
        System.out.format(" liczba całkowita x = %d ",(int)x);
        System.out.println();
        System.out.format(" liczba zmiennoprzecinkowa x = %,8.2f zł ",x);
    }
}
