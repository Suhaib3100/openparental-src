package com.tencent.beacon.base.net.call;

/* compiled from: JceCall.java */
/* loaded from: classes6.dex */
class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Callback f71348a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f71349b;

    f(i iVar, Callback callback) {
        this.f71349b = iVar;
        this.f71348a = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71349b.b(this.f71348a);
    }
}
