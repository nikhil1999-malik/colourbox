package com.example.colourbox;


import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.res.ColorStateList;

public class MainActivity extends AppCompatActivity {

    private EditText edittext;
    private Button greenBtn,blueBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext=(EditText)findViewById(R.id.edittext);
        greenBtn=(Button)findViewById(R.id.greenBtn);
        blueBtn=(Button)findViewById(R.id.blueBtn);

        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GradientDrawable gradientDrawable= (GradientDrawable)edittext.getBackground().mutate();
                gradientDrawable.setColor(Color.GREEN);
            }
        });

        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GradientDrawable gradientDrawable =(GradientDrawable) edittext.getBackground().mutate();
                gradientDrawable.setColor(Color.BLUE);
            }
        });
    }
}
