package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.f;

/* compiled from: FixedPreloadSizeProvider.java */
/* loaded from: classes3.dex */
public class g<T> implements f.b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f12156a;

    public g(int i5, int i6) {
        this.f12156a = new int[]{i5, i6};
    }

    @Override // com.bumptech.glide.f.b
    @q0
    public int[] a(@o0 T t5, int i5, int i6) {
        return this.f12156a;
    }
}
