package AdapterDesignPattern;

public interface PaymentGW {
    public void initiate(String orderNumber);
    public boolean checkStatus(String orderNumber);
}
