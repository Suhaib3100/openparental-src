package kotlinx.coroutines.sync;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.d2;
import fg.l;
import fg.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kd.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.s0;
import kotlinx.coroutines.q;
import kotlinx.coroutines.s;
import kotlinx.coroutines.y3;
import ld.p;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJd\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000f0\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\fH\u0083\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u000f*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001cJ\u0013\u0010!\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\tJ\u001d\u0010#\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\"H\u0005¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020\u00072\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%2\b\u0010'\u001a\u0004\u0018\u00010\u001dH\u0004¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u000b\u00102\u001a\u0002018\u0002X\u0082\u0004R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004R\u000b\u00105\u001a\u0002038\u0002X\u0082\u0004R\u0011\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004R\u0011\u00109\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lkotlinx/coroutines/sync/e;", "Lkotlinx/coroutines/sync/d;", "", "permits", "acquiredPermits", "<init>", "(II)V", "Lkotlin/k2;", "o", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "W", "waiter", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "", "suspend", "onAcquired", "l", "(Ljava/lang/Object;Lld/l;Lld/l;)V", "r", "()I", "q", "()V", "Lkotlinx/coroutines/y3;", "p", "(Lkotlinx/coroutines/y3;)Z", "u", "()Z", "", "t", "(Ljava/lang/Object;)Z", "b", "e", "Lkotlinx/coroutines/p;", "m", "(Lkotlinx/coroutines/p;)V", "Lkotlinx/coroutines/selects/m;", "select", "ignoredParam", "s", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V", "release", "a", "I", "", "Lld/l;", "onCancellationRelease", "availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "enqIdx", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/g;", "head", "tail", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
/* loaded from: classes7.dex */
public class e implements d {

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final AtomicReferenceFieldUpdater f81126c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, ProtectedSandApp.s("裒\u0001"));

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final AtomicLongFieldUpdater f81127d = AtomicLongFieldUpdater.newUpdater(e.class, ProtectedSandApp.s("裓\u0001"));

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final AtomicReferenceFieldUpdater f81128e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, ProtectedSandApp.s("裔\u0001"));

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final AtomicLongFieldUpdater f81129f = AtomicLongFieldUpdater.newUpdater(e.class, ProtectedSandApp.s("裕\u0001"));

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final AtomicIntegerFieldUpdater f81130g = AtomicIntegerFieldUpdater.newUpdater(e.class, ProtectedSandApp.s("裖\u0001"));

    @x
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int permits;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<Throwable, k2> onCancellationRelease;

    @x
    private volatile long deqIdx;

    @x
    private volatile long enqIdx;

    @m
    @x
    private volatile Object head;

    @m
    @x
    private volatile Object tail;

    /* compiled from: Semaphore.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends h0 implements p<Long, g, g> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f81133d = new a();

        a() {
            super(2, f.class, ProtectedSandApp.s("裮\u0001"), ProtectedSandApp.s("裭\u0001"), 1);
        }

        @l
        public final g Z(long j4, @m g gVar) {
            g j5;
            j5 = f.j(j4, gVar);
            return j5;
        }

        @Override // ld.p
        public g invoke(Long l4, g gVar) {
            g j4;
            j4 = f.j(l4.longValue(), gVar);
            return j4;
        }
    }

    /* compiled from: Semaphore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<Throwable, k2> {
        b() {
            super(1);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l Throwable th) {
            e.this.release();
        }
    }

    /* compiled from: Semaphore.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends h0 implements p<Long, g, g> {

        /* renamed from: d, reason: collision with root package name */
        public static final c f81135d = new c();

        c() {
            super(2, f.class, ProtectedSandApp.s("裰\u0001"), ProtectedSandApp.s("裯\u0001"), 1);
        }

        @l
        public final g Z(long j4, @m g gVar) {
            g j5;
            j5 = f.j(j4, gVar);
            return j5;
        }

        @Override // ld.p
        public g invoke(Long l4, g gVar) {
            g j4;
            j4 = f.j(l4.longValue(), gVar);
            return j4;
        }
    }

    public e(int i4, int i5) {
        this.permits = i4;
        if (i4 <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("裘\u0001"), i4).toString());
        }
        if (i5 < 0 || i5 > i4) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("裗\u0001"), i4).toString());
        }
        g gVar = new g(0L, null, 2);
        this.head = gVar;
        this.tail = gVar;
        this._availablePermits = i4 - i5;
        this.onCancellationRelease = new b();
    }

    private final <W> void l(W waiter, ld.l<? super W, Boolean> suspend, ld.l<? super W, k2> onAcquired) {
        while (r() <= 0) {
            if (suspend.invoke(waiter).booleanValue()) {
                return;
            }
        }
        onAcquired.invoke(waiter);
    }

    static Object n(e eVar, kotlin.coroutines.d<? super k2> dVar) {
        if (eVar.r() > 0) {
            return k2.f75408a;
        }
        Object o4 = eVar.o(dVar);
        return o4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? o4 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(kotlin.coroutines.d<? super k2> dVar) {
        q b5 = s.b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            if (!p(b5)) {
                m(b5);
            }
            Object y4 = b5.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                h.c(dVar);
            }
            return y4 == aVar ? y4 : k2.f75408a;
        } catch (Throwable th) {
            b5.N();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(y3 waiter) {
        int i4;
        Object g4;
        int i5;
        s0 s0Var;
        s0 s0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81128e;
        g gVar = (g) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f81129f.getAndIncrement(this);
        a aVar = a.f81133d;
        i4 = f.f81141f;
        long j4 = andIncrement / i4;
        loop0: while (true) {
            g4 = kotlinx.coroutines.internal.f.g(gVar, j4, aVar);
            if (!q0.h(g4)) {
                p0 f4 = q0.f(g4);
                while (true) {
                    p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
                    if (p0Var.id >= f4.id) {
                        break loop0;
                    }
                    if (!f4.s()) {
                        break;
                    }
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, p0Var, f4)) {
                        if (p0Var.o()) {
                            p0Var.l();
                        }
                    } else if (f4.o()) {
                        f4.l();
                    }
                }
            } else {
                break;
            }
        }
        g gVar2 = (g) q0.f(g4);
        i5 = f.f81141f;
        int i6 = (int) (andIncrement % i5);
        if (d2.a(gVar2.getF81146f(), i6, null, waiter)) {
            waiter.a(gVar2, i6);
            return true;
        }
        s0Var = f.f81137b;
        s0Var2 = f.f81138c;
        if (!d2.a(gVar2.getF81146f(), i6, s0Var, s0Var2)) {
            return false;
        }
        if (waiter instanceof kotlinx.coroutines.p) {
            l0.n(waiter, ProtectedSandApp.s("裙\u0001"));
            ((kotlinx.coroutines.p) waiter).W(k2.f75408a, this.onCancellationRelease);
        } else {
            if (!(waiter instanceof kotlinx.coroutines.selects.m)) {
                throw new IllegalStateException((ProtectedSandApp.s("裚\u0001") + waiter).toString());
            }
            ((kotlinx.coroutines.selects.m) waiter).d(k2.f75408a);
        }
        return true;
    }

    private final void q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        int i5;
        do {
            atomicIntegerFieldUpdater = f81130g;
            i4 = atomicIntegerFieldUpdater.get(this);
            i5 = this.permits;
            if (i4 <= i5) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, i5));
    }

    private final int r() {
        int andDecrement;
        do {
            andDecrement = f81130g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final boolean t(Object obj) {
        if (!(obj instanceof kotlinx.coroutines.p)) {
            if (obj instanceof kotlinx.coroutines.selects.m) {
                return ((kotlinx.coroutines.selects.m) obj).l(this, k2.f75408a);
            }
            throw new IllegalStateException((ProtectedSandApp.s("裚\u0001") + obj).toString());
        }
        l0.n(obj, ProtectedSandApp.s("裙\u0001"));
        kotlinx.coroutines.p pVar = (kotlinx.coroutines.p) obj;
        Object i02 = pVar.i0(k2.f75408a, null, this.onCancellationRelease);
        if (i02 == null) {
            return false;
        }
        pVar.l0(i02);
        return true;
    }

    private final boolean u() {
        int i4;
        Object g4;
        int i5;
        s0 s0Var;
        s0 s0Var2;
        int i6;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81126c;
        g gVar = (g) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f81127d.getAndIncrement(this);
        i4 = f.f81141f;
        long j4 = andIncrement / i4;
        c cVar = c.f81135d;
        loop0: while (true) {
            g4 = kotlinx.coroutines.internal.f.g(gVar, j4, cVar);
            if (q0.h(g4)) {
                break;
            }
            p0 f4 = q0.f(g4);
            while (true) {
                p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
                if (p0Var.id >= f4.id) {
                    break loop0;
                }
                if (!f4.s()) {
                    break;
                }
                if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, p0Var, f4)) {
                    if (p0Var.o()) {
                        p0Var.l();
                    }
                } else if (f4.o()) {
                    f4.l();
                }
            }
        }
        g gVar2 = (g) q0.f(g4);
        gVar2.b();
        if (gVar2.id > j4) {
            return false;
        }
        i5 = f.f81141f;
        int i7 = (int) (andIncrement % i5);
        s0Var = f.f81137b;
        Object andSet = gVar2.getF81146f().getAndSet(i7, s0Var);
        if (andSet != null) {
            s0Var2 = f.f81140e;
            if (andSet == s0Var2) {
                return false;
            }
            return t(andSet);
        }
        i6 = f.f81136a;
        for (int i10 = 0; i10 < i6; i10++) {
            Object obj = gVar2.getF81146f().get(i7);
            s0Var5 = f.f81138c;
            if (obj == s0Var5) {
                return true;
            }
        }
        s0Var3 = f.f81137b;
        s0Var4 = f.f81139d;
        return !d2.a(gVar2.getF81146f(), i7, s0Var3, s0Var4);
    }

    @Override // kotlinx.coroutines.sync.d
    public int a() {
        return Math.max(f81130g.get(this), 0);
    }

    @Override // kotlinx.coroutines.sync.d
    public boolean b() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f81130g;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > this.permits) {
                q();
            } else {
                if (i4 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    return true;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.sync.d
    @m
    public Object e(@l kotlin.coroutines.d<? super k2> dVar) {
        return n(this, dVar);
    }

    protected final void m(@l kotlinx.coroutines.p<? super k2> waiter) {
        while (r() <= 0) {
            l0.n(waiter, ProtectedSandApp.s("裛\u0001"));
            if (p((y3) waiter)) {
                return;
            }
        }
        waiter.W(k2.f75408a, this.onCancellationRelease);
    }

    @Override // kotlinx.coroutines.sync.d
    public void release() {
        do {
            int andIncrement = f81130g.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                q();
                throw new IllegalStateException((ProtectedSandApp.s("補\u0001") + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!u());
    }

    protected final void s(@l kotlinx.coroutines.selects.m<?> select, @m Object ignoredParam) {
        while (r() <= 0) {
            l0.n(select, ProtectedSandApp.s("裛\u0001"));
            if (p((y3) select)) {
                return;
            }
        }
        select.d(k2.f75408a);
    }
}
