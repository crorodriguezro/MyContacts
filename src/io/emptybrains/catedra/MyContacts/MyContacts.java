package io.emptybrains.catedra.MyContacts;

import android.app.Activity;
import android.os.Bundle;
import io.emptybrains.catedra.MyContacts.data.Contact;

import java.util.ArrayList;

/**
 * Created by Cristian on 24/06/2015.
 */
public class MyContacts extends Activity {

    public ArrayList<Contact> myContacts;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public Contact searchContactByName(String name){
        Contact myContact = null;
        for (Contact contact: myContacts){
            if(contact.getName()==name){
                myContact = contact;
                break;
            }
        }
        return myContact;
    }
}