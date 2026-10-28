package androidx.core.os;

import android.os.CancellationSignal;

/* compiled from: CancellationSignal.java */
@Deprecated
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f26503a;

    /* renamed from: b, reason: collision with root package name */
    private a f26504b;

    /* renamed from: c, reason: collision with root package name */
    private Object f26505c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26506d;

    /* compiled from: CancellationSignal.java */
    public interface a {
        void onCancel();
    }

    private void f() {
        while (this.f26506d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f26503a) {
                    return;
                }
                this.f26503a = true;
                this.f26506d = true;
                a aVar = this.f26504b;
                Object obj = this.f26505c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f26506d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f26506d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    @androidx.annotation.q0
    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f26505c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f26505c = cancellationSignal;
                    if (this.f26503a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f26505c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean c() {
        boolean z4;
        synchronized (this) {
            z4 = this.f26503a;
        }
        return z4;
    }

    public void d(@androidx.annotation.q0 a aVar) {
        synchronized (this) {
            try {
                f();
                if (this.f26504b == aVar) {
                    return;
                }
                this.f26504b = aVar;
                if (this.f26503a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    public void e() {
        if (c()) {
            throw new OperationCanceledException();
        }
    }
}
