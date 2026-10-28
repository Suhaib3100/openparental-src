package com.google.firebase.remoteconfig.internal;

/* compiled from: FirebaseRemoteConfigInfoImpl.java */
/* loaded from: classes6.dex */
public class x implements com.google.firebase.remoteconfig.q {

    /* renamed from: a, reason: collision with root package name */
    private final long f60608a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60609b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.r f60610c;

    /* compiled from: FirebaseRemoteConfigInfoImpl.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f60611a;

        /* renamed from: b, reason: collision with root package name */
        private int f60612b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.firebase.remoteconfig.r f60613c;

        private b() {
        }

        public x a() {
            return new x(this.f60611a, this.f60612b, this.f60613c);
        }

        b b(com.google.firebase.remoteconfig.r rVar) {
            this.f60613c = rVar;
            return this;
        }

        b c(int i4) {
            this.f60612b = i4;
            return this;
        }

        public b d(long j4) {
            this.f60611a = j4;
            return this;
        }

        b(a aVar) {
        }
    }

    static b d() {
        return new b();
    }

    @Override // com.google.firebase.remoteconfig.q
    public long a() {
        return this.f60608a;
    }

    @Override // com.google.firebase.remoteconfig.q
    public com.google.firebase.remoteconfig.r b() {
        return this.f60610c;
    }

    @Override // com.google.firebase.remoteconfig.q
    public int c() {
        return this.f60609b;
    }

    private x(long j4, int i4, com.google.firebase.remoteconfig.r rVar) {
        this.f60608a = j4;
        this.f60609b = i4;
        this.f60610c = rVar;
    }
}
