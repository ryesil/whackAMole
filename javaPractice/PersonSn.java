package javaPractice;

public class PersonSn {

    private String firstName;
    private String secondName;
    private int age;

    //getter
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    //setter
    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String setSecondName(String secondName) {
        this.secondName = secondName;
        return secondName;
    }

    public int setAge(int age) {
        if (age < 0 || age > 0) {
            this.age = 0;
        }
        this.age = age;
        return age;
    }

    //isTeen
    public boolean isTeen() {
        return (age > 12 && age < 20) ? true : false;
    }

    //getFullName
    public String getFullName(){
        if (firstName.isEmpty()){
            return secondName;
        }
        if (secondName.isEmpty()){
            return firstName;
        }
        return firstName +" " + secondName;
    }

}