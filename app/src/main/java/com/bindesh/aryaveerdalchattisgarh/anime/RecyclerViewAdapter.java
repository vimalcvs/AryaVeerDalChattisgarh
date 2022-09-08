package com.bindesh.aryaveerdalchattisgarh.anime;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<com.bindesh.aryaveerdalchattisgarh.anime.Anime> mData ;
    RequestOptions option;


    public RecyclerViewAdapter(Context mContext, List<com.bindesh.aryaveerdalchattisgarh.anime.Anime> mData) {
        this.mContext = mContext;
        this.mData = mData;

        option = new RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.loading_shape)
                .error(R.drawable.loading_shape);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.anime_row_item,parent,false) ;
        final MyViewHolder viewHolder = new MyViewHolder(view) ;

        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mContext, AnimeActivity.class);
                i.putExtra("anime_name",mData.get(viewHolder.getAdapterPosition()).getName());
                i.putExtra("anime_description",mData.get(viewHolder.getAdapterPosition()).getDescription());

                i.putExtra("anime_category",mData.get(viewHolder.getAdapterPosition()).getCategorie());

                i.putExtra("anime_img",mData.get(viewHolder.getAdapterPosition()).getImage_url());
                mContext.startActivity(i);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());

        holder.tv_category.setText(mData.get(position).getCategorie());

        Glide.with(mContext)
                .load(mData.get(position)
                .getImage_url())
                .apply(option)
                .into(holder.img_thumbnail);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name ;
        TextView tv_rating ;
        TextView tv_studio ;
        TextView tv_category;
        ImageView img_thumbnail;
        LinearLayoutCompat view_container;

        public MyViewHolder(View itemView) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            tv_name = itemView.findViewById(R.id.anime_name);
            tv_category = itemView.findViewById(R.id.categorie);

            img_thumbnail = itemView.findViewById(R.id.thumbnail);

        }
    }

}
