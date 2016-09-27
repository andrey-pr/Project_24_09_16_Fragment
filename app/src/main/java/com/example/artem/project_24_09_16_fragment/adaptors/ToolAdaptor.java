package com.example.artem.project_24_09_16_fragment.adaptors;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.artem.project_24_09_16_fragment.R;
import com.example.artem.project_24_09_16_fragment.model.tools;

import java.util.ArrayList;

/**
 * Created by Artem on 24.09.2016.
 */
public class ToolAdaptor extends RecyclerView.Adapter<ToolAdaptor.ToolsHolder> {
    private Context mContext;
    private ArrayList mToolsData;
    public ToolAdaptor(Context context, ArrayList toolsData) {
        this.mContext = context;
        this.mToolsData = toolsData;
    }

    static class ToolsHolder extends RecyclerView.ViewHolder {
        public CardView cardTools;
        //public ImageView image_url;
        public TextView textId;
        public TextView textBrand;
        public TextView textModel;
        public TextView textType;
        public TextView textPrice;
        public TextView textQuantity;
        public ToolsHolder(View itemView) {
            super(itemView);
            this.cardTools = (CardView) itemView.findViewById(R.id.card_view_instrument);
            //this.image_url = (ImageView) itemView.findViewById(R.id.image_view_image_url);
            this.textId = (TextView) itemView.findViewById(R.id.txt_id);
            this.textBrand = (TextView) itemView.findViewById(R.id.txt_brand);
            this.textModel = (TextView) itemView.findViewById(R.id.txt_model);
            this.textType = (TextView) itemView.findViewById(R.id.txt_type);
            this.textPrice = (TextView) itemView.findViewById(R.id.txt_price);
            this.textQuantity = (TextView) itemView.findViewById(R.id.txt_quantity);
        }
    }

    @Override
    public ToolsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tool, parent, false);
        ToolsHolder toolsViewHolder = new ToolsHolder(view);
        return toolsViewHolder;
    }

    @Override
    public void onBindViewHolder(ToolsHolder holder, int position) {
        final tools tool = (tools) mToolsData.get(position);
        //holder.image_url.setImageURI(new URL(tool.getImageUrl()));
        try
        {
            holder.textId.setText(tool .getId());
        }catch(Exception e){}
        try
        {
            holder.textBrand.setText(tool.getBrand());
        }catch(Exception e){}
        try
        {
            holder.textModel.setText(tool.getModel());
        }catch(Exception e){}
        try
        {
            holder.textType.setText(tool.getModel());
        }catch(Exception e){}
        try
        {
            holder.textPrice.setText(tool.getModel());
        }catch(Exception e){}
        try
        {
            holder.textQuantity.setText(tool.getModel());
        }catch(Exception e){}
    }

    @Override
    public int getItemCount() {
        return mToolsData.size();
    }
}
