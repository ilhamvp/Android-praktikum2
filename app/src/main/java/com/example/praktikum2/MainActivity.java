package com.example.praktikum2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buka_profile;
    private Button buka_browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buka_profile = (Button)findViewById(R.id.btn_buka_profile);
        buka_profile.setOnClickListener((View.OnClickListener) this);

        buka_browser = (Button)findViewById(R.id.btn_buka_profile_browser);
        buka_browser.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btn_buka_profile:
                Intent pp = new Intent(MainActivity.this, ProfileActivity_baru.class);
                Bundle bd = new Bundle();
                bd.putString("name", "Ilham Vanny Putra");
                bd.putString("email", "dev@Ilham.id");
                bd.putInt("age", 24);
                pp.putExtra("Profile", bd);
                startActivity(pp);
                break;
            case R.id.btn_buka_profile_browser:
                Intent ff = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
                Toast.makeText(getApplicationContext(),ff.toString(),Toast.LENGTH_SHORT).show();
                startActivity(ff);
                break;


        }
    }



}