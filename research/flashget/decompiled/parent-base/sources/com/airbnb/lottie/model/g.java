package com.airbnb.lottie.model;

import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.collection.g1;
import com.airbnb.lottie.k;

/* compiled from: LottieCompositionCache.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f39089b = new g();

    /* renamed from: a, reason: collision with root package name */
    private final g1<String, k> f39090a = new g1<>(20);

    @m1
    g() {
    }

    public static g c() {
        return f39089b;
    }

    public void a() {
        this.f39090a.evictAll();
    }

    @q0
    public k b(@q0 String str) {
        if (str == null) {
            return null;
        }
        return this.f39090a.get(str);
    }

    public void d(@q0 String str, k kVar) {
        if (str == null) {
            return;
        }
        this.f39090a.put(str, kVar);
    }

    public void e(int i4) {
        this.f39090a.resize(i4);
    }
}
