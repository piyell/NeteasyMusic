package com.zsorg.neteasecloudmusic.views.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zsorg.neteasecloudmusic.BaseHolder;
import com.zsorg.neteasecloudmusic.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by piyel_000 on 2017/1/6.
 */

public class AlbumHolder extends BaseItemHolder {
    @BindView(R.id.iv_album)
    public ImageView ivAlbum;
    @BindView(R.id.tv_singer)
    public TextView tvSinger;
    @BindView(R.id.tv_songs_in_total)
    public TextView tvCount;
    @BindView(R.id.iv_right)
    public ImageView ivRight;

    public AlbumHolder(View view) {
        super(view);

        ButterKnife.bind(this, view);
    }
}
