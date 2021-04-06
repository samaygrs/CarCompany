public class CarToBuy extends Car
{
    private float price;
    private int registrationYear;
    private int mileage;
    private boolean isSold;

    CarToBuy(String description, int price, int registrationYear, int mileage, boolean isSold) {
        super(description);
        this.isSold = false;
        this.price = price;
        this.registrationYear = registrationYear;
        this.mileage = mileage;
        this.isSold = isSold;
    }

    public float getPrice()
    {
        return price;
    }

    public int getRegistrationYear()
    {
        return registrationYear;
    }

    public int getMileage()
    {
        return mileage;
    }

    public boolean isSold()
    {
        return isSold;
    }

    public void setPrice(float price)
    {
        if (!isSold) {
            this.price = price;
        } else {
            System.out.println("The car have already been sold so you can't change the price!");
        }
    }

    public void buyCar(String customerName)
    {
        if (!isSold) {
            this.setCustomerName(customerName);
            isSold = true;
        } else {
            System.out.println("The car have already been sold so you can't buy it!");
        }
    }

    public void printAttributes()
    {
        super.printAttributes();
        if (!isSold) {
            System.out.println("Price: " + getPrice());
            System.out.println("Registration Year: " + getRegistrationYear());
            System.out.println("Mileage: " + getMileage());
        }
    }
}
