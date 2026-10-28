package com.bumptech.glide;

import androidx.annotation.o0;
import com.bumptech.glide.request.transition.j;

/* compiled from: GenericTransitionOptions.java */
/* loaded from: classes3.dex */
public final class b<TranscodeType> extends o<b<TranscodeType>, TranscodeType> {
    @o0
    public static <TranscodeType> b<TranscodeType> k(int i4) {
        return new b().f(i4);
    }

    @o0
    public static <TranscodeType> b<TranscodeType> l(@o0 com.bumptech.glide.request.transition.g<? super TranscodeType> gVar) {
        return new b().g(gVar);
    }

    @o0
    public static <TranscodeType> b<TranscodeType> m(@o0 j.a aVar) {
        return new b().i(aVar);
    }

    @o0
    public static <TranscodeType> b<TranscodeType> n() {
        return new b().c();
    }

    @Override // com.bumptech.glide.o
    public boolean equals(Object obj) {
        return (obj instanceof b) && super.equals(obj);
    }

    @Override // com.bumptech.glide.o
    public int hashCode() {
        return super.hashCode();
    }
}
