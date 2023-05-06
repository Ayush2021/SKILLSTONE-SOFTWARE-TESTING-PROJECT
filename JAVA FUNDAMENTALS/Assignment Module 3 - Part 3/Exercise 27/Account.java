class Account {
    int accountNumber;
    String customerName;
    String address;
    public Account() {
        this.accountNumber = 101111;
        this.customerName = "Vimal";
        this.address = "Panchkula";
    }
    public void display() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Name: " + customerName);
        System.out.println("Address: " + address);
    }
}
class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.display();
    }
}
