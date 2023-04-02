package AdapterDesignPattern;

import AdapterDesignPattern.thirdParty.CCAvenuePG;

public class CCAvenueAdapter implements PaymentGW{
    private CCAvenuePG ccAvenuePG=new CCAvenuePG();
    public void initiate(String orderNumber) {
        ccAvenuePG.startPayment(orderNumber);
    }

    public boolean checkStatus(String orderNumber) {
        return Integer.parseInt(orderNumber)>0?true:false;
    }
}
