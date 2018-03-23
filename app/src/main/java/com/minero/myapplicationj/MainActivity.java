package com.minero.myapplicationj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView tv1;
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.Button1);
        tv1= (TextView) findViewById(R.id.TextView1);
        et1= (EditText) findViewById(R.id.EditText1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(et1.getText());
            }
        });
    }
}
