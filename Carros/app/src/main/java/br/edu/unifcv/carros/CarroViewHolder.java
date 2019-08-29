package br.edu.unifcv.carros;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CarroViewHolder extends RecyclerView.ViewHolder {

    TextView mTeste;

    public CarroViewHolder(@NonNull View itemView) {
        super(itemView);
        mTeste = itemView.findViewById(R.id.txt_teste);
    }

    public void bindData(final CarroModel carroModel, final onClickViewListener mOnClickViewListener) {
        this.mTeste.setText(carroModel.getModelo());

        this.mTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnClickViewListener.click(carroModel.getId());
            }
        });

    }
}
