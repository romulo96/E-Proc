package com.example.administrador.eproc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//import com.notarazi.Eproc.R;

public class ConsultarPorNomeDaParteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_por_nome_da_parte);
    }


    //CHAMAR TELA RETORNO DA CONSULTA
    public void startactivity_retorno_consulta_processo (View view){
        Intent activity_retorno_consulta_processo = new Intent(this, RetornoConsultaProcessoActivity.class);
        startActivity(activity_retorno_consulta_processo);
    }


}
