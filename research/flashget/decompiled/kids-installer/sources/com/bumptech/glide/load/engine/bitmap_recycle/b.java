package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: ArrayPool.java */
/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11151a = 65536;

    void a(int i5);

    void b();

    <T> T c(int i5, Class<T> cls);

    @Deprecated
    <T> void d(T t5, Class<T> cls);

    <T> T e(int i5, Class<T> cls);

    <T> void put(T t5);
}
