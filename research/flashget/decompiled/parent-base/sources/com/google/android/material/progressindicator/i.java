package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.o0;
import androidx.vectordrawable.graphics.drawable.b;

/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes6.dex */
abstract class i<T extends Animator> {

    /* renamed from: a, reason: collision with root package name */
    protected j f53726a;

    /* renamed from: b, reason: collision with root package name */
    protected final float[] f53727b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f53728c;

    protected i(int i4) {
        this.f53727b = new float[i4 * 2];
        this.f53728c = new int[i4];
    }

    abstract void a();

    protected float b(int i4, int i5, int i6) {
        return (i4 - i5) / i6;
    }

    public abstract void c();

    public abstract void d(@o0 b.a aVar);

    protected void e(@o0 j jVar) {
        this.f53726a = jVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
