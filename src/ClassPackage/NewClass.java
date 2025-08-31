
package ClassPackage;

import java.io.*;
public class NewClass {
    
    
    FileSystem fs = new FileSystem("User_Info.txt");
    
    private String Username;
    private String UserId; //U001
    private String Password;//111
    private String UserType;
    private int UserCount; 
    
     public NewClass(){}
    public NewClass(String Username,String UserId, String Password, String UserType) {
        this.Username = Username;
        this.UserId = UserId;
        this.Password = Password;
        this.UserType = UserType;
    }

    public NewClass(String UserId, String Password, String UserType) {
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

    public int getUserCount() {
        return UserCount;
    }

    public void setUserCount(int UserCount) {
        this.UserCount = UserCount;
    }


   public boolean addNewUser() 
   {
        if(!fs.createANewFile()){
            String record = Username + " "+ UserId + " " + Password+ " " + UserType ;           
            return fs.writeDataToFile(record);
        }
        return false;
    }
           
       
}
