package javaPractice.ry.Question30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MobilePhoneRY {
    private String myNumber;
    private List<ContactRY> myContacts;

    public MobilePhoneRY(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(ContactRY contact) {
        if(findContact(contact) == -1) {
            this.myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(ContactRY oldContact, ContactRY newContact) {
        int index = findContact(oldContact);
        if( index > -1) {
            this.myContacts.set(index, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(ContactRY contact) {
        int index = findContact(contact);
        if(index > -1) {
            this.myContacts.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public int findContact(ContactRY contact) {
        return this.myContacts.stream().map(cont -> cont.getName()).collect(Collectors.toList()).indexOf(contact.getName());
    }

    public int findContact(String name) {
       ContactRY cont = new ContactRY(name, ""); // Fake number to generate a new ContactRY
        return findContact(cont);
    }

    public ContactRY queryContact(String name) {
        try{
            return myContacts.get(findContact(name));
        } catch (IndexOutOfBoundsException e) {
            return new ContactRY("Contact Not Found!", "");

        }

    }

    public void printContacts(){
        for(ContactRY cont: myContacts) {
            System.out.println(cont.getName() + " --> " + cont.getPhoneNumber());
        }
    }

}
