package com.androchunk.checkboxcustomization2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckBoxChecked(View view) {
        CheckBox checkBox = findViewById(view.getId());
        switch (view.getId()) {
            case R.id.bold:
                if (checkBox.isChecked()) {
                    Toast.makeText(this, "bold is enable", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "bold is disable", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.italic:
                if (checkBox.isChecked()) {
                    Toast.makeText(this, "italic is enable", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "italic is disable", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.underline:
                if (checkBox.isChecked()) {
                    Toast.makeText(this, "underline is enable", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "underline is disable", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
