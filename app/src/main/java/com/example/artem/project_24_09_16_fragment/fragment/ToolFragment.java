package com.example.artem.project_24_09_16_fragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.artem.project_24_09_16_fragment.Config;
import com.example.artem.project_24_09_16_fragment.R;
import com.example.artem.project_24_09_16_fragment.adaptors.StoreAdaptor;
import com.example.artem.project_24_09_16_fragment.adaptors.ToolAdaptor;

import java.util.ArrayList;

/**
 * Created by Artem on 24.09.2016.
 */
public class ToolFragment extends Fragment{
    private ArrayList mData;
    private RecyclerView mRecyclerView;
    private ToolAdaptor mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tool, null);

        Config data = new Config();
        mData = data.getToolsData();

        mRecyclerView = (RecyclerView) v.findViewById(R.id.recycler_view_tool);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(v.getContext(), LinearLayoutManager.VERTICAL, false));
        mAdapter = new ToolAdaptor(v.getContext(), mData);
        mRecyclerView.setAdapter(mAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
