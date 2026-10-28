package com.tencent.beacon.a.b;

/* compiled from: AbsAsyncTask.java */
/* loaded from: classes6.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f71022a;

    a(b bVar) {
        this.f71022a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.beacon.base.net.c.d().a(com.tencent.beacon.d.b.b().e() - 1);
        this.f71022a.a(0L, 1);
        this.f71022a.f71025c = false;
    }
}
