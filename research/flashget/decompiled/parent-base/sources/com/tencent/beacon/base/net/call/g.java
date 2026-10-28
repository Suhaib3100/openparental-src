package com.tencent.beacon.base.net.call;

/* compiled from: JceCall.java */
/* loaded from: classes6.dex */
class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Callback f71350a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f71351b;

    g(i iVar, Callback callback) {
        this.f71351b = iVar;
        this.f71350a = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71351b.b(this.f71350a);
    }
}
