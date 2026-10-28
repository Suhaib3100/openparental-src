package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.request.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private static final int O = -1;
    private static final int P = 2;
    private static final int Q = 4;
    private static final int R = 8;
    private static final int S = 16;
    private static final int T = 32;
    private static final int U = 64;
    private static final int V = 128;
    private static final int W = 256;
    private static final int X = 512;
    private static final int Y = 1024;
    private static final int Z = 2048;

    /* renamed from: a0, reason: collision with root package name */
    private static final int f11965a0 = 4096;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f11966b0 = 8192;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f11967c0 = 16384;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f11968d0 = 32768;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f11969e0 = 65536;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f11970f0 = 131072;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f11971g0 = 262144;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f11972h0 = 524288;

    /* renamed from: i0, reason: collision with root package name */
    private static final int f11973i0 = 1048576;
    private boolean A;

    @q0
    private Drawable C;
    private int D;
    private boolean H;

    @q0
    private Resources.Theme I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean N;

    /* renamed from: o, reason: collision with root package name */
    private int f11974o;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private Drawable f11978s;

    /* renamed from: t, reason: collision with root package name */
    private int f11979t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private Drawable f11980u;

    /* renamed from: v, reason: collision with root package name */
    private int f11981v;

    /* renamed from: p, reason: collision with root package name */
    private float f11975p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private com.bumptech.glide.load.engine.j f11976q = com.bumptech.glide.load.engine.j.f11364e;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private com.bumptech.glide.i f11977r = com.bumptech.glide.i.NORMAL;

    /* renamed from: w, reason: collision with root package name */
    private boolean f11982w = true;

    /* renamed from: x, reason: collision with root package name */
    private int f11983x = -1;

    /* renamed from: y, reason: collision with root package name */
    private int f11984y = -1;

    /* renamed from: z, reason: collision with root package name */
    @o0
    private com.bumptech.glide.load.f f11985z = com.bumptech.glide.signature.c.c();
    private boolean B = true;

    @o0
    private com.bumptech.glide.load.i E = new com.bumptech.glide.load.i();

    @o0
    private Map<Class<?>, m<?>> F = new com.bumptech.glide.util.b();

    @o0
    private Class<?> G = Object.class;
    private boolean M = true;

    @o0
    private T E0(@o0 p pVar, @o0 m<Bitmap> mVar) {
        return P0(pVar, mVar, false);
    }

    @o0
    private T O0(@o0 p pVar, @o0 m<Bitmap> mVar) {
        return P0(pVar, mVar, true);
    }

    @o0
    private T P0(@o0 p pVar, @o0 m<Bitmap> mVar, boolean z5) {
        T b12 = z5 ? b1(pVar, mVar) : G0(pVar, mVar);
        b12.M = true;
        return b12;
    }

    private T Q0() {
        return this;
    }

    private boolean q0(int i5) {
        return r0(this.f11974o, i5);
    }

    private static boolean r0(int i5, int i6) {
        return (i5 & i6) != 0;
    }

    @androidx.annotation.j
    @o0
    public T A(@g0(from = 0, to = 100) int i5) {
        return S0(com.bumptech.glide.load.resource.bitmap.e.f11705b, Integer.valueOf(i5));
    }

    @androidx.annotation.j
    @o0
    public T A0() {
        return G0(p.f11762e, new com.bumptech.glide.load.resource.bitmap.m());
    }

    @androidx.annotation.j
    @o0
    public T B(@v int i5) {
        if (this.J) {
            return (T) p().B(i5);
        }
        this.f11979t = i5;
        int i6 = this.f11974o | 32;
        this.f11978s = null;
        this.f11974o = i6 & (-17);
        return R0();
    }

    @androidx.annotation.j
    @o0
    public T B0() {
        return P0(p.f11761d, new n(), false);
    }

    @androidx.annotation.j
    @o0
    public T C(@q0 Drawable drawable) {
        if (this.J) {
            return (T) p().C(drawable);
        }
        this.f11978s = drawable;
        int i5 = this.f11974o | 16;
        this.f11979t = 0;
        this.f11974o = i5 & (-33);
        return R0();
    }

    @androidx.annotation.j
    @o0
    public T C0() {
        return G0(p.f11762e, new o());
    }

    @androidx.annotation.j
    @o0
    public T D(@v int i5) {
        if (this.J) {
            return (T) p().D(i5);
        }
        this.D = i5;
        int i6 = this.f11974o | 16384;
        this.C = null;
        this.f11974o = i6 & (-8193);
        return R0();
    }

    @androidx.annotation.j
    @o0
    public T D0() {
        return P0(p.f11760c, new z(), false);
    }

    @androidx.annotation.j
    @o0
    public T E(@q0 Drawable drawable) {
        if (this.J) {
            return (T) p().E(drawable);
        }
        this.C = drawable;
        int i5 = this.f11974o | 8192;
        this.D = 0;
        this.f11974o = i5 & (-16385);
        return R0();
    }

    @androidx.annotation.j
    @o0
    public T F() {
        return P0(p.f11760c, new z(), true);
    }

    @androidx.annotation.j
    @o0
    public T F0(@o0 m<Bitmap> mVar) {
        return a1(mVar, false);
    }

    @androidx.annotation.j
    @o0
    public T G(@o0 com.bumptech.glide.load.b bVar) {
        com.bumptech.glide.util.l.d(bVar);
        return (T) S0(com.bumptech.glide.load.resource.bitmap.v.f11782g, bVar).S0(com.bumptech.glide.load.resource.gif.i.f11867a, bVar);
    }

    @o0
    final T G0(@o0 p pVar, @o0 m<Bitmap> mVar) {
        if (this.J) {
            return (T) p().G0(pVar, mVar);
        }
        y(pVar);
        return a1(mVar, false);
    }

    @androidx.annotation.j
    @o0
    public <Y> T H0(@o0 Class<Y> cls, @o0 m<Y> mVar) {
        return d1(cls, mVar, false);
    }

    @androidx.annotation.j
    @o0
    public T I(@g0(from = 0) long j5) {
        return S0(com.bumptech.glide.load.resource.bitmap.q0.f11770g, Long.valueOf(j5));
    }

    @androidx.annotation.j
    @o0
    public T I0(int i5) {
        return J0(i5, i5);
    }

    @o0
    public final com.bumptech.glide.load.engine.j J() {
        return this.f11976q;
    }

    @androidx.annotation.j
    @o0
    public T J0(int i5, int i6) {
        if (this.J) {
            return (T) p().J0(i5, i6);
        }
        this.f11984y = i5;
        this.f11983x = i6;
        this.f11974o |= 512;
        return R0();
    }

    public final int K() {
        return this.f11979t;
    }

    @androidx.annotation.j
    @o0
    public T K0(@v int i5) {
        if (this.J) {
            return (T) p().K0(i5);
        }
        this.f11981v = i5;
        int i6 = this.f11974o | 128;
        this.f11980u = null;
        this.f11974o = i6 & (-65);
        return R0();
    }

    @q0
    public final Drawable L() {
        return this.f11978s;
    }

    @androidx.annotation.j
    @o0
    public T L0(@q0 Drawable drawable) {
        if (this.J) {
            return (T) p().L0(drawable);
        }
        this.f11980u = drawable;
        int i5 = this.f11974o | 64;
        this.f11981v = 0;
        this.f11974o = i5 & (-129);
        return R0();
    }

    @q0
    public final Drawable M() {
        return this.C;
    }

    @androidx.annotation.j
    @o0
    public T M0(@o0 com.bumptech.glide.i iVar) {
        if (this.J) {
            return (T) p().M0(iVar);
        }
        this.f11977r = (com.bumptech.glide.i) com.bumptech.glide.util.l.d(iVar);
        this.f11974o |= 8;
        return R0();
    }

    public final int N() {
        return this.D;
    }

    public final boolean Q() {
        return this.L;
    }

    @o0
    protected final T R0() {
        if (this.H) {
            throw new IllegalStateException(ProtectedSandApp.s("ȉ"));
        }
        return this;
    }

    @o0
    public final com.bumptech.glide.load.i S() {
        return this.E;
    }

    @androidx.annotation.j
    @o0
    public <Y> T S0(@o0 com.bumptech.glide.load.h<Y> hVar, @o0 Y y5) {
        if (this.J) {
            return (T) p().S0(hVar, y5);
        }
        com.bumptech.glide.util.l.d(hVar);
        com.bumptech.glide.util.l.d(y5);
        this.E.e(hVar, y5);
        return R0();
    }

    public final int T() {
        return this.f11983x;
    }

    @androidx.annotation.j
    @o0
    public T U0(@o0 com.bumptech.glide.load.f fVar) {
        if (this.J) {
            return (T) p().U0(fVar);
        }
        this.f11985z = (com.bumptech.glide.load.f) com.bumptech.glide.util.l.d(fVar);
        this.f11974o |= 1024;
        return R0();
    }

    public final int V() {
        return this.f11984y;
    }

    @androidx.annotation.j
    @o0
    public T V0(@x(from = 0.0d, to = 1.0d) float f6) {
        if (this.J) {
            return (T) p().V0(f6);
        }
        if (f6 < 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ȋ"));
        }
        this.f11975p = f6;
        this.f11974o |= 2;
        return R0();
    }

    @q0
    public final Drawable W() {
        return this.f11980u;
    }

    @androidx.annotation.j
    @o0
    public T W0(boolean z5) {
        if (this.J) {
            return (T) p().W0(true);
        }
        this.f11982w = !z5;
        this.f11974o |= 256;
        return R0();
    }

    @androidx.annotation.j
    @o0
    public T X0(@q0 Resources.Theme theme) {
        if (this.J) {
            return (T) p().X0(theme);
        }
        this.I = theme;
        this.f11974o |= 32768;
        return R0();
    }

    public final int Y() {
        return this.f11981v;
    }

    @androidx.annotation.j
    @o0
    public T Y0(@g0(from = 0) int i5) {
        return S0(com.bumptech.glide.load.model.stream.b.f11603b, Integer.valueOf(i5));
    }

    @androidx.annotation.j
    @o0
    public T Z0(@o0 m<Bitmap> mVar) {
        return a1(mVar, true);
    }

    @androidx.annotation.j
    @o0
    public T a(@o0 a<?> aVar) {
        if (this.J) {
            return (T) p().a(aVar);
        }
        if (r0(aVar.f11974o, 2)) {
            this.f11975p = aVar.f11975p;
        }
        if (r0(aVar.f11974o, 262144)) {
            this.K = aVar.K;
        }
        if (r0(aVar.f11974o, 1048576)) {
            this.N = aVar.N;
        }
        if (r0(aVar.f11974o, 4)) {
            this.f11976q = aVar.f11976q;
        }
        if (r0(aVar.f11974o, 8)) {
            this.f11977r = aVar.f11977r;
        }
        if (r0(aVar.f11974o, 16)) {
            this.f11978s = aVar.f11978s;
            this.f11979t = 0;
            this.f11974o &= -33;
        }
        if (r0(aVar.f11974o, 32)) {
            this.f11979t = aVar.f11979t;
            this.f11978s = null;
            this.f11974o &= -17;
        }
        if (r0(aVar.f11974o, 64)) {
            this.f11980u = aVar.f11980u;
            this.f11981v = 0;
            this.f11974o &= -129;
        }
        if (r0(aVar.f11974o, 128)) {
            this.f11981v = aVar.f11981v;
            this.f11980u = null;
            this.f11974o &= -65;
        }
        if (r0(aVar.f11974o, 256)) {
            this.f11982w = aVar.f11982w;
        }
        if (r0(aVar.f11974o, 512)) {
            this.f11984y = aVar.f11984y;
            this.f11983x = aVar.f11983x;
        }
        if (r0(aVar.f11974o, 1024)) {
            this.f11985z = aVar.f11985z;
        }
        if (r0(aVar.f11974o, 4096)) {
            this.G = aVar.G;
        }
        if (r0(aVar.f11974o, 8192)) {
            this.C = aVar.C;
            this.D = 0;
            this.f11974o &= -16385;
        }
        if (r0(aVar.f11974o, 16384)) {
            this.D = aVar.D;
            this.C = null;
            this.f11974o &= -8193;
        }
        if (r0(aVar.f11974o, 32768)) {
            this.I = aVar.I;
        }
        if (r0(aVar.f11974o, 65536)) {
            this.B = aVar.B;
        }
        if (r0(aVar.f11974o, 131072)) {
            this.A = aVar.A;
        }
        if (r0(aVar.f11974o, 2048)) {
            this.F.putAll(aVar.F);
            this.M = aVar.M;
        }
        if (r0(aVar.f11974o, 524288)) {
            this.L = aVar.L;
        }
        if (!this.B) {
            this.F.clear();
            int i5 = this.f11974o & (-2049);
            this.A = false;
            this.f11974o = i5 & (-131073);
            this.M = true;
        }
        this.f11974o |= aVar.f11974o;
        this.E.d(aVar.E);
        return R0();
    }

    @o0
    public final com.bumptech.glide.i a0() {
        return this.f11977r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    T a1(@o0 m<Bitmap> mVar, boolean z5) {
        if (this.J) {
            return (T) p().a1(mVar, z5);
        }
        com.bumptech.glide.load.resource.bitmap.x xVar = new com.bumptech.glide.load.resource.bitmap.x(mVar, z5);
        d1(Bitmap.class, mVar, z5);
        d1(Drawable.class, xVar, z5);
        d1(BitmapDrawable.class, xVar, z5);
        d1(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.f(mVar), z5);
        return R0();
    }

    @o0
    public T b() {
        if (this.H && !this.J) {
            throw new IllegalStateException(ProtectedSandApp.s("ȋ"));
        }
        this.J = true;
        return x0();
    }

    @o0
    public final Class<?> b0() {
        return this.G;
    }

    @androidx.annotation.j
    @o0
    final T b1(@o0 p pVar, @o0 m<Bitmap> mVar) {
        if (this.J) {
            return (T) p().b1(pVar, mVar);
        }
        y(pVar);
        return Z0(mVar);
    }

    @o0
    public final com.bumptech.glide.load.f c0() {
        return this.f11985z;
    }

    @androidx.annotation.j
    @o0
    public <Y> T c1(@o0 Class<Y> cls, @o0 m<Y> mVar) {
        return d1(cls, mVar, true);
    }

    public final float d0() {
        return this.f11975p;
    }

    @o0
    <Y> T d1(@o0 Class<Y> cls, @o0 m<Y> mVar, boolean z5) {
        if (this.J) {
            return (T) p().d1(cls, mVar, z5);
        }
        com.bumptech.glide.util.l.d(cls);
        com.bumptech.glide.util.l.d(mVar);
        this.F.put(cls, mVar);
        int i5 = this.f11974o | 2048;
        this.B = true;
        int i6 = i5 | 65536;
        this.f11974o = i6;
        this.M = false;
        if (z5) {
            this.f11974o = i6 | 131072;
            this.A = true;
        }
        return R0();
    }

    @q0
    public final Resources.Theme e0() {
        return this.I;
    }

    @androidx.annotation.j
    @o0
    public T e1(@o0 m<Bitmap>... mVarArr) {
        return mVarArr.length > 1 ? a1(new com.bumptech.glide.load.g(mVarArr), true) : mVarArr.length == 1 ? Z0(mVarArr[0]) : R0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f11975p, this.f11975p) == 0 && this.f11979t == aVar.f11979t && com.bumptech.glide.util.n.d(this.f11978s, aVar.f11978s) && this.f11981v == aVar.f11981v && com.bumptech.glide.util.n.d(this.f11980u, aVar.f11980u) && this.D == aVar.D && com.bumptech.glide.util.n.d(this.C, aVar.C) && this.f11982w == aVar.f11982w && this.f11983x == aVar.f11983x && this.f11984y == aVar.f11984y && this.A == aVar.A && this.B == aVar.B && this.K == aVar.K && this.L == aVar.L && this.f11976q.equals(aVar.f11976q) && this.f11977r == aVar.f11977r && this.E.equals(aVar.E) && this.F.equals(aVar.F) && this.G.equals(aVar.G) && com.bumptech.glide.util.n.d(this.f11985z, aVar.f11985z) && com.bumptech.glide.util.n.d(this.I, aVar.I);
    }

    @androidx.annotation.j
    @o0
    @Deprecated
    public T f1(@o0 m<Bitmap>... mVarArr) {
        return a1(new com.bumptech.glide.load.g(mVarArr), true);
    }

    @o0
    public final Map<Class<?>, m<?>> g0() {
        return this.F;
    }

    public final boolean h0() {
        return this.N;
    }

    @androidx.annotation.j
    @o0
    public T h1(boolean z5) {
        if (this.J) {
            return (T) p().h1(z5);
        }
        this.N = z5;
        this.f11974o |= 1048576;
        return R0();
    }

    public int hashCode() {
        return com.bumptech.glide.util.n.q(this.I, com.bumptech.glide.util.n.q(this.f11985z, com.bumptech.glide.util.n.q(this.G, com.bumptech.glide.util.n.q(this.F, com.bumptech.glide.util.n.q(this.E, com.bumptech.glide.util.n.q(this.f11977r, com.bumptech.glide.util.n.q(this.f11976q, (((((((((((((com.bumptech.glide.util.n.q(this.C, (com.bumptech.glide.util.n.q(this.f11980u, (com.bumptech.glide.util.n.q(this.f11978s, (com.bumptech.glide.util.n.m(this.f11975p) * 31) + this.f11979t) * 31) + this.f11981v) * 31) + this.D) * 31) + (this.f11982w ? 1 : 0)) * 31) + this.f11983x) * 31) + this.f11984y) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0))))))));
    }

    public final boolean i0() {
        return this.K;
    }

    @androidx.annotation.j
    @o0
    public T i1(boolean z5) {
        if (this.J) {
            return (T) p().i1(z5);
        }
        this.K = z5;
        this.f11974o |= 262144;
        return R0();
    }

    protected final boolean j0() {
        return this.J;
    }

    @androidx.annotation.j
    @o0
    public T k() {
        return b1(p.f11762e, new com.bumptech.glide.load.resource.bitmap.m());
    }

    public final boolean k0() {
        return q0(4);
    }

    public final boolean l0() {
        return this.H;
    }

    public final boolean m0() {
        return this.f11982w;
    }

    @androidx.annotation.j
    @o0
    public T n() {
        return P0(p.f11761d, new n(), true);
    }

    public final boolean n0() {
        return q0(8);
    }

    @androidx.annotation.j
    @o0
    public T o() {
        return b1(p.f11761d, new o());
    }

    boolean o0() {
        return this.M;
    }

    @Override // 
    @androidx.annotation.j
    public T p() {
        try {
            T t5 = (T) super.clone();
            com.bumptech.glide.load.i iVar = new com.bumptech.glide.load.i();
            t5.E = iVar;
            iVar.d(this.E);
            com.bumptech.glide.util.b bVar = new com.bumptech.glide.util.b();
            t5.F = bVar;
            bVar.putAll(this.F);
            t5.H = false;
            t5.J = false;
            return t5;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    @androidx.annotation.j
    @o0
    public T q(@o0 Class<?> cls) {
        if (this.J) {
            return (T) p().q(cls);
        }
        this.G = (Class) com.bumptech.glide.util.l.d(cls);
        this.f11974o |= 4096;
        return R0();
    }

    public final boolean s0() {
        return q0(256);
    }

    public final boolean t0() {
        return this.B;
    }

    @androidx.annotation.j
    @o0
    public T u() {
        return S0(com.bumptech.glide.load.resource.bitmap.v.f11786k, Boolean.FALSE);
    }

    public final boolean u0() {
        return this.A;
    }

    @androidx.annotation.j
    @o0
    public T v(@o0 com.bumptech.glide.load.engine.j jVar) {
        if (this.J) {
            return (T) p().v(jVar);
        }
        this.f11976q = (com.bumptech.glide.load.engine.j) com.bumptech.glide.util.l.d(jVar);
        this.f11974o |= 4;
        return R0();
    }

    public final boolean v0() {
        return q0(2048);
    }

    @androidx.annotation.j
    @o0
    public T w() {
        return S0(com.bumptech.glide.load.resource.gif.i.f11868b, Boolean.TRUE);
    }

    public final boolean w0() {
        return com.bumptech.glide.util.n.w(this.f11984y, this.f11983x);
    }

    @androidx.annotation.j
    @o0
    public T x() {
        if (this.J) {
            return (T) p().x();
        }
        this.F.clear();
        int i5 = this.f11974o & (-2049);
        this.A = false;
        this.B = false;
        this.f11974o = (i5 & (-131073)) | 65536;
        this.M = true;
        return R0();
    }

    @o0
    public T x0() {
        this.H = true;
        return this;
    }

    @androidx.annotation.j
    @o0
    public T y(@o0 p pVar) {
        return S0(p.f11765h, com.bumptech.glide.util.l.d(pVar));
    }

    @androidx.annotation.j
    @o0
    public T z(@o0 Bitmap.CompressFormat compressFormat) {
        return S0(com.bumptech.glide.load.resource.bitmap.e.f11706c, com.bumptech.glide.util.l.d(compressFormat));
    }

    @androidx.annotation.j
    @o0
    public T z0(boolean z5) {
        if (this.J) {
            return (T) p().z0(z5);
        }
        this.L = z5;
        this.f11974o |= 524288;
        return R0();
    }
}
