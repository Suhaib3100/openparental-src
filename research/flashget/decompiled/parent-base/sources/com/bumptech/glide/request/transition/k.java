package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.request.transition.f;

/* compiled from: ViewTransition.java */
/* loaded from: classes3.dex */
public class k<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    private final a f44932a;

    /* compiled from: ViewTransition.java */
    interface a {
        Animation a(Context context);
    }

    k(a aVar) {
        this.f44932a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r4, f.a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f44932a.a(view.getContext()));
        return false;
    }
}
