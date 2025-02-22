package javaPractice.ry.Question30;

public class ContactRY {
    private String name;
    private String phoneNumber;


    public ContactRY(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public static ContactRY generateContact(String name, String phoneNumber ) {
        return new ContactRY(name, phoneNumber);
    }

    @Override
    public String toString(){
        if(getName().equals("Contact Not Found!")) {
            return getName();
        } else {
            return "Name: " + getName() + " Phone Number: " + getPhoneNumber();
        }
    }
}
