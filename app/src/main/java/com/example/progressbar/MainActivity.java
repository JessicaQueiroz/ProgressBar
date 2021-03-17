package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar pb_horizonal, pb_circular;
    private int progresso = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb_horizonal = findViewById(R.id.progressBarHorizontal);
        pb_circular = findViewById(R.id.progressBarCircular);
    }

    public void carregarProgressBar(View view){
        // Progress horizontal
        this.progresso = this.progresso +1;
        pb_horizonal.setProgress(this.progresso);
    }
}