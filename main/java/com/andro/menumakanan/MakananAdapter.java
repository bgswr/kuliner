package com.andro.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {


    Context context;
    ArrayList<Makanan> arrayList = new ArrayList<>();

    public MakananAdapter(Context context, ArrayList<Makanan> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_menu,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.imgFoto.setImageResource(arrayList.get(position).getId_gambar());
        holder.txtNama.setText(arrayList.get(position).getNama());
        holder.txtHarga.setText(arrayList.get(position).getHarga());

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context,arrayList.get(position).getDeskripsi(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context,DescActivity.class);

                intent.putExtra("id_gambar", arrayList.get(position).getId_gambar());
                intent.putExtra("nama", arrayList.get(position).getNama());
                intent.putExtra("deskripsi", arrayList.get(position).getDeskripsi());
                intent.putExtra("harga", arrayList.get(position).getHarga());

                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNama, txtHarga;
        ImageView imgFoto;
        ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama =(TextView) itemView.findViewById(R.id.txtNama);
            txtHarga =(TextView) itemView.findViewById(R.id.txtHarga);
            imgFoto =(ImageView) itemView.findViewById(R.id.imgFoto);
            mainLayout = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}
