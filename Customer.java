/*Create a public Customer class that extends Person, with fields for customer number and mailing preference, 
a constructor for initialization, and public accessor and mutator methods.*/


public class Customer extends Person
{
    private String customerNumber;
    private boolean receiveMail;
    
    public Customer(String name,String address,String telephoneNumber,String customerNumber,boolean receiveMail)
    {
        super(name,address,telephoneNumber);
        this.customerNumber = customerNumber;
        this.receiveMail = receiveMail;
    }
    public String getCustomerNumber()
    {
        return customerNumber;
    }
    public boolean getReceiveMail()
    {
        return receiveMail;
    }
    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    public void setReceiveMail(boolean receiveMail)
    {
        this.receiveMail = receiveMail;
    }
}