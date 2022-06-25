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
class Userr {
    private int price,id;
    private String name,type,size;
    public Userr(String name,String type,int price,String size,int id){
        this.name=name;
        this.type=type;
        
        this.price=price;
        this.size=size;
        this.id=id;
        
        
    }
    public String getname(){
        return name;
    }
    public String gettype(){
        return type;
    }
    public int getprice(){
        return price;
    }
    public String getsize(){
        return size;
    }
    public int getid(){
        return id;
    }
   
    
}
