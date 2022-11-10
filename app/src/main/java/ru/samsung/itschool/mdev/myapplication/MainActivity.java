package ru.samsung.itschool.mdev.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private int counter = 0;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.superButton);
        tv = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                tv.setText(Integer.toString(counter));
            }
        });
        Log.d("RRR","1 onCreate()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("val",counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle getState) {
        super.onRestoreInstanceState(getState);
        counter = getState.getInt("val");
        tv.setText(Integer.toString(counter));
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","2 onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","3 onPause()");
    }

    @Override
    protected void onDestroy() {
        Log.d("RRR","4 onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","5 onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","6 onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","7 onResume()");
    }
}