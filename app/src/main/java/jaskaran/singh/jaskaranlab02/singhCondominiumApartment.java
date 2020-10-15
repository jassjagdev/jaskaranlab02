package jaskaran.singh.jaskaranlab02;
//Jaskaran singh
//301109429
//Section 002
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class singhCondominiumApartment extends singhHomeTypes {

    //
    Set<String> setApartments = new HashSet<String>();
    //preferences data variable
    SharedPreferences myPref;
    //variable to modify preference data
    SharedPreferences.Editor prefEditor;
    //
    String[] availableCourses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singh_condominium_apartment);
        //get available apartments from string array
        availableCourses = getResources().getStringArray(R.array.address_names);
        //retrieving from shared preferences
        myPref = getSharedPreferences("info", MODE_PRIVATE);
        //check what's in shared preferences named apartments
        setApartments = myPref.getStringSet("courses",new HashSet<String>());
        for( String strApartment : setApartments ){
            Toast.makeText(this, "Selected Town Houses: "+strApartment, Toast.LENGTH_SHORT).show();
            // restore the state of check boxes according to shared preferences values
            if(strApartment.equals("10th Street"))
            {
                CheckBox checkBox1 = (CheckBox) findViewById(R.id.cb11);
                checkBox1.setChecked(true);

            }
            if(strApartment.equals("110 Town Haven Place"))
            {
                CheckBox checkBox1 = (CheckBox) findViewById(R.id.cb22);
                checkBox1.setChecked(true);

            }
            if(strApartment.equals("1185 Warden Avenue"))
            {
                CheckBox checkBox1 = (CheckBox) findViewById(R.id.cb22);
                checkBox1.setChecked(true);

            }
        }

        String myString = myPref.getString("program","");
        Toast.makeText(this, "Retrieving from shared preferences: "+myString, Toast.LENGTH_SHORT).show();
        // myPref.edit().remove("text").commit();
        prefEditor= myPref.edit();
        //   myPref.edit().clear().commit();

    }
    //
    public void onCheckboxClicked(View view)
    {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.cb11:
                if (checked) { //add it to the set
                    setApartments.add("10th Street");
                }
                else //remove it from the set
                {
                    setApartments.remove("10th Street");
                }
                break;

            case R.id.cb22:
                if (checked) {
                    setApartments.add("110 Town Haven Place");
                }
                else
                {
                    setApartments.remove("110 Town Haven Place");
                }
                break;

            case R.id.cb33:
                if (checked)
                    setApartments.add("1185 Warden Avenue");
                else
                    setApartments.remove("1185 Warden Avenue");
                break;



            default:
                break;
        }

    }
    //
    public void onClickNext(View view)
    {

        Toast.makeText(this, "Number of selected Condominium Apartments: "+setApartments.size(), Toast.LENGTH_SHORT).show();

        //using enhanced for loop to show selected courses
        for( String strApartment : setApartments ){
            Toast.makeText(this, "Selected Condominium Apartments: "+strApartment, Toast.LENGTH_SHORT).show();
        }
        //add the selected courses to shared preferences variable named courses
        prefEditor.putStringSet("courses",setApartments);
        prefEditor.commit();
        //
        Intent intent = new Intent(this, singhCheckOutScreen.class);
        startActivity(intent);
    }
}

