package com.tale.recyclerviewadapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Author tale. Created on 6/10/15.
 */
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(T data);

}
