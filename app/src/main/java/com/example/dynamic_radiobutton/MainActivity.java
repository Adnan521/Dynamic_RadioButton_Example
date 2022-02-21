package com.example.dynamic_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

RelativeLayout relativelaout;
RadioButton btn1,btn2;
RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativelaout=findViewById(R.id.relativelaout);
        btn1=new RadioButton(this);
        btn2=new RadioButton(this);
        radioGroup=new RadioGroup(this);

        btn1.setText("Male");
        btn2.setText("Female");

        radioGroup.addView(btn1);
        radioGroup.addView(btn2);
       radioGroup.setOrientation(LinearLayout.HORIZONTAL);

       RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int) RelativeLayout.LayoutParams.WRAP_CONTENT,(int) RelativeLayout.LayoutParams.WRAP_CONTENT);
radioGroup.setLayoutParams(params);
       relativelaout.addView(radioGroup);


       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               RadioButton radioButton=findViewById(checkedId);
               Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
           }
       });




    }


}