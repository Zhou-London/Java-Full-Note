//Feb 20 2025

package week5.LabSheet3.Q1;

import week1.src.Person;

import java.util.ArrayList;

public class AddressBookRecord {

    //An array to store the entry
    private ArrayList<AddressEntryRecord> arr;

    //2 ways to init the object
    public AddressBookRecord() { arr = new ArrayList<>(); }
    public AddressBookRecord(ArrayList<AddressEntryRecord> arr) {this.arr = arr; }

    //Add, remove and search
    public void add(AddressEntryRecord entry) { arr.add(entry); }
    public void remove(AddressEntryRecord entry) { arr.remove(entry); }

    public AddressEntryRecord search(AddressEntryRecord entry) {

        //Iterate the array
        //Return the object if found
        for ( AddressEntryRecord e: arr){ if (e.equals(entry)) return e; }

        //Return null if not found
        return null;
    }
}
