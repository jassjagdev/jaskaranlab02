package jaskaran.singh.jaskaranlab02;
//Jaskaran singh
//301109429
//Section 002
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class singhCheckOutScreen extends singhHomeTypes {
    private SharedPreferences myPreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singh_check_out_screen);
        //Toast.makeText(this, "payed courses ", Toast.LENGTH_LONG).show();

        myPreference = getSharedPreferences("info", MODE_PRIVATE);
        String programName = myPreference.getString("programName","");
        Set<String> courses = myPreference.getStringSet("courses",new HashSet<String>());
        //Toast.makeText(this, "Number of selected courses "+courses.size(), Toast.LENGTH_SHORT).show();
        TextView tvCourses = (TextView)findViewById(R.id.tvCourses);
        ImageView iv=(ImageView)findViewById(R.id.iv1);
        tvCourses.setText( "Selected Apartments:" + "\n");


        //using enhanced for loop
        for( String strCourse : courses ){
            tvCourses.setText(tvCourses.getText().toString()+strCourse +"\n");
            iv=(ImageView)findViewById(R.id.iv1);
        }
    }
    public void Enter(View view)
    {
        Intent intent = new Intent(singhCheckOutScreen.this, singhProceedToCheckout.class);
        startActivity(intent);

    }
}