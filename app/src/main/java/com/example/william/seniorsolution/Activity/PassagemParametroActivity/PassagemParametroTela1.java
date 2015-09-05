package com.example.william.seniorsolution.Activity.PassagemParametroActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.william.seniorsolution.R;

/**
 * Created by william on 05/09/2015.
 */
public class PassagemParametroTela1 extends Activity {

    EditText texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitypassagemparametrotela1);
        Button enviar = (Button) findViewById(R.id.button);
        texto = (EditText) findViewById(R.id.editText);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(PassagemParametroTela1.this,PassagemParametroTela2.class);
                it.putExtra("msg",texto.getText().toString());
                startActivity(it);
            }
        });


    }
}
