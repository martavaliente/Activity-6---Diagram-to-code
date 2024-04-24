public class Check extends Payment {
    private String name;
    private String BankID;

    public Check(String name, String BankID) {
        this.name = name;
        this.BankID = BankID;
    }

    public void authorized() {
        System.out.println("Pago con cheque realizado");
    }
}