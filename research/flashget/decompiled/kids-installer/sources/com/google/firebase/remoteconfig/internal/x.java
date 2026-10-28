package com.google.firebase.remoteconfig.internal;

/* compiled from: FirebaseRemoteConfigInfoImpl.java */
/* loaded from: classes3.dex */
public class x implements com.google.firebase.remoteconfig.q {

    /* renamed from: a, reason: collision with root package name */
    private final long f18062a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18063b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.r f18064c;

    /* compiled from: FirebaseRemoteConfigInfoImpl.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f18065a;

        /* renamed from: b, reason: collision with root package name */
        private int f18066b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.firebase.remoteconfig.r f18067c;

        private b() {
        }

        public x a() {
            return new x(this.f18065a, this.f18066b, this.f18067c);
        }

        b b(com.google.firebase.remoteconfig.r rVar) {
            this.f18067c = rVar;
            return this;
        }

        b c(int i5) {
            this.f18066b = i5;
            return this;
        }

        public b d(long j5) {
            this.f18065a = j5;
            return this;
        }

        b(a aVar) {
        }
    }

    static b d() {
        return new b(null);
    }

    @Override // com.google.firebase.remoteconfig.q
    public int a() {
        return this.f18063b;
    }

    @Override // com.google.firebase.remoteconfig.q
    public long b() {
        return this.f18062a;
    }

    @Override // com.google.firebase.remoteconfig.q
    public com.google.firebase.remoteconfig.r c() {
        return this.f18064c;
    }

    private x(long j5, int i5, com.google.firebase.remoteconfig.r rVar) {
        this.f18062a = j5;
        this.f18063b = i5;
        this.f18064c = rVar;
    }
}
