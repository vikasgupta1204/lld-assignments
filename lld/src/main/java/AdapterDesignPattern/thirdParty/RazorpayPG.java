package AdapterDesignPattern.thirdParty;

public class RazorpayPG
{
    public String initiatePayment(String orderNumber){
        System.out.println("Razorpay payment gateway started for ordernumber "+orderNumber);
        return "Success!! for razorpay";
    }
}
