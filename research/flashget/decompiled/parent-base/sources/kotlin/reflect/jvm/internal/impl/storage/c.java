package kotlin.reflect.jvm.internal.impl.storage;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: locks.kt */
/* loaded from: classes7.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Runnable f78303c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final ld.l<InterruptedException, k2> f78304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(@fg.l Lock lock, @fg.l Runnable runnable, @fg.l ld.l<? super InterruptedException, k2> lVar) {
        super(lock);
        l0.p(lock, ProtectedSandApp.s("粭\u0001"));
        l0.p(runnable, ProtectedSandApp.s("粫\u0001"));
        l0.p(lVar, ProtectedSandApp.s("粬\u0001"));
        this.f78303c = runnable;
        this.f78304d = lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.d, kotlin.reflect.jvm.internal.impl.storage.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f78303c.run();
            } catch (InterruptedException e4) {
                this.f78304d.invoke(e4);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@fg.l Runnable runnable, @fg.l ld.l<? super InterruptedException, k2> lVar) {
        this(new ReentrantLock(), runnable, lVar);
        l0.p(runnable, ProtectedSandApp.s("粫\u0001"));
        l0.p(lVar, ProtectedSandApp.s("粬\u0001"));
    }
}
