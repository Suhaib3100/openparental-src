package com.bumptech.glide.request;

import androidx.annotation.b0;
import androidx.annotation.q0;
import com.bumptech.glide.request.f;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes3.dex */
public class l implements f, e {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final f f12037a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f12038b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f12039c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f12040d;

    /* renamed from: e, reason: collision with root package name */
    @b0("requestLock")
    private f.a f12041e;

    /* renamed from: f, reason: collision with root package name */
    @b0("requestLock")
    private f.a f12042f;

    /* renamed from: g, reason: collision with root package name */
    @b0("requestLock")
    private boolean f12043g;

    public l(Object obj, @q0 f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f12041e = aVar;
        this.f12042f = aVar;
        this.f12038b = obj;
        this.f12037a = fVar;
    }

    @b0("requestLock")
    private boolean k() {
        f fVar = this.f12037a;
        return fVar == null || fVar.j(this);
    }

    @b0("requestLock")
    private boolean l() {
        f fVar = this.f12037a;
        return fVar == null || fVar.c(this);
    }

    @b0("requestLock")
    private boolean m() {
        f fVar = this.f12037a;
        return fVar == null || fVar.e(this);
    }

    @Override // com.bumptech.glide.request.f
    public void a(e eVar) {
        synchronized (this.f12038b) {
            if (!eVar.equals(this.f12039c)) {
                this.f12042f = f.a.FAILED;
                return;
            }
            this.f12041e = f.a.FAILED;
            f fVar = this.f12037a;
            if (fVar != null) {
                fVar.a(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.f, com.bumptech.glide.request.e
    public boolean b() {
        boolean z5;
        synchronized (this.f12038b) {
            z5 = this.f12040d.b() || this.f12039c.b();
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.f
    public boolean c(e eVar) {
        boolean z5;
        synchronized (this.f12038b) {
            z5 = l() && eVar.equals(this.f12039c) && !b();
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f12038b) {
            this.f12043g = false;
            f.a aVar = f.a.CLEARED;
            this.f12041e = aVar;
            this.f12042f = aVar;
            this.f12040d.clear();
            this.f12039c.clear();
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean d(e eVar) {
        if (!(eVar instanceof l)) {
            return false;
        }
        l lVar = (l) eVar;
        if (this.f12039c == null) {
            if (lVar.f12039c != null) {
                return false;
            }
        } else if (!this.f12039c.d(lVar.f12039c)) {
            return false;
        }
        if (this.f12040d == null) {
            if (lVar.f12040d != null) {
                return false;
            }
        } else if (!this.f12040d.d(lVar.f12040d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.f
    public boolean e(e eVar) {
        boolean z5;
        synchronized (this.f12038b) {
            z5 = m() && (eVar.equals(this.f12039c) || this.f12041e != f.a.SUCCESS);
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.e
    public boolean f() {
        boolean z5;
        synchronized (this.f12038b) {
            z5 = this.f12041e == f.a.CLEARED;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.f
    public void g(e eVar) {
        synchronized (this.f12038b) {
            if (eVar.equals(this.f12040d)) {
                this.f12042f = f.a.SUCCESS;
                return;
            }
            this.f12041e = f.a.SUCCESS;
            f fVar = this.f12037a;
            if (fVar != null) {
                fVar.g(this);
            }
            if (!this.f12042f.isComplete()) {
                this.f12040d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public f getRoot() {
        f root;
        synchronized (this.f12038b) {
            f fVar = this.f12037a;
            root = fVar != null ? fVar.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
        synchronized (this.f12038b) {
            this.f12043g = true;
            try {
                if (this.f12041e != f.a.SUCCESS) {
                    f.a aVar = this.f12042f;
                    f.a aVar2 = f.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f12042f = aVar2;
                        this.f12040d.h();
                    }
                }
                if (this.f12043g) {
                    f.a aVar3 = this.f12041e;
                    f.a aVar4 = f.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.f12041e = aVar4;
                        this.f12039c.h();
                    }
                }
            } finally {
                this.f12043g = false;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean i() {
        boolean z5;
        synchronized (this.f12038b) {
            z5 = this.f12041e == f.a.SUCCESS;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z5;
        synchronized (this.f12038b) {
            z5 = this.f12041e == f.a.RUNNING;
        }
        return z5;
    }

    @Override // com.bumptech.glide.request.f
    public boolean j(e eVar) {
        boolean z5;
        synchronized (this.f12038b) {
            z5 = k() && eVar.equals(this.f12039c) && this.f12041e != f.a.PAUSED;
        }
        return z5;
    }

    public void n(e eVar, e eVar2) {
        this.f12039c = eVar;
        this.f12040d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f12038b) {
            if (!this.f12042f.isComplete()) {
                this.f12042f = f.a.PAUSED;
                this.f12040d.pause();
            }
            if (!this.f12041e.isComplete()) {
                this.f12041e = f.a.PAUSED;
                this.f12039c.pause();
            }
        }
    }
}
