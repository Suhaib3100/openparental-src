package com.tencent.beacon.a.a;

/* compiled from: BeaconBus.java */
/* loaded from: classes6.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f71012a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f71013b;

    a(b bVar, c cVar) {
        this.f71013b = bVar;
        this.f71012a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71013b.b(this.f71012a);
    }
}
