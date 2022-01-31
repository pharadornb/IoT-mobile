package com.example.b6134228;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSwitchLight1(View v){
        boolean on = ((Switch) v).isChecked();
        if(on)
        {
            Toast.makeText(getApplicationContext(),R.string.toast_on_light1, Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),R.string.toast_off_light1, Toast.LENGTH_SHORT).show();
        }
    }

    public void onSwitchLight2(View v){
        boolean on = ((Switch) v).isChecked();
        if(on)
        {
            Toast.makeText(getApplicationContext(),R.string.toast_on_light2, Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),R.string.toast_off_light2, Toast.LENGTH_SHORT).show();
        }
    }
}