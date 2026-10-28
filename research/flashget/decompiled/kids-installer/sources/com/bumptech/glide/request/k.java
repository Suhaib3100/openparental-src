package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: SingleRequest.java */
/* loaded from: classes3.dex */
public final class k<R> implements e, o, j {
    private static final String D = ProtectedSandApp.s("ᶚ");
    private static final String E = ProtectedSandApp.s("ᶛ");
    private static final boolean F = Log.isLoggable(ProtectedSandApp.s("ᶜ"), 2);

    @b0("requestLock")
    private int A;

    @b0("requestLock")
    private boolean B;

    @q0
    private RuntimeException C;

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final String f12011a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f12012b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f12013c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private final h<R> f12014d;

    /* renamed from: e, reason: collision with root package name */
    private final f f12015e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f12016f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.d f12017g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private final Object f12018h;

    /* renamed from: i, reason: collision with root package name */
    private final Class<R> f12019i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.request.a<?> f12020j;

    /* renamed from: k, reason: collision with root package name */
    private final int f12021k;

    /* renamed from: l, reason: collision with root package name */
    private final int f12022l;

    /* renamed from: m, reason: collision with root package name */
    private final com.bumptech.glide.i f12023m;

    /* renamed from: n, reason: collision with root package name */
    private final p<R> f12024n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private final List<h<R>> f12025o;

    /* renamed from: p, reason: collision with root package name */
    private final com.bumptech.glide.request.transition.g<? super R> f12026p;

    /* renamed from: q, reason: collision with root package name */
    private final Executor f12027q;

    /* renamed from: r, reason: collision with root package name */
    @b0("requestLock")
    private u<R> f12028r;

    /* renamed from: s, reason: collision with root package name */
    @b0("requestLock")
    private k.d f12029s;

    /* renamed from: t, reason: collision with root package name */
    @b0("requestLock")
    private long f12030t;

    /* renamed from: u, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.k f12031u;

    /* renamed from: v, reason: collision with root package name */
    @b0("requestLock")
    private a f12032v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    @b0("requestLock")
    private Drawable f12033w;

    /* renamed from: x, reason: collision with root package name */
    @q0
    @b0("requestLock")
    private Drawable f12034x;

    /* renamed from: y, reason: collision with root package name */
    @q0
    @b0("requestLock")
    private Drawable f12035y;

    /* renamed from: z, reason: collision with root package name */
    @b0("requestLock")
    private int f12036z;

    /* compiled from: SingleRequest.java */
    /* loaded from: classes.dex */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private k(Context context, com.bumptech.glide.d dVar, @o0 Object obj, @q0 Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i5, int i6, com.bumptech.glide.i iVar, p<R> pVar, @q0 h<R> hVar, @q0 List<h<R>> list, f fVar, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.request.transition.g<? super R> gVar, Executor executor) {
        this.f12011a = F ? String.valueOf(hashCode()) : null;
        this.f12012b = com.bumptech.glide.util.pool.c.a();
        this.f12013c = obj;
        this.f12016f = context;
        this.f12017g = dVar;
        this.f12018h = obj2;
        this.f12019i = cls;
        this.f12020j = aVar;
        this.f12021k = i5;
        this.f12022l = i6;
        this.f12023m = iVar;
        this.f12024n = pVar;
        this.f12014d = hVar;
        this.f12025o = list;
        this.f12015e = fVar;
        this.f12031u = kVar;
        this.f12026p = gVar;
        this.f12027q = executor;
        this.f12032v = a.PENDING;
        if (this.C == null && dVar.g().b(c.d.class)) {
            this.C = new RuntimeException(ProtectedSandApp.s("ᶝ"));
        }
    }

    @b0("requestLock")
    private void A() {
        if (l()) {
            Drawable p5 = this.f12018h == null ? p() : null;
            if (p5 == null) {
                p5 = o();
            }
            if (p5 == null) {
                p5 = q();
            }
            this.f12024n.k(p5);
        }
    }

    @b0("requestLock")
    private void j() {
        if (this.B) {
            throw new IllegalStateException(ProtectedSandApp.s("ᶞ"));
        }
    }

    @b0("requestLock")
    private boolean k() {
        f fVar = this.f12015e;
        return fVar == null || fVar.j(this);
    }

    @b0("requestLock")
    private boolean l() {
        f fVar = this.f12015e;
        return fVar == null || fVar.c(this);
    }

    @b0("requestLock")
    private boolean m() {
        f fVar = this.f12015e;
        return fVar == null || fVar.e(this);
    }

    @b0("requestLock")
    private void n() {
        j();
        this.f12012b.c();
        this.f12024n.a(this);
        k.d dVar = this.f12029s;
        if (dVar != null) {
            dVar.a();
            this.f12029s = null;
        }
    }

    @b0("requestLock")
    private Drawable o() {
        if (this.f12033w == null) {
            Drawable L = this.f12020j.L();
            this.f12033w = L;
            if (L == null && this.f12020j.K() > 0) {
                this.f12033w = s(this.f12020j.K());
            }
        }
        return this.f12033w;
    }

    @b0("requestLock")
    private Drawable p() {
        if (this.f12035y == null) {
            Drawable M = this.f12020j.M();
            this.f12035y = M;
            if (M == null && this.f12020j.N() > 0) {
                this.f12035y = s(this.f12020j.N());
            }
        }
        return this.f12035y;
    }

    @b0("requestLock")
    private Drawable q() {
        if (this.f12034x == null) {
            Drawable W = this.f12020j.W();
            this.f12034x = W;
            if (W == null && this.f12020j.Y() > 0) {
                this.f12034x = s(this.f12020j.Y());
            }
        }
        return this.f12034x;
    }

    @b0("requestLock")
    private boolean r() {
        f fVar = this.f12015e;
        return fVar == null || !fVar.getRoot().b();
    }

    @b0("requestLock")
    private Drawable s(@v int i5) {
        return com.bumptech.glide.load.resource.drawable.a.a(this.f12017g, i5, this.f12020j.e0() != null ? this.f12020j.e0() : this.f12016f.getTheme());
    }

    private void t(String str) {
    }

    private static int u(int i5, float f6) {
        return i5 == Integer.MIN_VALUE ? i5 : Math.round(f6 * i5);
    }

    @b0("requestLock")
    private void v() {
        f fVar = this.f12015e;
        if (fVar != null) {
            fVar.a(this);
        }
    }

    @b0("requestLock")
    private void w() {
        f fVar = this.f12015e;
        if (fVar != null) {
            fVar.g(this);
        }
    }

    public static <R> k<R> x(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, com.bumptech.glide.request.a<?> aVar, int i5, int i6, com.bumptech.glide.i iVar, p<R> pVar, h<R> hVar, @q0 List<h<R>> list, f fVar, com.bumptech.glide.load.engine.k kVar, com.bumptech.glide.request.transition.g<? super R> gVar, Executor executor) {
        return new k<>(context, dVar, obj, obj2, cls, aVar, i5, i6, iVar, pVar, hVar, list, fVar, kVar, gVar, executor);
    }

    private void y(GlideException glideException, int i5) {
        boolean z5;
        this.f12012b.c();
        synchronized (this.f12013c) {
            glideException.l(this.C);
            int h5 = this.f12017g.h();
            if (h5 <= i5) {
                Objects.toString(this.f12018h);
                if (h5 <= 4) {
                    glideException.h(ProtectedSandApp.s("ᶟ"));
                }
            }
            this.f12029s = null;
            this.f12032v = a.FAILED;
            boolean z6 = true;
            this.B = true;
            try {
                List<h<R>> list = this.f12025o;
                if (list != null) {
                    Iterator<h<R>> it = list.iterator();
                    z5 = false;
                    while (it.hasNext()) {
                        z5 |= it.next().c(glideException, this.f12018h, this.f12024n, r());
                    }
                } else {
                    z5 = false;
                }
                h<R> hVar = this.f12014d;
                if (hVar == null || !hVar.c(glideException, this.f12018h, this.f12024n, r())) {
                    z6 = false;
                }
                if (!(z5 | z6)) {
                    A();
                }
                this.B = false;
                v();
            } catch (Throwable th) {
                this.B = false;
                throw th;
            }
        }
    }

    @b0("requestLock")
    private void z(u<R> uVar, R r5, com.bumptech.glide.load.a aVar, boolean z5) {
        boolean z6;
        boolean r6 = r();
        this.f12032v = a.COMPLETE;
        this.f12028r = uVar;
        if (this.f12017g.h() <= 3) {
            r5.getClass();
            Objects.toString(aVar);
            Objects.toString(this.f12018h);
            com.bumptech.glide.util.h.a(this.f12030t);
        }
        boolean z7 = true;
        this.B = true;
        try {
            List<h<R>> list = this.f12025o;
            if (list != null) {
                Iterator<h<R>> it = list.iterator();
                z6 = false;
                while (it.hasNext()) {
                    z6 |= it.next().d(r5, this.f12018h, this.f12024n, aVar, r6);
                }
            } else {
                z6 = false;
            }
            h<R> hVar = this.f12014d;
            if (hVar == null || !hVar.d(r5, this.f12018h, this.f12024n, aVar, r6)) {
                z7 = false;
            }
            if (!(z7 | z6)) {
                this.f12024n.b(r5, this.f12026p.a(aVar, r6));
            }
            this.B = false;
            w();
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    @Override // com.bumptech.glide.request.j
    public void a(GlideException glideException) {
        y(glideException, 5);
    }

    @Override // com.bumptech.glide.request.e
    public boolean b() {
        boolean z5;
        synchronized (this.f12013c) {
            z5 = this.f12032v == a.COMPLETE;
        }
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.j
    public void c(u<?> uVar, com.bumptech.glide.load.a aVar, boolean z5) {
        String s5 = ProtectedSandApp.s("ᶠ");
        String s6 = ProtectedSandApp.s("ᶡ");
        this.f12012b.c();
        u<?> uVar2 = null;
        try {
            synchronized (this.f12013c) {
                try {
                    this.f12029s = null;
                    if (uVar == null) {
                        y(new GlideException(s6 + this.f12019i + ProtectedSandApp.s("ᶢ")), 5);
                        return;
                    }
                    Object obj = uVar.get();
                    try {
                        if (obj != null && this.f12019i.isAssignableFrom(obj.getClass())) {
                            if (m()) {
                                z(uVar, obj, aVar, z5);
                                return;
                            }
                            this.f12028r = null;
                            this.f12032v = a.COMPLETE;
                            this.f12031u.l(uVar);
                            return;
                        }
                        this.f12028r = null;
                        StringBuilder sb = new StringBuilder(s5);
                        sb.append(this.f12019i);
                        sb.append(ProtectedSandApp.s("ᶣ"));
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append(ProtectedSandApp.s("ᶤ"));
                        sb.append(obj);
                        sb.append(ProtectedSandApp.s("ᶥ"));
                        sb.append(uVar);
                        sb.append(ProtectedSandApp.s("ᶦ"));
                        sb.append(obj != null ? "" : ProtectedSandApp.s("ᶧ"));
                        y(new GlideException(sb.toString()), 5);
                        this.f12031u.l(uVar);
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
                this.f12031u.l(uVar2);
            }
            throw th3;
        }
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f12013c) {
            j();
            this.f12012b.c();
            a aVar = this.f12032v;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            n();
            u<R> uVar = this.f12028r;
            if (uVar != null) {
                this.f12028r = null;
            } else {
                uVar = null;
            }
            if (k()) {
                this.f12024n.p(q());
            }
            this.f12032v = aVar2;
            if (uVar != null) {
                this.f12031u.l(uVar);
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean d(e eVar) {
        int i5;
        int i6;
        Object obj;
        Class<R> cls;
        com.bumptech.glide.request.a<?> aVar;
        com.bumptech.glide.i iVar;
        int size;
        int i7;
        int i8;
        Object obj2;
        Class<R> cls2;
        com.bumptech.glide.request.a<?> aVar2;
        com.bumptech.glide.i iVar2;
        int size2;
        if (!(eVar instanceof k)) {
            return false;
        }
        synchronized (this.f12013c) {
            i5 = this.f12021k;
            i6 = this.f12022l;
            obj = this.f12018h;
            cls = this.f12019i;
            aVar = this.f12020j;
            iVar = this.f12023m;
            List<h<R>> list = this.f12025o;
            size = list != null ? list.size() : 0;
        }
        k kVar = (k) eVar;
        synchronized (kVar.f12013c) {
            i7 = kVar.f12021k;
            i8 = kVar.f12022l;
            obj2 = kVar.f12018h;
            cls2 = kVar.f12019i;
            aVar2 = kVar.f12020j;
            iVar2 = kVar.f12023m;
            List<h<R>> list2 = kVar.f12025o;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i5 == i7 && i6 == i8 && n.c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && iVar == iVar2 && size == size2;
    }

    @Override // com.bumptech.glide.request.target.o
    public void e(int i5, int i6) {
        Object obj;
        this.f12012b.c();
        Object obj2 = this.f12013c;
        synchronized (obj2) {
            try {
                try {
                    boolean z5 = F;
                    if (z5) {
                        com.bumptech.glide.util.h.a(this.f12030t);
                    }
                    if (this.f12032v == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f12032v = aVar;
                        float d02 = this.f12020j.d0();
                        this.f12036z = u(i5, d02);
                        this.A = u(i6, d02);
                        if (z5) {
                            com.bumptech.glide.util.h.a(this.f12030t);
                        }
                        obj = obj2;
                        try {
                            this.f12029s = this.f12031u.g(this.f12017g, this.f12018h, this.f12020j.c0(), this.f12036z, this.A, this.f12020j.b0(), this.f12019i, this.f12023m, this.f12020j.J(), this.f12020j.g0(), this.f12020j.u0(), this.f12020j.o0(), this.f12020j.S(), this.f12020j.m0(), this.f12020j.i0(), this.f12020j.h0(), this.f12020j.Q(), this, this.f12027q);
                            if (this.f12032v != aVar) {
                                this.f12029s = null;
                            }
                            if (z5) {
                                com.bumptech.glide.util.h.a(this.f12030t);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean f() {
        boolean z5;
        synchronized (this.f12013c) {
            z5 = this.f12032v == a.CLEARED;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.j
    public Object g() {
        this.f12012b.c();
        return this.f12013c;
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
        synchronized (this.f12013c) {
            j();
            this.f12012b.c();
            this.f12030t = com.bumptech.glide.util.h.b();
            if (this.f12018h == null) {
                if (n.w(this.f12021k, this.f12022l)) {
                    this.f12036z = this.f12021k;
                    this.A = this.f12022l;
                }
                y(new GlideException(ProtectedSandApp.s("ᶨ")), p() == null ? 5 : 3);
                return;
            }
            a aVar = this.f12032v;
            a aVar2 = a.RUNNING;
            if (aVar == aVar2) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ᶩ"));
            }
            if (aVar == a.COMPLETE) {
                c(this.f12028r, com.bumptech.glide.load.a.MEMORY_CACHE, false);
                return;
            }
            a aVar3 = a.WAITING_FOR_SIZE;
            this.f12032v = aVar3;
            if (n.w(this.f12021k, this.f12022l)) {
                e(this.f12021k, this.f12022l);
            } else {
                this.f12024n.q(this);
            }
            a aVar4 = this.f12032v;
            if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                this.f12024n.n(q());
            }
            if (F) {
                com.bumptech.glide.util.h.a(this.f12030t);
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean i() {
        boolean z5;
        synchronized (this.f12013c) {
            z5 = this.f12032v == a.COMPLETE;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z5;
        synchronized (this.f12013c) {
            a aVar = this.f12032v;
            z5 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f12013c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
