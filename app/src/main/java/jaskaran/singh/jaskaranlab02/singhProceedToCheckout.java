package jaskaran.singh.jaskaranlab02;
//Jaskaran singh
//301109429
//Section 002
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class singhProceedToCheckout extends AppCompatActivity {
    RadioGroup rbg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singh_proceed_to_checkout);
       rbg=(RadioGroup)findViewById(R.id.rbg);

        rbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                int id =rbg.getCheckedRadioButtonId();
                if(id==R.id.rb1)
                {
                    Intent in= new Intent(singhProceedToCheckout.this, singhLastScreen.class);
                    startActivity(in);
                }
                if(id==R.id.rb2)
                {
                    Intent in= new Intent(singhProceedToCheckout.this, singhLastScreen.class);
                    startActivity(in);
                }
                if(id==R.id.rb3)
                {
                    Intent in= new Intent(singhProceedToCheckout.this, singhLastScreen.class);
                    startActivity(in);
                }
            }
        });
    }


}
