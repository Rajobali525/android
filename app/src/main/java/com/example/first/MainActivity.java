package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private EditText ed1,ed2,ed3,ed4,ed5,ed6;
    private Button btn1,btn2;

    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        databaseReference = FirebaseDatabase.getInstance().getReference("students");


        ed1 = findViewById(R.id.ed1id);
        ed2 = findViewById(R.id.ed2id);
        ed3 = findViewById(R.id.ed3id);
        ed4 = findViewById(R.id.ed4id);
        ed5 = findViewById(R.id.ed5id);
        ed6 = findViewById(R.id.ed6id);
        btn1 = findViewById(R.id.calculatebuttonid);
        btn2 = findViewById(R.id.clearbuttonid);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.length()==0 ||ed2.length()==0 ||ed3.length()==0 ||ed4.length()==0 ||ed5.length()==0 ||ed6.length()==0){
                    Toast.makeText(getApplicationContext(),"Please Fill All Field",Toast.LENGTH_LONG).show();
                }
                else{
                    saveData();

                }




            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                startActivity(intent);

            }
        });

    }


    public void saveData(){
        String name = ed1.getText().toString().trim();
        String age =ed2.getText().toString().trim();
        String section =ed3.getText().toString().trim();
        String lm =ed4.getText().toString().trim();
        String fault =ed5.getText().toString().trim();
        String date =ed6.getText().toString().trim();

        String key = databaseReference.push().getKey();

       Student student = new Student(name,age,section,lm,fault,date);

       databaseReference.child(key).setValue(student);
        Toast.makeText(getApplicationContext(),"Data inserted successfully",Toast.LENGTH_LONG).show();

        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed5.setText("");
        ed6.setText("");



    }
}