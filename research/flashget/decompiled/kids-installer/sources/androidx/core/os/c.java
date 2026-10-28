package androidx.core.os;

import android.os.CancellationSignal;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: CancellationSignal.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4968a;

    /* renamed from: b, reason: collision with root package name */
    private b f4969b;

    /* renamed from: c, reason: collision with root package name */
    private Object f4970c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4971d;

    /* compiled from: CancellationSignal.java */
    @x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        @androidx.annotation.u
        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* compiled from: CancellationSignal.java */
    public interface b {
        void onCancel();
    }

    private void f() {
        while (this.f4971d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f4968a) {
                return;
            }
            this.f4968a = true;
            this.f4971d = true;
            b bVar = this.f4969b;
            Object obj = this.f4970c;
            if (bVar != null) {
                try {
                    bVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f4971d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.f4971d = false;
                notifyAll();
            }
        }
    }

    @q0
    public Object b() {
        Object obj;
        synchronized (this) {
            if (this.f4970c == null) {
                CancellationSignal b6 = a.b();
                this.f4970c = b6;
                if (this.f4968a) {
                    a.a(b6);
                }
            }
            obj = this.f4970c;
        }
        return obj;
    }

    public boolean c() {
        boolean z5;
        synchronized (this) {
            z5 = this.f4968a;
        }
        return z5;
    }

    public void d(@q0 b bVar) {
        synchronized (this) {
            f();
            if (this.f4969b == bVar) {
                return;
            }
            this.f4969b = bVar;
            if (this.f4968a && bVar != null) {
                bVar.onCancel();
            }
        }
    }

    public void e() {
        if (c()) {
            throw new OperationCanceledException();
        }
    }
}
