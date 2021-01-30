package com.github.andreytimashkov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.github.skifuniversaltbdriver.SkifJson;
import com.github.skifuniversaltbdriver.SkifTbCallback;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity implements SkifTbCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new SkifJson(getApplicationContext(),((EditText) findViewById(R.id.login)).getText().toString(),((EditText) findViewById(R.id.pwd)).getText().toString(), this).runTbFunc("","");
    }

    @Override
    public void skifTbCallback(JSONArray skifTbAnswer) {
        Toast.makeText(this, skifTbAnswer.toString(), Toast.LENGTH_SHORT).show();
    }
}
