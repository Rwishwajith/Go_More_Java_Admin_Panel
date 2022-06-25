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
class User {
    private int phone;
    private String name,email,location,arravi,departure,comment,hotel,adult,child;
    public User(String hotel,String name,String email,int phone,String location,String arravi,String departure,String adult,String child,String comment){
        this.hotel=hotel;
        this.name=name;
        this.email=email;
        
        this.phone=phone;
        this.location=location;
        this.arravi=arravi;
        this.departure=departure;
        this.adult=adult;
        this.child=child;
        this.comment=comment;
        
    }
    public String gethotel(){
        return hotel;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public int getphone(){
        return phone;
    }
    public String getlocation(){
        return location;
    }
    public String getarravi(){
        return arravi;
    }
    public String getdeparture(){
        return departure;
    }
    public String getcomment(){
        return comment;
    }
    public String getadult(){
        return adult;
    }
    public String getchild(){
        return child;
    }
    
}
