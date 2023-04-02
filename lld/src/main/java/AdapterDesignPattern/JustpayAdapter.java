package AdapterDesignPattern;

import AdapterDesignPattern.thirdParty.JustpayPG;

public class JustpayAdapter implements PaymentGW{
    private JustpayPG justpayPG=new JustpayPG();
    public void initiate(String orderNumber) {
        justpayPG.beginPayement(orderNumber);
    }

    public boolean checkStatus(String orderNumber) {
        return Integer.parseInt(orderNumber)>0?true:false;
    }
}
