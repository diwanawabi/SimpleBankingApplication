/**
 * Author: Diwa Nawabi
 * Date: 4/24/2021
 * Purpose: Creating a Simple Banking Application
 */

import java.util.Scanner;

public class SimpleBankingApplication
{
    public String customerName;
    public String customerLastName;
    public double accountBalance;
    public int numTransactions;
    public String lastTransacDate;
    
    public SimpleBankingApplication()
    {
        customerName = new String("Diwa");
        customerLastName = new String("Nawabi");
        accountBalance = 50000.0;
        numTransactions = 12;
        lastTransacDate = new String("April 12, 2021");
    }
    
    public SimpleBankingApplication(String newCustomerName, String newCustomerLastName,
                                    double newAccountBalance, int newNumTransactions,
                                    String newLastTransacDate)
    {
        if (customerName == null || customerLastName == null || accountBalance < 0.0
            || numTransactions < 0 || lastTransacDate == null)
        {
            System.out.println("Fatal Error! The information is wrong! Please try again!");
            System.exit(0);
        }
        
        else
        {
            customerName = new String(newCustomerName);
            customerLastName = new String(newCustomerLastName);
            accountBalance = newAccountBalance;
            numTransactions = newNumTransactions;
            lastTransacDate = new String(newLastTransacDate);
        }
    }
    
    public String getCustomerName()
    {
        return customerName;
    }
    
    public String getCustomerLastName()
    {
        return customerLastName;
    }
    
    public double getAccountBalance()
    {
        return accountBalance;
    }
    
    public int getNumTransactions()
    {
        return numTransactions;
    }
    
    public String getLastTransacDate()
    {
        return lastTransacDate;
    }
    
    public void setCustomerName(String newCustomerName)
    {
        if (customerName == null)
        {
            System.out.println("Fatal Error! Name cannot be null!");
            System.exit(0);
        }
        
        else
        {
            customerName = newCustomerName;
        }
    }
    
    public void setCustomerLastName(String newCustomerLastName)
    {
        if (customerLastName == null)
        {
            System.out.println("Fatal Error! Last name cannot be null!");
            System.exit(0);
        }
        
        else
        {
            customerLastName = newCustomerLastName;
        }
    }
    
    public void setAccountBalance(double newAccountBalance)
    {
        if (accountBalance < 0)
        {
            System.out.println("Fatal Error! Account balance cannot be less than 0!");
            System.exit(0);
        }
        
        else
        {
            accountBalance = newAccountBalance;
        }
    }
    
    public void setNumTransactions(int newNumTransactions)
    {
        if (numTransactions < 0)
        {
            System.out.println("Fatal Error! Number of transactions cannot be less than 0!");
            System.exit(0);
        }
        
        else
        {
            numTransactions = newNumTransactions;
        }
    }
    
    public void setLastTransacDate(String newLastTransacDate)
    {
        if (lastTransacDate == null)
        {
            System.out.println("Fatal Error! Last transaction date cannot be a negative value!");
            System.exit(0);
        }
        
        else
        {
            lastTransacDate = new String(newLastTransacDate);
        }
    }
    
    public SimpleBankingApplication(SimpleBankingApplication copyObject)
    {
        if (customerName == null || customerLastName == null || accountBalance < 0.0
            || numTransactions < 0 || lastTransacDate == null)
        {
            System.out.println("Fatal Error! The information is wrong! Please try again!");
            System.exit(0);
        }
        
        else
        {
            customerName = new String(copyObject.customerName);
            customerLastName = new String(copyObject.customerLastName);
            accountBalance = copyObject.accountBalance;
            numTransactions = copyObject.numTransactions;
            lastTransacDate = new String(copyObject.lastTransacDate);
        }
    }
    
    public boolean equals(SimpleBankingApplication copyObject)
    {
        return (customerName.equals(copyObject.customerName)) && (customerLastName.equals(copyObject.customerLastName))
                && (accountBalance == copyObject.accountBalance) && (numTransactions == copyObject.numTransactions)
                && (lastTransacDate.equals(copyObject.lastTransacDate));
    }
    
    public String toString()
    {
        System.out.println("Name\t Last Name\t Account Balance\t Number of Transactions\t Date of Last Transaction");
        
        return customerName + "\t " + customerLastName + "\t\t " +
               accountBalance + "\t\t " + numTransactions + "\t\t\t " + lastTransacDate;
    }
    
    public void readCustomerName()
    {
        Scanner text = new Scanner(System.in);
        
        System.out.println("Please enter customer name: ");
        customerName = text.nextLine();
    }
    
    public void readCustomerLastName()
    {
        Scanner text = new Scanner(System.in);
        
        System.out.println("Please enter customer last name: ");
        customerLastName = text.nextLine();
    }
    
    public void readAccountBalance()
    {
        Scanner value = new Scanner(System.in);
        
        System.out.println("Please enter the account balance: ");
        accountBalance = value.nextDouble();
    }
    
    public void readNumTransactions()
    {
        Scanner value = new Scanner(System.in);
        
        System.out.println("Please enter the number of transactions: ");
        numTransactions = value.nextInt();
    }
            
    public void readLastTransacDate()
    {
        Scanner value = new Scanner(System.in);
        
        int month;
        int day;
        int year;
        String writeMonth = new String();
        
        System.out.println("Please enter the month of last transaction: ");
        month = value.nextInt();
        
        try
        {
            if (month < 1 || month > 12)
            {
                throw new Exception("Fatal Error! Month cannot be bigger than 12 or smaller"
                                    + " than 1.");
            }
        }
        
        catch (Exception MonthException)
        { 
            String message = MonthException.getMessage();
            System.out.println(message);
            
            while (month < 1 || month > 12)
            {
                System.out.println("Please enter the month of last transaction: ");
                month = value.nextInt();
            }
        }
        
        if (month == 1)
            writeMonth = "January";
        
        else if (month == 2)
            writeMonth = "February";
        
        else if (month == 3)
            writeMonth = "March";
        
        else if (month == 4)
            writeMonth = "April";
        
        else if (month == 5)
            writeMonth = "May";
          
        else if (month == 6)
            writeMonth = "June";
           
        else if (month == 7)
            writeMonth = "July";
            
        else if (month == 8)
            writeMonth = "August";
            
        else if (month == 9)
            writeMonth = "September";
            
        else if (month == 10)
            writeMonth = "October";
            
        else if (month == 11)
            writeMonth = "November";
            
        else if (month == 12)
            writeMonth = "December";
                    
        System.out.println("Please enter the day of last transaction: ");
        day = value.nextInt();
        
        try
        {
            while (day < 1 || day > 31)
            {
                throw new Exception("Fatal Error! Day cannot be bigger than 31 or smaller than"
                                    + " 1.");
            }
        }
        
        catch (Exception DayException)
        {
            String message = DayException.getMessage();
            System.out.println(message);

            while (day < 1 || day > 31)
            {
                System.out.println("Please enter the day of last transaction: ");
                day = value.nextInt();
            }
        }
        
        System.out.println("Please enter the year of last transaction: ");
        year = value.nextInt();
        
        try
        {
            if (year < 1000 || year > 3000)
            {
                throw new Exception("Fatal Error! Year cannot be smaller than 1000" +
                                    " or bigger than 3000.");
            }
        }
        
        catch (Exception YearException)
        {
            String message = YearException.getMessage();
            System.out.println(message);
            
            while (year < 1000 || year > 3000)
            {
                System.out.println("Please enter the year of last transaction: ");
                year = value.nextInt();
            }
        }
        
        lastTransacDate = new String(writeMonth + " " + day + ", " + year);
    }

    public void writeBankAccountInformation()
    {
        System.out.println(this.toString());
    }
}