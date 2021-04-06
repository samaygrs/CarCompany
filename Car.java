public class Car extends CarCompany
{
    private String customerName;
    final private String description;
 
    Car(String description) {
        this.customerName = "";
        this.description = description;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getDescription()
    {
        return description;
    }

    public void printAttributes()
    {
        if (!customerName.equals("")) {
            System.out.println("Customer's name: " + getCustomerName());
        }
        System.out.println("Description: " + getDescription());
    }
}
