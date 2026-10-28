package kotlin.reflect.jvm.internal.impl.storage;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: locks.kt */
/* loaded from: classes6.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Runnable f26295c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final q3.l<InterruptedException, m2> f26296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(@d5.d Lock lock, @d5.d Runnable runnable, @d5.d q3.l<? super InterruptedException, m2> lVar) {
        super(lock);
        l0.p(lock, ProtectedSandApp.s("蠧"));
        l0.p(runnable, ProtectedSandApp.s("蠨"));
        l0.p(lVar, ProtectedSandApp.s("蠩"));
        this.f26295c = runnable;
        this.f26296d = lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.d, kotlin.reflect.jvm.internal.impl.storage.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f26295c.run();
            } catch (InterruptedException e6) {
                this.f26296d.N(e6);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@d5.d Runnable runnable, @d5.d q3.l<? super InterruptedException, m2> lVar) {
        this(new ReentrantLock(), runnable, lVar);
        l0.p(runnable, ProtectedSandApp.s("蠥"));
        l0.p(lVar, ProtectedSandApp.s("蠦"));
    }
}
