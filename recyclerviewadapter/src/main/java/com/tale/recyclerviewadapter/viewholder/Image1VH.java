package com.tale.recyclerviewadapter.viewholder;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import com.tale.recyclerviewadapter.Asserts;

/**
 * ViewHolder class. This will help to bind content of view which has only one ImageView.
 */
public class Image1VH<T> extends BaseViewHolder<T> {

    private final ImageView iv;
    private final ImageViewLoader imageViewLoader;

    /**
     * Constructor to instance a Text1ViewHolder
     *
     * @param view            The view object.
     * @param imageViewId     The id of the {@link ImageView}.
     * @param imageViewLoader The {@link ImageViewLoader} which will be used to bind imageView.
     */
    public Image1VH(View view, int imageViewId, ImageViewLoader imageViewLoader) {
        super(view);
        Asserts.assertNotNull(imageViewLoader);
        this.imageViewLoader = imageViewLoader;
        iv = (ImageView) view.findViewById(imageViewId);
        Asserts.assertNotNull(iv, "the imageViewId is not valid");
    }

    @Override
    public void bind(T data) {
        if (data instanceof String) {
            setImageSource((CharSequence) data);
        } else if (data instanceof Uri) {
            setImageSource((Uri) data);
        }
    }

    public void setImageSource(CharSequence source) {
        imageViewLoader.load(iv, source);
    }

    public void setImageSource(Uri source) {
        imageViewLoader.load(iv, source);
    }
}
