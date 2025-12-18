import java.time.LocalDate;

public class Reservation {
    Customer customer;
    Service service;
    LocalDate date;
    PaymentMethod paymentMethod;

    public Reservation(Customer customer, Service service, LocalDate date, PaymentMethod paymentMethod) {
        this.customer = customer;
        this.service = service;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }
}
