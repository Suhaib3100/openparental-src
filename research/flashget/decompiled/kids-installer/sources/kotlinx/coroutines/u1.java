package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.e1;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0004¢\u0006\u0004\b,\u0010\rR$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#¨\u0006<"}, d2 = {"Lkotlinx/coroutines/u1;", "Lkotlinx/coroutines/v1;", "Lkotlinx/coroutines/e1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "y1", "(Ljava/lang/Runnable;)Z", "w1", "()Ljava/lang/Runnable;", "Lkotlin/m2;", "v1", "()V", "Lkotlinx/coroutines/u1$c;", "F1", "(Lkotlinx/coroutines/u1$c;)Z", "", "now", "delayedTask", "", "C1", "(JLkotlinx/coroutines/u1$c;)I", "z1", "shutdown", "timeMillis", "Lkotlinx/coroutines/q;", "continuation", "g", "(JLkotlinx/coroutines/q;)V", "block", "Lkotlinx/coroutines/p1;", "D1", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/p1;", "i1", "()J", "Lkotlin/coroutines/g;", "context", "y0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "x1", "(Ljava/lang/Runnable;)V", "B1", "(JLkotlinx/coroutines/u1$c;)V", "A1", "value", "m", "()Z", "E1", "(Z)V", "isCompleted", "b1", "isEmpty", "R0", "nextTime", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class u1 extends v1 implements e1 {

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29018t = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, ProtectedSandApp.s("遃"));

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29019u = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, ProtectedSandApp.s("遄"));

    @d5.d
    private volatile /* synthetic */ Object _queue = null;

    @d5.d
    private volatile /* synthetic */ Object _delayed = null;

    @d5.d
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/u1$a;", "Lkotlinx/coroutines/u1$c;", "Lkotlin/m2;", "run", "", "toString", "Lkotlinx/coroutines/q;", "q", "Lkotlinx/coroutines/q;", "cont", "", "nanoTime", "<init>", "(Lkotlinx/coroutines/u1;JLkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private final class a extends c {

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final q<kotlin.m2> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j5, @d5.d q<? super kotlin.m2> qVar) {
            super(j5);
            this.cont = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.W(u1.this, kotlin.m2.f23662a);
        }

        @Override // kotlinx.coroutines.u1.c
        @d5.d
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/u1$b;", "Lkotlinx/coroutines/u1$c;", "Lkotlin/m2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "q", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class b extends c {

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final Runnable block;

        public b(long j5, @d5.d Runnable runnable) {
            super(j5);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.u1.c
        @d5.d
        public String toString() {
            return super.toString() + this.block;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b(\u0010)J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010!2\f\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lkotlinx/coroutines/u1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/p1;", "Lkotlinx/coroutines/internal/b1;", "other", "", "l", "", "now", "", "p", "Lkotlinx/coroutines/u1$d;", "delayed", "Lkotlinx/coroutines/u1;", "eventLoop", "o", "Lkotlin/m2;", "g", "", "toString", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lkotlinx/coroutines/internal/a1;", "value", "j", "()Lkotlinx/coroutines/internal/a1;", "h", "(Lkotlinx/coroutines/internal/a1;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    public static abstract class c implements Runnable, Comparable<c>, p1, kotlinx.coroutines.internal.b1 {

        @d5.e
        private volatile Object _heap;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public long nanoTime;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        public c(long j5) {
            this.nanoTime = j5;
        }

        @Override // kotlinx.coroutines.p1
        public final synchronized void g() {
            kotlinx.coroutines.internal.r0 r0Var;
            kotlinx.coroutines.internal.r0 r0Var2;
            Object obj = this._heap;
            r0Var = x1.f29061a;
            if (obj == r0Var) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                dVar.k(this);
            }
            r0Var2 = x1.f29061a;
            this._heap = r0Var2;
        }

        @Override // kotlinx.coroutines.internal.b1
        public int getIndex() {
            return this.index;
        }

        @Override // kotlinx.coroutines.internal.b1
        public void h(@d5.e kotlinx.coroutines.internal.a1<?> a1Var) {
            kotlinx.coroutines.internal.r0 r0Var;
            Object obj = this._heap;
            r0Var = x1.f29061a;
            if (!(obj != r0Var)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("広").toString());
            }
            this._heap = a1Var;
        }

        @Override // kotlinx.coroutines.internal.b1
        @d5.e
        public kotlinx.coroutines.internal.a1<?> j() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.a1) {
                return (kotlinx.coroutines.internal.a1) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(@d5.d c other) {
            long j5 = this.nanoTime - other.nanoTime;
            if (j5 > 0) {
                return 1;
            }
            return j5 < 0 ? -1 : 0;
        }

        public final synchronized int o(long now, @d5.d d delayed, @d5.d u1 eventLoop) {
            kotlinx.coroutines.internal.r0 r0Var;
            Object obj = this._heap;
            r0Var = x1.f29061a;
            if (obj == r0Var) {
                return 2;
            }
            synchronized (delayed) {
                c f6 = delayed.f();
                if (u1.u1(eventLoop)) {
                    return 1;
                }
                if (f6 == null) {
                    delayed.timeNow = now;
                } else {
                    long j5 = f6.nanoTime;
                    if (j5 - now < 0) {
                        now = j5;
                    }
                    if (now - delayed.timeNow > 0) {
                        delayed.timeNow = now;
                    }
                }
                long j6 = this.nanoTime;
                long j7 = delayed.timeNow;
                if (j6 - j7 < 0) {
                    this.nanoTime = j7;
                }
                delayed.a(this);
                return 0;
            }
        }

        public final boolean p(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // kotlinx.coroutines.internal.b1
        public void setIndex(int i5) {
            this.index = i5;
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("庄") + this.nanoTime + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/u1$d;", "Lkotlinx/coroutines/internal/a1;", "Lkotlinx/coroutines/u1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    public static final class d extends kotlinx.coroutines.internal.a1<c> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @p3.f
        public long timeNow;

        public d(long j5) {
            this.timeNow = j5;
        }
    }

    private final int C1(long now, c delayedTask) {
        if (this._isCompleted != 0) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            androidx.concurrent.futures.d.a(f29019u, this, null, new d(now));
            Object obj = this._delayed;
            kotlin.jvm.internal.l0.m(obj);
            dVar = (d) obj;
        }
        return delayedTask.o(now, dVar, this);
    }

    private final void E1(boolean z5) {
        this._isCompleted = z5 ? 1 : 0;
    }

    private final boolean F1(c task) {
        d dVar = (d) this._delayed;
        return (dVar != null ? dVar.i() : null) == task;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private final boolean m() {
        return this._isCompleted;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean u1(u1 u1Var) {
        return u1Var._isCompleted;
    }

    private final void v1() {
        kotlinx.coroutines.internal.r0 r0Var;
        kotlinx.coroutines.internal.r0 r0Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29018t;
                r0Var = x1.f29068h;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, null, r0Var)) {
                    return;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.b0) {
                    ((kotlinx.coroutines.internal.b0) obj).d();
                    return;
                }
                r0Var2 = x1.f29068h;
                if (obj == r0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.b0 b0Var = new kotlinx.coroutines.internal.b0(8, true);
                b0Var.a((Runnable) obj);
                if (androidx.concurrent.futures.d.a(f29018t, this, obj, b0Var)) {
                    return;
                }
            }
        }
    }

    private final Runnable w1() {
        kotlinx.coroutines.internal.r0 r0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.b0) {
                kotlinx.coroutines.internal.b0 b0Var = (kotlinx.coroutines.internal.b0) obj;
                Object l5 = b0Var.l();
                if (l5 != kotlinx.coroutines.internal.b0.f28680t) {
                    return (Runnable) l5;
                }
                androidx.concurrent.futures.d.a(f29018t, this, obj, b0Var.k());
            } else {
                r0Var = x1.f29068h;
                if (obj == r0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.d.a(f29018t, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean y1(Runnable task) {
        kotlinx.coroutines.internal.r0 r0Var;
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.d.a(f29018t, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.b0) {
                kotlinx.coroutines.internal.b0 b0Var = (kotlinx.coroutines.internal.b0) obj;
                int a6 = b0Var.a(task);
                if (a6 == 0) {
                    return true;
                }
                if (a6 == 1) {
                    androidx.concurrent.futures.d.a(f29018t, this, obj, b0Var.k());
                } else if (a6 == 2) {
                    return false;
                }
            } else {
                r0Var = x1.f29068h;
                if (obj == r0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.b0 b0Var2 = new kotlinx.coroutines.internal.b0(8, true);
                b0Var2.a((Runnable) obj);
                b0Var2.a(task);
                if (androidx.concurrent.futures.d.a(f29018t, this, obj, b0Var2)) {
                    return true;
                }
            }
        }
    }

    private final void z1() {
        c n5;
        kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
        long b7 = b6 != null ? b6.b() : System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar == null || (n5 = dVar.n()) == null) {
                return;
            } else {
                s1(b7, n5);
            }
        }
    }

    protected final void A1() {
        this._queue = null;
        this._delayed = null;
    }

    public final void B1(long now, @d5.d c delayedTask) {
        int C1 = C1(now, delayedTask);
        if (C1 == 0) {
            if (F1(delayedTask)) {
                t1();
            }
        } else if (C1 == 1) {
            s1(now, delayedTask);
        } else if (C1 != 2) {
            throw new IllegalStateException(ProtectedSandApp.s("遅").toString());
        }
    }

    @d5.d
    protected final p1 D1(long timeMillis, @d5.d Runnable block) {
        long d6 = x1.d(timeMillis);
        if (d6 >= kotlin.time.g.f27205c) {
            return b3.f27276o;
        }
        kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
        long b7 = b6 != null ? b6.b() : System.nanoTime();
        b bVar = new b(d6 + b7, block);
        B1(b7, bVar);
        return bVar;
    }

    @Override // kotlinx.coroutines.t1
    protected long R0() {
        c i5;
        kotlinx.coroutines.internal.r0 r0Var;
        if (super.R0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.b0)) {
                r0Var = x1.f29068h;
                return obj == r0Var ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.b0) obj).h()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (i5 = dVar.i()) == null) {
            return Long.MAX_VALUE;
        }
        long j5 = i5.nanoTime;
        kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
        long b7 = j5 - (b6 != null ? b6.b() : System.nanoTime());
        if (b7 < 0) {
            return 0L;
        }
        return b7;
    }

    @d5.d
    public p1 b0(long j5, @d5.d Runnable runnable, @d5.d CoroutineContext coroutineContext) {
        return e1.a.b(this, j5, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.t1
    protected boolean b1() {
        kotlinx.coroutines.internal.r0 r0Var;
        if (!g1()) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.h()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.b0) {
                return ((kotlinx.coroutines.internal.b0) obj).h();
            }
            r0Var = x1.f29068h;
            if (obj != r0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @d5.e
    public Object e0(long j5, @d5.d Continuation<? super kotlin.m2> continuation) {
        return e1.a.a(this, j5, continuation);
    }

    @Override // kotlinx.coroutines.e1
    public void g(long timeMillis, @d5.d q<? super kotlin.m2> continuation) {
        long d6 = x1.d(timeMillis);
        if (d6 < kotlin.time.g.f27205c) {
            kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
            long b7 = b6 != null ? b6.b() : System.nanoTime();
            a aVar = new a(d6 + b7, continuation);
            B1(b7, aVar);
            u.a(continuation, aVar);
        }
    }

    @Override // kotlinx.coroutines.t1
    public long i1() {
        c cVar;
        if (m1()) {
            return 0L;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.h()) {
            kotlinx.coroutines.b b6 = kotlinx.coroutines.c.b();
            long b7 = b6 != null ? b6.b() : System.nanoTime();
            do {
                synchronized (dVar) {
                    c f6 = dVar.f();
                    if (f6 != null) {
                        c cVar2 = f6;
                        cVar = cVar2.p(b7) ? y1(cVar2) : false ? dVar.l(0) : null;
                    }
                }
            } while (cVar != null);
        }
        Runnable w12 = w1();
        if (w12 == null) {
            return R0();
        }
        w12.run();
        return 0L;
    }

    @Override // kotlinx.coroutines.t1
    public void shutdown() {
        t3.f29007a.c();
        this._isCompleted = 1;
        v1();
        while (i1() <= 0) {
        }
        z1();
    }

    public void x1(@d5.d Runnable task) {
        if (y1(task)) {
            t1();
        } else {
            a1.f27251v.x1(task);
        }
    }

    @Override // kotlinx.coroutines.o0
    public final void y0(@d5.d CoroutineContext context, @d5.d Runnable block) {
        x1(block);
    }
}
