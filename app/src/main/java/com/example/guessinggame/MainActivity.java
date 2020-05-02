package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button buttonOK;
    private EditText editTextNumber;
    private TextView textViewIndication;
    private ProgressBar progressBarTentatives;
    private TextView textViewTentatives;
    private ListView listviewhistorique;
    private int secret;
    private int counter;
    private int score;
    private int maxTentatives = 6;
    private List<String> listHistorique = new ArrayList<>();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOK = findViewById(R.id.buttonOK);
        editTextNumber = findViewById(R.id.editTextNumber);
        textViewIndication = findViewById(R.id.textViewIndication);
        progressBarTentatives=findViewById(R.id.progressBarTentatives);
        textViewTentatives=findViewById(R.id.textViewTentatives);
        listviewhistorique= findViewById(R.id.listviewHistorique);
        initialisation();
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(editTextNumber.getText().toString());
                int res=number*11;
                textViewIndication.setText(String.valueOf(res));
            }

                                    }
        );
    }

    private void initialisation() {
        secret = 1+((int) Math.random()*100);
        counter = 1;
        textViewTentatives.setText(String.valueOf(counter));
        progressBarTentatives.setProgress(counter);
        progressBarTentatives.setMax(maxTentatives);
    }
}