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
class Userrr {
     private int number;
    private String name,email,password,country;
    public Userrr(String name,String email,String password,String country,int number){
        this.name=name;
        this.email=email;
        
        this.password=password;
        this.country=country;
        this.number=number;
        
        
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
    public int getnumber(){
        return number;
    }
    
    
}
