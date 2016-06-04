package com.example.user.myapp2.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.myapp2.R;
import com.example.user.myapp2.calc.CalcService;
import com.example.user.myapp2.calc.CalcServiceImpl;
import com.example.user.myapp2.kaup.KaupActivity;


public class MainActivity extends Activity implements View.OnClickListener{
    Button btnKaup, btnCalc, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.btKaup)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnCalc)).setOnClickListener(this);
        ((Button) findViewById(R.id.btLogin)).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btKaup:
                startActivity(new Intent(this, KaupActivity.class));
                break;
            case R.id.btnCalc:
                startActivity(new Intent(this, KaupActivity.class));
                break;
            case R.id.btLogin:
                startActivity(new Intent(this, KaupActivity.class));
                break;

        }
    }
}
