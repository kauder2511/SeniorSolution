package com.example.william.seniorsolution.Activity.ListaCustomizada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.william.seniorsolution.R;

import java.util.List;

/**
 * Created by william on 05/09/2015.
 */
public class SmileAdapter extends BaseAdapter
{
        private Context context;
        private List<Smile> lista;

    public SmileAdapter(Context context, List<Smile> lista) {
        this.context = context;
        this.lista = lista;
    }

    public int getCount(){
        return lista.size();
    }

    public Object getItem(int position){
        return lista.get(position);
    }

    public long getItemId (int position){
        return position;
    }

    public View getView (int posicao,View convertView, ViewGroup parent){
        Smile smile = lista.get(posicao);
        LayoutInflater inflater =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.smile_detalhes,null);
        TextView text = (TextView) v.findViewById(R.id.nome);
        text.setText(smile.nome);
        ImageView img = (ImageView) v.findViewById(R.id.img);
        img.setImageResource(smile.getImagem());
        return v;
    }
}
