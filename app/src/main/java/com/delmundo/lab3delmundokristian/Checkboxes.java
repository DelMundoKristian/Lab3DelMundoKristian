package com.delmundo.lab3delmundokristian;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.os.Bundle;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checkboxes extends AppCompatActivity {
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);

        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);
        c6 = findViewById(R.id.checkBox6);
        c7 = findViewById(R.id.checkBox7);
        c8 = findViewById(R.id.checkBox8);

        FileInputStream reader = null;
        String data = "";
        try{
            reader = openFileInput("data1.txt");
            int token;

            while((token = reader.read()) != -1){
                data = data + (char)token;
            }
        }
        catch(FileNotFoundException e){
            Log.d("Error","no file");
        }
        catch (IOException e){
            Log.d("Error","IO error");
        }
        String arr[] = data.split(" ");
        c1.setText(arr[0]);
        c2.setText(arr[1]);
        c3.setText(arr[2]);
        c4.setText(arr[3]);
        c5.setText(arr[4]);
        c6.setText(arr[5]);
        c7.setText(arr[6]);
        c8.setText(arr[7]);
    }

    public void showData(View v){
        String ck = "Enrolled in: ";
        if(c1.isChecked()){
            ck = ck + " " + c1.getText().toString();
                }
        if(c2.isChecked()){
            ck = ck + " " + c2.getText().toString();
        }
        if(c3.isChecked()){
            ck = ck + " " + c3.getText().toString();
        }
        if(c4.isChecked()){
            ck = ck + " " + c4.getText().toString();
        }
        if(c5.isChecked()){
            ck = ck + " " + c5.getText().toString();
        }
        if(c6.isChecked()){
            ck = ck + " " + c6.getText().toString();
        }
        if(c7.isChecked()){
            ck = ck + " " + c7.getText().toString();
        }
        if(c8.isChecked()){
            ck = ck + " " + c8.getText().toString();
        }
        Toast.makeText(this,ck,Toast.LENGTH_LONG).show();
    }
}
