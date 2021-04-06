import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class CarCompany 
implements ActionListener
{
private JFrame frame;
///////////////
private JLabel  yearLable;
private JLabel priceLable;
private JLabel mileageLable;
private JLabel descriptionLable;
private JLabel  adminfeeLable;
private JLabel dailyrateLable;
private JLabel customernameLable;
private JLabel rentaldateLable;
private JLabel  returndateLable;
private JLabel numberofdaysLable;
private JLabel carnumberLable; 
public JLabel blankLable;
   
private JTextField yearTextbox = new JTextField(10);
private JTextField priceTextbox = new JTextField(10);
private JTextField mileageTextbox = new JTextField(10);
private JTextField descriptionTextbox = new JTextField(10);
private JTextField adminfeeTextbox = new JTextField(10);
private JTextField dailyrateTextbox = new JTextField(10);
private JTextField customernameTextbox = new JTextField(10);
private JTextField rentaldateTextbox = new JTextField(10); 
private JTextField returndateTextbox = new JTextField(10);
private JTextField numberofdaysTextbox = new JTextField(10);
private JTextField carnumberTextbox = new JTextField(10);


private JButton CarToBuyButton;
private JButton CarToRentButton;
private JButton BuyCarButton;
private JButton RentCarButton;
private JButton DisplayButton;
private JButton ReturnCarButton;
///////////////








////////////////
public void actionPerformed(ActionEvent event)
{
System.out.println("Menu item: " + event.getActionCommand());
}

public CarCompany () 
    {
        makeFrame();
    }


private void makeFrame()
    {
        frame = new JFrame("CW GridLayout Example");
        Container contentPane = frame.getContentPane();
        ///////////////////////////
        
        JLabel  yearLable = new JLabel("Year:");
         yearTextbox = new JTextField(10);
         
        JLabel priceLable = new JLabel("Price:");
        JLabel mileageLable = new JLabel("Mileage:");
        JLabel descriptionLable = new JLabel("Description:");
        JLabel  adminfeeLable = new JLabel("Admin Fee:");
        JLabel dailyrateLable = new JLabel("Daily Rate:");
        JLabel customernameLable = new JLabel("Customer Name:");
        JLabel rentaldateLable = new JLabel("Rental Date:");
        JLabel  returndateLable = new JLabel("Return Date:");
        JLabel numberofdaysLable = new JLabel("Number Of Days:");
        JLabel carnumberLable = new JLabel("Car Number:");
    
        
     
        priceTextbox = new JTextField(10);
        mileageTextbox = new JTextField(10);
        descriptionTextbox = new JTextField(10);
        adminfeeTextbox = new JTextField(10);
        dailyrateTextbox = new JTextField(10);
        customernameTextbox = new JTextField(10);
        rentaldateTextbox = new JTextField(10); 
        returndateTextbox = new JTextField(10);
        numberofdaysTextbox = new JTextField(10);
       carnumberTextbox = new JTextField(10);
    

        CarToBuyButton = new JButton("Add Car To Buy");
        CarToRentButton = new JButton("Add Car To Rent");
        BuyCarButton = new JButton("Buy Car");
        RentCarButton = new JButton("Rent Car");
        ReturnCarButton = new JButton("Return Car");
        DisplayButton = new JButton("Display All"); 
       
        contentPane.setLayout(new GridLayout(4, 4));
        contentPane.add(yearLable);
        contentPane.add(yearTextbox);
        
        contentPane.add(priceLable);
         contentPane.add(priceTextbox);
         
        contentPane.add(mileageLable);
        contentPane.add(mileageTextbox);
        
        contentPane.add(CarToBuyButton);
        
        contentPane.add(descriptionLable);
        contentPane.add(descriptionTextbox);
        
        contentPane.add(adminfeeLable);
        contentPane.add(adminfeeTextbox);
        
        contentPane.add(dailyrateLable);
        contentPane.add(dailyrateTextbox);
        
        contentPane.add(CarToRentButton);
        
        contentPane.add(customernameLable);
        contentPane.add(customernameTextbox);
        
        contentPane.add(rentaldateLable);
        contentPane.add(rentaldateTextbox);
        
        contentPane.add(returndateLable);
        contentPane.add(returndateTextbox);
        
        contentPane.add(BuyCarButton);
        contentPane.add(numberofdaysLable);
        contentPane.add(numberofdaysTextbox);
        
        contentPane.add(carnumberLable);
        contentPane.add(carnumberTextbox);
       
        contentPane.add(RentCarButton);
        
        contentPane.add(ReturnCarButton);
        contentPane.add(DisplayButton);
        
        
        
                 
        //////////////////
        frame.pack();
        frame.setVisible(true);
    }
    
    
private void makeMenuBar(JFrame frame)
{
 JMenuBar menubar = new JMenuBar();
 frame.setJMenuBar(menubar);
 
 JMenu fileMenu = new JMenu("File");
 menubar.add(fileMenu);
 
 JMenuItem openItem = new JMenuItem("Open");
 openItem.addActionListener(this);
 fileMenu.add(openItem);
 JMenuItem quitItem = new JMenuItem("Quit");
 quitItem.addActionListener(this);
 fileMenu.add(quitItem);
}
}