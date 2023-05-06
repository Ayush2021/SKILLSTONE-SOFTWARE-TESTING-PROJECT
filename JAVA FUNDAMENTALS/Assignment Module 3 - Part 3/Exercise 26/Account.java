class Account {
int accountNumber;
String customerName;
Account(int accountNumber) {
this.accountNumber = accountNumber;
}
Account(int accountNumber, String customerName) {
this(accountNumber);
this.customerName = customerName;
}
}

class AccountTest {
public static void main(String[] args) {
Account account1 = new Account(101);
Account account2 = new Account(101, "Vishal");
System.out.println(account1.accountNumber);
System.out.println(account2.accountNumber);
System.out.println(account2.customerName);
}
}