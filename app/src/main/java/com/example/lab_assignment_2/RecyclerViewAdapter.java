package com.example.lab_assignment_2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<Names> studentsList;
    int []pp;
    Names N;


    public RecyclerViewAdapter() {
    }
    public RecyclerViewAdapter(Context context, List<Names> studentsList) {
        this.context = context;
        this.studentsList = studentsList;
        this.pp=pp;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Names name = studentsList.get(position);
        holder.student_name.setText(name.getName());
        Names students = studentsList.get(position);
        holder.profile.setImageResource(students.getPp());
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentsList.remove(position);
                notifyItemRemoved(position);
                Toast.makeText(context, "Deleted an Item", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentsList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView student_name;
        ImageButton delete,like,menu;
        ImageView profile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        student_name = itemView.findViewById(R.id.name_Title);
        delete = itemView.findViewById(R.id.delete);
        profile = itemView.findViewById(R.id.profile);
        like = itemView.findViewById(R.id.like);

        }

        @Override
        public void onClick(View v) {

        }

    }

}

