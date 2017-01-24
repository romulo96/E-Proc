package com.example.administrador.eproc;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RetornoConsultaProcessoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retorno_consulta_processo);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Processo Adcionado Aos Favoritos", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });





    }





    // CHAMAR TELA DETALHE DO PROCESSO
    public void startactivity_detalhes_processo (View view){
        Intent activity_detalhes_processo = new Intent(this, DetalhesProcessoActivity.class);
        startActivity(activity_detalhes_processo);
    }

}
