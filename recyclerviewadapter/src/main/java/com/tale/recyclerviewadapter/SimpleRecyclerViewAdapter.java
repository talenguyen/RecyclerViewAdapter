package com.tale.recyclerviewadapter;

import com.tale.recyclerviewadapter.viewholder.BaseViewHolder;

/**
 * Author tale. Created on 6/10/15.
 */
public abstract class SimpleRecyclerViewAdapter<T> extends RecyclerTypedAdapter<T, BaseViewHolder<T>> {

    @Override
    public void onBindViewHolder(BaseViewHolder<T> holder, int position) {
        holder.bind(getItem(position));
    }
}
