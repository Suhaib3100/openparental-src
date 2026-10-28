package com.bumptech.glide;

import androidx.annotation.o0;
import com.bumptech.glide.o;
import com.bumptech.glide.request.transition.j;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TransitionOptions.java */
/* loaded from: classes3.dex */
public abstract class o<CHILD extends o<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.request.transition.g<? super TranscodeType> f44757b = com.bumptech.glide.request.transition.e.c();

    private CHILD e() {
        return this;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    @o0
    public final CHILD c() {
        return g(com.bumptech.glide.request.transition.e.c());
    }

    final com.bumptech.glide.request.transition.g<? super TranscodeType> d() {
        return this.f44757b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return com.bumptech.glide.util.o.e(this.f44757b, ((o) obj).f44757b);
        }
        return false;
    }

    @o0
    public final CHILD f(int i4) {
        return g(new com.bumptech.glide.request.transition.h(i4));
    }

    @o0
    public final CHILD g(@o0 com.bumptech.glide.request.transition.g<? super TranscodeType> gVar) {
        this.f44757b = (com.bumptech.glide.request.transition.g) com.bumptech.glide.util.m.f(gVar, ProtectedSandApp.s("ࠊ"));
        return this;
    }

    public int hashCode() {
        com.bumptech.glide.request.transition.g<? super TranscodeType> gVar = this.f44757b;
        if (gVar != null) {
            return gVar.hashCode();
        }
        return 0;
    }

    @o0
    public final CHILD i(@o0 j.a aVar) {
        return g(new com.bumptech.glide.request.transition.i(aVar));
    }
}
