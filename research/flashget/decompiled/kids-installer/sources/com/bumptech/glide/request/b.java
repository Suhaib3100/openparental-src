package com.bumptech.glide.request;

import androidx.annotation.b0;
import androidx.annotation.q0;
import com.bumptech.glide.request.f;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes3.dex */
public final class b implements f, e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f11986a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final f f11987b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f11988c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f11989d;

    /* renamed from: e, reason: collision with root package name */
    @b0("requestLock")
    private f.a f11990e;

    /* renamed from: f, reason: collision with root package name */
    @b0("requestLock")
    private f.a f11991f;

    public b(Object obj, @q0 f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f11990e = aVar;
        this.f11991f = aVar;
        this.f11986a = obj;
        this.f11987b = fVar;
    }

    @b0("requestLock")
    private boolean k(e eVar) {
        return eVar.equals(this.f11988c) || (this.f11990e == f.a.FAILED && eVar.equals(this.f11989d));
    }

    @b0("requestLock")
    private boolean l() {
        f fVar = this.f11987b;
        return fVar == null || fVar.j(this);
    }

    @b0("requestLock")
    private boolean m() {
        f fVar = this.f11987b;
        return fVar == null || fVar.c(this);
    }

    @b0("requestLock")
    private boolean n() {
        f fVar = this.f11987b;
        return fVar == null || fVar.e(this);
    }

    @Override // com.bumptech.glide.request.f
    public void a(e eVar) {
        synchronized (this.f11986a) {
            if (eVar.equals(this.f11989d)) {
                this.f11991f = f.a.FAILED;
                f fVar = this.f11987b;
                if (fVar != null) {
                    fVar.a(this);
                }
                return;
            }
            this.f11990e = f.a.FAILED;
            f.a aVar = this.f11991f;
            f.a aVar2 = f.a.RUNNING;
            if (aVar != aVar2) {
                this.f11991f = aVar2;
                this.f11989d.h();
            }
        }
    }

    @Override // com.bumptech.glide.request.f, com.bumptech.glide.request.e
    public boolean b() {
        boolean z5;
        synchronized (this.f11986a) {
            z5 = this.f11988c.b() || this.f11989d.b();
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.f
    public boolean c(e eVar) {
        boolean z5;
        synchronized (this.f11986a) {
            z5 = m() && k(eVar);
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f11986a) {
            f.a aVar = f.a.CLEARED;
            this.f11990e = aVar;
            this.f11988c.clear();
            if (this.f11991f != aVar) {
                this.f11991f = aVar;
                this.f11989d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean d(e eVar) {
        if (!(eVar instanceof b)) {
            return false;
        }
        b bVar = (b) eVar;
        return this.f11988c.d(bVar.f11988c) && this.f11989d.d(bVar.f11989d);
    }

    @Override // com.bumptech.glide.request.f
    public boolean e(e eVar) {
        boolean z5;
        synchronized (this.f11986a) {
            z5 = n() && k(eVar);
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.e
    public boolean f() {
        boolean z5;
        synchronized (this.f11986a) {
            f.a aVar = this.f11990e;
            f.a aVar2 = f.a.CLEARED;
            z5 = aVar == aVar2 && this.f11991f == aVar2;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.f
    public void g(e eVar) {
        synchronized (this.f11986a) {
            if (eVar.equals(this.f11988c)) {
                this.f11990e = f.a.SUCCESS;
            } else if (eVar.equals(this.f11989d)) {
                this.f11991f = f.a.SUCCESS;
            }
            f fVar = this.f11987b;
            if (fVar != null) {
                fVar.g(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public f getRoot() {
        f root;
        synchronized (this.f11986a) {
            f fVar = this.f11987b;
            root = fVar != null ? fVar.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
        synchronized (this.f11986a) {
            f.a aVar = this.f11990e;
            f.a aVar2 = f.a.RUNNING;
            if (aVar != aVar2) {
                this.f11990e = aVar2;
                this.f11988c.h();
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean i() {
        boolean z5;
        synchronized (this.f11986a) {
            f.a aVar = this.f11990e;
            f.a aVar2 = f.a.SUCCESS;
            z5 = aVar == aVar2 || this.f11991f == aVar2;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z5;
        synchronized (this.f11986a) {
            f.a aVar = this.f11990e;
            f.a aVar2 = f.a.RUNNING;
            z5 = aVar == aVar2 || this.f11991f == aVar2;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.f
    public boolean j(e eVar) {
        boolean z5;
        synchronized (this.f11986a) {
            z5 = l() && k(eVar);
        }
        return z5;
    }

    public void o(e eVar, e eVar2) {
        this.f11988c = eVar;
        this.f11989d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f11986a) {
            f.a aVar = this.f11990e;
            f.a aVar2 = f.a.RUNNING;
            if (aVar == aVar2) {
                this.f11990e = f.a.PAUSED;
                this.f11988c.pause();
            }
            if (this.f11991f == aVar2) {
                this.f11991f = f.a.PAUSED;
                this.f11989d.pause();
            }
        }
    }
}
