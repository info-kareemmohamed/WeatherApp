package com.example.weatherapp.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherapp.R;
import com.example.weatherapp.model.ToDay;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ToDayHolder> {
    private List<ToDay> list;
    private Context context;

    public RecyclerAdapter(List<ToDay> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override


    public ToDayHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ToDayHolder(LayoutInflater.from(context).inflate(R.layout.cardtoday, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ToDayHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ToDayHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView textView, textView2;

        public ToDayHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
            textView2 = itemView.findViewById(R.id.text2);
        }

        public void bind(ToDay item) {
            textView.setText(item.getTime());
            textView2.setText(item.getTemperature());
        }


    }


}
