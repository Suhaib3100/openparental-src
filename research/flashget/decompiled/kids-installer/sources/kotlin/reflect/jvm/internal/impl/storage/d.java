package kotlin.reflect.jvm.internal.impl.storage;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: locks.kt */
/* loaded from: classes5.dex */
public class d implements k {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Lock f26297b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @d5.d
    protected final Lock a() {
        return this.f26297b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.k
    public void lock() {
        this.f26297b.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.k
    public void unlock() {
        this.f26297b.unlock();
    }

    public d(@d5.d Lock lock) {
        l0.p(lock, ProtectedSandApp.s("咋"));
        this.f26297b = lock;
    }

    public /* synthetic */ d(Lock lock, int i5, w wVar) {
        this((i5 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
