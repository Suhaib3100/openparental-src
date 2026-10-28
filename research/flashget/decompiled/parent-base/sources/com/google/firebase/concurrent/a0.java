package com.google.firebase.concurrent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f58497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f58498c;

    public /* synthetic */ a0(b0 b0Var, Runnable runnable) {
        this.f58497b = b0Var;
        this.f58498c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f58497b.c(this.f58498c);
    }
}
