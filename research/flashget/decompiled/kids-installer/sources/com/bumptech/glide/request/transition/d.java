package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.transition.f;

/* compiled from: DrawableCrossFadeTransition.java */
/* loaded from: classes3.dex */
public class d implements f<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f12115a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12116b;

    public d(int i5, boolean z5) {
        this.f12115a = i5;
        this.f12116b = z5;
    }

    @Override // com.bumptech.glide.request.transition.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, f.a aVar) {
        Drawable e6 = aVar.e();
        if (e6 == null) {
            e6 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{e6, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f12116b);
        transitionDrawable.startTransition(this.f12115a);
        aVar.c(transitionDrawable);
        return true;
    }
}
