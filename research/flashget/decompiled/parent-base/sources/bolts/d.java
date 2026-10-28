package bolts;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;

/* compiled from: CancellationTokenRegistration.java */
/* loaded from: classes3.dex */
public class d implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private final Object f36865b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private e f36866c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f36867d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36868e;

    d(e eVar, Runnable runnable) {
        this.f36866c = eVar;
        this.f36867d = runnable;
    }

    private void b() {
        if (this.f36868e) {
            throw new IllegalStateException(ProtectedSandApp.s("Û"));
        }
    }

    void a() {
        synchronized (this.f36865b) {
            b();
            this.f36867d.run();
            close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f36865b) {
            try {
                if (this.f36868e) {
                    return;
                }
                this.f36868e = true;
                this.f36866c.n(this);
                this.f36866c = null;
                this.f36867d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
