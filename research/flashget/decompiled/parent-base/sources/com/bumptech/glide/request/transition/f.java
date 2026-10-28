package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.q0;

/* compiled from: Transition.java */
/* loaded from: classes3.dex */
public interface f<R> {

    /* compiled from: Transition.java */
    public interface a {
        void b(Drawable drawable);

        @q0
        Drawable c();

        View getView();
    }

    boolean a(R r4, a aVar);
}
