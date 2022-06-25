/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package go_more;

/**
 *
 * @author Bharatha Sachintha
 */
class Userrrr {
    
    private String name,email,password,country;
    public Userrrr(String name,String password,String email,String country){
        this.name=name;
        this.email=email;
        
        this.password=password;
        this.country=country;
        
        
        
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public String getpassword(){
        return password;
    }
    public String getcountry(){
        return country;
    }
    
    
}
