package com.example.praktikum2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class ProfileActivity_baru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_baru);

        TextView ff = (TextView)findViewById(R.id.buka_profile);
        Bundle bundle = getIntent().getBundleExtra("Profile");
        String name = bundle.getString("name");
        String email = bundle.getString("email");
        int age = bundle.getInt("age");

        String text = "Name : " + name +"\n" + "Email : " +email+"\n" + "Age : "
                +age; ff.setText(text);

    }
}