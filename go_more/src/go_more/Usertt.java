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
class Usertt {
     private int zip,year,month,cvv,cnum;
    private String name,email,address,city,state,cname;
    public Usertt(String name,String email,String address,String city,String state,int zip,String cname,int cnum,int month,int year,int cvv){
        this.name=name;
        this.email=email;
        
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.cname=cname;
        this.cnum=cnum;
        this.month=month;
        this.year=year;
        this.cvv=cvv;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public String getaddress(){
        return address;
    }
    public String getcity(){
        return city;
    }
    public String getstate(){
        return state;
    }
    public int getzip(){
        return zip;
    }
    public String getcname(){
        return cname;
    }
    public int getcnum(){
        return cnum;
    }
    public int getmonth(){
        return month;
    }
    public int getyear(){
        return year;
    }
    public int getcvv(){
        return cvv;
    }
}
