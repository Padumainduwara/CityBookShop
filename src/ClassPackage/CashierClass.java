package ClassPackage;

import java.io.*;
public class CashierClass {
    
    private String Cashiername;
    private String CashierId;
    private String Password;
    private int CashierCount;
    
    FileSystem fs = new FileSystem("Cashier.txt");
    
    public CashierClass(){}
    public CashierClass(String Cashiername,String CashierId, String password) {
        this.Cashiername = Cashiername;
        this.CashierId = CashierId;
        this.Password = password;
    }

    public CashierClass(String Cashiername) {
        this.Cashiername = Cashiername;
    }
    

    public CashierClass(String CashierId, String password) {
        this.CashierId = CashierId;
        this.Password = password;
    }

    public String getCashiername() {
        return Cashiername;
    }

    public void setCashiername(String Cashiername) {
        this.Cashiername = Cashiername;
    }
    

    public String getCashierId() {
        return CashierId;
    }

    public void setCashierId(String CashierId) {
        this.CashierId = CashierId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getCashierCount() {
        return CashierCount;
    }

    public void setCashierCount(int CashierCount) {
        this.CashierCount = CashierCount;
    }
    
    
     public boolean addNewCashier() 
   {
        if(!fs.createANewFile()){
            String record =  Cashiername + " " + CashierId + " " + Password+ " ";           
            return fs.writeDataToFile(record);
        }
        return false;
    }
    
    
    public boolean validateLogin() {
        try {
            String[] words = null;
            
            BufferedReader cashiers = fs.readAFile();
            String cashier;

            while ((cashier = cashiers.readLine()) != null) 
            {  
                words = cashier.split(" "); 

                
                if (words[1].equals(CashierId) && words[2].equals(Password)) {
                    this.setCashiername(words[0]);
                    this.setCashierId(words[1]);
                    this.setPassword(words[2]);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error validating Login"+e);
        }    
        return false;
    }
    public String viewAllCashiers () 
        {
        String Cashier, allCashiers = " ";
        String[] words = null;
        int count = 0;

        BufferedReader cashier = fs.readAFile();

        try {
            while ((Cashier = cashier.readLine()) != null) 
            {    
                words = Cashier.split(" ");
                allCashiers = allCashiers + words[0]  + "\t" +  words[1] +"\n";
                count++;
            }
        } catch (Exception e) {
             System.err.println("Error Searching Users"+e); 
        }
        
        setCashierCount(count);
        return allCashiers;
    }  
    
}
