package com.google.android.datatransport.runtime.firebase.transport;

import j2.a;

/* compiled from: GlobalMetrics.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f12513b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final e f12514a;

    /* compiled from: GlobalMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private e f12515a = null;

        a() {
        }

        public b a() {
            return new b(this.f12515a);
        }

        public a b(e eVar) {
            this.f12515a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f12514a = eVar;
    }

    public static b a() {
        return f12513b;
    }

    public static a d() {
        return new a();
    }

    @a.b
    public e b() {
        e eVar = this.f12514a;
        return eVar == null ? e.b() : eVar;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    @a.InterfaceC0250a(name = "storageMetrics")
    public e c() {
        return this.f12514a;
    }
}
