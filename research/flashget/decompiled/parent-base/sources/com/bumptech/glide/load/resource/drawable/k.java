package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import com.bumptech.glide.o;
import com.bumptech.glide.request.transition.c;

/* compiled from: DrawableTransitionOptions.java */
/* loaded from: classes3.dex */
public final class k extends o<k, Drawable> {
    @o0
    public static k o(@o0 com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return new k().g(gVar);
    }

    @o0
    public static k p() {
        return new k().k();
    }

    @o0
    public static k q(int i4) {
        return new k().l(i4);
    }

    @o0
    public static k r(@o0 c.a aVar) {
        return new k().m(aVar);
    }

    @o0
    public static k s(@o0 com.bumptech.glide.request.transition.c cVar) {
        return new k().g(cVar);
    }

    @Override // com.bumptech.glide.o
    public boolean equals(Object obj) {
        return (obj instanceof k) && super.equals(obj);
    }

    @Override // com.bumptech.glide.o
    public int hashCode() {
        return super.hashCode();
    }

    @o0
    public k k() {
        return m(new c.a());
    }

    @o0
    public k l(int i4) {
        return m(new c.a(i4));
    }

    @o0
    public k m(@o0 c.a aVar) {
        return g(aVar.a());
    }

    @o0
    public k n(@o0 com.bumptech.glide.request.transition.c cVar) {
        return g(cVar);
    }
}
