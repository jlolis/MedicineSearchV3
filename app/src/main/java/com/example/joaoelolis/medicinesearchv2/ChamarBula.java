package com.example.joaoelolis.medicinesearchv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChamarBula extends AppCompatActivity {

    private TextView txtNome;
    private TextView txtBula;
    private TextView txtObservacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamar_bula);

        txtNome = findViewById(R.id.textViewNome);
        txtBula = findViewById(R.id.textViewBula);
        txtObservacao = findViewById(R.id.textViewObs);
    }


    public void setTxtBula(TextView txtBula) {
        this.txtBula = txtBula;
    }
}
