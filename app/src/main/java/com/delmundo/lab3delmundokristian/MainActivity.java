package com.delmundo.lab3delmundokristian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText t1 , t2, t3, t4, t5, t6, t7, t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.editText);
        t2 = findViewById(R.id.editText2);
        t3 = findViewById(R.id.editText3);
        t4 = findViewById(R.id.editText5);
        t5 = findViewById(R.id.editText6);
        t6 = findViewById(R.id.editText7);
        t7 = findViewById(R.id.editText8);
        t8 = findViewById(R.id.editText9);
    }
    public void writeData(View v){
        String d1 = t1.getText().toString();
        String d2 = t2.getText().toString();
        String d3 = t3.getText().toString();
        String d4 = t4.getText().toString();
        String d5 = t5.getText().toString();
        String d6 = t6.getText().toString();
        String d7 = t7.getText().toString();
        String d8 = t8.getText().toString();
        String BigData = d1 + " " + d2 +  " " + d3 +  " " + d4 +  " " + d5 +  " " + d6 +  " " + d7 +  " " + d8;
        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data1.txt", MODE_PRIVATE);
            writer.write(BigData.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("error","no file fool");
        }
        finally {
            try {
                writer.close();
            }
            catch (IOException e) {
                Log.d("error","no file boi");
            }
        }
        Toast.makeText(this, "data saved", Toast.LENGTH_LONG).show();
    }

    public void next(View v){
        Intent intent = new Intent(getApplicationContext(),Checkboxes.class);
        startActivity(intent);

    }
}
