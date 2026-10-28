package com.google.android.datatransport.runtime.firebase.transport;

import t9.a;

/* compiled from: GlobalMetrics.java */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f52041b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final e f52042a;

    /* compiled from: GlobalMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private e f52043a = null;

        a() {
        }

        public b a() {
            return new b(this.f52043a);
        }

        public a b(e eVar) {
            this.f52043a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f52042a = eVar;
    }

    public static b a() {
        return f52041b;
    }

    public static a d() {
        return new a();
    }

    @a.b
    public e b() {
        e eVar = this.f52042a;
        return eVar == null ? e.b() : eVar;
    }

    @a.InterfaceC1396a(name = "storageMetrics")
    @com.google.firebase.encoders.proto.d(tag = 1)
    public e c() {
        return this.f52042a;
    }
}
