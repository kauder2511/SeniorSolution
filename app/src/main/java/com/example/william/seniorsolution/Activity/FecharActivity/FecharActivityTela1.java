package com.example.william.seniorsolution.Activity.FecharActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by william on 05/09/2015.
 */
public class FecharActivityTela1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button bt  = new Button(this);
        bt.setText("Clique aqui para Fechar a Activity");
        setContentView(bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
