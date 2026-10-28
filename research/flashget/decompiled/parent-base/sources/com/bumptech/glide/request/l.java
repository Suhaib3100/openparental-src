package com.bumptech.glide.request;

import androidx.annotation.b0;
import androidx.annotation.q0;
import com.bumptech.glide.request.f;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes3.dex */
public class l implements f, e {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final f f44843a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f44844b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f44845c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f44846d;

    /* renamed from: e, reason: collision with root package name */
    @b0("requestLock")
    private f.a f44847e;

    /* renamed from: f, reason: collision with root package name */
    @b0("requestLock")
    private f.a f44848f;

    /* renamed from: g, reason: collision with root package name */
    @b0("requestLock")
    private boolean f44849g;

    public l(Object obj, @q0 f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f44847e = aVar;
        this.f44848f = aVar;
        this.f44844b = obj;
        this.f44843a = fVar;
    }

    @b0("requestLock")
    private boolean j() {
        f fVar = this.f44843a;
        return fVar == null || fVar.i(this);
    }

    @b0("requestLock")
    private boolean k() {
        f fVar = this.f44843a;
        return fVar == null || fVar.b(this);
    }

    @b0("requestLock")
    private boolean l() {
        f fVar = this.f44843a;
        return fVar == null || fVar.c(this);
    }

    @Override // com.bumptech.glide.request.f, com.bumptech.glide.request.e
    public boolean a() {
        boolean z4;
        synchronized (this.f44844b) {
            try {
                z4 = this.f44846d.a() || this.f44845c.a();
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.f
    public boolean b(e eVar) {
        boolean z4;
        synchronized (this.f44844b) {
            try {
                z4 = k() && eVar.equals(this.f44845c) && !a();
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.f
    public boolean c(e eVar) {
        boolean z4;
        synchronized (this.f44844b) {
            try {
                z4 = l() && (eVar.equals(this.f44845c) || this.f44847e != f.a.SUCCESS);
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f44844b) {
            this.f44849g = false;
            f.a aVar = f.a.CLEARED;
            this.f44847e = aVar;
            this.f44848f = aVar;
            this.f44846d.clear();
            this.f44845c.clear();
        }
    }

    @Override // com.bumptech.glide.request.f
    public void d(e eVar) {
        synchronized (this.f44844b) {
            try {
                if (!eVar.equals(this.f44845c)) {
                    this.f44848f = f.a.FAILED;
                    return;
                }
                this.f44847e = f.a.FAILED;
                f fVar = this.f44843a;
                if (fVar != null) {
                    fVar.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
        boolean z4;
        synchronized (this.f44844b) {
            z4 = this.f44847e == f.a.CLEARED;
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.f
    public void f(e eVar) {
        synchronized (this.f44844b) {
            try {
                if (eVar.equals(this.f44846d)) {
                    this.f44848f = f.a.SUCCESS;
                    return;
                }
                this.f44847e = f.a.SUCCESS;
                f fVar = this.f44843a;
                if (fVar != null) {
                    fVar.f(this);
                }
                if (!this.f44848f.isComplete()) {
                    this.f44846d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean g(e eVar) {
        if (!(eVar instanceof l)) {
            return false;
        }
        l lVar = (l) eVar;
        if (this.f44845c == null) {
            if (lVar.f44845c != null) {
                return false;
            }
        } else if (!this.f44845c.g(lVar.f44845c)) {
            return false;
        }
        if (this.f44846d == null) {
            if (lVar.f44846d != null) {
                return false;
            }
        } else if (!this.f44846d.g(lVar.f44846d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.f
    public f getRoot() {
        f root;
        synchronized (this.f44844b) {
            try {
                f fVar = this.f44843a;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
        synchronized (this.f44844b) {
            try {
                this.f44849g = true;
                try {
                    if (this.f44847e != f.a.SUCCESS) {
                        f.a aVar = this.f44848f;
                        f.a aVar2 = f.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f44848f = aVar2;
                            this.f44846d.h();
                        }
                    }
                    if (this.f44849g) {
                        f.a aVar3 = this.f44847e;
                        f.a aVar4 = f.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f44847e = aVar4;
                            this.f44845c.h();
                        }
                    }
                    this.f44849g = false;
                } catch (Throwable th) {
                    this.f44849g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public boolean i(e eVar) {
        boolean z4;
        synchronized (this.f44844b) {
            try {
                z4 = j() && eVar.equals(this.f44845c) && this.f44847e != f.a.PAUSED;
            } finally {
            }
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z4;
        synchronized (this.f44844b) {
            z4 = this.f44847e == f.a.SUCCESS;
        }
        return z4;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z4;
        synchronized (this.f44844b) {
            z4 = this.f44847e == f.a.RUNNING;
        }
        return z4;
    }

    public void m(e eVar, e eVar2) {
        this.f44845c = eVar;
        this.f44846d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f44844b) {
            try {
                if (!this.f44848f.isComplete()) {
                    this.f44848f = f.a.PAUSED;
                    this.f44846d.pause();
                }
                if (!this.f44847e.isComplete()) {
                    this.f44847e = f.a.PAUSED;
                    this.f44845c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
