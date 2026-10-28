package kotlin.reflect.jvm.internal.impl.storage;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: locks.kt */
/* loaded from: classes7.dex */
public class d implements k {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Lock f78305b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @fg.l
    protected final Lock a() {
        return this.f78305b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.k
    public void lock() {
        this.f78305b.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.k
    public void unlock() {
        this.f78305b.unlock();
    }

    public d(@fg.l Lock lock) {
        l0.p(lock, ProtectedSandApp.s("粪\u0001"));
        this.f78305b = lock;
    }

    public /* synthetic */ d(Lock lock, int i4, w wVar) {
        this((i4 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
