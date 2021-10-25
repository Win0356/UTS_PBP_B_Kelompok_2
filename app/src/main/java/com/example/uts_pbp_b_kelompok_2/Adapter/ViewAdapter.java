package com.example.uts_pbp_b_kelompok_2.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.uts_pbp_b_kelompok_2.model.Model;
import com.example.uts_pbp_b_kelompok_2.databinding.RvActivityBinding;

import java.util.ArrayList;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.viewHolder> {
    ArrayList<Model> listmodel;

    public ViewAdapter(ArrayList<Model> listmodel){
        this.listmodel = listmodel;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        RvActivityBinding binding;

        public viewHolder(@NonNull RvActivityBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }

    @NonNull
    @Override
    public ViewAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RvActivityBinding binding =RvActivityBinding.inflate(layoutInflater, parent, false);
        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter.viewHolder holder, int position) {
        Model model = listmodel.get(position);
        holder.binding.setMdl(model);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return listmodel.size();
    }
}
