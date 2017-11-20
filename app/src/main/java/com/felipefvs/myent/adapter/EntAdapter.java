package com.felipefvs.myent.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.felipefvs.myent.R;
import com.felipefvs.myent.model.Ent;

import java.util.List;

/**
 * Created by FELIPESIQUEIRAB20588 on 17/11/2017.
 */

public class EntAdapter extends RecyclerView.Adapter<EntAdapter.EntViewHolder>{

    private List<Ent> mEntList;

    public class EntViewHolder extends RecyclerView.ViewHolder {

        public TextView title;

        public EntViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.mEntNameTextView);
        }
    }

    public EntAdapter(List<Ent> entList) {
        this.mEntList = entList;
    }

    @Override
    public EntViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ent_item, parent, false);

        return new EntViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EntViewHolder holder, int position) {

        Ent ent = mEntList.get(position);
        holder.title.setText(ent.getName());

    }

    @Override
    public int getItemCount() {
        return mEntList.size();
    }


}