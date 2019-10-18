package com.example.primeiroapp.exemplo5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.primeiroapp.R;
import com.example.primeiroapp.exemplo2.LayoutInflaterActivity;

import java.util.List;

public class AdapterPlanetas extends BaseAdapter {

    private Context context;
    private final List<Planeta> planetas;

    public AdapterPlanetas(Context context, List<Planeta> planetas) {
        this.context = context;
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas != null ? planetas.size() : 0;  // se a lista de planetas diferente de nulo, retorno o tamanho da lista
    }

    @Override
    public Object getItem(int position) {
        return planetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.adapter_item_planeta, parent, false);

        TextView txtNomePlaneta = (TextView) view.findViewById(R.id.txtNomePlaneta);
        ImageView imagemPlaneta = (ImageView) view.findViewById(R.id.imagemPlaneta);

        Planeta planeta = planetas.get(position);
        txtNomePlaneta.setText(planeta.getNome());
        imagemPlaneta.setImageResource(planeta.getImagem());

        return view;
    }
}
