package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes2.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    static final int f14260e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f14261f = 1500;

    /* renamed from: g, reason: collision with root package name */
    private static final int f14262g = 2750;

    /* renamed from: h, reason: collision with root package name */
    private static c f14263h;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final Object f14264a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Handler f14265b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    @q0
    private C0181c f14266c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private C0181c f14267d;

    /* compiled from: SnackbarManager.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@o0 Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0181c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    interface b {
        void a();

        void b(int i5);
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    private static class C0181c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        final WeakReference<b> f14269a;

        /* renamed from: b, reason: collision with root package name */
        int f14270b;

        /* renamed from: c, reason: collision with root package name */
        boolean f14271c;

        C0181c(int i5, b bVar) {
            this.f14269a = new WeakReference<>(bVar);
            this.f14270b = i5;
        }

        boolean a(@q0 b bVar) {
            return bVar != null && this.f14269a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(@o0 C0181c c0181c, int i5) {
        b bVar = c0181c.f14269a.get();
        if (bVar == null) {
            return false;
        }
        this.f14265b.removeCallbacksAndMessages(c0181c);
        bVar.b(i5);
        return true;
    }

    static c c() {
        if (f14263h == null) {
            f14263h = new c();
        }
        return f14263h;
    }

    private boolean g(b bVar) {
        C0181c c0181c = this.f14266c;
        return c0181c != null && c0181c.a(bVar);
    }

    private boolean h(b bVar) {
        C0181c c0181c = this.f14267d;
        return c0181c != null && c0181c.a(bVar);
    }

    private void m(@o0 C0181c c0181c) {
        int i5 = c0181c.f14270b;
        if (i5 == -2) {
            return;
        }
        if (i5 <= 0) {
            i5 = i5 == -1 ? 1500 : f14262g;
        }
        this.f14265b.removeCallbacksAndMessages(c0181c);
        Handler handler = this.f14265b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0181c), i5);
    }

    private void o() {
        C0181c c0181c = this.f14267d;
        if (c0181c != null) {
            this.f14266c = c0181c;
            this.f14267d = null;
            b bVar = c0181c.f14269a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f14266c = null;
            }
        }
    }

    public void b(b bVar, int i5) {
        synchronized (this.f14264a) {
            if (g(bVar)) {
                a(this.f14266c, i5);
            } else if (h(bVar)) {
                a(this.f14267d, i5);
            }
        }
    }

    void d(@o0 C0181c c0181c) {
        synchronized (this.f14264a) {
            if (this.f14266c == c0181c || this.f14267d == c0181c) {
                a(c0181c, 2);
            }
        }
    }

    public boolean e(b bVar) {
        boolean g5;
        synchronized (this.f14264a) {
            g5 = g(bVar);
        }
        return g5;
    }

    public boolean f(b bVar) {
        boolean z5;
        synchronized (this.f14264a) {
            z5 = g(bVar) || h(bVar);
        }
        return z5;
    }

    public void i(b bVar) {
        synchronized (this.f14264a) {
            if (g(bVar)) {
                this.f14266c = null;
                if (this.f14267d != null) {
                    o();
                }
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f14264a) {
            if (g(bVar)) {
                m(this.f14266c);
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f14264a) {
            if (g(bVar)) {
                C0181c c0181c = this.f14266c;
                if (!c0181c.f14271c) {
                    c0181c.f14271c = true;
                    this.f14265b.removeCallbacksAndMessages(c0181c);
                }
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f14264a) {
            if (g(bVar)) {
                C0181c c0181c = this.f14266c;
                if (c0181c.f14271c) {
                    c0181c.f14271c = false;
                    m(c0181c);
                }
            }
        }
    }

    public void n(int i5, b bVar) {
        synchronized (this.f14264a) {
            if (g(bVar)) {
                C0181c c0181c = this.f14266c;
                c0181c.f14270b = i5;
                this.f14265b.removeCallbacksAndMessages(c0181c);
                m(this.f14266c);
                return;
            }
            if (h(bVar)) {
                this.f14267d.f14270b = i5;
            } else {
                this.f14267d = new C0181c(i5, bVar);
            }
            C0181c c0181c2 = this.f14266c;
            if (c0181c2 == null || !a(c0181c2, 4)) {
                this.f14266c = null;
                o();
            }
        }
    }
}
