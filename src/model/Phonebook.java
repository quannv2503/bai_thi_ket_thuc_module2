package model;

public class Phonebook {
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private String type;
    private String gender;
    private String email;
    private String birthday;

    public Phonebook(String name, String phoneNumber, String address, String type, String gender, String email, String birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.type = type;
        this.gender = gender;
        this.email = email;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String toCSV() {
        return name + "," + phoneNumber + "," + address + "," + type + "," + gender + "," + email + "," + birthday;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
