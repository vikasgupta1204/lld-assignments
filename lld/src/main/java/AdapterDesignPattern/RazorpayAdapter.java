package AdapterDesignPattern;

import AdapterDesignPattern.thirdParty.RazorpayPG;

public class RazorpayAdapter implements PaymentGW{
    private RazorpayPG razorpayPG=new RazorpayPG();
    public void initiate(String orderNumber) {
        razorpayPG.initiatePayment(orderNumber);
    }

    public boolean checkStatus(String orderNumber) {
        return  Integer.parseInt(orderNumber)>0?true:false;
    }
}
