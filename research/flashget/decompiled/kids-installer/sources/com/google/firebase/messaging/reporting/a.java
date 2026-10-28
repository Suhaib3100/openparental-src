package com.google.firebase.messaging.reporting;

/* compiled from: MessagingClientEvent.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    private static final a f17371p = new C0223a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f17372a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17373b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17374c;

    /* renamed from: d, reason: collision with root package name */
    private final c f17375d;

    /* renamed from: e, reason: collision with root package name */
    private final d f17376e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17377f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17378g;

    /* renamed from: h, reason: collision with root package name */
    private final int f17379h;

    /* renamed from: i, reason: collision with root package name */
    private final int f17380i;

    /* renamed from: j, reason: collision with root package name */
    private final String f17381j;

    /* renamed from: k, reason: collision with root package name */
    private final long f17382k;

    /* renamed from: l, reason: collision with root package name */
    private final b f17383l;

    /* renamed from: m, reason: collision with root package name */
    private final String f17384m;

    /* renamed from: n, reason: collision with root package name */
    private final long f17385n;

    /* renamed from: o, reason: collision with root package name */
    private final String f17386o;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: com.google.firebase.messaging.reporting.a$a, reason: collision with other inner class name */
    public static final class C0223a {

        /* renamed from: a, reason: collision with root package name */
        private long f17387a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f17388b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f17389c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f17390d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f17391e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f17392f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f17393g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f17394h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f17395i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f17396j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f17397k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f17398l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f17399m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f17400n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f17401o = "";

        C0223a() {
        }

        public a a() {
            return new a(this.f17387a, this.f17388b, this.f17389c, this.f17390d, this.f17391e, this.f17392f, this.f17393g, this.f17394h, this.f17395i, this.f17396j, this.f17397k, this.f17398l, this.f17399m, this.f17400n, this.f17401o);
        }

        public C0223a b(String str) {
            this.f17399m = str;
            return this;
        }

        public C0223a c(long j5) {
            this.f17397k = j5;
            return this;
        }

        public C0223a d(long j5) {
            this.f17400n = j5;
            return this;
        }

        public C0223a e(String str) {
            this.f17393g = str;
            return this;
        }

        public C0223a f(String str) {
            this.f17401o = str;
            return this;
        }

        public C0223a g(b bVar) {
            this.f17398l = bVar;
            return this;
        }

        public C0223a h(String str) {
            this.f17389c = str;
            return this;
        }

        public C0223a i(String str) {
            this.f17388b = str;
            return this;
        }

        public C0223a j(c cVar) {
            this.f17390d = cVar;
            return this;
        }

        public C0223a k(String str) {
            this.f17392f = str;
            return this;
        }

        public C0223a l(int i5) {
            this.f17394h = i5;
            return this;
        }

        public C0223a m(long j5) {
            this.f17387a = j5;
            return this;
        }

        public C0223a n(d dVar) {
            this.f17391e = dVar;
            return this;
        }

        public C0223a o(String str) {
            this.f17396j = str;
            return this;
        }

        public C0223a p(int i5) {
            this.f17395i = i5;
            return this;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes3.dex */
    public enum b implements com.google.firebase.encoders.proto.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i5) {
            this.number_ = i5;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes3.dex */
    public enum c implements com.google.firebase.encoders.proto.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i5) {
            this.number_ = i5;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes3.dex */
    public enum d implements com.google.firebase.encoders.proto.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i5) {
            this.number_ = i5;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    a(long j5, String str, String str2, c cVar, d dVar, String str3, String str4, int i5, int i6, String str5, long j6, b bVar, String str6, long j7, String str7) {
        this.f17372a = j5;
        this.f17373b = str;
        this.f17374c = str2;
        this.f17375d = cVar;
        this.f17376e = dVar;
        this.f17377f = str3;
        this.f17378g = str4;
        this.f17379h = i5;
        this.f17380i = i6;
        this.f17381j = str5;
        this.f17382k = j6;
        this.f17383l = bVar;
        this.f17384m = str6;
        this.f17385n = j7;
        this.f17386o = str7;
    }

    public static a f() {
        return f17371p;
    }

    public static C0223a q() {
        return new C0223a();
    }

    @com.google.firebase.encoders.proto.d(tag = 13)
    public String a() {
        return this.f17384m;
    }

    @com.google.firebase.encoders.proto.d(tag = 11)
    public long b() {
        return this.f17382k;
    }

    @com.google.firebase.encoders.proto.d(tag = 14)
    public long c() {
        return this.f17385n;
    }

    @com.google.firebase.encoders.proto.d(tag = 7)
    public String d() {
        return this.f17378g;
    }

    @com.google.firebase.encoders.proto.d(tag = 15)
    public String e() {
        return this.f17386o;
    }

    @com.google.firebase.encoders.proto.d(tag = 12)
    public b g() {
        return this.f17383l;
    }

    @com.google.firebase.encoders.proto.d(tag = 3)
    public String h() {
        return this.f17374c;
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public String i() {
        return this.f17373b;
    }

    @com.google.firebase.encoders.proto.d(tag = 4)
    public c j() {
        return this.f17375d;
    }

    @com.google.firebase.encoders.proto.d(tag = 6)
    public String k() {
        return this.f17377f;
    }

    @com.google.firebase.encoders.proto.d(tag = 8)
    public int l() {
        return this.f17379h;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long m() {
        return this.f17372a;
    }

    @com.google.firebase.encoders.proto.d(tag = 5)
    public d n() {
        return this.f17376e;
    }

    @com.google.firebase.encoders.proto.d(tag = 10)
    public String o() {
        return this.f17381j;
    }

    @com.google.firebase.encoders.proto.d(tag = 9)
    public int p() {
        return this.f17380i;
    }
}
