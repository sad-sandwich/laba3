package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Snackbar snackbar = Snackbar.make(view, "Hello Android",
                Snackbar.LENGTH_LONG);
        snackbar.setAction("Next...", v -> {
            Toast toast = Toast.makeText(getApplicationContext(), "Next clicked!",Toast.LENGTH_LONG);
            toast.show();
        });
        snackbar.show();
        snackbar.setTextColor(0XFF81C784);
        snackbar.setBackgroundTint(0XFF555555);
        snackbar.setActionTextColor(0XFF0277BD);
    }
}
