package com.sematech.android.basic.farvardin98;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {


    private ArrayList<String> myList;

    TestAdapter(ArrayList<String> list) {
        myList = list;
    }


    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);

        TestViewHolder holder = new TestViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {


        if (position % 2 == 1) {
            holder.root.setBackgroundResource(R.color.colorAccent);
        }else
            holder.root.setBackgroundResource(R.color.colorPrimary);
        
        String name = myList.get(position);

        holder.txtName.setText(name);

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class TestViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;
        LinearLayout root;

        public TestViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            root = itemView.findViewById(R.id.root);
        }
    }
}
