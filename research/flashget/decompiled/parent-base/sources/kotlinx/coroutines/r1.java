package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.b1;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u001d?@AB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J%\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00122\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0004¢\u0006\u0004\b-\u0010\u0004R$\u00103\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00107\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b6\u0010$R\u0013\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109088\u0002X\u0082\u0004R\u000b\u0010<\u001a\u00020;8\u0002X\u0082\u0004R\u0013\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=088\u0002X\u0082\u0004¨\u0006B"}, d2 = {"Lkotlinx/coroutines/r1;", "Lkotlinx/coroutines/s1;", "Lkotlinx/coroutines/b1;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "l2", "(Ljava/lang/Runnable;)Z", "f2", "()Ljava/lang/Runnable;", "Lkotlin/k2;", "e2", "Lkotlinx/coroutines/r1$c;", "B2", "(Lkotlinx/coroutines/r1$c;)Z", "", "now", "delayedTask", "", "w2", "(JLkotlinx/coroutines/r1$c;)I", "n2", "shutdown", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", "a", "(JLkotlinx/coroutines/p;)V", "block", "Lkotlinx/coroutines/m1;", "x2", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/m1;", "L1", "()J", "Lkotlin/coroutines/g;", "context", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "g2", "(Ljava/lang/Runnable;)V", "q2", "(JLkotlinx/coroutines/r1$c;)V", "o2", "value", "l", "()Z", "A2", "(Z)V", "isCompleted", "D1", "isEmpty", "t1", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/r1$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "", "_queue", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n60#2:544\n61#2,7:550\n28#3,4:545\n20#4:549\n56#5:557\n1#6:558\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n269#1:544\n269#1:550,7\n269#1:545,4\n269#1:549\n280#1:557\n*E\n"})
/* loaded from: classes7.dex */
public abstract class r1 extends s1 implements b1 {

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80898g = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, ProtectedSandApp.s("蟈\u0001"));

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80899h = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, ProtectedSandApp.s("蟉\u0001"));

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80900i = AtomicIntegerFieldUpdater.newUpdater(r1.class, ProtectedSandApp.s("蟊\u0001"));

    @fg.m
    @kd.x
    private volatile Object _delayed;

    @kd.x
    private volatile int _isCompleted = 0;

    @fg.m
    @kd.x
    private volatile Object _queue;

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/r1$a;", "Lkotlinx/coroutines/r1$c;", "", "nanoTime", "Lkotlinx/coroutines/p;", "Lkotlin/k2;", "cont", "<init>", "(Lkotlinx/coroutines/r1;JLkotlinx/coroutines/p;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "d", "Lkotlinx/coroutines/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    private final class a extends c {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final p<kotlin.k2> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j4, @fg.l p<? super kotlin.k2> pVar) {
            super(j4);
            this.cont = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.Z(r1.this, kotlin.k2.f75408a);
        }

        @Override // kotlinx.coroutines.r1.c
        @fg.l
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/r1$b;", "Lkotlinx/coroutines/r1$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "Lkotlin/k2;", "run", "()V", "", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends c {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Runnable block;

        public b(long j4, @fg.l Runnable runnable) {
            super(j4);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.r1.c
        @fg.l
        public String toString() {
            return super.toString() + this.block;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lkotlinx/coroutines/r1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/internal/d1;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "d", "(Lkotlinx/coroutines/r1$c;)I", "now", "", "f", "(J)Z", "Lkotlinx/coroutines/r1$d;", "delayed", "Lkotlinx/coroutines/r1;", "eventLoop", "e", "(JLkotlinx/coroutines/r1$d;Lkotlinx/coroutines/r1;)I", "Lkotlin/k2;", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "b", "J", "_heap", "Ljava/lang/Object;", "c", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lkotlinx/coroutines/internal/c1;", "value", "()Lkotlinx/coroutines/internal/c1;", "a", "(Lkotlinx/coroutines/internal/c1;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,543:1\n28#2,4:544\n28#2,4:550\n28#2,4:562\n20#3:548\n20#3:554\n20#3:566\n72#4:549\n73#4,7:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n437#1:544,4\n439#1:550,4\n479#1:562,4\n437#1:548\n439#1:554\n479#1:566\n439#1:549\n439#1:555,7\n*E\n"})
    public static abstract class c implements Runnable, Comparable<c>, m1, kotlinx.coroutines.internal.d1 {

        @fg.m
        private volatile Object _heap;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public long nanoTime;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        public c(long j4) {
            this.nanoTime = j4;
        }

        @Override // kotlinx.coroutines.internal.d1
        public void a(@fg.m kotlinx.coroutines.internal.c1<?> c1Var) {
            kotlinx.coroutines.internal.s0 s0Var;
            Object obj = this._heap;
            s0Var = u1.f81161a;
            if (obj == s0Var) {
                throw new IllegalArgumentException(ProtectedSandApp.s("衏\u0001"));
            }
            this._heap = c1Var;
        }

        @Override // kotlinx.coroutines.internal.d1
        @fg.m
        public kotlinx.coroutines.internal.c1<?> c() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.c1) {
                return (kotlinx.coroutines.internal.c1) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(@fg.l c other) {
            long j4 = this.nanoTime - other.nanoTime;
            if (j4 > 0) {
                return 1;
            }
            return j4 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.m1
        public final void dispose() {
            kotlinx.coroutines.internal.s0 s0Var;
            kotlinx.coroutines.internal.s0 s0Var2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    s0Var = u1.f81161a;
                    if (obj == s0Var) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.k(this);
                    }
                    s0Var2 = u1.f81161a;
                    this._heap = s0Var2;
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int e(long now, @fg.l d delayed, @fg.l r1 eventLoop) {
            kotlinx.coroutines.internal.s0 s0Var;
            synchronized (this) {
                Object obj = this._heap;
                s0Var = u1.f81161a;
                if (obj == s0Var) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c f4 = delayed.f();
                        if (eventLoop.l()) {
                            return 1;
                        }
                        if (f4 == null) {
                            delayed.timeNow = now;
                        } else {
                            long j4 = f4.nanoTime;
                            if (j4 - now < 0) {
                                now = j4;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j5 = this.nanoTime;
                        long j6 = delayed.timeNow;
                        if (j5 - j6 < 0) {
                            this.nanoTime = j6;
                        }
                        delayed.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean f(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // kotlinx.coroutines.internal.d1
        public int getIndex() {
            return this.index;
        }

        @Override // kotlinx.coroutines.internal.d1
        public void setIndex(int i4) {
            this.index = i4;
        }

        @fg.l
        public String toString() {
            return androidx.collection.y0.a(new StringBuilder(ProtectedSandApp.s("衐\u0001")), this.nanoTime, ']');
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/r1$d;", "Lkotlinx/coroutines/internal/c1;", "Lkotlinx/coroutines/r1$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends kotlinx.coroutines.internal.c1<c> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public long timeNow;

        public d(long j4) {
            this.timeNow = j4;
        }
    }

    private final void A2(boolean z4) {
        f80900i.set(this, z4 ? 1 : 0);
    }

    private final boolean B2(c task) {
        d dVar = (d) f80899h.get(this);
        return (dVar != null ? dVar.i() : null) == task;
    }

    private final void e2() {
        kotlinx.coroutines.internal.s0 s0Var;
        kotlinx.coroutines.internal.s0 s0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80898g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f80898g;
                s0Var = u1.f81168h;
                if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater2, this, null, s0Var)) {
                    return;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.a0) {
                    ((kotlinx.coroutines.internal.a0) obj).d();
                    return;
                }
                s0Var2 = u1.f81168h;
                if (obj == s0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.a0 a0Var = new kotlinx.coroutines.internal.a0(8, true);
                kotlin.jvm.internal.l0.n(obj, ProtectedSandApp.s("蟋\u0001"));
                a0Var.a((Runnable) obj);
                if (androidx.concurrent.futures.c.a(f80898g, this, obj, a0Var)) {
                    return;
                }
            }
        }
    }

    private final Runnable f2() {
        kotlinx.coroutines.internal.s0 s0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80898g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.a0) {
                kotlin.jvm.internal.l0.n(obj, ProtectedSandApp.s("蟌\u0001"));
                kotlinx.coroutines.internal.a0 a0Var = (kotlinx.coroutines.internal.a0) obj;
                Object n4 = a0Var.n();
                if (n4 != kotlinx.coroutines.internal.a0.f80740t) {
                    return (Runnable) n4;
                }
                androidx.concurrent.futures.c.a(f80898g, this, obj, a0Var.m());
            } else {
                s0Var = u1.f81168h;
                if (obj == s0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.c.a(f80898g, this, obj, null)) {
                    kotlin.jvm.internal.l0.n(obj, ProtectedSandApp.s("蟋\u0001"));
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        return f80900i.get(this) != 0;
    }

    private final boolean l2(Runnable task) {
        kotlinx.coroutines.internal.s0 s0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80898g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (l()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.c.a(f80898g, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.a0) {
                kotlin.jvm.internal.l0.n(obj, ProtectedSandApp.s("蟌\u0001"));
                kotlinx.coroutines.internal.a0 a0Var = (kotlinx.coroutines.internal.a0) obj;
                int a5 = a0Var.a(task);
                if (a5 == 0) {
                    return true;
                }
                if (a5 == 1) {
                    androidx.concurrent.futures.c.a(f80898g, this, obj, a0Var.m());
                } else if (a5 == 2) {
                    return false;
                }
            } else {
                s0Var = u1.f81168h;
                if (obj == s0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.a0 a0Var2 = new kotlinx.coroutines.internal.a0(8, true);
                kotlin.jvm.internal.l0.n(obj, ProtectedSandApp.s("蟋\u0001"));
                a0Var2.a((Runnable) obj);
                a0Var2.a(task);
                if (androidx.concurrent.futures.c.a(f80898g, this, obj, a0Var2)) {
                    return true;
                }
            }
        }
    }

    private final void m2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, kotlin.k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void n2() {
        c n4;
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        long b6 = b5 != null ? b5.b() : System.nanoTime();
        while (true) {
            d dVar = (d) f80899h.get(this);
            if (dVar == null || (n4 = dVar.n()) == null) {
                return;
            } else {
                W1(b6, n4);
            }
        }
    }

    private final int w2(long now, c delayedTask) {
        if (l()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80899h;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, null, new d(now));
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlin.jvm.internal.l0.m(obj);
            dVar = (d) obj;
        }
        return delayedTask.e(now, dVar, this);
    }

    @Override // kotlinx.coroutines.q1
    protected boolean D1() {
        kotlinx.coroutines.internal.s0 s0Var;
        if (!K1()) {
            return false;
        }
        d dVar = (d) f80899h.get(this);
        if (dVar != null && !dVar.h()) {
            return false;
        }
        Object obj = f80898g.get(this);
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.a0) {
                return ((kotlinx.coroutines.internal.a0) obj).h();
            }
            s0Var = u1.f81168h;
            if (obj != s0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.q1
    public long L1() {
        c cVar;
        if (M1()) {
            return 0L;
        }
        d dVar = (d) f80899h.get(this);
        if (dVar != null && !dVar.h()) {
            kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
            long b6 = b5 != null ? b5.b() : System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        c f4 = dVar.f();
                        if (f4 != null) {
                            c cVar2 = f4;
                            cVar = cVar2.f(b6) ? l2(cVar2) : false ? dVar.l(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (cVar != null);
        }
        Runnable f22 = f2();
        if (f22 == null) {
            return t1();
        }
        f22.run();
        return 0L;
    }

    @Override // kotlinx.coroutines.m0
    public final void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        g2(block);
    }

    @Override // kotlinx.coroutines.b1
    public void a(long timeMillis, @fg.l p<? super kotlin.k2> continuation) {
        long d5 = u1.d(timeMillis);
        if (d5 < kotlin.time.g.f79218c) {
            kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
            long b6 = b5 != null ? b5.b() : System.nanoTime();
            a aVar = new a(d5 + b6, continuation);
            q2(b6, aVar);
            s.a(continuation, aVar);
        }
    }

    public void g2(@fg.l Runnable task) {
        if (l2(task)) {
            a2();
        } else {
            x0.f81189j.g2(task);
        }
    }

    protected final void o2() {
        f80898g.set(this, null);
        f80899h.set(this, null);
    }

    @Override // kotlinx.coroutines.b1
    @fg.l
    public m1 q(long j4, @fg.l Runnable runnable, @fg.l kotlin.coroutines.g gVar) {
        return b1.a.b(this, j4, runnable, gVar);
    }

    @Override // kotlinx.coroutines.b1
    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object q0(long j4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        return b1.a.a(this, j4, dVar);
    }

    public final void q2(long now, @fg.l c delayedTask) {
        int w22 = w2(now, delayedTask);
        if (w22 == 0) {
            if (B2(delayedTask)) {
                a2();
            }
        } else if (w22 == 1) {
            W1(now, delayedTask);
        } else if (w22 != 2) {
            throw new IllegalStateException(ProtectedSandApp.s("蟍\u0001"));
        }
    }

    @Override // kotlinx.coroutines.q1
    public void shutdown() {
        n3.f80870a.c();
        A2(true);
        e2();
        while (L1() <= 0) {
        }
        n2();
    }

    @Override // kotlinx.coroutines.q1
    protected long t1() {
        c i4;
        kotlinx.coroutines.internal.s0 s0Var;
        if (super.t1() == 0) {
            return 0L;
        }
        Object obj = f80898g.get(this);
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.a0)) {
                s0Var = u1.f81168h;
                return obj == s0Var ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.a0) obj).h()) {
                return 0L;
            }
        }
        d dVar = (d) f80899h.get(this);
        if (dVar == null || (i4 = dVar.i()) == null) {
            return Long.MAX_VALUE;
        }
        long j4 = i4.nanoTime;
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        return kotlin.ranges.s.v(j4 - (b5 != null ? b5.b() : System.nanoTime()), 0L);
    }

    @fg.l
    protected final m1 x2(long timeMillis, @fg.l Runnable block) {
        long d5 = u1.d(timeMillis);
        if (d5 >= kotlin.time.g.f79218c) {
            return y2.f81204b;
        }
        kotlinx.coroutines.b b5 = kotlinx.coroutines.c.b();
        long b6 = b5 != null ? b5.b() : System.nanoTime();
        b bVar = new b(d5 + b6, block);
        q2(b6, bVar);
        return bVar;
    }
}
