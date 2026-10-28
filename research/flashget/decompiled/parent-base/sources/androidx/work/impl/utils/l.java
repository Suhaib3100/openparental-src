package androidx.work.impl.utils;

import androidx.annotation.c1;
import androidx.work.w;

/* compiled from: PruneWorkRunnable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.j f36496b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.c f36497c = new androidx.work.impl.c();

    public l(androidx.work.impl.j workManagerImpl) {
        this.f36496b = workManagerImpl;
    }

    public androidx.work.w a() {
        return this.f36497c;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f36496b.M().k().c();
            this.f36497c.b(androidx.work.w.f36614a);
        } catch (Throwable th) {
            this.f36497c.b(new w.b.a(th));
        }
    }
}
