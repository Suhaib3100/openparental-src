package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.q0;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public interface f<R> {

    /* compiled from: Transition.java */
    public interface a {
        void c(Drawable drawable);

        View d();

        @q0
        Drawable e();
    }

    boolean a(R r5, a aVar);
}
