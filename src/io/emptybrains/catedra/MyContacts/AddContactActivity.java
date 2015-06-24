package io.emptybrains.catedra.MyContacts;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import io.emptybrains.catedra.MyContacts.data.Contact;

/**
 * Created by Cristian on 24/06/2015.
 */
public class AddContactActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_contact);
    }

    public void addContact(View view){
        Context context = getApplicationContext();
        Toast toast;

        EditText nameField = (EditText) findViewById(R.id.editText);
        EditText emailField = (EditText) findViewById(R.id.editText2);
        EditText phoneField = (EditText) findViewById(R.id.editText3);
        EditText addressField = (EditText) findViewById(R.id.editText4);

        Contact newContact = new Contact(nameField.getText().toString(),
                emailField.getText().toString(),
                addressField.getText().toString(),
                phoneField.getText().toString());
    }
}