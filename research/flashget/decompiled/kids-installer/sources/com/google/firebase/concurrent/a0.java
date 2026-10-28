package com.google.firebase.concurrent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b0 f15420o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Runnable f15421p;

    public /* synthetic */ a0(b0 b0Var, Runnable runnable) {
        this.f15420o = b0Var;
        this.f15421p = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15420o.c(this.f15421p);
    }
}
