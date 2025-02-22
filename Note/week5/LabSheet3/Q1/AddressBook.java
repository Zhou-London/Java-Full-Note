//Feb 20 2025

package week5.LabSheet3.Q1;

import java.util.ArrayList;

public class AddressBook {

    //An array to store the entry
    private ArrayList<AddressBookEntry> arr;

    //2 ways to init the object
    public AddressBook() { arr = new ArrayList<>(); }
    public AddressBook(ArrayList<AddressBookEntry> arr) {this.arr = arr; }

    //Add, remove and search
    public void add(AddressBookEntry entry) { arr.add(entry); }
    public void remove(AddressBookEntry entry) { arr.remove(entry); }

    public AddressBookEntry search(AddressBookEntry entry) {

        //Iterate the array
        //Return the object if found
        for ( AddressBookEntry e: arr){ if (e.equals(entry)) return e; }

        //Return null if not found
        return null;
    }
}
