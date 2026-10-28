package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR:\u0010\u000f\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/d1;", "Lkotlinx/coroutines/internal/k;", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "a", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "b", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "exceptionCtors", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class d1 extends k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final d1 f28696a = new d1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final WeakHashMap<Class<? extends Throwable>, q3.l<Throwable, Throwable>> exceptionCtors = new WeakHashMap<>();

    private d1() {
    }

    @Override // kotlinx.coroutines.internal.k
    @d5.d
    public q3.l<Throwable, Throwable> a(@d5.d Class<? extends Throwable> cls) {
        q3.l<Throwable, Throwable> b6;
        ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            q3.l<Throwable, Throwable> lVar = exceptionCtors.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i5 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i6 = 0; i6 < readHoldCount; i6++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, q3.l<Throwable, Throwable>> weakHashMap = exceptionCtors;
                q3.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                b6 = n.b(cls);
                weakHashMap.put(cls, b6);
                while (i5 < readHoldCount) {
                    readLock2.lock();
                    i5++;
                }
                writeLock.unlock();
                return b6;
            } finally {
                while (i5 < readHoldCount) {
                    readLock2.lock();
                    i5++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
