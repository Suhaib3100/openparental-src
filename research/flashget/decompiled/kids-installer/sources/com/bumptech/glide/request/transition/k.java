package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.request.transition.f;

/* compiled from: ViewTransition.java */
/* loaded from: classes3.dex */
public class k<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    private final a f12126a;

    /* compiled from: ViewTransition.java */
    /* loaded from: classes.dex */
    interface a {
        Animation a(Context context);
    }

    k(a aVar) {
        this.f12126a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r5, f.a aVar) {
        View d6 = aVar.d();
        if (d6 == null) {
            return false;
        }
        d6.clearAnimation();
        d6.startAnimation(this.f12126a.a(d6.getContext()));
        return false;
    }
}
