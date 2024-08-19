package BankProject1;



public interface BankaMetodları {

    public void run();
    public void listCustomers();
    public void listCustomerAccounts(Musteri musteri);
    public void addCustomer();
    public void customerOperationsMenu();
    public void customerOperations(Musteri musteri);
    public void openNewAccount(Musteri musteri);
    public void depositToAccount(Musteri customer);
    public void withdrawToAccount (Musteri customer);
    public void checkBalance (Musteri customer);
    public Hesap getAccountById (int accountId);

}
