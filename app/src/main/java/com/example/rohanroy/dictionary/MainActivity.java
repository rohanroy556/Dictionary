package com.example.rohanroy.dictionary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b;
    EditText e;
    TextView t;
    String text="";
    word_container o=new word_container();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        e=(EditText)findViewById(R.id.editText);
        t=(TextView)findViewById(R.id.textView2);
        int i,j;
        for(i=0;i<23;i++) {
            for (j = 0; j < 100; j++) {
                if(o.w[i][j].a.compareTo("")!=0)
                text += o.w[i][j].a + "\n";
            }
        }
        t.setText(text);
        b.setOnClickListener(this);
    }
    public void onClick(View v) {
        try {
            o.s.a = e.getText().toString().toLowerCase();
            if(o.s.a.length()==1)
                o.letter();
            else
                o.search(0, 99);
            t.setText(o.s.m);
        }
        catch(Exception e){
            t.setText(text);
        }
    }
}
