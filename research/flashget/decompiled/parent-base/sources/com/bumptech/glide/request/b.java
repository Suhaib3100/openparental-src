package com.bumptech.glide.request;

import androidx.annotation.b0;
import androidx.annotation.q0;
import com.bumptech.glide.request.f;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes3.dex */
public final class b implements f, e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f44800a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final f f44801b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f44802c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f44803d;

    /* renamed from: e, reason: collision with root package name */
    @b0("requestLock")
    private f.a f44804e;

    /* renamed from: f, reason: collision with root package name */
    @b0("requestLock")
    private f.a f44805f;

    public b(Object obj, @q0 f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f44804e = aVar;
        this.f44805f = aVar;
        this.f44800a = obj;
        this.f44801b = fVar;
    }

    @b0("requestLock")
    private boolean j(e eVar) {
        f.a aVar;
        f.a aVar2 = this.f44804e;
        f.a aVar3 = f.a.FAILED;
        return aVar2 != aVar3 ? eVar.equals(this.f44802c) : eVar.equals(this.f44803d) && ((aVar = this.f44805f) == f.a.SUCCESS || aVar == aVar3);
    }

    @b0("requestLock")
    private boolean k() {
        f fVar = this.f44801b;
        return fVar == null || fVar.i(this);
    }

    @b0("requestLock")
    private boolean l() {
        f fVar = this.f44801b;
        return fVar == null || fVar.b(this);
    }

    @b0("requestLock")
    private boolean m() {
        f fVar = this.f44801b;
        return fVar == null || fVar.c(this);
    }

    @Override // com.bumptech.glide.request.f, com.bumptech.glide.request.e
    public boolean a() {
        boolean z4;
        synchronized (this.f44800a) {
            try {
                z4 = this.f44802c.a() || this.f44803d.a();
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.f
    public boolean b(e eVar) {
        boolean z4;
        synchronized (this.f44800a) {
            try {
                z4 = l() && j(eVar);
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.f
    public boolean c(e eVar) {
        boolean m4;
        synchronized (this.f44800a) {
            m4 = m();
        }
        return m4;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f44800a) {
            try {
                f.a aVar = f.a.CLEARED;
                this.f44804e = aVar;
                this.f44802c.clear();
                if (this.f44805f != aVar) {
                    this.f44805f = aVar;
                    this.f44803d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public void d(e eVar) {
        synchronized (this.f44800a) {
            try {
                if (eVar.equals(this.f44803d)) {
                    this.f44805f = f.a.FAILED;
                    f fVar = this.f44801b;
                    if (fVar != null) {
                        fVar.d(this);
                    }
                    return;
                }
                this.f44804e = f.a.FAILED;
                f.a aVar = this.f44805f;
                f.a aVar2 = f.a.RUNNING;
                if (aVar != aVar2) {
                    this.f44805f = aVar2;
                    this.f44803d.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
        boolean z4;
        synchronized (this.f44800a) {
            try {
                f.a aVar = this.f44804e;
                f.a aVar2 = f.a.CLEARED;
                z4 = aVar == aVar2 && this.f44805f == aVar2;
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.f
    public void f(e eVar) {
        synchronized (this.f44800a) {
            try {
                if (eVar.equals(this.f44802c)) {
                    this.f44804e = f.a.SUCCESS;
                } else if (eVar.equals(this.f44803d)) {
                    this.f44805f = f.a.SUCCESS;
                }
                f fVar = this.f44801b;
                if (fVar != null) {
                    fVar.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean g(e eVar) {
        if (!(eVar instanceof b)) {
            return false;
        }
        b bVar = (b) eVar;
        return this.f44802c.g(bVar.f44802c) && this.f44803d.g(bVar.f44803d);
    }

    @Override // com.bumptech.glide.request.f
    public f getRoot() {
        f root;
        synchronized (this.f44800a) {
            try {
                f fVar = this.f44801b;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
        synchronized (this.f44800a) {
            try {
                f.a aVar = this.f44804e;
                f.a aVar2 = f.a.RUNNING;
                if (aVar != aVar2) {
                    this.f44804e = aVar2;
                    this.f44802c.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public boolean i(e eVar) {
        boolean z4;
        synchronized (this.f44800a) {
            try {
                z4 = k() && eVar.equals(this.f44802c);
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z4;
        synchronized (this.f44800a) {
            try {
                f.a aVar = this.f44804e;
                f.a aVar2 = f.a.SUCCESS;
                z4 = aVar == aVar2 || this.f44805f == aVar2;
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z4;
        synchronized (this.f44800a) {
            try {
                f.a aVar = this.f44804e;
                f.a aVar2 = f.a.RUNNING;
                z4 = aVar == aVar2 || this.f44805f == aVar2;
            } finally {
            }
        }
        return z4;
    }

    public void n(e eVar, e eVar2) {
        this.f44802c = eVar;
        this.f44803d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f44800a) {
            try {
                f.a aVar = this.f44804e;
                f.a aVar2 = f.a.RUNNING;
                if (aVar == aVar2) {
                    this.f44804e = f.a.PAUSED;
                    this.f44802c.pause();
                }
                if (this.f44805f == aVar2) {
                    this.f44805f = f.a.PAUSED;
                    this.f44803d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
