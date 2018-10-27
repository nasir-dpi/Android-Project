package com.example.sogir.myproject6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> languages = new ArrayList<>();
    private RadioGroup genderRG,typeRG;
    
    private String gender ="Male";
    private String type ="Base Slaried";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genderRG = findViewById(R.id.grnderRG);
        typeRG = findViewById(R.id.typeRG);
        genderRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb = findViewById(i);
                gender=rb.getText().toString();
                //Toast.makeText(MainActivity.this, "gender", Toast.LENGTH_SHORT).show();
            }
        });
        typeRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                RadioButton rb = findViewById(i);
                type=rb.getText().toString();
               // Toast.makeText(MainActivity.this, "gender", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void selectLanguage(View view) {
        CheckBox cb = (CheckBox) view;
        boolean status = cb.isChecked();
        String selectedlanguage = cb.getText().toString();
        if (status) {

            languages.add(selectedlanguage);
        } else {

            languages.remove(selectedlanguage);
        }
        String s = TextUtils.join(",", languages);

        Log.e("Collection test", "selectLanguage: " + s);
    }

    public void registerEmployee(View view) {

        String name = ((EditText)findViewById(R.id.nameValue)).getText().toString();
        String age = ((EditText)findViewById(R.id.ageValue)).getText().toString();
        Employee employee = new Employee(name,age,gender,type,languages);
        Intent intent = new Intent(MainActivity.this,EmployeeDetailsActivity.class);
       // intent.putExtra("Name", "Nasir");
        intent.putExtra("emp",employee);
        startActivity(intent);
    }
}
