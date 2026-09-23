package in.strikes;

public class PaymentService {
    private String type;

    public PaymentService(String type){
        this.type = type;
    }

    public void pay(){
        System.out.println("Payment is done. Type of payment is " + type);
    }
}
