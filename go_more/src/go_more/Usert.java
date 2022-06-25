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
class Usert {
     private int number,adult,child;
    private String date,email,type,activity,name;
    public Usert(String date,String name,String email,int number,String type,String activity,int adult,int child){
        this.date=date;
        this.name=name;
        this.email=email;
        this.number=number;
        this.type=type;
        this.activity=activity;
        this.adult=adult;
        this.child=child;
        
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
    public int getnumber(){
        return number;
    }
    public String gettype(){
        return type;
    }
    public String getactivity(){
        return activity;
    }
    public int getadult(){
        return adult;
    }
    public int getchild(){
        return child;
    }
    
    
}
