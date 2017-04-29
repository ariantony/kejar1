package com.example.klola.projecthappybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    TextView cont_jababan;
    Button btnhitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        et1 = (EditText) findViewById(R.id.angka1);
        et2 = (EditText) findViewById(R.id.angka2);
        cont_jababan = (TextView) findViewById(R.id.cont_jabawan);
        btnhitung = (Button) findViewById(R.id.hitungAngka);

btnhitung.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("")){
            int a1 = Integer.parseInt(et1.getText().toString());
            int a2 = Integer.parseInt(et2.getText().toString());
            int jawaban = a1 + a2;
            cont_jababan.setText(Integer.toString(jawaban));
        }else{
            cont_jababan.setText("anda belum mengisi angka");
        }
    }
});

/*
* Edit text >
* */
    }
}
