package com.example.william.seniorsolution.Activity.PassagemParametroActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by william on 05/09/2015.
 */
public class PassagemParametroTela2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        Intent it = getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            String msg = params.getString("msg");
            text.setText(msg);
        }
        setContentView(text);
    }


}
