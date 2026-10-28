package com.bumptech.glide.load.data;

import androidx.annotation.o0;
import java.io.IOException;

/* compiled from: DataRewinder.java */
/* loaded from: classes.dex */
public interface e<T> {

    /* compiled from: DataRewinder.java */
    public interface a<T> {
        @o0
        Class<T> a();

        @o0
        e<T> b(@o0 T t5);
    }

    @o0
    T a() throws IOException;

    void b();
}
