package com.tencent.beacon.base.net.call;

/* compiled from: JceCall.java */
/* loaded from: classes6.dex */
public class i implements a<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final JceRequestEntity f71354a;

    /* renamed from: b, reason: collision with root package name */
    private long f71355b;

    public i(JceRequestEntity jceRequestEntity) {
        this.f71354a = jceRequestEntity;
    }

    public void a(Callback<byte[]> callback) {
        com.tencent.beacon.a.b.b.a().a(new f(this, callback));
    }

    public void b(Callback<byte[]> callback) {
        this.f71355b = com.tencent.beacon.base.util.b.c();
        com.tencent.beacon.base.net.c.d().a(this.f71354a, new h(this, callback));
    }

    public void a(Callback<byte[]> callback, com.tencent.beacon.a.b.b bVar) {
        bVar.a(new g(this, callback));
    }
}
