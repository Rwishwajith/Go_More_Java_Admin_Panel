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
class Userttt {
     private int time;
    private String name,email,date,spice,msg;
    public Userttt(String date,int time,String email,String name,String spice,String msg){
        this.date=date;
        this.time=time;
        
        this.email=email;
        this.name=name;
        this.spice=spice;
        this.msg=msg;
        
        
    }
    public String getdate(){
        return date;
    }
    public int gettime(){
        return time;
    }
    public String getemail(){
        return email;
    }
    public String getname(){
        return name;
    }
    public String getspice(){
        return spice;
    }
    public String getmsg(){
        return msg;
    }
    
}
