
package ClassPackage;

import java.io.*;
public class Createnewaccountclass {
    
    
    FileSystem fs = new FileSystem("CreateAccount.txt");
    
    private String Username;
    private String UserId; 
    private String Password;
    private String UserType;
    
    
     public Createnewaccountclass(){}
    public Createnewaccountclass(String Username,String UserId, String Password, String UserType) {
        this.Username = Username;
        this.UserId = UserId;
        this.Password = Password;
        this.UserType = UserType;
    }

    public Createnewaccountclass(String UserId, String Password, String UserType) {
        this.UserId = UserId;
        this.Password = Password;
        this.UserType = UserType;
    }
    


    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    
    
    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

  
   public boolean addNewUser() 
   {
        if(!fs.createANewFile()){
            String record = UserId + " " + Password+ " " + UserType ;           
            return fs.writeDataToFile(record);
        }
        return false;
    }
           
}
