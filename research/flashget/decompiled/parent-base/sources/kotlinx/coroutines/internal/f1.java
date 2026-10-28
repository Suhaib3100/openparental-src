package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR:\u0010\u0012\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/f1;", "Lkotlinx/coroutines/internal/k;", "<init>", "()V", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "a", "(Ljava/lang/Class;)Lld/l;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "b", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "exceptionCtors", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
/* loaded from: classes7.dex */
final class f1 extends k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final f1 f80769a = new f1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final WeakHashMap<Class<? extends Throwable>, ld.l<Throwable, Throwable>> exceptionCtors = new WeakHashMap<>();

    private f1() {
    }

    @Override // kotlinx.coroutines.internal.k
    @fg.l
    public ld.l<Throwable, Throwable> a(@fg.l Class<? extends Throwable> key) {
        ld.l<Throwable, Throwable> b5;
        ReentrantReadWriteLock reentrantReadWriteLock = cacheLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            ld.l<Throwable, Throwable> lVar = exceptionCtors.get(key);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i4 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i5 = 0; i5 < readHoldCount; i5++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, ld.l<Throwable, Throwable>> weakHashMap = exceptionCtors;
                ld.l<Throwable, Throwable> lVar2 = weakHashMap.get(key);
                if (lVar2 != null) {
                    return lVar2;
                }
                b5 = n.b(key);
                weakHashMap.put(key, b5);
                while (i4 < readHoldCount) {
                    readLock2.lock();
                    i4++;
                }
                writeLock.unlock();
                return b5;
            } finally {
                while (i4 < readHoldCount) {
                    readLock2.lock();
                    i4++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
