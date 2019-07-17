package com.alc.kato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProfileActivity extends AppCompatActivity {

    TextView _track, _slack, _country, _number, _name, _email;
    ImageView _imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        _imgView = findViewById(R.id.imageView);

        Picasso.with(ProfileActivity.this).load(R.drawable.kats).into(_imgView);

    }
}
