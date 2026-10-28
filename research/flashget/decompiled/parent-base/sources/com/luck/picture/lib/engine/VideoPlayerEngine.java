package com.luck.picture.lib.engine;

import android.content.Context;
import android.view.View;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnPlayerListener;

/* loaded from: classes6.dex */
public interface VideoPlayerEngine<T> {
    void addPlayListener(OnPlayerListener onPlayerListener);

    void destroy(T t4);

    boolean isPlaying(T t4);

    View onCreateVideoPlayer(Context context);

    void onPause(T t4);

    void onPlayerAttachedToWindow(T t4);

    void onPlayerDetachedFromWindow(T t4);

    void onResume(T t4);

    void onStarPlayer(T t4, LocalMedia localMedia);

    void removePlayListener(OnPlayerListener onPlayerListener);
}
