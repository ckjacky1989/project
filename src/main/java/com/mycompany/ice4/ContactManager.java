/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4;

/**
 *
 * @author ckjac
 */
public class ContactManager {
    private Contact[] contactList;
    public ContactManager(Contact[] contactList){
        
            this.contactList=contactList;}
    //hi
    /*
	Locate a Contact record that matches the email address provided.
	Returns the Contact record if found, null if not found.
    */
    public Contact findContact(String emailAddress){
       if (contactList != null){
        for (Contact contact : contactList) {
            if (contact.getEmailAddress().equals(emailAddress))
                return contact;
            }
        return null;}
       else return null;
    };

    /*
	 Removes all contacts
    */
    public void clearContacts(){
            this.contactList=new Contact[0];
        };
    
    public Contact[] getContactList(){
        return this.contactList;}
}
