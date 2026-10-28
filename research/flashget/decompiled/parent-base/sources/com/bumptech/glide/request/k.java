package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import com.bumptech.glide.d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: SingleRequest.java */
/* loaded from: classes3.dex */
public final class k<R> implements e, o, j {
    private static final String E = ProtectedSandApp.s("\u0a62");
    private static final String F = ProtectedSandApp.s("\u0a63");
    private static final boolean G = Log.isLoggable(ProtectedSandApp.s("\u0a62"), 2);

    @b0("requestLock")
    private int A;

    @b0("requestLock")
    private int B;

    @b0("requestLock")
    private boolean C;

    @q0
    private RuntimeException D;

    /* renamed from: a, reason: collision with root package name */
    private int f44817a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final String f44818b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f44819c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f44820d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final h<R> f44821e;

    /* renamed from: f, reason: collision with root package name */
    private final f f44822f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f44823g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.e f44824h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private final Object f44825i;

    /* renamed from: j, reason: collision with root package name */
    private final Class<R> f44826j;

    /* renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.request.a<?> f44827k;

    /* renamed from: l, reason: collision with root package name */
    private final int f44828l;

    /* renamed from: m, reason: collision with root package name */
    private final int f44829m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.j f44830n;

    /* renamed from: o, reason: collision with root package name */
    private final p<R> f44831o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private final List<h<R>> f44832p;

    /* renamed from: q, reason: collision with root package name */
    private final com.bumptech.glide.request.transition.g<? super R> f44833q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f44834r;

    /* renamed from: s, reason: collision with root package name */
    @b0("requestLock")
    private u<R> f44835s;

    /* renamed from: t, reason: collision with root package name */
    @b0("requestLock")
    private k.d f44836t;

    /* renamed from: u, reason: collision with root package name */
    @b0("requestLock")
    private long f44837u;

    /* renamed from: v, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.k f44838v;

    /* renamed from: w, reason: collision with root package name */
    @b0("requestLock")
    private a f44839w;

    /* renamed from: x, reason: collision with root package name */
    @q0
    @b0("requestLock")
    private Drawable f44840x;

    /* renamed from: y, reason: collision with root package name */
    @q0
    @b0("requestLock")
    private Drawable f44841y;

    /* renamed from: z, reason: collision with root package name */
    @q0
    @b0("requestLock")
    private Drawable f44842z;

    /* compiled from: SingleRequest.java */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private k(Context context, com.bumptech.glide.e eVar, @o0 Object obj, @q0 Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i4, int i5, com.bumptech.glide.j jVar, p<R> pVar, @q0 h<R> hVar, @q0 List<h<R>> list, f fVar, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.request.transition.g<? super R> gVar, Executor executor) {
        this.f44818b = G ? String.valueOf(hashCode()) : null;
        this.f44819c = com.bumptech.glide.util.pool.c.a();
        this.f44820d = obj;
        this.f44823g = context;
        this.f44824h = eVar;
        this.f44825i = obj2;
        this.f44826j = cls;
        this.f44827k = aVar;
        this.f44828l = i4;
        this.f44829m = i5;
        this.f44830n = jVar;
        this.f44831o = pVar;
        this.f44821e = hVar;
        this.f44832p = list;
        this.f44822f = fVar;
        this.f44838v = kVar;
        this.f44833q = gVar;
        this.f44834r = executor;
        this.f44839w = a.PENDING;
        if (this.D == null && eVar.g().b(d.C0730d.class)) {
            this.D = new RuntimeException(ProtectedSandApp.s("\u0a64"));
        }
    }

    @b0("requestLock")
    private void A() {
        if (k()) {
            Drawable p4 = this.f44825i == null ? p() : null;
            if (p4 == null) {
                p4 = o();
            }
            if (p4 == null) {
                p4 = q();
            }
            this.f44831o.m(p4);
        }
    }

    @b0("requestLock")
    private void i() {
        if (this.C) {
            throw new IllegalStateException(ProtectedSandApp.s("\u0a65"));
        }
    }

    @b0("requestLock")
    private boolean j() {
        f fVar = this.f44822f;
        return fVar == null || fVar.i(this);
    }

    @b0("requestLock")
    private boolean k() {
        f fVar = this.f44822f;
        return fVar == null || fVar.b(this);
    }

    @b0("requestLock")
    private boolean l() {
        f fVar = this.f44822f;
        return fVar == null || fVar.c(this);
    }

    @b0("requestLock")
    private void m() {
        i();
        this.f44819c.c();
        this.f44831o.a(this);
        k.d dVar = this.f44836t;
        if (dVar != null) {
            dVar.a();
            this.f44836t = null;
        }
    }

    private void n(Object obj) {
        List<h<R>> list = this.f44832p;
        if (list == null) {
            return;
        }
        for (h<R> hVar : list) {
            if (hVar instanceof c) {
                ((c) hVar).a(obj);
            }
        }
    }

    @b0("requestLock")
    private Drawable o() {
        if (this.f44840x == null) {
            Drawable J = this.f44827k.J();
            this.f44840x = J;
            if (J == null && this.f44827k.I() > 0) {
                this.f44840x = s(this.f44827k.I());
            }
        }
        return this.f44840x;
    }

    @b0("requestLock")
    private Drawable p() {
        if (this.f44842z == null) {
            Drawable K = this.f44827k.K();
            this.f44842z = K;
            if (K == null && this.f44827k.M() > 0) {
                this.f44842z = s(this.f44827k.M());
            }
        }
        return this.f44842z;
    }

    @b0("requestLock")
    private Drawable q() {
        if (this.f44841y == null) {
            Drawable S = this.f44827k.S();
            this.f44841y = S;
            if (S == null && this.f44827k.T() > 0) {
                this.f44841y = s(this.f44827k.T());
            }
        }
        return this.f44841y;
    }

    @b0("requestLock")
    private boolean r() {
        f fVar = this.f44822f;
        return fVar == null || !fVar.getRoot().a();
    }

    @b0("requestLock")
    private Drawable s(@v int i4) {
        return com.bumptech.glide.load.resource.drawable.i.a(this.f44823g, i4, this.f44827k.Z() != null ? this.f44827k.Z() : this.f44823g.getTheme());
    }

    private void t(String str) {
    }

    private static int u(int i4, float f4) {
        return i4 == Integer.MIN_VALUE ? i4 : Math.round(f4 * i4);
    }

    @b0("requestLock")
    private void v() {
        f fVar = this.f44822f;
        if (fVar != null) {
            fVar.d(this);
        }
    }

    @b0("requestLock")
    private void w() {
        f fVar = this.f44822f;
        if (fVar != null) {
            fVar.f(this);
        }
    }

    public static <R> k<R> x(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i4, int i5, com.bumptech.glide.j jVar, p<R> pVar, h<R> hVar, @q0 List<h<R>> list, f fVar, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.request.transition.g<? super R> gVar, Executor executor) {
        return new k<>(context, eVar, obj, obj2, cls, aVar, i4, i5, jVar, pVar, hVar, list, fVar, kVar, gVar, executor);
    }

    private void y(GlideException glideException, int i4) {
        boolean z4;
        this.f44819c.c();
        synchronized (this.f44820d) {
            try {
                glideException.l(this.D);
                int h4 = this.f44824h.h();
                if (h4 <= i4) {
                    Objects.toString(this.f44825i);
                    if (h4 <= 4) {
                        glideException.h(ProtectedSandApp.s("\u0a63"));
                    }
                }
                this.f44836t = null;
                this.f44839w = a.FAILED;
                v();
                boolean z5 = true;
                this.C = true;
                try {
                    List<h<R>> list = this.f44832p;
                    if (list != null) {
                        Iterator<h<R>> it = list.iterator();
                        z4 = false;
                        while (it.hasNext()) {
                            z4 |= it.next().b(glideException, this.f44825i, this.f44831o, r());
                        }
                    } else {
                        z4 = false;
                    }
                    h<R> hVar = this.f44821e;
                    if (hVar == null || !hVar.b(glideException, this.f44825i, this.f44831o, r())) {
                        z5 = false;
                    }
                    if (!(z4 | z5)) {
                        A();
                    }
                    this.C = false;
                    com.bumptech.glide.util.pool.b.g(ProtectedSandApp.s("\u0a62"), this.f44817a);
                } catch (Throwable th) {
                    this.C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @b0("requestLock")
    private void z(u<R> uVar, R r4, com.bumptech.glide.load.a aVar, boolean z4) {
        boolean z5;
        boolean r5 = r();
        this.f44839w = a.COMPLETE;
        this.f44835s = uVar;
        if (this.f44824h.h() <= 3) {
            r4.getClass();
            Objects.toString(aVar);
            Objects.toString(this.f44825i);
            com.bumptech.glide.util.i.a(this.f44837u);
        }
        w();
        boolean z6 = true;
        this.C = true;
        try {
            List<h<R>> list = this.f44832p;
            if (list != null) {
                z5 = false;
                for (h<R> hVar : list) {
                    boolean c5 = z5 | hVar.c(r4, this.f44825i, this.f44831o, aVar, r5);
                    z5 = hVar instanceof c ? ((c) hVar).d(r4, this.f44825i, this.f44831o, aVar, r5, z4) | c5 : c5;
                }
            } else {
                z5 = false;
            }
            h<R> hVar2 = this.f44821e;
            if (hVar2 == null || !hVar2.c(r4, this.f44825i, this.f44831o, aVar, r5)) {
                z6 = false;
            }
            if (!(z5 | z6)) {
                this.f44831o.j(r4, this.f44833q.a(aVar, r5));
            }
            this.C = false;
            com.bumptech.glide.util.pool.b.g(ProtectedSandApp.s("\u0a62"), this.f44817a);
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean a() {
        boolean z4;
        synchronized (this.f44820d) {
            z4 = this.f44839w == a.COMPLETE;
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.j
    public void b(u<?> uVar, com.bumptech.glide.load.a aVar, boolean z4) {
        String s4 = ProtectedSandApp.s("੦");
        String s5 = ProtectedSandApp.s("੧");
        this.f44819c.c();
        u<?> uVar2 = null;
        try {
            synchronized (this.f44820d) {
                try {
                    this.f44836t = null;
                    if (uVar == null) {
                        y(new GlideException(s5 + this.f44826j + ProtectedSandApp.s("੨")), 5);
                        return;
                    }
                    Object obj = uVar.get();
                    try {
                        if (obj != null && this.f44826j.isAssignableFrom(obj.getClass())) {
                            if (l()) {
                                z(uVar, obj, aVar, z4);
                                return;
                            }
                            this.f44835s = null;
                            this.f44839w = a.COMPLETE;
                            com.bumptech.glide.util.pool.b.g(ProtectedSandApp.s("\u0a62"), this.f44817a);
                            this.f44838v.l(uVar);
                            return;
                        }
                        this.f44835s = null;
                        StringBuilder sb = new StringBuilder(s4);
                        sb.append(this.f44826j);
                        sb.append(ProtectedSandApp.s("੩"));
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append(ProtectedSandApp.s("੪"));
                        sb.append(obj);
                        sb.append(ProtectedSandApp.s("੫"));
                        sb.append(uVar);
                        sb.append(ProtectedSandApp.s("੬"));
                        sb.append(obj != null ? "" : ProtectedSandApp.s("੭"));
                        y(new GlideException(sb.toString()), 5);
                        this.f44838v.l(uVar);
                    } catch (Throwable th) {
                        uVar2 = uVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (uVar2 != null) {
                this.f44838v.l(uVar2);
            }
            throw th3;
        }
    }

    @Override // com.bumptech.glide.request.j
    public void c(GlideException glideException) {
        y(glideException, 5);
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f44820d) {
            try {
                i();
                this.f44819c.c();
                a aVar = this.f44839w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                m();
                u<R> uVar = this.f44835s;
                if (uVar != null) {
                    this.f44835s = null;
                } else {
                    uVar = null;
                }
                if (j()) {
                    this.f44831o.i(q());
                }
                com.bumptech.glide.util.pool.b.g(ProtectedSandApp.s("\u0a62"), this.f44817a);
                this.f44839w = aVar2;
                if (uVar != null) {
                    this.f44838v.l(uVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.o
    public void d(int i4, int i5) {
        Object obj;
        this.f44819c.c();
        Object obj2 = this.f44820d;
        synchronized (obj2) {
            try {
                try {
                    boolean z4 = G;
                    if (z4) {
                        com.bumptech.glide.util.i.a(this.f44837u);
                    }
                    if (this.f44839w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f44839w = aVar;
                        float Y = this.f44827k.Y();
                        this.A = u(i4, Y);
                        this.B = u(i5, Y);
                        if (z4) {
                            com.bumptech.glide.util.i.a(this.f44837u);
                        }
                        obj = obj2;
                        try {
                            this.f44836t = this.f44838v.g(this.f44824h, this.f44825i, this.f44827k.W(), this.A, this.B, this.f44827k.V(), this.f44826j, this.f44830n, this.f44827k.H(), this.f44827k.a0(), this.f44827k.q0(), this.f44827k.k0(), this.f44827k.O(), this.f44827k.h0(), this.f44827k.c0(), this.f44827k.b0(), this.f44827k.N(), this, this.f44834r);
                            if (this.f44839w != aVar) {
                                this.f44836t = null;
                            }
                            if (z4) {
                                com.bumptech.glide.util.i.a(this.f44837u);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
        boolean z4;
        synchronized (this.f44820d) {
            z4 = this.f44839w == a.CLEARED;
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.j
    public Object f() {
        this.f44819c.c();
        return this.f44820d;
    }

    @Override // com.bumptech.glide.request.e
    public boolean g(e eVar) {
        int i4;
        int i5;
        Object obj;
        Class<R> cls;
        com.bumptech.glide.request.a<?> aVar;
        com.bumptech.glide.j jVar;
        int size;
        int i6;
        int i7;
        Object obj2;
        Class<R> cls2;
        com.bumptech.glide.request.a<?> aVar2;
        com.bumptech.glide.j jVar2;
        int size2;
        if (!(eVar instanceof k)) {
            return false;
        }
        synchronized (this.f44820d) {
            try {
                i4 = this.f44828l;
                i5 = this.f44829m;
                obj = this.f44825i;
                cls = this.f44826j;
                aVar = this.f44827k;
                jVar = this.f44830n;
                List<h<R>> list = this.f44832p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        k kVar = (k) eVar;
        synchronized (kVar.f44820d) {
            try {
                i6 = kVar.f44828l;
                i7 = kVar.f44829m;
                obj2 = kVar.f44825i;
                cls2 = kVar.f44826j;
                aVar2 = kVar.f44827k;
                jVar2 = kVar.f44830n;
                List<h<R>> list2 = kVar.f44832p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i4 == i6 && i5 == i7 && com.bumptech.glide.util.o.d(obj, obj2) && cls.equals(cls2) && com.bumptech.glide.util.o.c(aVar, aVar2) && jVar == jVar2 && size == size2;
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
        synchronized (this.f44820d) {
            try {
                i();
                this.f44819c.c();
                this.f44837u = com.bumptech.glide.util.i.b();
                Object obj = this.f44825i;
                if (obj == null) {
                    if (com.bumptech.glide.util.o.x(this.f44828l, this.f44829m)) {
                        this.A = this.f44828l;
                        this.B = this.f44829m;
                    }
                    y(new GlideException(ProtectedSandApp.s("੮")), p() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f44839w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("੯"));
                }
                if (aVar == a.COMPLETE) {
                    b(this.f44835s, com.bumptech.glide.load.a.MEMORY_CACHE, false);
                    return;
                }
                n(obj);
                this.f44817a = com.bumptech.glide.util.pool.b.b(ProtectedSandApp.s("\u0a62"));
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f44839w = aVar3;
                if (com.bumptech.glide.util.o.x(this.f44828l, this.f44829m)) {
                    d(this.f44828l, this.f44829m);
                } else {
                    this.f44831o.p(this);
                }
                a aVar4 = this.f44839w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && k()) {
                    this.f44831o.g(q());
                }
                if (G) {
                    com.bumptech.glide.util.i.a(this.f44837u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z4;
        synchronized (this.f44820d) {
            z4 = this.f44839w == a.COMPLETE;
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z4;
        synchronized (this.f44820d) {
            try {
                a aVar = this.f44839w;
                z4 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f44820d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f44820d) {
            obj = this.f44825i;
            cls = this.f44826j;
        }
        return super.toString() + ProtectedSandApp.s("ੰ") + obj + ProtectedSandApp.s("ੱ") + cls + ProtectedSandApp.s("ੲ");
    }
}
