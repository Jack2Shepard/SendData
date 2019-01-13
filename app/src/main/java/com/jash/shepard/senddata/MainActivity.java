package com.jash.shepard.senddata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText fname,lname,age;
    private RadioGroup rg_sex;
    private RadioButton male_rb,female_rb;
    private Button send_btn;
    private String sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inits();
        getData();
    }

    private void inits() {
        fname = findViewById(R.id.fname_ed);
        lname = findViewById(R.id.lname_ed);
        age = findViewById(R.id.age_ed);
        rg_sex = findViewById(R.id.sex_rg);
        male_rb = findViewById(R.id.male_rb);
        female_rb = findViewById(R.id.female_rb);
        send_btn = findViewById(R.id.send_btn);
        sex = male_rb.getText().toString();
    }

    private void getData() {
        rg_sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.male_rb :
                        sex = male_rb.getText().toString();
                        break;
                    case R.id.female_rb:
                        sex = female_rb.getText().toString();
                        break;
                }
            }
        });
        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToFrag();
            }
        });
    }

    public void sendToFrag(){
        Person person = new Person(fname.getText().toString(),lname.getText().toString(),
                Integer.valueOf(age.getText().toString()),sex);
        ShowDataFrag frag = new ShowDataFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("person",person);
        frag.setArguments(bundle);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frag_container,frag,"data")
                .commit();
    }
}
