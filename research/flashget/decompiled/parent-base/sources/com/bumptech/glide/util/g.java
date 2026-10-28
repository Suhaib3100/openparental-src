package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.g;

/* compiled from: FixedPreloadSizeProvider.java */
/* loaded from: classes3.dex */
public class g<T> implements g.b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f44963a;

    public g(int i4, int i5) {
        this.f44963a = new int[]{i4, i5};
    }

    @Override // com.bumptech.glide.g.b
    @q0
    public int[] a(@o0 T t4, int i4, int i5) {
        return this.f44963a;
    }
}
