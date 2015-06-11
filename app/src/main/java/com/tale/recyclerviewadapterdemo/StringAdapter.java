package com.tale.recyclerviewadapterdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tale.recyclerviewadapter.SimpleRecyclerViewAdapter;
import com.tale.recyclerviewadapter.viewholder.BaseViewHolder;
import com.tale.recyclerviewadapter.viewholder.Text1VH;

/**
 * Author tale. Created on 6/10/15.
 */
public class StringAdapter extends SimpleRecyclerViewAdapter<String> {

    @Override
    public BaseViewHolder<String> onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        final View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        return new Text1VH<>(view, android.R.id.text1);
    }
}
