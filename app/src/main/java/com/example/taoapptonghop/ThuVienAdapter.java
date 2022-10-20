package com.example.taoapptonghop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ThuVienAdapter extends RecyclerView.Adapter<ThuVienAdapter.ThuVienViewHolder>{
    private List<ThuVien> thuVienList;

    public ThuVienAdapter(List<ThuVien> thuVienList) {
        this.thuVienList = thuVienList;
    }

    public ThuVienViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_listview,parent,false);
        return new ThuVienViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThuVienViewHolder holder, int position) {
        ThuVien thuVien = thuVienList.get(position);
        if(thuVien == null){
            return;
        }
        holder.tvTenSach.setText(thuVien.getTenSach());
        holder.tvTacGia.setText(thuVien.getChitiet());
        holder.tvViTri.setText(thuVien.getVitri());
        holder.imgHinh.setImageResource(thuVien.getHinh());

    }

    @Override
    public int getItemCount() {
        if(thuVienList !=null){
            return thuVienList.size();
        }
        return 0;
    }

    class ThuVienViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTenSach,tvTacGia,tvViTri;
        private ImageView imgHinh;
        public ThuVienViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTenSach = itemView.findViewById(R.id.tv_name);
            tvTacGia = itemView.findViewById(R.id.tv_infor);
            tvViTri = itemView.findViewById(R.id.tv_vitri);
            imgHinh = itemView.findViewById(R.id.imgAvatar);
        }
    }
}
