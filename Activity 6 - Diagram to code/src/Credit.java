import java.util.Date;

public class Credit extends Payment {
    private String type;
    private String number;
    private Date expDate;

    public Credit(String type, String number, Date expDate) {
        this.type = type;
        this.number = number;
        this.expDate = expDate;
    }

    public void authorized() {
        System.out.println("Pago con tarjeta de crédito realizado");
    }
}