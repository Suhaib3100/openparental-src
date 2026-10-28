package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes6.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    static final int f54128e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f54129f = 1500;

    /* renamed from: g, reason: collision with root package name */
    private static final int f54130g = 2750;

    /* renamed from: h, reason: collision with root package name */
    private static c f54131h;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final Object f54132a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Handler f54133b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    @q0
    private C0815c f54134c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private C0815c f54135d;

    /* compiled from: SnackbarManager.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@o0 Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0815c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    interface b {
        void a(int i4);

        void b();
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    private static class C0815c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        final WeakReference<b> f54137a;

        /* renamed from: b, reason: collision with root package name */
        int f54138b;

        /* renamed from: c, reason: collision with root package name */
        boolean f54139c;

        C0815c(int i4, b bVar) {
            this.f54137a = new WeakReference<>(bVar);
            this.f54138b = i4;
        }

        boolean a(@q0 b bVar) {
            return bVar != null && this.f54137a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(@o0 C0815c c0815c, int i4) {
        b bVar = c0815c.f54137a.get();
        if (bVar == null) {
            return false;
        }
        this.f54133b.removeCallbacksAndMessages(c0815c);
        bVar.a(i4);
        return true;
    }

    static c c() {
        if (f54131h == null) {
            f54131h = new c();
        }
        return f54131h;
    }

    private boolean g(b bVar) {
        C0815c c0815c = this.f54134c;
        return c0815c != null && c0815c.a(bVar);
    }

    private boolean h(b bVar) {
        C0815c c0815c = this.f54135d;
        return c0815c != null && c0815c.a(bVar);
    }

    private void m(@o0 C0815c c0815c) {
        int i4 = c0815c.f54138b;
        if (i4 == -2) {
            return;
        }
        if (i4 <= 0) {
            i4 = i4 == -1 ? 1500 : f54130g;
        }
        this.f54133b.removeCallbacksAndMessages(c0815c);
        Handler handler = this.f54133b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0815c), i4);
    }

    private void o() {
        C0815c c0815c = this.f54135d;
        if (c0815c != null) {
            this.f54134c = c0815c;
            this.f54135d = null;
            b bVar = c0815c.f54137a.get();
            if (bVar != null) {
                bVar.b();
            } else {
                this.f54134c = null;
            }
        }
    }

    public void b(b bVar, int i4) {
        synchronized (this.f54132a) {
            try {
                if (g(bVar)) {
                    a(this.f54134c, i4);
                } else if (h(bVar)) {
                    a(this.f54135d, i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(@o0 C0815c c0815c) {
        synchronized (this.f54132a) {
            try {
                if (this.f54134c != c0815c) {
                    if (this.f54135d == c0815c) {
                    }
                }
                a(c0815c, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean g4;
        synchronized (this.f54132a) {
            g4 = g(bVar);
        }
        return g4;
    }

    public boolean f(b bVar) {
        boolean z4;
        synchronized (this.f54132a) {
            try {
                z4 = g(bVar) || h(bVar);
            } finally {
            }
        }
        return z4;
    }

    public void i(b bVar) {
        synchronized (this.f54132a) {
            try {
                if (g(bVar)) {
                    this.f54134c = null;
                    if (this.f54135d != null) {
                        o();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f54132a) {
            try {
                if (g(bVar)) {
                    m(this.f54134c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f54132a) {
            try {
                if (g(bVar)) {
                    C0815c c0815c = this.f54134c;
                    if (!c0815c.f54139c) {
                        c0815c.f54139c = true;
                        this.f54133b.removeCallbacksAndMessages(c0815c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f54132a) {
            try {
                if (g(bVar)) {
                    C0815c c0815c = this.f54134c;
                    if (c0815c.f54139c) {
                        c0815c.f54139c = false;
                        m(c0815c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(int i4, b bVar) {
        synchronized (this.f54132a) {
            try {
                if (g(bVar)) {
                    C0815c c0815c = this.f54134c;
                    c0815c.f54138b = i4;
                    this.f54133b.removeCallbacksAndMessages(c0815c);
                    m(this.f54134c);
                    return;
                }
                if (h(bVar)) {
                    this.f54135d.f54138b = i4;
                } else {
                    this.f54135d = new C0815c(i4, bVar);
                }
                C0815c c0815c2 = this.f54134c;
                if (c0815c2 == null || !a(c0815c2, 4)) {
                    this.f54134c = null;
                    o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
