package com.tale.recyclerviewadapter.viewholder;

import android.view.View;
import android.widget.TextView;

import com.tale.recyclerviewadapter.Assets;

/**
 * ViewHolder class. This will help to bind content of view which has only one TextView.
 */
public class Text1VH<T> extends BaseViewHolder<T> {

    private final TextView tv;

    /**
     * Constructor to instance a Text1ViewHolder
     *
     * @param view       The view object.
     * @param textViewId The id of the {@link android.widget.TextView}.
     */
    public Text1VH(View view, int textViewId) {
        super(view);
        tv = (TextView) view.findViewById(textViewId);
        Assets.assetNotNull(tv, "the textViewId is not valid");
    }

    @Override
    public void bind(T data) {
        if (data instanceof String) {
            tv.setText((CharSequence) data);
        }
    }

    public void setText(CharSequence text) {
        tv.setText(text);
    }
}
