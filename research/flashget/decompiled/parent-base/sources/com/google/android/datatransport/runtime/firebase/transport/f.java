package com.google.android.datatransport.runtime.firebase.transport;

/* compiled from: TimeWindow.java */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f52059c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f52060a;

    /* renamed from: b, reason: collision with root package name */
    private final long f52061b;

    /* compiled from: TimeWindow.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f52062a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f52063b = 0;

        a() {
        }

        public f a() {
            return new f(this.f52062a, this.f52063b);
        }

        public a b(long j4) {
            this.f52063b = j4;
            return this;
        }

        public a c(long j4) {
            this.f52062a = j4;
            return this;
        }
    }

    f(long j4, long j5) {
        this.f52060a = j4;
        this.f52061b = j5;
    }

    public static f a() {
        return f52059c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public long b() {
        return this.f52061b;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long c() {
        return this.f52060a;
    }
}
