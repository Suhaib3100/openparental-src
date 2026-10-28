package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import com.squareup.picasso.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Request.java */
/* loaded from: classes6.dex */
public final class b0 {

    /* renamed from: u, reason: collision with root package name */
    private static final long f70746u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    int f70747a;

    /* renamed from: b, reason: collision with root package name */
    long f70748b;

    /* renamed from: c, reason: collision with root package name */
    int f70749c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f70750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70751e;

    /* renamed from: f, reason: collision with root package name */
    public final String f70752f;

    /* renamed from: g, reason: collision with root package name */
    public final List<j0> f70753g;

    /* renamed from: h, reason: collision with root package name */
    public final int f70754h;

    /* renamed from: i, reason: collision with root package name */
    public final int f70755i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f70756j;

    /* renamed from: k, reason: collision with root package name */
    public final int f70757k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f70758l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f70759m;

    /* renamed from: n, reason: collision with root package name */
    public final float f70760n;

    /* renamed from: o, reason: collision with root package name */
    public final float f70761o;

    /* renamed from: p, reason: collision with root package name */
    public final float f70762p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f70763q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f70764r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap.Config f70765s;

    /* renamed from: t, reason: collision with root package name */
    public final w.f f70766t;

    /* compiled from: Request.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f70767a;

        /* renamed from: b, reason: collision with root package name */
        private int f70768b;

        /* renamed from: c, reason: collision with root package name */
        private String f70769c;

        /* renamed from: d, reason: collision with root package name */
        private int f70770d;

        /* renamed from: e, reason: collision with root package name */
        private int f70771e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f70772f;

        /* renamed from: g, reason: collision with root package name */
        private int f70773g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f70774h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f70775i;

        /* renamed from: j, reason: collision with root package name */
        private float f70776j;

        /* renamed from: k, reason: collision with root package name */
        private float f70777k;

        /* renamed from: l, reason: collision with root package name */
        private float f70778l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f70779m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f70780n;

        /* renamed from: o, reason: collision with root package name */
        private List<j0> f70781o;

        /* renamed from: p, reason: collision with root package name */
        private Bitmap.Config f70782p;

        /* renamed from: q, reason: collision with root package name */
        private w.f f70783q;

        public b0 a() {
            boolean z4 = this.f70774h;
            if (z4 && this.f70772f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f70772f && this.f70770d == 0 && this.f70771e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z4 && this.f70770d == 0 && this.f70771e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f70783q == null) {
                this.f70783q = w.f.NORMAL;
            }
            return new b0(this.f70767a, this.f70768b, this.f70769c, this.f70781o, this.f70770d, this.f70771e, this.f70772f, this.f70774h, this.f70773g, this.f70775i, this.f70776j, this.f70777k, this.f70778l, this.f70779m, this.f70780n, this.f70782p, this.f70783q);
        }

        public b b() {
            return c(17);
        }

        public b c(int i4) {
            if (this.f70774h) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f70772f = true;
            this.f70773g = i4;
            return this;
        }

        public b d() {
            if (this.f70772f) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.f70774h = true;
            return this;
        }

        public b e() {
            this.f70772f = false;
            this.f70773g = 17;
            return this;
        }

        public b f() {
            this.f70774h = false;
            return this;
        }

        public b g() {
            this.f70775i = false;
            return this;
        }

        public b h() {
            this.f70770d = 0;
            this.f70771e = 0;
            this.f70772f = false;
            this.f70774h = false;
            return this;
        }

        public b i() {
            this.f70776j = 0.0f;
            this.f70777k = 0.0f;
            this.f70778l = 0.0f;
            this.f70779m = false;
            return this;
        }

        public b j(@o0 Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("config == null");
            }
            this.f70782p = config;
            return this;
        }

        boolean k() {
            return (this.f70767a == null && this.f70768b == 0) ? false : true;
        }

        boolean l() {
            return this.f70783q != null;
        }

        boolean m() {
            return (this.f70770d == 0 && this.f70771e == 0) ? false : true;
        }

        public b n() {
            if (this.f70771e == 0 && this.f70770d == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.f70775i = true;
            return this;
        }

        public b o(@o0 w.f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("Priority invalid.");
            }
            if (this.f70783q != null) {
                throw new IllegalStateException("Priority already set.");
            }
            this.f70783q = fVar;
            return this;
        }

        public b p() {
            this.f70780n = true;
            return this;
        }

        public b q(@u0 int i4, @u0 int i5) {
            if (i4 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i5 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i5 == 0 && i4 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f70770d = i4;
            this.f70771e = i5;
            return this;
        }

        public b r(float f4) {
            this.f70776j = f4;
            return this;
        }

        public b s(float f4, float f5, float f6) {
            this.f70776j = f4;
            this.f70777k = f5;
            this.f70778l = f6;
            this.f70779m = true;
            return this;
        }

        public b t(@androidx.annotation.v int i4) {
            if (i4 == 0) {
                throw new IllegalArgumentException("Image resource ID may not be 0.");
            }
            this.f70768b = i4;
            this.f70767a = null;
            return this;
        }

        public b u(@o0 Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("Image URI may not be null.");
            }
            this.f70767a = uri;
            this.f70768b = 0;
            return this;
        }

        public b v(@q0 String str) {
            this.f70769c = str;
            return this;
        }

        public b w(@o0 j0 j0Var) {
            if (j0Var == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (j0Var.key() == null) {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            if (this.f70781o == null) {
                this.f70781o = new ArrayList(2);
            }
            this.f70781o.add(j0Var);
            return this;
        }

        public b x(@o0 List<? extends j0> list) {
            if (list == null) {
                throw new IllegalArgumentException("Transformation list must not be null.");
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                w(list.get(i4));
            }
            return this;
        }

        public b(@o0 Uri uri) {
            u(uri);
        }

        public b(@androidx.annotation.v int i4) {
            t(i4);
        }

        b(Uri uri, int i4, Bitmap.Config config) {
            this.f70767a = uri;
            this.f70768b = i4;
            this.f70782p = config;
        }

        private b(b0 b0Var) {
            this.f70767a = b0Var.f70750d;
            this.f70768b = b0Var.f70751e;
            this.f70769c = b0Var.f70752f;
            this.f70770d = b0Var.f70754h;
            this.f70771e = b0Var.f70755i;
            this.f70772f = b0Var.f70756j;
            this.f70774h = b0Var.f70758l;
            this.f70773g = b0Var.f70757k;
            this.f70776j = b0Var.f70760n;
            this.f70777k = b0Var.f70761o;
            this.f70778l = b0Var.f70762p;
            this.f70779m = b0Var.f70763q;
            this.f70780n = b0Var.f70764r;
            this.f70775i = b0Var.f70759m;
            if (b0Var.f70753g != null) {
                this.f70781o = new ArrayList(b0Var.f70753g);
            }
            this.f70782p = b0Var.f70765s;
            this.f70783q = b0Var.f70766t;
        }
    }

    public b a() {
        return new b();
    }

    String b() {
        Uri uri = this.f70750d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f70751e);
    }

    boolean c() {
        return this.f70753g != null;
    }

    public boolean d() {
        return (this.f70754h == 0 && this.f70755i == 0) ? false : true;
    }

    String e() {
        long nanoTime = System.nanoTime() - this.f70748b;
        if (nanoTime > f70746u) {
            return h() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return h() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    boolean f() {
        return d() || this.f70760n != 0.0f;
    }

    boolean g() {
        return f() || c();
    }

    String h() {
        return androidx.view.e.a(new StringBuilder("[R"), this.f70747a, ']');
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i4 = this.f70751e;
        if (i4 > 0) {
            sb.append(i4);
        } else {
            sb.append(this.f70750d);
        }
        List<j0> list = this.f70753g;
        if (list != null && !list.isEmpty()) {
            for (j0 j0Var : this.f70753g) {
                sb.append(' ');
                sb.append(j0Var.key());
            }
        }
        if (this.f70752f != null) {
            sb.append(" stableKey(");
            sb.append(this.f70752f);
            sb.append(')');
        }
        if (this.f70754h > 0) {
            sb.append(" resize(");
            sb.append(this.f70754h);
            sb.append(',');
            sb.append(this.f70755i);
            sb.append(')');
        }
        if (this.f70756j) {
            sb.append(" centerCrop");
        }
        if (this.f70758l) {
            sb.append(" centerInside");
        }
        if (this.f70760n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f70760n);
            if (this.f70763q) {
                sb.append(" @ ");
                sb.append(this.f70761o);
                sb.append(',');
                sb.append(this.f70762p);
            }
            sb.append(')');
        }
        if (this.f70764r) {
            sb.append(" purgeable");
        }
        if (this.f70765s != null) {
            sb.append(' ');
            sb.append(this.f70765s);
        }
        sb.append('}');
        return sb.toString();
    }

    private b0(Uri uri, int i4, String str, List<j0> list, int i5, int i6, boolean z4, boolean z5, int i7, boolean z6, float f4, float f5, float f6, boolean z7, boolean z10, Bitmap.Config config, w.f fVar) {
        this.f70750d = uri;
        this.f70751e = i4;
        this.f70752f = str;
        if (list == null) {
            this.f70753g = null;
        } else {
            this.f70753g = Collections.unmodifiableList(list);
        }
        this.f70754h = i5;
        this.f70755i = i6;
        this.f70756j = z4;
        this.f70758l = z5;
        this.f70757k = i7;
        this.f70759m = z6;
        this.f70760n = f4;
        this.f70761o = f5;
        this.f70762p = f6;
        this.f70763q = z7;
        this.f70764r = z10;
        this.f70765s = config;
        this.f70766t = fVar;
    }
}
