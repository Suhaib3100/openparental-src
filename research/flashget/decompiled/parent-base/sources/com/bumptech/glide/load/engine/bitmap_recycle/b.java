package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: ArrayPool.java */
/* loaded from: classes3.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f43859a = 65536;

    void b(int i4);

    void c();

    <T> T d(int i4, Class<T> cls);

    <T> T e(int i4, Class<T> cls);

    @Deprecated
    <T> void f(T t4, Class<T> cls);

    <T> void put(T t4);
}
