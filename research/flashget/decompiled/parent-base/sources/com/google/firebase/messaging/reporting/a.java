package com.google.firebase.messaging.reporting;

/* compiled from: MessagingClientEvent.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    private static final a f60279p = new C0928a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f60280a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60281b;

    /* renamed from: c, reason: collision with root package name */
    private final String f60282c;

    /* renamed from: d, reason: collision with root package name */
    private final c f60283d;

    /* renamed from: e, reason: collision with root package name */
    private final d f60284e;

    /* renamed from: f, reason: collision with root package name */
    private final String f60285f;

    /* renamed from: g, reason: collision with root package name */
    private final String f60286g;

    /* renamed from: h, reason: collision with root package name */
    private final int f60287h;

    /* renamed from: i, reason: collision with root package name */
    private final int f60288i;

    /* renamed from: j, reason: collision with root package name */
    private final String f60289j;

    /* renamed from: k, reason: collision with root package name */
    private final long f60290k;

    /* renamed from: l, reason: collision with root package name */
    private final b f60291l;

    /* renamed from: m, reason: collision with root package name */
    private final String f60292m;

    /* renamed from: n, reason: collision with root package name */
    private final long f60293n;

    /* renamed from: o, reason: collision with root package name */
    private final String f60294o;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: com.google.firebase.messaging.reporting.a$a, reason: collision with other inner class name */
    public static final class C0928a {

        /* renamed from: a, reason: collision with root package name */
        private long f60295a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f60296b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f60297c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f60298d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f60299e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f60300f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f60301g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f60302h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f60303i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f60304j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f60305k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f60306l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f60307m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f60308n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f60309o = "";

        C0928a() {
        }

        public a a() {
            return new a(this.f60295a, this.f60296b, this.f60297c, this.f60298d, this.f60299e, this.f60300f, this.f60301g, this.f60302h, this.f60303i, this.f60304j, this.f60305k, this.f60306l, this.f60307m, this.f60308n, this.f60309o);
        }

        public C0928a b(String str) {
            this.f60307m = str;
            return this;
        }

        public C0928a c(long j4) {
            this.f60305k = j4;
            return this;
        }

        public C0928a d(long j4) {
            this.f60308n = j4;
            return this;
        }

        public C0928a e(String str) {
            this.f60301g = str;
            return this;
        }

        public C0928a f(String str) {
            this.f60309o = str;
            return this;
        }

        public C0928a g(b bVar) {
            this.f60306l = bVar;
            return this;
        }

        public C0928a h(String str) {
            this.f60297c = str;
            return this;
        }

        public C0928a i(String str) {
            this.f60296b = str;
            return this;
        }

        public C0928a j(c cVar) {
            this.f60298d = cVar;
            return this;
        }

        public C0928a k(String str) {
            this.f60300f = str;
            return this;
        }

        public C0928a l(int i4) {
            this.f60302h = i4;
            return this;
        }

        public C0928a m(long j4) {
            this.f60295a = j4;
            return this;
        }

        public C0928a n(d dVar) {
            this.f60299e = dVar;
            return this;
        }

        public C0928a o(String str) {
            this.f60304j = str;
            return this;
        }

        public C0928a p(int i4) {
            this.f60303i = i4;
            return this;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    public enum b implements com.google.firebase.encoders.proto.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i4) {
            this.number_ = i4;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    public enum c implements com.google.firebase.encoders.proto.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i4) {
            this.number_ = i4;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    public enum d implements com.google.firebase.encoders.proto.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i4) {
            this.number_ = i4;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    a(long j4, String str, String str2, c cVar, d dVar, String str3, String str4, int i4, int i5, String str5, long j5, b bVar, String str6, long j6, String str7) {
        this.f60280a = j4;
        this.f60281b = str;
        this.f60282c = str2;
        this.f60283d = cVar;
        this.f60284e = dVar;
        this.f60285f = str3;
        this.f60286g = str4;
        this.f60287h = i4;
        this.f60288i = i5;
        this.f60289j = str5;
        this.f60290k = j5;
        this.f60291l = bVar;
        this.f60292m = str6;
        this.f60293n = j6;
        this.f60294o = str7;
    }

    public static a f() {
        return f60279p;
    }

    public static C0928a q() {
        return new C0928a();
    }

    @com.google.firebase.encoders.proto.d(tag = 13)
    public String a() {
        return this.f60292m;
    }

    @com.google.firebase.encoders.proto.d(tag = 11)
    public long b() {
        return this.f60290k;
    }

    @com.google.firebase.encoders.proto.d(tag = 14)
    public long c() {
        return this.f60293n;
    }

    @com.google.firebase.encoders.proto.d(tag = 7)
    public String d() {
        return this.f60286g;
    }

    @com.google.firebase.encoders.proto.d(tag = 15)
    public String e() {
        return this.f60294o;
    }

    @com.google.firebase.encoders.proto.d(tag = 12)
    public b g() {
        return this.f60291l;
    }

    @com.google.firebase.encoders.proto.d(tag = 3)
    public String h() {
        return this.f60282c;
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public String i() {
        return this.f60281b;
    }

    @com.google.firebase.encoders.proto.d(tag = 4)
    public c j() {
        return this.f60283d;
    }

    @com.google.firebase.encoders.proto.d(tag = 6)
    public String k() {
        return this.f60285f;
    }

    @com.google.firebase.encoders.proto.d(tag = 8)
    public int l() {
        return this.f60287h;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long m() {
        return this.f60280a;
    }

    @com.google.firebase.encoders.proto.d(tag = 5)
    public d n() {
        return this.f60284e;
    }

    @com.google.firebase.encoders.proto.d(tag = 10)
    public String o() {
        return this.f60289j;
    }

    @com.google.firebase.encoders.proto.d(tag = 9)
    public int p() {
        return this.f60288i;
    }
}
