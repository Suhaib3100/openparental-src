package com.google.android.datatransport.runtime.firebase.transport;

/* compiled from: StorageMetrics.java */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f52054c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f52055a;

    /* renamed from: b, reason: collision with root package name */
    private final long f52056b;

    /* compiled from: StorageMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f52057a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f52058b = 0;

        a() {
        }

        public e a() {
            return new e(this.f52057a, this.f52058b);
        }

        public a b(long j4) {
            this.f52057a = j4;
            return this;
        }

        public a c(long j4) {
            this.f52058b = j4;
            return this;
        }
    }

    e(long j4, long j5) {
        this.f52055a = j4;
        this.f52056b = j5;
    }

    public static e b() {
        return f52054c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long a() {
        return this.f52055a;
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public long c() {
        return this.f52056b;
    }
}
