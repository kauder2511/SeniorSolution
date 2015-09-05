package com.example.william.seniorsolution.Activity.ListaCustomizada;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by william on 05/09/2015.
 */
public class ExemploSmileAdapter extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<Smile> list = new ArrayList<Smile>();
        list.add(new Smile("feliz",Smile.FELIZ));
        list.add(new Smile("Triste",Smile.TRISTE));
        list.add(new Smile("Louco",Smile.LOUCO));
        setListAdapter(new SmileAdapter(this,list));

     }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Smile smile = (Smile) this.getListAdapter().getItem(position);
        Toast.makeText(ExemploSmileAdapter.this,"selecionou: "+ smile.nome, Toast.LENGTH_SHORT).show();
    }
}
