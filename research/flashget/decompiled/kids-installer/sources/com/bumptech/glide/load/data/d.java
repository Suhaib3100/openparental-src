package com.bumptech.glide.load.data;

import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: DataFetcher.java */
/* loaded from: classes.dex */
public interface d<T> {

    /* compiled from: DataFetcher.java */
    public interface a<T> {
        void c(@o0 Exception exc);

        void f(@q0 T t5);
    }

    @o0
    Class<T> a();

    void b();

    void cancel();

    @o0
    com.bumptech.glide.load.a d();

    void e(@o0 com.bumptech.glide.i iVar, @o0 a<? super T> aVar);
}
