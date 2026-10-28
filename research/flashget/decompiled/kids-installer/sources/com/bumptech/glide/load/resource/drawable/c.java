package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import com.bumptech.glide.m;
import com.bumptech.glide.request.transition.c;
import com.bumptech.glide.request.transition.g;

/* compiled from: DrawableTransitionOptions.java */
/* loaded from: classes3.dex */
public final class c extends m<c, Drawable> {
    @o0
    public static c n(@o0 g<Drawable> gVar) {
        return new c().f(gVar);
    }

    @o0
    public static c o() {
        return new c().j();
    }

    @o0
    public static c p(int i5) {
        return new c().k(i5);
    }

    @o0
    public static c q(@o0 c.a aVar) {
        return new c().l(aVar);
    }

    @o0
    public static c s(@o0 com.bumptech.glide.request.transition.c cVar) {
        return new c().m(cVar);
    }

    @o0
    public c j() {
        return l(new c.a());
    }

    @o0
    public c k(int i5) {
        return l(new c.a(i5));
    }

    @o0
    public c l(@o0 c.a aVar) {
        return m(aVar.a());
    }

    @o0
    public c m(@o0 com.bumptech.glide.request.transition.c cVar) {
        return f(cVar);
    }
}
