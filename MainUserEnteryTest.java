/**
 * Author: Diwa Nawabi
 * Date: 4/24/2021
 * Purpose: Creating a Simple Banking Application
 */
import java.util.Scanner;

public class MainUserEnteryTest
{
    public static void main (String [] args)
    {
        
        SimpleBankingApplication object = new SimpleBankingApplication();
        
        object.readCustomerName();
        object.readCustomerLastName();
        object.readNumTransactions();
        object.readLastTransacDate();
        object.writeBankAccountInformation();
    }
}