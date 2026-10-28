package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.transition.f;

/* compiled from: DrawableCrossFadeTransition.java */
/* loaded from: classes3.dex */
public class d implements f<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f44921a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44922b;

    public d(int i4, boolean z4) {
        this.f44921a = i4;
        this.f44922b = z4;
    }

    @Override // com.bumptech.glide.request.transition.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, f.a aVar) {
        Drawable c5 = aVar.c();
        if (c5 == null) {
            c5 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{c5, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f44922b);
        transitionDrawable.startTransition(this.f44921a);
        aVar.b(transitionDrawable);
        return true;
    }
}
