package jaskaran.singh.jaskaranlab02;

//Jaskaran singh
//301109429
//Section 002
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class singhHomeTypes extends AppCompatActivity {
    //preference data variable
    private SharedPreferences myPreference;
    //variable to modify preference data
    SharedPreferences.Editor prefEditor;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }
    //
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.item2:
                Toast.makeText(this, "You selected APARTMENTS!", Toast.LENGTH_LONG).show();
                //instantiate the preference data variable
                myPreference = getSharedPreferences("info", 0);
                //prepare it for edit by creating and Edit object
                prefEditor = myPreference.edit();
                //store "set" in  a preference named "program"
                prefEditor.putString("programName", "APARTMENT");
                //commit the transaction
                prefEditor.commit();
                //show SoftEngActivity
                intent = new Intent(this, singhApartment.class);
                startActivity(intent);
                break;

            case R.id.item3:
                Toast.makeText(this, "You selected DETACHED HOMES!", Toast.LENGTH_LONG).show();

                //instantiate the preference data variable
                myPreference = getSharedPreferences("info", 0);
                //prepare it for edit by creating and Edit object
                prefEditor = myPreference.edit();
                //store "set" in  a preference named "program"
                prefEditor.putString("programName", "TOWN HOUSE");
                //commit the transaction
                prefEditor.commit();
                //show SoftEngActivity
                intent = new Intent(this, singhDetachedHome.class);
                startActivity(intent);
                break;

            case R.id.item4:
                Toast.makeText(this, "You selected SEMI DETACHED HOMES!", Toast.LENGTH_LONG).show();

                myPreference = getSharedPreferences("info", 0);
                //prepare it for edit by creating and Edit object
                prefEditor = myPreference.edit();
                //store "set" in  a preference named "program"
                prefEditor.putString("programName", "TOWN HOUSE");
                //commit the transaction
                prefEditor.commit();
                intent = new Intent(this, singhSemiDetachedHome.class);
                startActivity(intent);
                break;

            case R.id.item5:
                Toast.makeText(this, "You selected CONDOMINIUM APARTMENT!", Toast.LENGTH_LONG).show();

                myPreference = getSharedPreferences("info", 0);
                //prepare it for edit by creating and Edit object
                prefEditor = myPreference.edit();
                //store "set" in  a preference named "program"
                prefEditor.putString("programName", "TOWN HOUSE");
                //commit the transaction
                prefEditor.commit();

                intent = new Intent(this, singhCondominiumApartment.class);
                startActivity(intent);
                break;

            case R.id.item6:
                Toast.makeText(this, "You selected TOWN HOUSE!", Toast.LENGTH_LONG).show();
                //instantiate the preference data variable
                myPreference = getSharedPreferences("info", 0);
                //prepare it for edit by creating and Edit object
                prefEditor = myPreference.edit();
                //store "set" in  a preference named "program"
                prefEditor.putString("programName", "TOWN HOUSE");
                //commit the transaction
                prefEditor.commit();
                //show SoftEngActivity

                //show GamingActivity
                intent = new Intent(this, singhTownHouse.class);
                startActivity(intent);
                break;



            default:
                return super.onOptionsItemSelected(item);

        }
        return true;

    }
}