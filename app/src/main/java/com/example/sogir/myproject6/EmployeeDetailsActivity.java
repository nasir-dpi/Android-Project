package com.example.sogir.myproject6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

public class EmployeeDetailsActivity extends AppCompatActivity {

    private TextView nameTv,ageTv,genderTv,skillTv,typeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);
        nameTv=findViewById(R.id.showname);
        ageTv=findViewById(R.id.showage);
        genderTv=findViewById(R.id.showGender);
        skillTv=findViewById(R.id.showSkills);
        typeTv=findViewById(R.id.showType);
        Intent intent = getIntent();

        //String name = intent.getStringExtra("name");
        //int value = intent.getIntExtra("name",0);

        //Toast.makeText(this, "name", Toast.LENGTH_SHORT).show();
        Employee employee = (Employee) intent.getSerializableExtra("emp");
        nameTv.setText(employee.getName());
        ageTv.setText(employee.getAge());
        genderTv.setText(employee.getGender());
        String s = TextUtils.join(",", employee.getLanguages());
        skillTv.setText(s);
        typeTv.setText(employee.getType());

    }
}
