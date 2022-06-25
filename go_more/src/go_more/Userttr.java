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
class Userttr {
    private int adult,child,number;
    private String date,name,email,city,type,vehicle;
    public Userttr(String date,String name,String email,int number,String city,String type,int adult,int child,String vehicle){
        this.date=date;
        this.name=name;
        this.email=email;
        this.number=number;
        this.city=city;
        this.type=type;
        this.adult=adult;
        this.child=child;
        this.vehicle=vehicle;
    }
    public String getdate(){
        return date;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public String getcity(){
        return city;
    }
    public int getnumber(){
        return number;
    }
    public String gettype(){
        return type;
    }
    
    public String getvehical(){
        return vehicle;
    }
    public int getadult(){
        return adult;
    }
    public int getchild(){
        return child;
    } 
}
