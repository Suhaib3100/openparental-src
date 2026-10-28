package com.google.android.datatransport.runtime.firebase.transport;

/* compiled from: StorageMetrics.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f12526c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f12527a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12528b;

    /* compiled from: StorageMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f12529a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f12530b = 0;

        a() {
        }

        public e a() {
            return new e(this.f12529a, this.f12530b);
        }

        public a b(long j5) {
            this.f12529a = j5;
            return this;
        }

        public a c(long j5) {
            this.f12530b = j5;
            return this;
        }
    }

    e(long j5, long j6) {
        this.f12527a = j5;
        this.f12528b = j6;
    }

    public static e b() {
        return f12526c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long a() {
        return this.f12527a;
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public long c() {
        return this.f12528b;
    }
}
