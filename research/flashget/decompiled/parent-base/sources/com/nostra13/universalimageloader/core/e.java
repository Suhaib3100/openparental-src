package com.nostra13.universalimageloader.core;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.core.download.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: ImageLoaderConfiguration.java */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final Resources f70401a;

    /* renamed from: b, reason: collision with root package name */
    final int f70402b;

    /* renamed from: c, reason: collision with root package name */
    final int f70403c;

    /* renamed from: d, reason: collision with root package name */
    final int f70404d;

    /* renamed from: e, reason: collision with root package name */
    final int f70405e;

    /* renamed from: f, reason: collision with root package name */
    final qb.a f70406f;

    /* renamed from: g, reason: collision with root package name */
    final Executor f70407g;

    /* renamed from: h, reason: collision with root package name */
    final Executor f70408h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f70409i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f70410j;

    /* renamed from: k, reason: collision with root package name */
    final int f70411k;

    /* renamed from: l, reason: collision with root package name */
    final int f70412l;

    /* renamed from: m, reason: collision with root package name */
    final com.nostra13.universalimageloader.core.assist.g f70413m;

    /* renamed from: n, reason: collision with root package name */
    final com.nostra13.universalimageloader.cache.memory.c f70414n;

    /* renamed from: o, reason: collision with root package name */
    final nb.a f70415o;

    /* renamed from: p, reason: collision with root package name */
    final com.nostra13.universalimageloader.core.download.b f70416p;

    /* renamed from: q, reason: collision with root package name */
    final com.nostra13.universalimageloader.core.decode.b f70417q;

    /* renamed from: r, reason: collision with root package name */
    final com.nostra13.universalimageloader.core.c f70418r;

    /* renamed from: s, reason: collision with root package name */
    final com.nostra13.universalimageloader.core.download.b f70419s;

    /* renamed from: t, reason: collision with root package name */
    final com.nostra13.universalimageloader.core.download.b f70420t;

    /* compiled from: ImageLoaderConfiguration.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70421a;

        static {
            int[] iArr = new int[b.a.values().length];
            f70421a = iArr;
            try {
                iArr[b.a.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70421a[b.a.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ImageLoaderConfiguration.java */
    public static class b {
        public static final int C = 3;
        public static final int D = 3;

        /* renamed from: a, reason: collision with root package name */
        private Context f70424a;

        /* renamed from: v, reason: collision with root package name */
        private com.nostra13.universalimageloader.core.decode.b f70445v;
        private static final String A = ProtectedSandApp.s("\u1a8a\u0001");
        private static final String B = ProtectedSandApp.s("\u1a8b\u0001");

        /* renamed from: y, reason: collision with root package name */
        private static final String f70422y = ProtectedSandApp.s("\u1a8c\u0001");

        /* renamed from: z, reason: collision with root package name */
        private static final String f70423z = ProtectedSandApp.s("\u1a8d\u0001");
        public static final com.nostra13.universalimageloader.core.assist.g E = com.nostra13.universalimageloader.core.assist.g.FIFO;

        /* renamed from: b, reason: collision with root package name */
        private int f70425b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f70426c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f70427d = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f70428e = 0;

        /* renamed from: f, reason: collision with root package name */
        private qb.a f70429f = null;

        /* renamed from: g, reason: collision with root package name */
        private Executor f70430g = null;

        /* renamed from: h, reason: collision with root package name */
        private Executor f70431h = null;

        /* renamed from: i, reason: collision with root package name */
        private boolean f70432i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f70433j = false;

        /* renamed from: k, reason: collision with root package name */
        private int f70434k = 3;

        /* renamed from: l, reason: collision with root package name */
        private int f70435l = 3;

        /* renamed from: m, reason: collision with root package name */
        private boolean f70436m = false;

        /* renamed from: n, reason: collision with root package name */
        private com.nostra13.universalimageloader.core.assist.g f70437n = E;

        /* renamed from: o, reason: collision with root package name */
        private int f70438o = 0;

        /* renamed from: p, reason: collision with root package name */
        private long f70439p = 0;

        /* renamed from: q, reason: collision with root package name */
        private int f70440q = 0;

        /* renamed from: r, reason: collision with root package name */
        private com.nostra13.universalimageloader.cache.memory.c f70441r = null;

        /* renamed from: s, reason: collision with root package name */
        private nb.a f70442s = null;

        /* renamed from: t, reason: collision with root package name */
        private ob.a f70443t = null;

        /* renamed from: u, reason: collision with root package name */
        private com.nostra13.universalimageloader.core.download.b f70444u = null;

        /* renamed from: w, reason: collision with root package name */
        private com.nostra13.universalimageloader.core.c f70446w = null;

        /* renamed from: x, reason: collision with root package name */
        private boolean f70447x = false;

        public b(Context context) {
            this.f70424a = context.getApplicationContext();
        }

        private void I() {
            if (this.f70430g == null) {
                this.f70430g = com.nostra13.universalimageloader.core.a.c(this.f70434k, this.f70435l, this.f70437n);
            } else {
                this.f70432i = true;
            }
            if (this.f70431h == null) {
                this.f70431h = com.nostra13.universalimageloader.core.a.c(this.f70434k, this.f70435l, this.f70437n);
            } else {
                this.f70433j = true;
            }
            if (this.f70442s == null) {
                if (this.f70443t == null) {
                    this.f70443t = new ob.b();
                }
                this.f70442s = com.nostra13.universalimageloader.core.a.b(this.f70424a, this.f70443t, this.f70439p, this.f70440q);
            }
            if (this.f70441r == null) {
                this.f70441r = com.nostra13.universalimageloader.core.a.g(this.f70424a, this.f70438o);
            }
            if (this.f70436m) {
                this.f70441r = new com.nostra13.universalimageloader.cache.memory.impl.b(this.f70441r, com.nostra13.universalimageloader.utils.e.a());
            }
            if (this.f70444u == null) {
                this.f70444u = new com.nostra13.universalimageloader.core.download.a(this.f70424a);
            }
            if (this.f70445v == null) {
                this.f70445v = new com.nostra13.universalimageloader.core.decode.a(this.f70447x);
            }
            if (this.f70446w == null) {
                this.f70446w = com.nostra13.universalimageloader.core.c.t();
            }
        }

        @Deprecated
        public b A(int i4) {
            return F(i4);
        }

        public b B(nb.a aVar) {
            if (this.f70439p > 0 || this.f70440q > 0) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8c\u0001"), new Object[0]);
            }
            if (this.f70443t != null) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8d\u0001"), new Object[0]);
            }
            this.f70442s = aVar;
            return this;
        }

        public b C(int i4, int i5, qb.a aVar) {
            this.f70427d = i4;
            this.f70428e = i5;
            this.f70429f = aVar;
            return this;
        }

        public b D(int i4) {
            if (i4 <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\u1a8e\u0001"));
            }
            if (this.f70442s != null) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8c\u0001"), new Object[0]);
            }
            this.f70440q = i4;
            return this;
        }

        public b E(ob.a aVar) {
            if (this.f70442s != null) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8d\u0001"), new Object[0]);
            }
            this.f70443t = aVar;
            return this;
        }

        public b F(int i4) {
            if (i4 <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\u1a8f\u0001"));
            }
            if (this.f70442s != null) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8c\u0001"), new Object[0]);
            }
            this.f70439p = i4;
            return this;
        }

        public b G(com.nostra13.universalimageloader.core.decode.b bVar) {
            this.f70445v = bVar;
            return this;
        }

        public b H(com.nostra13.universalimageloader.core.download.b bVar) {
            this.f70444u = bVar;
            return this;
        }

        public b J(com.nostra13.universalimageloader.cache.memory.c cVar) {
            if (this.f70438o != 0) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8a\u0001"), new Object[0]);
            }
            this.f70441r = cVar;
            return this;
        }

        public b K(int i4, int i5) {
            this.f70425b = i4;
            this.f70426c = i5;
            return this;
        }

        public b L(int i4) {
            if (i4 <= 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("᪐\u0001"));
            }
            if (this.f70441r != null) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8a\u0001"), new Object[0]);
            }
            this.f70438o = i4;
            return this;
        }

        public b M(int i4) {
            if (i4 <= 0 || i4 >= 100) {
                throw new IllegalArgumentException(ProtectedSandApp.s("᪑\u0001"));
            }
            if (this.f70441r != null) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8a\u0001"), new Object[0]);
            }
            this.f70438o = (int) ((i4 / 100.0f) * Runtime.getRuntime().maxMemory());
            return this;
        }

        public b N(Executor executor) {
            if (this.f70434k != 3 || this.f70435l != 3 || this.f70437n != E) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8b\u0001"), new Object[0]);
            }
            this.f70430g = executor;
            return this;
        }

        public b O(Executor executor) {
            if (this.f70434k != 3 || this.f70435l != 3 || this.f70437n != E) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8b\u0001"), new Object[0]);
            }
            this.f70431h = executor;
            return this;
        }

        public b P(com.nostra13.universalimageloader.core.assist.g gVar) {
            if (this.f70430g != null || this.f70431h != null) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8b\u0001"), new Object[0]);
            }
            this.f70437n = gVar;
            return this;
        }

        public b Q(int i4) {
            if (this.f70430g != null || this.f70431h != null) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8b\u0001"), new Object[0]);
            }
            this.f70434k = i4;
            return this;
        }

        public b R(int i4) {
            if (this.f70430g != null || this.f70431h != null) {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("\u1a8b\u0001"), new Object[0]);
            }
            if (i4 < 1) {
                this.f70435l = 1;
            } else if (i4 > 10) {
                this.f70435l = 10;
            } else {
                this.f70435l = i4;
            }
            return this;
        }

        public b S() {
            this.f70447x = true;
            return this;
        }

        public e t() {
            I();
            return new e(this, null);
        }

        public b u(com.nostra13.universalimageloader.core.c cVar) {
            this.f70446w = cVar;
            return this;
        }

        public b v() {
            this.f70436m = true;
            return this;
        }

        @Deprecated
        public b w(nb.a aVar) {
            return B(aVar);
        }

        @Deprecated
        public b x(int i4, int i5, qb.a aVar) {
            return C(i4, i5, aVar);
        }

        @Deprecated
        public b y(int i4) {
            return D(i4);
        }

        @Deprecated
        public b z(ob.a aVar) {
            return E(aVar);
        }
    }

    /* compiled from: ImageLoaderConfiguration.java */
    private static class c implements com.nostra13.universalimageloader.core.download.b {

        /* renamed from: a, reason: collision with root package name */
        private final com.nostra13.universalimageloader.core.download.b f70448a;

        public c(com.nostra13.universalimageloader.core.download.b bVar) {
            this.f70448a = bVar;
        }

        @Override // com.nostra13.universalimageloader.core.download.b
        public InputStream a(String str, Object obj) throws IOException {
            int i4 = a.f70421a[b.a.ofUri(str).ordinal()];
            if (i4 == 1 || i4 == 2) {
                throw new IllegalStateException();
            }
            return this.f70448a.a(str, obj);
        }
    }

    /* compiled from: ImageLoaderConfiguration.java */
    private static class d implements com.nostra13.universalimageloader.core.download.b {

        /* renamed from: a, reason: collision with root package name */
        private final com.nostra13.universalimageloader.core.download.b f70449a;

        public d(com.nostra13.universalimageloader.core.download.b bVar) {
            this.f70449a = bVar;
        }

        @Override // com.nostra13.universalimageloader.core.download.b
        public InputStream a(String str, Object obj) throws IOException {
            InputStream a5 = this.f70449a.a(str, obj);
            int i4 = a.f70421a[b.a.ofUri(str).ordinal()];
            return (i4 == 1 || i4 == 2) ? new com.nostra13.universalimageloader.core.assist.c(a5) : a5;
        }
    }

    /* synthetic */ e(b bVar, a aVar) {
        this(bVar);
    }

    public static e a(Context context) {
        return new b(context).t();
    }

    com.nostra13.universalimageloader.core.assist.e b() {
        DisplayMetrics displayMetrics = this.f70401a.getDisplayMetrics();
        int i4 = this.f70402b;
        if (i4 <= 0) {
            i4 = displayMetrics.widthPixels;
        }
        int i5 = this.f70403c;
        if (i5 <= 0) {
            i5 = displayMetrics.heightPixels;
        }
        return new com.nostra13.universalimageloader.core.assist.e(i4, i5);
    }

    private e(b bVar) {
        this.f70401a = bVar.f70424a.getResources();
        this.f70402b = bVar.f70425b;
        this.f70403c = bVar.f70426c;
        this.f70404d = bVar.f70427d;
        this.f70405e = bVar.f70428e;
        this.f70406f = bVar.f70429f;
        this.f70407g = bVar.f70430g;
        this.f70408h = bVar.f70431h;
        this.f70411k = bVar.f70434k;
        this.f70412l = bVar.f70435l;
        this.f70413m = bVar.f70437n;
        this.f70415o = bVar.f70442s;
        this.f70414n = bVar.f70441r;
        this.f70418r = bVar.f70446w;
        com.nostra13.universalimageloader.core.download.b bVar2 = bVar.f70444u;
        this.f70416p = bVar2;
        this.f70417q = bVar.f70445v;
        this.f70409i = bVar.f70432i;
        this.f70410j = bVar.f70433j;
        this.f70419s = new c(bVar2);
        this.f70420t = new d(bVar2);
        com.nostra13.universalimageloader.utils.d.j(bVar.f70447x);
    }
}
