package com.example.artem.project_24_09_16_fragment.adaptors;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.artem.project_24_09_16_fragment.R;
import com.example.artem.project_24_09_16_fragment.model.store;

import java.util.ArrayList;

/**
 * Created by Artem on 24.09.2016.
 */
public class StoreAdaptor extends RecyclerView.Adapter<StoreAdaptor.StoreHolder> {
    private Context mContext;
    private ArrayList mStoreData;
    public StoreAdaptor(Context context, ArrayList storeData) {
        this.mContext = context;
        this.mStoreData = storeData;
    }

    static class StoreHolder extends RecyclerView.ViewHolder {
        public CardView cardStore;
        public TextView textNameStore;
        public TextView textAddressStore;
        public TextView textPhoneStore;
        public TextView textLocationStore;
        public StoreHolder(View itemView) {
            super(itemView);
            this.cardStore = (CardView) itemView.findViewById(R.id.card_view_store);
            this.textNameStore = (TextView) itemView.findViewById(R.id.txt_name_store);
            this.textAddressStore = (TextView) itemView.findViewById(R.id.txt_address_store);
            this.textPhoneStore = (TextView) itemView.findViewById(R.id.txt_phone_store);
            this.textLocationStore = (TextView) itemView.findViewById(R.id.txt_location);
        }
    }

    @Override
    public StoreHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_store, parent, false);
        StoreHolder storeViewHolder = new StoreHolder(view);
        return  storeViewHolder;
    }

    @Override
    public void onBindViewHolder(StoreHolder holder, int position) {
        final store store = (store) mStoreData.get(position);
        holder.textNameStore.setText(store.getName());
        holder.textAddressStore.setText(store.getAddress());
        holder.textPhoneStore.setText(store.getPhone());
    }

    @Override
    public int getItemCount() {
        return mStoreData.size();
    }
}
