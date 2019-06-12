package com.example.good;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText uname;

    private  EditText upass;
    private Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        uname = (EditText)findViewById(R.id.name);
        upass = (EditText)findViewById(R.id.pass);

        login =(Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate(uname.getText().toString(), upass.getText().toString());
            }
        });
    }
// validate(uname.getText().toString(), upass.getText().toString());

    private void validate(String username, String userpass) {
        if ((username == "yves") && (userpass== "yves")) {

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

            Toast.makeText(getApplicationContext(),username+"hello world",Toast.LENGTH_LONG).show();

        }
        else {
            Toast.makeText(getApplicationContext(),"failed your button is enabled",Toast.LENGTH_LONG).show();
            login.setSaveEnabled(false);
        }
    }
}
