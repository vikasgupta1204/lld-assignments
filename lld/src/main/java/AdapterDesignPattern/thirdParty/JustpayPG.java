package AdapterDesignPattern.thirdParty;

public class JustpayPG {
    public boolean beginPayement(String orderNumber){
        System.out.println("Justpay payment gateway is started for ordernumber "+orderNumber);
        return true;
    }
}
