package user;

import java.io.Serializable;

/**
 *
 * @author popi
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;

    public User(String nm, String sn, String em, String un, String pw){
        this.name=nm;
        this.surname=sn;
        this.email=em;
        this.username=un;
        this.password=pw;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
   
    public void setPassword(String password) {
        this.password = password;
    }
 
 
    public String getName() {
        return name;
    }
 
    public String getSurname() {
        return surname;
    }
    
    public String getEmail() {
        return email;
    }
 
    public String getUsername() {
        return username;
    }
 
    public String getPassword() {
        return password;
    }
     
    @Override
    public String toString(){
        return "Name="+this.name+", Surname="+this.surname+", Email="+this.email+", Username="+this.username+", Password="+this.password;
    }


}
