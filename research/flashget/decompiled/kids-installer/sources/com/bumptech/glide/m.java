package com.bumptech.glide;

import androidx.annotation.o0;
import com.bumptech.glide.m;
import com.bumptech.glide.request.transition.j;

/* compiled from: TransitionOptions.java */
/* loaded from: classes.dex */
public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.request.transition.g<? super TranscodeType> f11896o = com.bumptech.glide.request.transition.e.c();

    private CHILD d() {
        return this;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    @o0
    public final CHILD b() {
        return f(com.bumptech.glide.request.transition.e.c());
    }

    final com.bumptech.glide.request.transition.g<? super TranscodeType> c() {
        return this.f11896o;
    }

    @o0
    public final CHILD e(int i5) {
        return f(new com.bumptech.glide.request.transition.h(i5));
    }

    @o0
    public final CHILD f(@o0 com.bumptech.glide.request.transition.g<? super TranscodeType> gVar) {
        this.f11896o = (com.bumptech.glide.request.transition.g) com.bumptech.glide.util.l.d(gVar);
        return this;
    }

    @o0
    public final CHILD i(@o0 j.a aVar) {
        return f(new com.bumptech.glide.request.transition.i(aVar));
    }
}
