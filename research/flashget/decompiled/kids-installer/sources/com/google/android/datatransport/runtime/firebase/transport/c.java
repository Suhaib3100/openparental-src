package com.google.android.datatransport.runtime.firebase.transport;

/* compiled from: LogEventDropped.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f12516c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f12517a;

    /* renamed from: b, reason: collision with root package name */
    private final b f12518b;

    /* compiled from: LogEventDropped.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f12519a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f12520b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f12519a, this.f12520b);
        }

        public a b(long j5) {
            this.f12519a = j5;
            return this;
        }

        public a c(b bVar) {
            this.f12520b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    /* loaded from: classes3.dex */
    public enum b implements com.google.firebase.encoders.proto.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i5) {
            this.number_ = i5;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    c(long j5, b bVar) {
        this.f12517a = j5;
        this.f12518b = bVar;
    }

    public static c a() {
        return f12516c;
    }

    public static a d() {
        return new a();
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long b() {
        return this.f12517a;
    }

    @com.google.firebase.encoders.proto.d(tag = 3)
    public b c() {
        return this.f12518b;
    }
}
