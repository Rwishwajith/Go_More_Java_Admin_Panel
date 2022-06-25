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
class Usertr {
     private int adult,children;
    private String date,email,city,pkg,name,level,lenght,company;
    public Usertr(String name,String email,String date,String city,String pkg,String level,String lenght,String company,int adult,int children){
        this.date=date;
        this.name=name;
        this.email=email;
        this.city=city;
        this.pkg=pkg;
        this.level=level;
        this.lenght=lenght;
        this.company=company;
        this.adult=adult;
        this.children=children;
        
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
    public String getpkg(){
        return pkg;
    }
    public String getlevel(){
        return level;
    }
    public String getlenght(){
        return lenght;
    }
    public String getcompany(){
        return company;
    }
    public int getadult(){
        return adult;
    }
    public int getchildren(){
        return children;
    }
}
