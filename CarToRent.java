public class CarToRent extends Car
{
    private String rentalDate;
    private String returnDate;
    private float adminFee;
    private int numberDays;
    private float dailyRate;
    private float totalAccumulated;
    private boolean isOnLoan;

    CarToRent(String description, float adminFee, float dailyRate) {
        super(description);
        this.adminFee = adminFee;
        this.dailyRate = dailyRate;
        this.rentalDate = "";
        this.returnDate = "";
        this.numberDays = 0;
        this.totalAccumulated = 0;
        this.isOnLoan = false;
    }

    public String getRentalDate()
    {
        return rentalDate;
    }

    public String getReturnDate()
    {
        return returnDate;
    }

    public float getAdminFee()
    {
        return adminFee;
    }

    public int getNumberDays()
    {
        return numberDays;
    }

    public float getDailyRate()
    {
        return dailyRate;
    }

    public float getTotalAccumulated()
    {
        return totalAccumulated;
    }

    public boolean isOnLoan()
    {
        return isOnLoan;
    }

    public void setAdminFee(float adminFee)
    {
        this.adminFee = adminFee;
    }

    public void setDailyRate(float dailyRate)
    {
        this.dailyRate = dailyRate;
    }

    public float getAmountToPay(int numberDays)
    {
        return getDailyRate() * numberDays + getAdminFee();
    }

    public void rentCar(String customerName, String rentalDate, String returnDate, int numberDays)
    {
        if (isOnLoan()) {
            System.out.println("The car is already on loan! It will return at " + getReturnDate());
        } else {
            setCustomerName(customerName);
            this.rentalDate = rentalDate;
            this.returnDate = returnDate;
            this.numberDays = numberDays;
            this.isOnLoan = true;
            this.totalAccumulated += getAmountToPay(numberDays);
        }
    }

    public void returnCar()
    {
        if (isOnLoan()) {
            setCustomerName("");
            this.numberDays = 0;
            this.returnDate = "";
            this.rentalDate = "";
            isOnLoan = false;
        } else {
            System.out.println("The car isn't on loan");
        }
    }

    public void printDescriptionWTotal()
    {
        System.out.println("Description: " + super.getDescription());
        System.out.println("Total Accumulated: " + getTotalAccumulated());
    }

    public void printAttributes()
    {
        super.printAttributes();
        System.out.println("Admin Fee: " + getAdminFee());
        System.out.println("Daily Fee: " + getDailyRate());

        if (isOnLoan) {
            System.out.println("Rental Date: " + getRentalDate());
            System.out.println("Return Date: " + getReturnDate());
            System.out.println("Number of Days: " + getNumberDays());
        }
    }
}
