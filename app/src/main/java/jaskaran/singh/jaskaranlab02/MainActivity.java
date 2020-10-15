package jaskaran.singh.jaskaranlab02;
//Jaskaran singh
//301109429
//Section 002
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.MainBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Enter();
            } 
        });
    } 

    public void Enter()
    {
        Intent intent = new Intent(MainActivity.this, singhHomeTypes.class);
        startActivity(intent); 
    }
}
