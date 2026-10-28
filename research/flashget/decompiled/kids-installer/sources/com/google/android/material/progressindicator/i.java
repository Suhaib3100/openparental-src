package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.o0;
import androidx.vectordrawable.graphics.drawable.b;

/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
abstract class i<T extends Animator> {

    /* renamed from: a, reason: collision with root package name */
    protected j f13878a;

    /* renamed from: b, reason: collision with root package name */
    protected final float[] f13879b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f13880c;

    protected i(int i5) {
        this.f13879b = new float[i5 * 2];
        this.f13880c = new int[i5];
    }

    abstract void a();

    protected float b(int i5, int i6, int i7) {
        return (i5 - i6) / i7;
    }

    public abstract void c();

    public abstract void d(@o0 b.a aVar);

    protected void e(@o0 j jVar) {
        this.f13878a = jVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
