package com.example.william.seniorsolution.Intent.FazerLigacao;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by william on 05/09/2015.
 */
public class FazerLigacao extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button bt = new Button(this);
        bt.setText("Clique aqui Para fazer a ligação");
        setContentView(bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:999999999");
                Intent it = new Intent(Intent.ACTION_CALL,uri);
                startActivity(it);
            }
        });
    }
}
