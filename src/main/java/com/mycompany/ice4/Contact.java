/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4;

/**
 *
 * @author ckjac
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    public Contact(String firstName,String lastName,String emailAddress){
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailAddress=emailAddress;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;}
    public String getFirstName(){
        return this.firstName;}
    public void setLastName(String lastName){
        this.lastName=lastName;}
    public String getLastName(){
        return this.lastName;}
    public void setEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;}
    public String getEmailAddress(){
//        if (this.emailAddress==null) 
//            return null;
//        else
            return this.emailAddress;}    

}



