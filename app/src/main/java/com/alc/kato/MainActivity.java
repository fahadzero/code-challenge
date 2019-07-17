package com.alc.kato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button _aboutBtn, _profileBtn;
    Intent _intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _aboutBtn = findViewById(R.id.aboutBtn);
        _profileBtn = findViewById(R.id.profileBtn);

        _aboutBtn.setOnClickListener(this);
        _profileBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.aboutBtn:
                _intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(_intent);
                break;
            case R.id.profileBtn:
                _intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(_intent);
                break;
                default:
                    Toast.makeText(MainActivity.this, "Wrong button action", Toast.LENGTH_LONG).show();
        }
    }
}
