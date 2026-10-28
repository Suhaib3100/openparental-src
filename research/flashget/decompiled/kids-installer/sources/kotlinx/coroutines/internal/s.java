package kotlinx.coroutines.internal;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.m2;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.p1;

/* compiled from: LimitedDispatcher.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J#\u0010\t\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\bJ\b\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010\f\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u001b\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0097Aø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0096\u0001J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u001c\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0017R\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u001e\u0010(\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010-\u001a\u00060)j\u0002`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/s;", "Lkotlinx/coroutines/o0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/e1;", "block", "Lkotlin/Function0;", "Lkotlin/m2;", "dispatch", "M0", "", "N0", "J0", "", "time", "e0", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "timeMillis", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/p1;", "b0", "Lkotlinx/coroutines/q;", "continuation", "g", "", "parallelism", "E0", "run", "y0", "A0", "q", "Lkotlinx/coroutines/o0;", "dispatcher", "r", "I", "runningWorkers", "Lkotlinx/coroutines/internal/a0;", "t", "Lkotlinx/coroutines/internal/a0;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "u", "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lkotlinx/coroutines/o0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class s extends kotlinx.coroutines.o0 implements Runnable, e1 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.o0 dispatcher;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;
    private volatile int runningWorkers;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ e1 f28749s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final a0<Runnable> queue;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Object workerAllocationLock;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@d5.d kotlinx.coroutines.o0 o0Var, int i5) {
        this.dispatcher = o0Var;
        this.parallelism = i5;
        e1 e1Var = o0Var instanceof e1 ? (e1) o0Var : null;
        this.f28749s = e1Var == null ? kotlinx.coroutines.b1.a() : e1Var;
        this.queue = new a0<>(false);
        this.workerAllocationLock = new Object();
    }

    private final boolean J0(Runnable block) {
        this.queue.a(block);
        return this.runningWorkers >= this.parallelism;
    }

    private final void M0(Runnable runnable, q3.a<m2> aVar) {
        if (!J0(runnable) && N0()) {
            aVar.n();
        }
    }

    private final boolean N0() {
        synchronized (this.workerAllocationLock) {
            if (this.runningWorkers >= this.parallelism) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.o0
    @i2
    public void A0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        if (J0(runnable) || !N0()) {
            return;
        }
        this.dispatcher.A0(this, this);
    }

    @Override // kotlinx.coroutines.o0
    @c2
    @d5.d
    public kotlinx.coroutines.o0 E0(int parallelism) {
        t.a(parallelism);
        return parallelism >= this.parallelism ? this : super.E0(parallelism);
    }

    @Override // kotlinx.coroutines.e1
    @d5.d
    public p1 b0(long timeMillis, @d5.d Runnable block, @d5.d CoroutineContext context) {
        return this.f28749s.b0(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @d5.e
    public Object e0(long j5, @d5.d Continuation<? super m2> continuation) {
        return this.f28749s.e0(j5, continuation);
    }

    @Override // kotlinx.coroutines.e1
    public void g(long j5, @d5.d kotlinx.coroutines.q<? super m2> qVar) {
        this.f28749s.g(j5, qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        r1 = r4.workerAllocationLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r4.queue.c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        r4.runningWorkers++;
        r2 = kotlin.m2.f23662a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.a0<java.lang.Runnable> r2 = r4.queue
            java.lang.Object r2 = r2.g()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.coroutines.i r3 = kotlin.coroutines.EmptyCoroutineContext.f23294o
            kotlinx.coroutines.r0.b(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.o0 r2 = r4.dispatcher
            boolean r2 = r2.B0(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.o0 r0 = r4.dispatcher
            r0.y0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.workerAllocationLock
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.a0<java.lang.Runnable> r2 = r4.queue     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlin.m2 r2 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.s.run():void");
    }

    @Override // kotlinx.coroutines.o0
    public void y0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        if (J0(runnable) || !N0()) {
            return;
        }
        this.dispatcher.y0(this, this);
    }
}
