package com.tale.recyclerviewadapter.viewholder;

import android.net.Uri;
import android.widget.ImageView;

/**
 * Author tale. Created on 6/28/15.
 */
public interface ImageViewLoader {
    void load(ImageView imageView, CharSequence url);

    void load(ImageView imageView, Uri uri);
}
