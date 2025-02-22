package week5.LabSheet3.Q1;

public class main {
    public static void main(String[] args) {
        AddressEntryRecord a = new AddressEntryRecord("Jane", "01", "abc");
        AddressBookRecord x = new AddressBookRecord();
        x.add(a);
        System.out.println(x.search(a).email());
    }
}
