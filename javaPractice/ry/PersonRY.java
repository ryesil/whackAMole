package javaPractice.ry;

public class PersonRY {
    private String firstName;
    private String lastName;
    private int age;

    public PersonRY() {
    }

    public PersonRY(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }

    public String fullName() {
        return this.firstName.isEmpty() && this.lastName.isEmpty() ? "" : this.firstName.isEmpty() && !this.lastName.isEmpty() ? this.lastName : !this.firstName.isEmpty() && this.lastName.isEmpty() ? this.firstName : this.firstName + " " + this.lastName;
    }
}
