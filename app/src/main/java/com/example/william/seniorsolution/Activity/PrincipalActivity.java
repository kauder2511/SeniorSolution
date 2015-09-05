package com.example.william.seniorsolution.Activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.william.seniorsolution.Activity.FecharActivity.FecharActivityTela1;
import com.example.william.seniorsolution.Activity.ListaCustomizada.ExemploSmileAdapter;
import com.example.william.seniorsolution.Activity.PassagemParametroActivity.PassagemParametroTela1;

/**
 * Created by william on 05/09/2015.
 */
public class PrincipalActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] lista = new String[] {
                "Passagem de Parametro entre Activity's",
                "Fechar uma Activity",
                "Lista Customizada"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position){
            case 0:
                Intent it = new Intent(PrincipalActivity.this, PassagemParametroTela1.class);
                startActivity(it);
                break;
            case 1:
                Intent it2 = new Intent(PrincipalActivity.this, FecharActivityTela1.class);
                startActivity(it2);
                break;
            case 2:
                Intent it3 = new Intent(PrincipalActivity.this, ExemploSmileAdapter.class);
                startActivity(it3);
                break;
        }
    }
}
