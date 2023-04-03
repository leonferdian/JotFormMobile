package com.example.jotformpadma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String HttpURL = "";
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
//        setSupportActionBar(toolbar);
//        toolbar.setLogoDescription(getResources().getString(R.string.app_name));
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText(getResources().getString(R.string.app_name));


        changeStatusBarColor();

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);


        // perform click event on edit text
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), panel_view.class);
                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), panel_view.class);
                intent.putExtra(HttpURL, "https://form.jotform.com/230858570646465");
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), panel_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), panel_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), panel_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), panel_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), output_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), output_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), output_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), output_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), output_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                Intent intent = new Intent(getApplicationContext(), output_view.class);
//                intent.putExtra(HttpURL, "https://form.jotform.com/230821367787465");
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "The field is empty", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            //window.setStatusBarColor(Color.TRANSPARENT);
            window.setStatusBarColor(getResources().getColor(R.color.JotFormDark));
        }
    }
}