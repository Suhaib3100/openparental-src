package com.google.android.datatransport.runtime.firebase.transport;

/* compiled from: LogEventDropped.java */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f52044c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f52045a;

    /* renamed from: b, reason: collision with root package name */
    private final b f52046b;

    /* compiled from: LogEventDropped.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f52047a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f52048b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f52047a, this.f52048b);
        }

        public a b(long j4) {
            this.f52047a = j4;
            return this;
        }

        public a c(b bVar) {
            this.f52048b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    public enum b implements com.google.firebase.encoders.proto.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i4) {
            this.number_ = i4;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    c(long j4, b bVar) {
        this.f52045a = j4;
        this.f52046b = bVar;
    }

    public static c a() {
        return f52044c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long b() {
        return this.f52045a;
    }

    @com.google.firebase.encoders.proto.d(tag = 3)
    public b c() {
        return this.f52046b;
    }
}
