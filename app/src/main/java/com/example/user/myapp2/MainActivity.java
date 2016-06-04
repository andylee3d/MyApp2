package com.example.user.myapp2;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    EditText etName,etWeight,etHeight;
    TextView resultCalc;
    String name, result;
    double weight,height;
    int test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("==카우프프로그램==");

        etName = (EditText) findViewById(R.id.name);
        etWeight= (EditText) findViewById(R.id.weight);
        etHeight=(EditText) findViewById(R.id.height);
        name=etName.getText().toString();
        weight = Double.parseDouble(etWeight.getText().toString());
        height = Double.parseDouble(etHeight.getText().toString());
        resultCalc=(TextView)findViewById(R.id.resultCalc);
        //test= integer.parselnt(etHeight.getText().toString());
        int idx =(int) (weight/(height*height))*10000;
        
        if(idx>=30){
            result="비만";
        }else  if(idx>=24){
            result="과체중";
        }else  if(idx>=20){
            result="정상";
        }else  if(idx>=15){
            result="저체중";
        }else  if(idx>=13){
            result="마름";
        }else  if(idx>=10){
            result="영양실조";
        }else  if(idx>=24){
            result="소모증";
        }
        resultCalc.setText(name+"님의 계산결과:"+result);
    }
    
}
