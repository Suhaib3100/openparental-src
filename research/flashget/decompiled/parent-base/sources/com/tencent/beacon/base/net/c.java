package com.tencent.beacon.base.net;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.beacon.base.net.adapter.h;
import com.tencent.beacon.base.net.b.e;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.HttpRequestEntity;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.net.call.i;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BeaconNet.java */
/* loaded from: classes6.dex */
public final class c implements e, e.a, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f71316a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f71317b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f71318c = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f71319d = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.beacon.base.net.a.a f71320e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.beacon.base.net.a.b f71321f;

    /* renamed from: g, reason: collision with root package name */
    private Context f71322g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractNetAdapter f71323h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractNetAdapter f71324i;

    private c() {
    }

    public static synchronized c d() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f71316a == null) {
                    f71316a = new c();
                }
                cVar = f71316a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅤ\u0001"), ProtectedSandApp.s("ㅥ\u0001"), Integer.valueOf(this.f71318c.decrementAndGet()));
    }

    private void i() {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅤ\u0001"), ProtectedSandApp.s("ㅥ\u0001"), Integer.valueOf(this.f71318c.incrementAndGet()));
    }

    public i b(JceRequestEntity jceRequestEntity) {
        return new i(jceRequestEntity);
    }

    public int c() {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅤ\u0001"), ProtectedSandApp.s("ㅪ\u0001"), Integer.valueOf(this.f71319d.get()));
        return this.f71319d.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f71317b.set(true);
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅤ\u0001"), ProtectedSandApp.s("ㅩ\u0001"), new Object[0]);
    }

    public void e() {
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅤ\u0001"), ProtectedSandApp.s("ㅫ\u0001"), Integer.valueOf(this.f71319d.incrementAndGet()));
    }

    public boolean f() {
        return this.f71318c.get() >= 5;
    }

    public void g() {
        this.f71317b.set(false);
    }

    public void a(Context context, AbstractNetAdapter abstractNetAdapter) {
        this.f71322g = context;
        if (abstractNetAdapter == null) {
            abstractNetAdapter = new com.tencent.beacon.base.net.adapter.b();
        }
        this.f71323h = h.a();
        this.f71324i = abstractNetAdapter;
        this.f71320e = com.tencent.beacon.base.net.a.a.a();
        this.f71321f = com.tencent.beacon.base.net.a.b.a();
        com.tencent.beacon.base.net.b.e.a(context, this);
    }

    @Override // com.tencent.beacon.base.net.b.e.a
    public void b() {
        this.f71317b.set(true);
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅤ\u0001"), ProtectedSandApp.s("ㅩ\u0001"), new Object[0]);
    }

    public void a(JceRequestEntity jceRequestEntity, Callback<byte[]> callback) {
        if (this.f71317b.get()) {
            callback.onFailure(new d(jceRequestEntity.getType().name(), null, 0, ProtectedSandApp.s("ㅧ\u0001")));
            return;
        }
        AbstractNetAdapter a5 = a(jceRequestEntity);
        i();
        a5.request(jceRequestEntity, new a(this, jceRequestEntity, a5 == this.f71323h, callback));
    }

    public void a(int i4) {
        this.f71319d.set(i4);
    }

    public void a(HttpRequestEntity httpRequestEntity, Callback<BResponse> callback) {
        if (this.f71317b.get()) {
            callback.onFailure(new d(httpRequestEntity.tag(), null, 0, ProtectedSandApp.s("ㅧ\u0001")));
        } else {
            i();
            this.f71324i.request(httpRequestEntity, new b(this, httpRequestEntity, callback));
        }
    }

    public com.tencent.beacon.base.net.call.c a(HttpRequestEntity httpRequestEntity) {
        return new com.tencent.beacon.base.net.call.c(httpRequestEntity);
    }

    @o0
    public AbstractNetAdapter a(JceRequestEntity jceRequestEntity) {
        if (jceRequestEntity.getType() == RequestType.EVENT) {
            return com.tencent.beacon.d.b.b().v() ? this.f71323h : this.f71324i;
        }
        return this.f71323h;
    }

    public void a(@o0 d dVar) {
        if (dVar.f71356a.equals(ProtectedSandApp.s("ㅨ\u0001")) || TextUtils.isEmpty(dVar.f71357b)) {
            return;
        }
        j.e().a(dVar.f71357b, dVar.toString(), dVar.f71360e);
    }

    @Override // com.tencent.beacon.base.net.b.e.a
    public void a() {
        this.f71317b.set(false);
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("ㅤ\u0001"), ProtectedSandApp.s("ㅦ\u0001"), new Object[0]);
    }
}
