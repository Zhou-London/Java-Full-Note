package week5.LabSheet3.Q1;

public class AddressBookEntry {

    private String name;
    private String phone;
    private String email;

    public AddressBookEntry(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName(){ return name; }
    public String getPhone(){ return phone; }
    public String getEmail(){ return email; }


}
