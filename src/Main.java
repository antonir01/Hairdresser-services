import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean endProgram = false;
        String var;
//        Customer customer = new Customer("Marian Sobiecki", "21434324329", "20");
//        Service service = new Service(ServiceType.CUTTING, 50, 30);
//        Reservation reservation = new Reservation(customer, service, LocalDate.parse("2025-12-18"), PaymentMethod.CASH);
        while (!endProgram){
            System.out.println("Do you want to exit? (yes or no)");
            var = scanner.nextLine();
            if (var.equals("yes")){
                endProgram = true;
            }
        }
    }
}