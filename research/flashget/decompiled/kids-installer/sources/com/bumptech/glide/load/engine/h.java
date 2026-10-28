package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.o0;
import androidx.core.util.p;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.util.pool.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: DecodeJob.java */
/* loaded from: classes3.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    private static final String U = ProtectedSandApp.s("᳦");
    private int A;
    private j B;
    private com.bumptech.glide.load.i C;
    private b<R> D;
    private int E;
    private EnumC0143h F;
    private g G;
    private long H;
    private boolean I;
    private Object J;
    private Thread K;
    private com.bumptech.glide.load.f L;
    private com.bumptech.glide.load.f M;
    private Object N;
    private com.bumptech.glide.load.a O;
    private com.bumptech.glide.load.data.d<?> P;
    private volatile com.bumptech.glide.load.engine.f Q;
    private volatile boolean R;
    private volatile boolean S;
    private boolean T;

    /* renamed from: r, reason: collision with root package name */
    private final e f11334r;

    /* renamed from: s, reason: collision with root package name */
    private final p.a<h<?>> f11335s;

    /* renamed from: v, reason: collision with root package name */
    private com.bumptech.glide.d f11338v;

    /* renamed from: w, reason: collision with root package name */
    private com.bumptech.glide.load.f f11339w;

    /* renamed from: x, reason: collision with root package name */
    private com.bumptech.glide.i f11340x;

    /* renamed from: y, reason: collision with root package name */
    private n f11341y;

    /* renamed from: z, reason: collision with root package name */
    private int f11342z;

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f11331o = new com.bumptech.glide.load.engine.g<>();

    /* renamed from: p, reason: collision with root package name */
    private final List<Throwable> f11332p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f11333q = com.bumptech.glide.util.pool.c.a();

    /* renamed from: t, reason: collision with root package name */
    private final d<?> f11336t = new d<>();

    /* renamed from: u, reason: collision with root package name */
    private final f f11337u = new f();

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11343a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11344b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f11345c;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            f11345c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11345c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0143h.values().length];
            f11344b = iArr2;
            try {
                iArr2[EnumC0143h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11344b[EnumC0143h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11344b[EnumC0143h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11344b[EnumC0143h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11344b[EnumC0143h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f11343a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11343a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11343a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    interface b<R> {
        void a(GlideException glideException);

        void c(u<R> uVar, com.bumptech.glide.load.a aVar, boolean z5);

        void d(h<?> hVar);
    }

    /* compiled from: DecodeJob.java */
    private final class c<Z> implements i.a<Z> {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.a f11346a;

        c(com.bumptech.glide.load.a aVar) {
            this.f11346a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        @o0
        public u<Z> a(@o0 u<Z> uVar) {
            return h.this.F(this.f11346a, uVar);
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    private static class d<Z> {

        /* renamed from: a, reason: collision with root package name */
        private com.bumptech.glide.load.f f11348a;

        /* renamed from: b, reason: collision with root package name */
        private com.bumptech.glide.load.l<Z> f11349b;

        /* renamed from: c, reason: collision with root package name */
        private t<Z> f11350c;

        d() {
        }

        void a() {
            this.f11348a = null;
            this.f11349b = null;
            this.f11350c = null;
        }

        void b(e eVar, com.bumptech.glide.load.i iVar) {
            try {
                eVar.a().a(this.f11348a, new com.bumptech.glide.load.engine.e(this.f11349b, this.f11350c, iVar));
            } finally {
                this.f11350c.f();
            }
        }

        boolean c() {
            return this.f11350c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.l<X> lVar, t<X> tVar) {
            this.f11348a = fVar;
            this.f11349b = lVar;
            this.f11350c = tVar;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    interface e {
        com.bumptech.glide.load.engine.cache.a a();
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f11351a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f11352b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f11353c;

        f() {
        }

        private boolean a(boolean z5) {
            return (this.f11353c || z5 || this.f11352b) && this.f11351a;
        }

        synchronized boolean b() {
            this.f11352b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f11353c = true;
            return a(false);
        }

        synchronized boolean d(boolean z5) {
            this.f11351a = true;
            return a(z5);
        }

        synchronized void e() {
            this.f11352b = false;
            this.f11351a = false;
            this.f11353c = false;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private enum EnumC0143h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, p.a<h<?>> aVar) {
        this.f11334r = eVar;
        this.f11335s = aVar;
    }

    private void A(u<R> uVar, com.bumptech.glide.load.a aVar, boolean z5) {
        L();
        this.D.c(uVar, aVar, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void B(u<R> uVar, com.bumptech.glide.load.a aVar, boolean z5) {
        t tVar;
        if (uVar instanceof q) {
            ((q) uVar).b();
        }
        if (this.f11336t.c()) {
            uVar = t.d(uVar);
            tVar = uVar;
        } else {
            tVar = 0;
        }
        A(uVar, aVar, z5);
        this.F = EnumC0143h.ENCODE;
        try {
            if (this.f11336t.c()) {
                this.f11336t.b(this.f11334r, this.C);
            }
            D();
        } finally {
            if (tVar != 0) {
                tVar.f();
            }
        }
    }

    private void C() {
        L();
        this.D.a(new GlideException(ProtectedSandApp.s("᳖"), new ArrayList(this.f11332p)));
        E();
    }

    private void D() {
        if (this.f11337u.b()) {
            H();
        }
    }

    private void E() {
        if (this.f11337u.c()) {
            H();
        }
    }

    private void H() {
        this.f11337u.e();
        this.f11336t.a();
        this.f11331o.a();
        this.R = false;
        this.f11338v = null;
        this.f11339w = null;
        this.C = null;
        this.f11340x = null;
        this.f11341y = null;
        this.D = null;
        this.F = null;
        this.Q = null;
        this.K = null;
        this.L = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.H = 0L;
        this.S = false;
        this.J = null;
        this.f11332p.clear();
        this.f11335s.a(this);
    }

    private void I() {
        this.K = Thread.currentThread();
        this.H = com.bumptech.glide.util.h.b();
        boolean z5 = false;
        while (!this.S && this.Q != null && !(z5 = this.Q.a())) {
            this.F = u(this.F);
            this.Q = t();
            if (this.F == EnumC0143h.SOURCE) {
                h();
                return;
            }
        }
        if ((this.F == EnumC0143h.FINISHED || this.S) && !z5) {
            C();
        }
    }

    private <Data, ResourceType> u<R> J(Data data, com.bumptech.glide.load.a aVar, s<Data, ResourceType, R> sVar) throws GlideException {
        com.bumptech.glide.load.i v5 = v(aVar);
        com.bumptech.glide.load.data.e<Data> l5 = this.f11338v.i().l(data);
        try {
            return sVar.b(l5, v5, this.f11342z, this.A, new c(aVar));
        } finally {
            l5.b();
        }
    }

    private void K() {
        int i5 = a.f11343a[this.G.ordinal()];
        if (i5 == 1) {
            this.F = u(EnumC0143h.INITIALIZE);
            this.Q = t();
            I();
        } else if (i5 == 2) {
            I();
        } else if (i5 == 3) {
            s();
        } else {
            throw new IllegalStateException(ProtectedSandApp.s("᳗") + this.G);
        }
    }

    private void L() {
        Throwable th;
        this.f11333q.c();
        if (!this.R) {
            this.R = true;
            return;
        }
        if (this.f11332p.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f11332p;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException(ProtectedSandApp.s("᳘"), th);
    }

    private <Data> u<R> q(com.bumptech.glide.load.data.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) throws GlideException {
        String s5 = ProtectedSandApp.s("᳙");
        if (data == null) {
            return null;
        }
        try {
            long b6 = com.bumptech.glide.util.h.b();
            u<R> r5 = r(data, aVar);
            if (Log.isLoggable(ProtectedSandApp.s("᳚"), 2)) {
                z(s5 + r5, b6, null);
            }
            return r5;
        } finally {
            dVar.b();
        }
    }

    private <Data> u<R> r(Data data, com.bumptech.glide.load.a aVar) throws GlideException {
        return J(data, aVar, this.f11331o.h(data.getClass()));
    }

    private void s() {
        u<R> uVar;
        if (Log.isLoggable(ProtectedSandApp.s("᳛"), 2)) {
            z(ProtectedSandApp.s("᳟"), this.H, ProtectedSandApp.s("᳜") + this.N + ProtectedSandApp.s("᳝") + this.L + ProtectedSandApp.s("᳞") + this.P);
        }
        try {
            uVar = q(this.P, this.N, this.O);
        } catch (GlideException e6) {
            e6.k(this.M, this.O, null);
            this.f11332p.add(e6);
            uVar = null;
        }
        if (uVar != null) {
            B(uVar, this.O, this.T);
        } else {
            I();
        }
    }

    private com.bumptech.glide.load.engine.f t() {
        int i5 = a.f11344b[this.F.ordinal()];
        if (i5 == 1) {
            return new v(this.f11331o, this);
        }
        if (i5 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f11331o, this);
        }
        if (i5 == 3) {
            return new y(this.f11331o, this);
        }
        if (i5 == 4) {
            return null;
        }
        throw new IllegalStateException(ProtectedSandApp.s("᳠") + this.F);
    }

    private EnumC0143h u(EnumC0143h enumC0143h) {
        int i5 = a.f11344b[enumC0143h.ordinal()];
        if (i5 == 1) {
            return this.B.a() ? EnumC0143h.DATA_CACHE : u(EnumC0143h.DATA_CACHE);
        }
        if (i5 == 2) {
            return this.I ? EnumC0143h.FINISHED : EnumC0143h.SOURCE;
        }
        if (i5 == 3 || i5 == 4) {
            return EnumC0143h.FINISHED;
        }
        if (i5 == 5) {
            return this.B.b() ? EnumC0143h.RESOURCE_CACHE : u(EnumC0143h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("᳡") + enumC0143h);
    }

    @o0
    private com.bumptech.glide.load.i v(com.bumptech.glide.load.a aVar) {
        com.bumptech.glide.load.i iVar = this.C;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z5 = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f11331o.w();
        com.bumptech.glide.load.h<Boolean> hVar = com.bumptech.glide.load.resource.bitmap.v.f11786k;
        Boolean bool = (Boolean) iVar.c(hVar);
        if (bool != null && (!bool.booleanValue() || z5)) {
            return iVar;
        }
        com.bumptech.glide.load.i iVar2 = new com.bumptech.glide.load.i();
        iVar2.d(this.C);
        iVar2.e(hVar, Boolean.valueOf(z5));
        return iVar2;
    }

    private int w() {
        return this.f11340x.ordinal();
    }

    private void y(String str, long j5) {
        z(str, j5, null);
    }

    private void z(String str, long j5, String str2) {
        com.bumptech.glide.util.h.a(j5);
        Objects.toString(this.f11341y);
        if (str2 != null) {
            ProtectedSandApp.s("᳢").concat(str2);
        }
        Thread.currentThread().getName();
    }

    @o0
    <Z> u<Z> F(com.bumptech.glide.load.a aVar, @o0 u<Z> uVar) {
        u<Z> uVar2;
        com.bumptech.glide.load.m<Z> mVar;
        com.bumptech.glide.load.c cVar;
        com.bumptech.glide.load.f dVar;
        Class<?> cls = uVar.get().getClass();
        com.bumptech.glide.load.l<Z> lVar = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.m<Z> r5 = this.f11331o.r(cls);
            mVar = r5;
            uVar2 = r5.b(this.f11338v, uVar, this.f11342z, this.A);
        } else {
            uVar2 = uVar;
            mVar = null;
        }
        if (!uVar.equals(uVar2)) {
            uVar.recycle();
        }
        if (this.f11331o.v(uVar2)) {
            lVar = this.f11331o.n(uVar2);
            cVar = lVar.b(this.C);
        } else {
            cVar = com.bumptech.glide.load.c.NONE;
        }
        com.bumptech.glide.load.l lVar2 = lVar;
        if (!this.B.d(!this.f11331o.x(this.L), aVar, cVar)) {
            return uVar2;
        }
        if (lVar2 == null) {
            throw new Registry.NoResultEncoderAvailableException(uVar2.get().getClass());
        }
        int i5 = a.f11345c[cVar.ordinal()];
        if (i5 == 1) {
            dVar = new com.bumptech.glide.load.engine.d(this.L, this.f11339w);
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException(ProtectedSandApp.s("᳣") + cVar);
            }
            dVar = new w(this.f11331o.b(), this.L, this.f11339w, this.f11342z, this.A, mVar, cls, this.C);
        }
        t d6 = t.d(uVar2);
        this.f11336t.d(dVar, lVar2, d6);
        return d6;
    }

    void G(boolean z5) {
        if (this.f11337u.d(z5)) {
            H();
        }
    }

    boolean M() {
        EnumC0143h u5 = u(EnumC0143h.INITIALIZE);
        return u5 == EnumC0143h.RESOURCE_CACHE || u5 == EnumC0143h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void g(com.bumptech.glide.load.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException(ProtectedSandApp.s("᳤"), exc);
        glideException.k(fVar, aVar, dVar.a());
        this.f11332p.add(glideException);
        if (Thread.currentThread() == this.K) {
            I();
        } else {
            this.G = g.SWITCH_TO_SOURCE_SERVICE;
            this.D.d(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void h() {
        this.G = g.SWITCH_TO_SOURCE_SERVICE;
        this.D.d(this);
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void j(com.bumptech.glide.load.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.f fVar2) {
        this.L = fVar;
        this.N = obj;
        this.P = dVar;
        this.O = aVar;
        this.M = fVar2;
        this.T = fVar != this.f11331o.c().get(0);
        if (Thread.currentThread() == this.K) {
            s();
        } else {
            this.G = g.DECODE_DATA;
            this.D.d(this);
        }
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @o0
    public com.bumptech.glide.util.pool.c l() {
        return this.f11333q;
    }

    public void o() {
        this.S = true;
        com.bumptech.glide.load.engine.f fVar = this.Q;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(@o0 h<?> hVar) {
        int w5 = w() - hVar.w();
        return w5 == 0 ? this.E - hVar.E : w5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.P;
        try {
            try {
                try {
                    if (this.S) {
                        C();
                        if (dVar != null) {
                            dVar.b();
                            return;
                        }
                        return;
                    }
                    K();
                    if (dVar != null) {
                        dVar.b();
                    }
                } catch (com.bumptech.glide.load.engine.b e6) {
                    throw e6;
                }
            } catch (Throwable th) {
                if (Log.isLoggable(ProtectedSandApp.s("᳥"), 3)) {
                    Objects.toString(this.F);
                }
                if (this.F != EnumC0143h.ENCODE) {
                    this.f11332p.add(th);
                    C();
                }
                if (!this.S) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            throw th2;
        }
    }

    h<R> x(com.bumptech.glide.d dVar, Object obj, n nVar, com.bumptech.glide.load.f fVar, int i5, int i6, Class<?> cls, Class<R> cls2, com.bumptech.glide.i iVar, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z5, boolean z6, boolean z7, com.bumptech.glide.load.i iVar2, b<R> bVar, int i7) {
        this.f11331o.u(dVar, obj, fVar, i5, i6, jVar, cls, cls2, iVar, iVar2, map, z5, z6, this.f11334r);
        this.f11338v = dVar;
        this.f11339w = fVar;
        this.f11340x = iVar;
        this.f11341y = nVar;
        this.f11342z = i5;
        this.A = i6;
        this.B = jVar;
        this.I = z7;
        this.C = iVar2;
        this.D = bVar;
        this.E = i7;
        this.G = g.INITIALIZE;
        this.J = obj;
        return this;
    }
}
