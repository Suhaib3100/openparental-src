package com.google.android.datatransport.runtime.firebase.transport;

/* compiled from: TimeWindow.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f12531c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f12532a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12533b;

    /* compiled from: TimeWindow.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f12534a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f12535b = 0;

        a() {
        }

        public f a() {
            return new f(this.f12534a, this.f12535b);
        }

        public a b(long j5) {
            this.f12535b = j5;
            return this;
        }

        public a c(long j5) {
            this.f12534a = j5;
            return this;
        }
    }

    f(long j5, long j6) {
        this.f12532a = j5;
        this.f12533b = j6;
    }

    public static f a() {
        return f12531c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public long b() {
        return this.f12533b;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long c() {
        return this.f12532a;
    }
}
