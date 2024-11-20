/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ice4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ckjac
 */
public class testIce4 {
    public ContactManager cm;
    private Contact[] contactList;
    public testIce4() {
    }
    
    @BeforeAll
    public static void setUpClass() {

        
    }

    @AfterAll
    public static void tearDownClass() {

    }
    
    @BeforeEach
    public void setUp() {
        Contact[] contactList= {new Contact("a","a","a@gmail.com"),
        new Contact("b","b","b@gmail.com")};
        cm = new ContactManager(contactList);
    }
    
    @AfterEach
    public void tearDown() {
        //contactList = new Contact[0];
    }

    //set email=b@gmail.com, exp cm.getContactList()[1]
    @Test
    public void testFindContactGood(){
        String emailAddress="b@gmail.com";
        Contact expResult=cm.getContactList()[1];
        Contact result=cm.findContact(emailAddress);
        assertEquals(expResult,result);
    }
    //set email=c@gmail.com, exp null
    @Test
    public void testFindContactBad(){
        String emailAddress="c@gmail.com";
        Contact expResult=null;
        Contact result=cm.findContact(emailAddress);
        assertEquals(expResult,result);
    }
    //set email=null, exp null
    @Test
    public void testFindContactNull(){
        String emailAddress=null;
        Contact expResult=null;
        Contact result=cm.findContact(emailAddress);
        assertEquals(expResult,result);
    }
    //set email="", exp null
    @Test
    public void testFindContactEmpty(){
        String emailAddress="";
        Contact expResult=null;
        Contact result=cm.findContact(emailAddress);
        assertEquals(expResult,result);
    }
    //set empty contactList, set email=null, exp null
    @Test
    public void testFindContactEmptyList(){
        String emailAddress=null;
        cm.clearContacts();
        Contact expResult=null;
        Contact result=cm.findContact(emailAddress);
        assertEquals(expResult,result);
    }
    //set empty contactList, set email="", exp null
    @Test
    public void testFindContactEmptyList2(){
        String emailAddress="";
        cm.clearContacts();
        Contact expResult=null;
        Contact result=cm.findContact(emailAddress);
        assertEquals(expResult,result);
    }
    //set contactList=null, set email=null, exp null
    @Test
    public void testFindContactNullList(){
        String emailAddress=null;
        ContactManager cm2 = new ContactManager(null);
        Contact expResult=null;
        Contact result=cm2.findContact(emailAddress);
        assertEquals(expResult,result);
    }
}
