package br.edu.unifcv.carros;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CarroAdapter extends RecyclerView.Adapter<CarroViewHolder> {

    private List<CarroModel> mCarros;
    private onClickViewListener mOnClickViewListener;


    public CarroAdapter(List<CarroModel> mCarros, onClickViewListener onClickViewListener) {
        this.mCarros = mCarros;
        this.mOnClickViewListener = onClickViewListener;
    }

    @NonNull
    @Override
    public CarroViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.linha_layout, viewGroup, false);
        return new CarroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarroViewHolder carroViewHolder, int i) {
        carroViewHolder.bindData(this.mCarros.get(i), mOnClickViewListener);
    }

    @Override
    public int getItemCount() {
        return mCarros.size();
    }
}
