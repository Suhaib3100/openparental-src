package com.nostra13.universalimageloader.core;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DisplayImageOptions.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f70296a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70297b;

    /* renamed from: c, reason: collision with root package name */
    private final int f70298c;

    /* renamed from: d, reason: collision with root package name */
    private final Drawable f70299d;

    /* renamed from: e, reason: collision with root package name */
    private final Drawable f70300e;

    /* renamed from: f, reason: collision with root package name */
    private final Drawable f70301f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f70302g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f70303h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f70304i;

    /* renamed from: j, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.assist.d f70305j;

    /* renamed from: k, reason: collision with root package name */
    private final BitmapFactory.Options f70306k;

    /* renamed from: l, reason: collision with root package name */
    private final int f70307l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f70308m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f70309n;

    /* renamed from: o, reason: collision with root package name */
    private final qb.a f70310o;

    /* renamed from: p, reason: collision with root package name */
    private final qb.a f70311p;

    /* renamed from: q, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.display.a f70312q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f70313r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f70314s;

    /* compiled from: DisplayImageOptions.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f70315a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f70316b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f70317c = 0;

        /* renamed from: d, reason: collision with root package name */
        private Drawable f70318d = null;

        /* renamed from: e, reason: collision with root package name */
        private Drawable f70319e = null;

        /* renamed from: f, reason: collision with root package name */
        private Drawable f70320f = null;

        /* renamed from: g, reason: collision with root package name */
        private boolean f70321g = false;

        /* renamed from: h, reason: collision with root package name */
        private boolean f70322h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f70323i = false;

        /* renamed from: j, reason: collision with root package name */
        private com.nostra13.universalimageloader.core.assist.d f70324j = com.nostra13.universalimageloader.core.assist.d.IN_SAMPLE_POWER_OF_2;

        /* renamed from: k, reason: collision with root package name */
        private BitmapFactory.Options f70325k = new BitmapFactory.Options();

        /* renamed from: l, reason: collision with root package name */
        private int f70326l = 0;

        /* renamed from: m, reason: collision with root package name */
        private boolean f70327m = false;

        /* renamed from: n, reason: collision with root package name */
        private Object f70328n = null;

        /* renamed from: o, reason: collision with root package name */
        private qb.a f70329o = null;

        /* renamed from: p, reason: collision with root package name */
        private qb.a f70330p = null;

        /* renamed from: q, reason: collision with root package name */
        private com.nostra13.universalimageloader.core.display.a f70331q = new com.nostra13.universalimageloader.core.display.f();

        /* renamed from: r, reason: collision with root package name */
        private Handler f70332r = null;

        /* renamed from: s, reason: collision with root package name */
        private boolean f70333s = false;

        public b A(c cVar) {
            this.f70315a = cVar.f70296a;
            this.f70316b = cVar.f70297b;
            this.f70317c = cVar.f70298c;
            this.f70318d = cVar.f70299d;
            this.f70319e = cVar.f70300e;
            this.f70320f = cVar.f70301f;
            this.f70321g = cVar.f70302g;
            this.f70322h = cVar.f70303h;
            this.f70323i = cVar.f70304i;
            this.f70324j = cVar.f70305j;
            this.f70325k = cVar.f70306k;
            this.f70326l = cVar.f70307l;
            this.f70327m = cVar.f70308m;
            this.f70328n = cVar.f70309n;
            this.f70329o = cVar.f70310o;
            this.f70330p = cVar.f70311p;
            this.f70331q = cVar.f70312q;
            this.f70332r = cVar.f70313r;
            this.f70333s = cVar.f70314s;
            return this;
        }

        public b B(boolean z4) {
            this.f70327m = z4;
            return this;
        }

        public b C(BitmapFactory.Options options) {
            if (options == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ᩚ\u0001"));
            }
            this.f70325k = options;
            return this;
        }

        public b D(int i4) {
            this.f70326l = i4;
            return this;
        }

        public b E(com.nostra13.universalimageloader.core.display.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ᩛ\u0001"));
            }
            this.f70331q = aVar;
            return this;
        }

        public b F(Object obj) {
            this.f70328n = obj;
            return this;
        }

        public b G(Handler handler) {
            this.f70332r = handler;
            return this;
        }

        public b H(com.nostra13.universalimageloader.core.assist.d dVar) {
            this.f70324j = dVar;
            return this;
        }

        public b I(qb.a aVar) {
            this.f70330p = aVar;
            return this;
        }

        public b J(qb.a aVar) {
            this.f70329o = aVar;
            return this;
        }

        public b K() {
            this.f70321g = true;
            return this;
        }

        public b L(boolean z4) {
            this.f70321g = z4;
            return this;
        }

        public b M(int i4) {
            this.f70316b = i4;
            return this;
        }

        public b N(Drawable drawable) {
            this.f70319e = drawable;
            return this;
        }

        public b O(int i4) {
            this.f70317c = i4;
            return this;
        }

        public b P(Drawable drawable) {
            this.f70320f = drawable;
            return this;
        }

        public b Q(int i4) {
            this.f70315a = i4;
            return this;
        }

        public b R(Drawable drawable) {
            this.f70318d = drawable;
            return this;
        }

        @Deprecated
        public b S(int i4) {
            this.f70315a = i4;
            return this;
        }

        b T(boolean z4) {
            this.f70333s = z4;
            return this;
        }

        public b t(Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ᩜ\u0001"));
            }
            this.f70325k.inPreferredConfig = config;
            return this;
        }

        public c u() {
            return new c(this);
        }

        @Deprecated
        public b v() {
            this.f70322h = true;
            return this;
        }

        public b w(boolean z4) {
            this.f70322h = z4;
            return this;
        }

        @Deprecated
        public b x() {
            return z(true);
        }

        @Deprecated
        public b y(boolean z4) {
            return z(z4);
        }

        public b z(boolean z4) {
            this.f70323i = z4;
            return this;
        }
    }

    public static c t() {
        return new b().u();
    }

    public Drawable A(Resources resources) {
        int i4 = this.f70298c;
        return i4 != 0 ? resources.getDrawable(i4) : this.f70301f;
    }

    public Drawable B(Resources resources) {
        int i4 = this.f70296a;
        return i4 != 0 ? resources.getDrawable(i4) : this.f70299d;
    }

    public com.nostra13.universalimageloader.core.assist.d C() {
        return this.f70305j;
    }

    public qb.a D() {
        return this.f70311p;
    }

    public qb.a E() {
        return this.f70310o;
    }

    public boolean F() {
        return this.f70303h;
    }

    public boolean G() {
        return this.f70304i;
    }

    public boolean H() {
        return this.f70308m;
    }

    public boolean I() {
        return this.f70302g;
    }

    boolean J() {
        return this.f70314s;
    }

    public boolean K() {
        return this.f70307l > 0;
    }

    public boolean L() {
        return this.f70311p != null;
    }

    public boolean M() {
        return this.f70310o != null;
    }

    public boolean N() {
        return (this.f70300e == null && this.f70297b == 0) ? false : true;
    }

    public boolean O() {
        return (this.f70301f == null && this.f70298c == 0) ? false : true;
    }

    public boolean P() {
        return (this.f70299d == null && this.f70296a == 0) ? false : true;
    }

    public BitmapFactory.Options u() {
        return this.f70306k;
    }

    public int v() {
        return this.f70307l;
    }

    public com.nostra13.universalimageloader.core.display.a w() {
        return this.f70312q;
    }

    public Object x() {
        return this.f70309n;
    }

    public Handler y() {
        return this.f70313r;
    }

    public Drawable z(Resources resources) {
        int i4 = this.f70297b;
        return i4 != 0 ? resources.getDrawable(i4) : this.f70300e;
    }

    private c(b bVar) {
        this.f70296a = bVar.f70315a;
        this.f70297b = bVar.f70316b;
        this.f70298c = bVar.f70317c;
        this.f70299d = bVar.f70318d;
        this.f70300e = bVar.f70319e;
        this.f70301f = bVar.f70320f;
        this.f70302g = bVar.f70321g;
        this.f70303h = bVar.f70322h;
        this.f70304i = bVar.f70323i;
        this.f70305j = bVar.f70324j;
        this.f70306k = bVar.f70325k;
        this.f70307l = bVar.f70326l;
        this.f70308m = bVar.f70327m;
        this.f70309n = bVar.f70328n;
        this.f70310o = bVar.f70329o;
        this.f70311p = bVar.f70330p;
        this.f70312q = bVar.f70331q;
        this.f70313r = bVar.f70332r;
        this.f70314s = bVar.f70333s;
    }
}
