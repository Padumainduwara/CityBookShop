
package ClassPackage;

import java.io.*;
public class ManagerClass {
    private String Managername;
    private String ManagerId;
    private String Password;
     private int ManagerCount;
    
    FileSystem fs = new FileSystem("Manager.txt");
    
    
    public ManagerClass(){}
    public ManagerClass(String Managername,String ManagerId, String Password) {
        this.Managername = Managername;
        this.ManagerId = ManagerId;
        this.Password = Password;
    }
    
    public ManagerClass(String Managername) {
        this.Managername = Managername;
    }
    
    public ManagerClass(String ManagerId, String Password) {
        this.ManagerId = ManagerId;
        this.Password = Password;
    }

    public String getManagername() {
        return Managername;
    }

    public void setManagername(String Managername) {
        this.Managername = Managername;
    }
    

    public String getManagerId() {
        return ManagerId;
    }

    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getManagerCount() {
        return ManagerCount;
    }

    public void setManagerCount(int ManagerCount) {
        this.ManagerCount = ManagerCount;
    }
    
    
      public boolean addNewManager() 
   {
        if(!fs.createANewFile()){
            String record = Managername + " " + ManagerId + " " + Password+ " ";           
            return fs.writeDataToFile(record);
        }
        return false;
    }
      
    public boolean validateLogin() {
        try {
            String[] words = null;
            
            BufferedReader managers = fs.readAFile();
            String manager;

            while ((manager = managers.readLine()) != null) 
            {  
                words = manager.split("  "); 

               
                if (words[0].equals(ManagerId) && words[1].equals(Password)) {
                    this.setManagerId(words[0]);
                    this.setPassword(words[1]);
                    
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error validating Login"+e);
        }    
        return false;
    }
     public String viewAllManagers () 
        {
        String Manager, allManagers = " ";
        String[] words = null;
        int count = 0;

        BufferedReader manager = fs.readAFile();

        try {
            while ((Manager = manager.readLine()) != null) 
            {    
                words = Manager.split(" ");
                allManagers = allManagers +  words[0] + "\n";
                count++;
            }
        } catch (Exception e) {
             System.err.println("Error Searching Users"+e); 
        }
        
        setManagerCount(count);
        return allManagers;
    }  
}
