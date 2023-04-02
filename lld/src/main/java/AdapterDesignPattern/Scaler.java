package AdapterDesignPattern;

public class Scaler {

    PaymentGW paymentGW=new JustpayAdapter();
    void admitStudent(String orderNumber){
        paymentGW.initiate(orderNumber);
        paymentGW.checkStatus(orderNumber);
    }
}
