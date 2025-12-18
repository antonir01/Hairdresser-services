public class Customer extends Account{
    boolean isRegularCustomer;

    public Customer(String fullName, String phoneNumber, String PIN, boolean isRegularCustomer) {
        super(fullName, phoneNumber, PIN);
        this.isRegularCustomer = isRegularCustomer;
    }
}
