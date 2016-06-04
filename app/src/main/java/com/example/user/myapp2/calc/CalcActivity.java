package com.example.user.myapp2.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.myapp2.R;
import com.example.user.myapp2.main.MainActivity;

public class CalcActivity extends Activity implements View.OnClickListener {

    EditText etName1,etName2;
    Button btnPlus,btnMinus,btnMuti,btnDivi, btnRest;
    TextView textResult;
    int num1,num2, result;
    CalcService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        setTitle("=초간단계산기=");
        service = new CalcServiceImpl();
        ((Button) findViewById(R.id.btnPlus)).setOnClickListener(this);
         ((Button) findViewById(R.id.btnMinus)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnMuti)).setOnClickListener(this);
         ((Button) findViewById(R.id.btnDivi)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnRest)).setOnClickListener(this);
        textResult = (TextView) findViewById(R.id.textResult);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnreturnMain){
            Toast tMsg = Toast.makeText(CalcActivity.this,"뒤로가기버튼클릭", Toast.LENGTH_LONG);
            startActivity(new Intent(this, MainActivity.class));
        }else {
            etName1 =(EditText) findViewById(R.id.etName1);
            num1 = Integer.parseInt(etName1.getText().toString());
            etName2 =(EditText) findViewById(R.id.etName2);
            num2 = Integer.parseInt(etName2.getText().toString());
            int result = 0;
            switch (v.getId()){
                case R.id.btnPlus:
                    result = service.plus(num1,num2); break;
                case R.id.btnMinus:
                    result = service.minus(num1,num2); break;
                case R.id.btnMuti:
                    result = service.multi(num1,num2);break;
                case R.id.btnDivi:
                    result = service.divide(num1,num2);break;
                case R.id.btnRest:
                    result = service.nmg(num1,num2);break;
            }
            textResult.setText("계산결과: "+result);
        }

    }

}
