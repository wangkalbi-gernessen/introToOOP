package miniProjectII;

import java.util.ArrayList;

/**
 * @author Kazunobu Someya
 */
public class ContactList {
    private ArrayList<Contact> contacts;

    public ContactList(ArrayList<Contact> contacts){
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts(){
        return this.contacts;
    }

    public void setContacts(ArrayList<Contact> contacts){
        this.contacts = contacts;
    }

    public boolean addContact(Contact newContact){
        if(newContact == null){
            System.out.println("Invalid information");
            return false;
        }
        for(Contact elem : contacts){
            if(elem.equals(newContact)){
                System.out.println("Already Exists and cannot be created");
                return false;
            }
        }
        contacts.add(newContact);
        return true;
    }
}