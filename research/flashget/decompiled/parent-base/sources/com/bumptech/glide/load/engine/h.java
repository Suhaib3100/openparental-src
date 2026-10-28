package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.o0;
import androidx.core.util.v;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.util.pool.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: DecodeJob.java */
/* loaded from: classes3.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    private static final String H = ProtectedSandApp.s("ࣷ");
    private Object A;
    private com.bumptech.glide.load.a B;
    private com.bumptech.glide.load.data.d<?> C;
    private volatile com.bumptech.glide.load.engine.f D;
    private volatile boolean E;
    private volatile boolean F;
    private boolean G;

    /* renamed from: e, reason: collision with root package name */
    private final e f44046e;

    /* renamed from: f, reason: collision with root package name */
    private final v.a<h<?>> f44047f;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.e f44050i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.load.f f44051j;

    /* renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.j f44052k;

    /* renamed from: l, reason: collision with root package name */
    private n f44053l;

    /* renamed from: m, reason: collision with root package name */
    private int f44054m;

    /* renamed from: n, reason: collision with root package name */
    private int f44055n;

    /* renamed from: o, reason: collision with root package name */
    private j f44056o;

    /* renamed from: p, reason: collision with root package name */
    private com.bumptech.glide.load.i f44057p;

    /* renamed from: q, reason: collision with root package name */
    private b<R> f44058q;

    /* renamed from: r, reason: collision with root package name */
    private int f44059r;

    /* renamed from: s, reason: collision with root package name */
    private EnumC0742h f44060s;

    /* renamed from: t, reason: collision with root package name */
    private g f44061t;

    /* renamed from: u, reason: collision with root package name */
    private long f44062u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f44063v;

    /* renamed from: w, reason: collision with root package name */
    private Object f44064w;

    /* renamed from: x, reason: collision with root package name */
    private Thread f44065x;

    /* renamed from: y, reason: collision with root package name */
    private com.bumptech.glide.load.f f44066y;

    /* renamed from: z, reason: collision with root package name */
    private com.bumptech.glide.load.f f44067z;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f44043b = new com.bumptech.glide.load.engine.g<>();

    /* renamed from: c, reason: collision with root package name */
    private final List<Throwable> f44044c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f44045d = com.bumptech.glide.util.pool.c.a();

    /* renamed from: g, reason: collision with root package name */
    private final d<?> f44048g = new d<>();

    /* renamed from: h, reason: collision with root package name */
    private final f f44049h = new f();

    /* compiled from: DecodeJob.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44068a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f44069b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f44070c;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            f44070c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44070c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0742h.values().length];
            f44069b = iArr2;
            try {
                iArr2[EnumC0742h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44069b[EnumC0742h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44069b[EnumC0742h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44069b[EnumC0742h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44069b[EnumC0742h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f44068a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44068a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44068a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    interface b<R> {
        void b(u<R> uVar, com.bumptech.glide.load.a aVar, boolean z4);

        void c(GlideException glideException);

        void e(h<?> hVar);
    }

    /* compiled from: DecodeJob.java */
    private final class c<Z> implements i.a<Z> {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.a f44071a;

        c(com.bumptech.glide.load.a aVar) {
            this.f44071a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        @o0
        public u<Z> a(@o0 u<Z> uVar) {
            return h.this.u(this.f44071a, uVar);
        }
    }

    /* compiled from: DecodeJob.java */
    private static class d<Z> {

        /* renamed from: a, reason: collision with root package name */
        private com.bumptech.glide.load.f f44073a;

        /* renamed from: b, reason: collision with root package name */
        private com.bumptech.glide.load.l<Z> f44074b;

        /* renamed from: c, reason: collision with root package name */
        private t<Z> f44075c;

        d() {
        }

        void a() {
            this.f44073a = null;
            this.f44074b = null;
            this.f44075c = null;
        }

        void b(e eVar, com.bumptech.glide.load.i iVar) {
            com.bumptech.glide.util.pool.b.a(ProtectedSandApp.s("࣪"));
            try {
                eVar.a().a(this.f44073a, new com.bumptech.glide.load.engine.e(this.f44074b, this.f44075c, iVar));
            } finally {
                this.f44075c.f();
            }
        }

        boolean c() {
            return this.f44075c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(com.bumptech.glide.load.f fVar, com.bumptech.glide.load.l<X> lVar, t<X> tVar) {
            this.f44073a = fVar;
            this.f44074b = lVar;
            this.f44075c = tVar;
        }
    }

    /* compiled from: DecodeJob.java */
    interface e {
        com.bumptech.glide.load.engine.cache.a a();
    }

    /* compiled from: DecodeJob.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f44076a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f44077b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f44078c;

        f() {
        }

        private boolean a(boolean z4) {
            return (this.f44078c || z4 || this.f44077b) && this.f44076a;
        }

        synchronized boolean b() {
            this.f44077b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f44078c = true;
            return a(false);
        }

        synchronized boolean d(boolean z4) {
            this.f44076a = true;
            return a(z4);
        }

        synchronized void e() {
            this.f44077b = false;
            this.f44076a = false;
            this.f44078c = false;
        }
    }

    /* compiled from: DecodeJob.java */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    private enum EnumC0742h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, v.a<h<?>> aVar) {
        this.f44046e = eVar;
        this.f44047f = aVar;
    }

    private void A() {
        int i4 = a.f44068a[this.f44061t.ordinal()];
        if (i4 == 1) {
            this.f44060s = k(EnumC0742h.INITIALIZE);
            this.D = j();
            y();
        } else if (i4 == 2) {
            y();
        } else if (i4 == 3) {
            i();
        } else {
            throw new IllegalStateException(ProtectedSandApp.s("ࣴ") + this.f44061t);
        }
    }

    private void B() {
        this.f44045d.c();
        if (this.E) {
            throw new IllegalStateException(ProtectedSandApp.s("ࣵ"), this.f44044c.isEmpty() ? null : (Throwable) androidx.appcompat.view.menu.d.a(this.f44044c, 1));
        }
        this.E = true;
    }

    private <Data> u<R> g(com.bumptech.glide.load.data.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) throws GlideException {
        String s4 = ProtectedSandApp.s("ࣶ");
        if (data == null) {
            return null;
        }
        try {
            long b5 = com.bumptech.glide.util.i.b();
            u<R> h4 = h(data, aVar);
            if (Log.isLoggable(ProtectedSandApp.s("ࣷ"), 2)) {
                o(s4 + h4, b5, null);
            }
            return h4;
        } finally {
            dVar.b();
        }
    }

    private int getPriority() {
        return this.f44052k.ordinal();
    }

    private <Data> u<R> h(Data data, com.bumptech.glide.load.a aVar) throws GlideException {
        return z(data, aVar, this.f44043b.h(data.getClass()));
    }

    private void i() {
        u<R> uVar;
        if (Log.isLoggable(ProtectedSandApp.s("ࣷ"), 2)) {
            o(ProtectedSandApp.s("ࣻ"), this.f44062u, ProtectedSandApp.s("ࣸ") + this.A + ProtectedSandApp.s("ࣹ") + this.f44066y + ProtectedSandApp.s("ࣺ") + this.C);
        }
        try {
            uVar = g(this.C, this.A, this.B);
        } catch (GlideException e4) {
            e4.k(this.f44067z, this.B, null);
            this.f44044c.add(e4);
            uVar = null;
        }
        if (uVar != null) {
            q(uVar, this.B, this.G);
        } else {
            y();
        }
    }

    private com.bumptech.glide.load.engine.f j() {
        int i4 = a.f44069b[this.f44060s.ordinal()];
        if (i4 == 1) {
            return new v(this.f44043b, this);
        }
        if (i4 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f44043b, this);
        }
        if (i4 == 3) {
            return new y(this.f44043b, this);
        }
        if (i4 == 4) {
            return null;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ࣼ") + this.f44060s);
    }

    private EnumC0742h k(EnumC0742h enumC0742h) {
        int i4 = a.f44069b[enumC0742h.ordinal()];
        if (i4 == 1) {
            return this.f44056o.a() ? EnumC0742h.DATA_CACHE : k(EnumC0742h.DATA_CACHE);
        }
        if (i4 == 2) {
            return this.f44063v ? EnumC0742h.FINISHED : EnumC0742h.SOURCE;
        }
        if (i4 == 3 || i4 == 4) {
            return EnumC0742h.FINISHED;
        }
        if (i4 == 5) {
            return this.f44056o.b() ? EnumC0742h.RESOURCE_CACHE : k(EnumC0742h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ࣼ") + enumC0742h);
    }

    @o0
    private com.bumptech.glide.load.i l(com.bumptech.glide.load.a aVar) {
        com.bumptech.glide.load.i iVar = this.f44057p;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z4 = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f44043b.x();
        com.bumptech.glide.load.h<Boolean> hVar = com.bumptech.glide.load.resource.bitmap.w.f44553k;
        Boolean bool = (Boolean) iVar.c(hVar);
        if (bool != null && (!bool.booleanValue() || z4)) {
            return iVar;
        }
        com.bumptech.glide.load.i iVar2 = new com.bumptech.glide.load.i();
        iVar2.d(this.f44057p);
        iVar2.f(hVar, Boolean.valueOf(z4));
        return iVar2;
    }

    private void n(String str, long j4) {
        o(str, j4, null);
    }

    private void o(String str, long j4, String str2) {
        com.bumptech.glide.util.i.a(j4);
        Objects.toString(this.f44053l);
        if (str2 != null) {
            ProtectedSandApp.s("ࣽ").concat(str2);
        }
        Thread.currentThread().getName();
    }

    private void p(u<R> uVar, com.bumptech.glide.load.a aVar, boolean z4) {
        B();
        this.f44058q.b(uVar, aVar, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void q(u<R> uVar, com.bumptech.glide.load.a aVar, boolean z4) {
        t tVar;
        com.bumptech.glide.util.pool.b.a(ProtectedSandApp.s("ࣾ"));
        if (uVar instanceof q) {
            ((q) uVar).c();
        }
        if (this.f44048g.c()) {
            uVar = t.c(uVar);
            tVar = uVar;
        } else {
            tVar = 0;
        }
        p(uVar, aVar, z4);
        this.f44060s = EnumC0742h.ENCODE;
        try {
            if (this.f44048g.c()) {
                this.f44048g.b(this.f44046e, this.f44057p);
            }
            s();
        } finally {
            if (tVar != 0) {
                tVar.f();
            }
        }
    }

    private void r() {
        B();
        this.f44058q.c(new GlideException(ProtectedSandApp.s("ࣿ"), new ArrayList(this.f44044c)));
        t();
    }

    private void s() {
        if (this.f44049h.b()) {
            w();
        }
    }

    private void t() {
        if (this.f44049h.c()) {
            w();
        }
    }

    private void w() {
        this.f44049h.e();
        this.f44048g.a();
        this.f44043b.a();
        this.E = false;
        this.f44050i = null;
        this.f44051j = null;
        this.f44057p = null;
        this.f44052k = null;
        this.f44053l = null;
        this.f44058q = null;
        this.f44060s = null;
        this.D = null;
        this.f44065x = null;
        this.f44066y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.f44062u = 0L;
        this.F = false;
        this.f44064w = null;
        this.f44044c.clear();
        this.f44047f.release(this);
    }

    private void x(g gVar) {
        this.f44061t = gVar;
        this.f44058q.e(this);
    }

    private void y() {
        this.f44065x = Thread.currentThread();
        this.f44062u = com.bumptech.glide.util.i.b();
        boolean z4 = false;
        while (!this.F && this.D != null && !(z4 = this.D.b())) {
            this.f44060s = k(this.f44060s);
            this.D = j();
            if (this.f44060s == EnumC0742h.SOURCE) {
                x(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f44060s == EnumC0742h.FINISHED || this.F) && !z4) {
            r();
        }
    }

    private <Data, ResourceType> u<R> z(Data data, com.bumptech.glide.load.a aVar, s<Data, ResourceType, R> sVar) throws GlideException {
        com.bumptech.glide.load.i l4 = l(aVar);
        com.bumptech.glide.load.data.e<Data> l5 = this.f44050i.i().l(data);
        try {
            return sVar.b(l5, l4, this.f44054m, this.f44055n, new c(aVar));
        } finally {
            l5.b();
        }
    }

    boolean C() {
        EnumC0742h k4 = k(EnumC0742h.INITIALIZE);
        return k4 == EnumC0742h.RESOURCE_CACHE || k4 == EnumC0742h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(com.bumptech.glide.load.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException(ProtectedSandApp.s("ऀ"), exc);
        glideException.k(fVar, aVar, dVar.a());
        this.f44044c.add(glideException);
        if (Thread.currentThread() != this.f44065x) {
            x(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            y();
        }
    }

    public void b() {
        this.F = true;
        com.bumptech.glide.load.engine.f fVar = this.D;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c() {
        x(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @o0
    public com.bumptech.glide.util.pool.c d() {
        return this.f44045d;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e(com.bumptech.glide.load.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.f fVar2) {
        this.f44066y = fVar;
        this.A = obj;
        this.C = dVar;
        this.B = aVar;
        this.f44067z = fVar2;
        this.G = fVar != this.f44043b.c().get(0);
        if (Thread.currentThread() != this.f44065x) {
            x(g.DECODE_DATA);
        } else {
            com.bumptech.glide.util.pool.b.a(ProtectedSandApp.s("ँ"));
            i();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(@o0 h<?> hVar) {
        int ordinal = this.f44052k.ordinal() - hVar.f44052k.ordinal();
        return ordinal == 0 ? this.f44059r - hVar.f44059r : ordinal;
    }

    h<R> m(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.f fVar, int i4, int i5, Class<?> cls, Class<R> cls2, com.bumptech.glide.j jVar, j jVar2, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z4, boolean z5, boolean z6, com.bumptech.glide.load.i iVar, b<R> bVar, int i6) {
        this.f44043b.v(eVar, obj, fVar, i4, i5, jVar2, cls, cls2, jVar, iVar, map, z4, z5, this.f44046e);
        this.f44050i = eVar;
        this.f44051j = fVar;
        this.f44052k = jVar;
        this.f44053l = nVar;
        this.f44054m = i4;
        this.f44055n = i5;
        this.f44056o = jVar2;
        this.f44063v = z6;
        this.f44057p = iVar;
        this.f44058q = bVar;
        this.f44059r = i6;
        this.f44061t = g.INITIALIZE;
        this.f44064w = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.util.pool.b.d(ProtectedSandApp.s("ं"), this.f44061t, this.f44064w);
        com.bumptech.glide.load.data.d<?> dVar = this.C;
        try {
            try {
                if (this.F) {
                    r();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                A();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th;
            }
        } catch (com.bumptech.glide.load.engine.b e4) {
            throw e4;
        } catch (Throwable th2) {
            if (Log.isLoggable(ProtectedSandApp.s("ࣷ"), 3)) {
                Objects.toString(this.f44060s);
            }
            if (this.f44060s != EnumC0742h.ENCODE) {
                this.f44044c.add(th2);
                r();
            }
            if (!this.F) {
                throw th2;
            }
            throw th2;
        }
    }

    @o0
    <Z> u<Z> u(com.bumptech.glide.load.a aVar, @o0 u<Z> uVar) {
        u<Z> uVar2;
        com.bumptech.glide.load.m<Z> mVar;
        com.bumptech.glide.load.c cVar;
        com.bumptech.glide.load.f dVar;
        Class<?> cls = uVar.get().getClass();
        com.bumptech.glide.load.l<Z> lVar = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.m<Z> s4 = this.f44043b.s(cls);
            mVar = s4;
            uVar2 = s4.a(this.f44050i, uVar, this.f44054m, this.f44055n);
        } else {
            uVar2 = uVar;
            mVar = null;
        }
        if (!uVar.equals(uVar2)) {
            uVar.recycle();
        }
        if (this.f44043b.w(uVar2)) {
            lVar = this.f44043b.n(uVar2);
            cVar = lVar.b(this.f44057p);
        } else {
            cVar = com.bumptech.glide.load.c.NONE;
        }
        com.bumptech.glide.load.l lVar2 = lVar;
        if (!this.f44056o.d(!this.f44043b.y(this.f44066y), aVar, cVar)) {
            return uVar2;
        }
        if (lVar2 == null) {
            throw new Registry.NoResultEncoderAvailableException(uVar2.get().getClass());
        }
        int i4 = a.f44070c[cVar.ordinal()];
        if (i4 == 1) {
            dVar = new com.bumptech.glide.load.engine.d(this.f44066y, this.f44051j);
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ः") + cVar);
            }
            dVar = new w(this.f44043b.b(), this.f44066y, this.f44051j, this.f44054m, this.f44055n, mVar, cls, this.f44057p);
        }
        t c5 = t.c(uVar2);
        this.f44048g.d(dVar, lVar2, c5);
        return c5;
    }

    void v(boolean z4) {
        if (this.f44049h.d(z4)) {
            w();
        }
    }
}
